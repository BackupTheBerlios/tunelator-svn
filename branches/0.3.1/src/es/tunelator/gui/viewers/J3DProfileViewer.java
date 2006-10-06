/*
 * Created on 15-jul-2005
 *
 * Tunelator surveying software.
 * 
 * Copyright (C) 2005 Juan Alvarez Ferrando
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 * 
 */
package es.tunelator.gui.viewers;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingBox;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Font3D;
import javax.media.j3d.FontExtrusion;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.Group;
import javax.media.j3d.LineStripArray;
import javax.media.j3d.Node;
import javax.media.j3d.PointArray;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Text3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.swing.JPanel;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;

import ca.odell.glazedlists.event.ListEvent;
import ca.odell.glazedlists.event.ListEventListener;

import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.behaviors.mouse.MouseTranslate;
import com.sun.j3d.utils.behaviors.mouse.MouseZoom;
import com.sun.j3d.utils.geometry.GeometryInfo;
import com.sun.j3d.utils.geometry.NormalGenerator;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.ViewInfo;

import es.tunelator.gui.vo.GUIFileVO;
import es.tunelator.log.Logger;
import es.tunelator.plugins.transformers.TransformException;
import es.tunelator.plugins.transformers.vo.Point3D;
import es.tunelator.vo.ProfileVO;
import es.tunelator.vo.PuntoVO;

import quickhull3d.*;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 *
 * A <code>JPanel</code> that displays a 3D graphic view of the profiles.</p>
 * 
 * The implementation includes a couple hacks related to the stablishment
 * and mantainment of the text size on window size or scene changes. See
 * the code coments.</p>
 * 
 * The panel is listener ot a EventList of profiles and updates the scene
 * on changs of the list.</p>
 * 
 * Introdution of this panel has forced to use the following directive to
 * run the application:</p>
 * 
 * -Dsun.java2d.noddraw=true</p>
 * 
 * this is needed to avoid distorsion of the geometries when resizing the
 * window. Solution found at:</p>
 * 
 *  <a href="http://www.int.com/products/3d/jview3d/problem_resolution/">
 *    http://www.int.com/products/3d/jview3d/problem_resolution/
 *  </a>
 * 
 * This viewer needs Java 3D 1.3.2 under JVM 1.5.0, or 1.3.1 under JVM 1.4.2
 * when ATI cards are used.
 * 
 * TODO: Add a user interface control, maybe a ruler, to modify the size of
 * the texts. Easily done either with a behaviour that modifies the scale
 * transformation, or changing the value of the desired screen size, now
 * fixed a 1.5cm, and the invoking updateTextScale to recalculate the scale
 * and apply it on all the texts.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public final class J3DProfileViewer extends JPanel 
	implements ListEventListener {
    /**
     * <code>List</code> of <code>ProfileVO</code> profiles displayed in the 
     * view
     */
    private List profiles = null;
    /**
     * <code>GuiFileVO</code> currently displayed
     */
    private GUIFileVO file = null;
    /**
     * <code>BorderLayout</code> layout of the panel that contains the canvas
     */
    private BorderLayout mainLayout = null;
    /**
     * Java3D helper class to create a universe 
     * @see com.sun.j3d.utils.universe.SimpleUniverse
     */
    private SimpleUniverse universe = null;
    /**
     * Root of the scene structure
     */
    private BranchGroup rootBranchGroup = null;
    /**
     * <code>JPanel</code> that contains the view
     */
    private JPanel innerPanel = null;
    /**
     * Java3D <code>Canvas3D</code> that's attached to the universe to render
     * the scene
     */
    private Canvas3D canvas3D = null;
    /**
     * <code>BranchGroup</code> that contains the <code>TransformGroup</code> 
     * that receives the mouse behaviours transformations.
     */
    private BranchGroup mouseBg = null;
    /**
     * <code>MouseTranslate</code> that applies dinamic translation in 
     * response to mouse actions
     */
    private MouseTranslate mouseTranslate = null;
    /**
     * <code>MouseRotate</code> that applies dinamic rotation in response 
     * to mouse actions
     */
    private MouseRotate mouseRotate = null;
    /**
     * <code>MouseZoom</code> that applies dinamic zoom in response to mouse 
     * actions
     */
    private MouseZoom mouseZoom = null;
    /**
     * <code>ArrayList<code> that contains the <code>BranchGroup</code> objects
     * that contain each <code>ProfileShape3d</code> at the same index position
     * in the profle list. This is needed to match changed elements in the 
     * profile list with the corresponding <code>BranchGroup</code>
     */
    private ArrayList profileBGList = null;
    /**
     * <code>textBGList</code> - All BranchGroups corresponding to the text 
     * labels of the profiles are saved in this list so they can be 
     * obtained by index to detach them individually.
     */
    private ArrayList textBGList = null;
    /**
     * Translation applied to all coordinates to move the profiles to the 
     * center of coordinates, where they will be seen in the viewport. 
     * This translation is done before using the coordinates to create the 
     * shapes because if done by means of a Java3D <code>TransformGroup</code>
     * the points jump on the screen when rotated, if they have large 
     * coordinate values, because of rounding errors.
     */
    private Point3D fp = null;
    /**
     * <code>BranchGroup</code> that's parent of all the nodes that contain the
     * profile shapes will have the required capabilities to add and detach 
     * children from it.
     */
    private BranchGroup profilesBg = null;
    /**
     * <code>BranchGroup</code> that includes the whole scene, including all 
     * transformations and allows to be detached from its parent.
     */
    private BranchGroup detachableSceneBg = null;
    /**
     * <code>TransformGroup</code> that receives the action of the mouse 
     * behaviours
     */
    private TransformGroup mouseTg = null;
    /**
     * <code>BoundingSphere</code> used to set the part of the scene 
     * where mouse behaviours act.
     */
    private BoundingSphere bounds = null;
    /**
     * <code>scaleTg</code> - Scale transformation applied on the scene
     */
    private TransformGroup scaleTg = null;
    /**
     * <code>translateTg</code> - Translation transformation applied on the 
     * scene
     */
    private TransformGroup translateTg = null;
    /**
     * <code>textScale</code> - Scale applied to text shapes
     */
    private Transform3D textScaleTransform = null;
    /**
     * Creates a new preview panel and initially shows the contents to the 
     * received <code>GUIFileVO</code>
     * @param file
     */
    public J3DProfileViewer(GUIFileVO file) {
        initialize();
        setFile(file);
    }
    /**
     * Creates a new preview panel and initially shows the 
     * <code>ProfileVO</code> profiles contained in the received 
     * <code>List</code>
     * @param profiles (<code>List</code>) of <code>ProfileVO</code> profiles
     * to initially display
     */
    public J3DProfileViewer(List profiles) {
        initialize();
        if(profiles != null) {
            setProfiles(profiles);
        }
    }
    /**
     * Displays the contents of the received <code>GUIFileVO<code>, replacing
     * the previous content and resetting to the initial state of zoom, scale
     * and point of view if there was a previous scene.
     * @param file - (<code>GUIFileVO</code>) that contains the list of 
     * profiles to display
     */
    public void setFile(GUIFileVO file) {
        if(file.equals(this.file)){
            return;
        }
        if(this.file!=null && (file!=null)) {
            this.file.getGroups().removeListEventListener(this);
        }
        this.file = file;
        if(this.file!=null){
            this.file.getGroups().addListEventListener(this);
            if(mouseBg!=null){
    	        mouseBg.detach();
    	        mouseTg = new TransformGroup();
    	        mouseTg.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    	        mouseTg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    	        mouseTg.setCapability(TransformGroup.ALLOW_CHILDREN_READ);
    	        mouseTg.setCapability(TransformGroup.ALLOW_CHILDREN_WRITE);
    	        mouseTg.setCapability(TransformGroup.ALLOW_CHILDREN_EXTEND);

    	        mouseBg = new BranchGroup();
    	        mouseBg.setCapability(BranchGroup.ALLOW_DETACH);

    	        mouseTranslate = new MouseTranslate();
    	        mouseTranslate.setTransformGroup(mouseTg);
    	        mouseTranslate.setSchedulingBounds(new BoundingSphere());
    	        mouseBg.addChild(mouseTranslate);

    	        mouseRotate = new MouseRotate();
    	        mouseRotate.setTransformGroup(mouseTg);
    	        mouseRotate.setSchedulingBounds(new BoundingSphere());
    	        mouseBg.addChild(mouseRotate);

    	        mouseZoom = new MouseZoom();
    	        mouseZoom.setTransformGroup(mouseTg);
    	        mouseZoom.setSchedulingBounds(new BoundingSphere());
    	        mouseBg.addChild(mouseZoom);

    	        mouseBg.addChild(mouseTg);
    	        rootBranchGroup.addChild(mouseBg);
            }
            setProfiles(this.file.getGroups());
            updateTextScale(null);
        } else {
            setProfiles(null);
        }
    }
    /**
     * Creates the panel, its layout and the top structure of Java3D 
     * objects:<br>
     * <br>
     * (SimpleUniverse)<br>
     * (Canvas3D)<br>
     * (BranchGroup) = Root<br>
     * (BranchGroup) = Mouse behaviours<br>
     * (TransformGroup) - MouseTranslate+MouseRotate+MouseZoom = Mouse 
     *  behaviours<br>
     * (BranchGroup) = Detachable group that contains all the scene shapes<br>
     * (BranchGroup) (1..N) = One for each profile in the scene<br>
     * (ProfileShape3D) = Profile shapes<br>
     */
    public void initialize() {
        setLayout(getMainLayout());
        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
        canvas3D = new Canvas3D(config);
        universe = new SimpleUniverse(canvas3D);
        rootBranchGroup = new BranchGroup();
        rootBranchGroup.setBoundsAutoCompute(true);
        rootBranchGroup.setCapability(Group.ALLOW_BOUNDS_READ);
        rootBranchGroup.setCapability(Group.ALLOW_CHILDREN_READ);
        rootBranchGroup.setCapability(Group.ALLOW_CHILDREN_WRITE);
        rootBranchGroup.setCapability(Group.ALLOW_CHILDREN_EXTEND);
        // Mouse behaviours to zoom, translate and rotate the scene
        mouseTg = new TransformGroup();
        mouseTg.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        mouseTg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        mouseTg.setCapability(TransformGroup.ALLOW_CHILDREN_READ);
        mouseTg.setCapability(TransformGroup.ALLOW_CHILDREN_WRITE);
        mouseTg.setCapability(TransformGroup.ALLOW_CHILDREN_EXTEND);
        mouseBg = new BranchGroup();
        mouseBg.setCapability(BranchGroup.ALLOW_DETACH);
        mouseBg.addChild(mouseTg);
        
        mouseTranslate = new MouseTranslate();
        mouseTranslate.setTransformGroup(mouseTg);
        mouseTranslate.setSchedulingBounds(new BoundingSphere());
        mouseBg.addChild(mouseTranslate);

        mouseRotate = new MouseRotate();
        mouseRotate.setTransformGroup(mouseTg);
        mouseRotate.setSchedulingBounds(new BoundingSphere());
        mouseBg.addChild(mouseRotate);

        mouseZoom = new MouseZoom();
        mouseZoom.setTransformGroup(mouseTg);
        mouseZoom.setSchedulingBounds(new BoundingSphere());
        mouseBg.addChild(mouseZoom);
        // Node to hold the scene allowing to detach it so it
        // can be completely reconstructed upon changes.
        detachableSceneBg = new BranchGroup();
        detachableSceneBg.setCapability(BranchGroup.ALLOW_DETACH);

        mouseTg.addChild(detachableSceneBg);
        rootBranchGroup.addChild(mouseBg);
        innerPanel = new JPanel();
        innerPanel.setLayout(new BorderLayout());
        innerPanel.add("Center",canvas3D);
        add("Center",innerPanel);
        setVisible(this.isVisible());
        rootBranchGroup.compile();
        universe.addBranchGraph(rootBranchGroup);
        universe.getViewingPlatform().setNominalViewingTransform();
        // Warning: This is a hack to solve a problem that arises
        // when the panel is firts made visible. At that time
        // the transformation that the updateTextScale methog gets
        // from the Canvas3D are not correct and provoke that the
        // texts are shrinked to a very tiny size.
        // This is the explanation given by Mark Hood at the 
        // JavaDesktop forum:
		// "There's an interaction with the AWT event listener thread and Java 3D
		// that introduces a 1-frame latency between the current state of the
		// Canvas3D and what its getVWorldToImagePlate method returns. The first
		// value is some bogus thing based on the default screen size. You don't
		// get the correct value until the second event after whatever AWT event
		// happened when initially making them visible (and if the next events
		// are canvas moves or resizes, you don't catch up).
		//
		// Calling getVworldToImagePlate multiple times doesn't help since it
		// just returns the internal Java 3D cached value, which won't change
		// until either the next AWT event involving the canvas is processed or
		// something which affects the view is performed. Does it help to make a
		// trivial change to the view, like translating the view platform a small
		// amount?
		//
		// com.sun.j3d.utils.universe.ViewInfo.getVworldToImagePlate() computes
		// the transform independently of the internal Java 3D view state --
		// directly from the API state instead -- so it avoids that latency. You
		// might want to give that a try instead of the core Canvas3D version.
		// You can call the ViewInfo canvas update method directly from an AWT
		// canvas listener and then get the correct value of vworldToImagePlate
		// based on the current canvas configuration."
        // This sugestion is correct, but required intercepting the events 
        // corresponding to the panel being shown or resized and forcing the 
        // calculation at that time. And thats what this particular code does.
        this.addComponentListener(new ComponentListener (){
    	    private void printCanvasSize(){
    	        Canvas3D canvas = universe.getCanvas();
    	        if ((canvas.getSize().getHeight()>0)||(canvas.getSize().getWidth()>0)){
    	            J3DProfileViewer.this.updateTextScale(null);
    	        }
    	        System.out.println(canvas.getSize().toString());
    	    }
    	    /* (non-Javadoc)
    	     * @see java.awt.event.ComponentListener#componentHidden(java.awt.event.ComponentEvent)
    	     */
    	    public void componentHidden(ComponentEvent e) {
    	    }
    	    /* (non-Javadoc)
    	     * @see java.awt.event.ComponentListener#componentMoved(java.awt.event.ComponentEvent)
    	     */
    	    public void componentMoved(ComponentEvent e) {
    	    }
    	    /* (non-Javadoc)
    	     * @see java.awt.event.ComponentListener#componentResized(java.awt.event.ComponentEvent)
    	     */
    	    public void componentResized(ComponentEvent e) {
    	        System.out.println("Resized");
    	        printCanvasSize();
    	    }
    	    /* (non-Javadoc)
    	     * @see java.awt.event.ComponentListener#componentShown(java.awt.event.ComponentEvent)
    	     */
    	    public void componentShown(ComponentEvent e) {
    	        System.out.println("Shown");
    	        printCanvasSize();
    	    }
        }
        );
    }
    /**
     * @return (<code>List</code>) of <code>ProfileVO</code> profile objects 
     * that's currently shown in the view.
     */
    public List getProfiles() {
        return profiles;
    }
    /**
     * @return (<code>BorderLayout</code>) Layout of the panel where the 
     * preview is inserted.
     */
    public BorderLayout getMainLayout() {
        if(mainLayout == null) {
            mainLayout = new BorderLayout();
        }
        return mainLayout;
    }
    /**
     * Overloads the inherited method to invoke <code>setVisible</code> also on
     * the <code>Canvas3D</code>.<p/>
     * This is a hack to force that the <code>Canvas3D</code> properly follows 
     * the visible state of the panel; specifically when in a tabbed pane, to 
     * avoid the preview to be the visible panel at startup when the active tab
     * is the data grid one.
     * @see java.awt.Component#setVisible(boolean)
     */
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag);
        canvas3D.setVisible(aFlag);
    }
    /**
     * Adds the list of points in the received profile to the scene and returns
     * the <code>BrachGroup</code> that contains the resulting shape. The 
     * returned <code>BranchGroup</code> has the <code>ALLOW_DETACH</code>
     * capability set, to allow profiles to be removed individually from the 
     * scene.<p/>
     * A <code>Point3D</code> object is used to specify a traslation of all the
     * points to the area where de viewport is looking, so the scene is visible.
     * The shape will be a <code>LineStripArray</code> if the profile contains
     * two or more points, and a <code>PointCloud</code> if it only has one 
     * point.<p/>
     * Translation is not performed with a <code>TransformGroup</code> because
     * it does not render properly and behaves jumpy when rotating if the 
     * coordinates are very far from the origin (probably rounding errors
     * in the Java3D engine). Instead, the shapes are created with the 
     * translated coordinates of the points.
     * @param profile (<code>ProfileVO</code>) Group of points that form the 
     * profile to be rendered in the scene
     * @param fp (<code>Point3D</code>) 3D coordinates of the translation 
     * vector
     * @param g (<code>Group</code>) to wich the created 
     * <code>BranchGroup</code> is added. If it's needed to detach profiles
     * the group must have the <code>ALLOW_CHILDREN_READ</code> and 
     * <code>ALLOW_CHILDREN_WRITE</code> capabilities.
     * @param appearance (<code>Appearance</code>) with which the shape is 
     * created. If null, a default is used.
     * @throws <code>IllegalArgumentException</code> If the profile has no 
     * points
     */
    private BranchGroup addProfile(ProfileVO profile, Point3D fp, Group g,
            Appearance appearance) {
        if(profile.getElements().size()<=0){
            throw new IllegalArgumentException("Received profile has no"+
                    " points");
        }
        ProfileShape3D shape = new ProfileShape3D(profile,fp,appearance);
        BranchGroup detachable = new BranchGroup();
        detachable.setCapability(BranchGroup.ALLOW_DETACH);
        detachable.addChild(shape);
        g.addChild(detachable);
        return detachable;
    }
    /**
     * Adds all the <code>ProfileVO</code> objects in the list to the scene,
     * as children of the specified <code>Group</code>, and applying the 
     * translation vector specified with the <code>Point3D</code> object.<p/>
     * Translation is not performed with a <code>TransformGroup</code> because
     * it does not render properly and behaves jumpy when rotating if the 
     * coordinates are very far from the origin (probably rounding errors
     * in the Java3D engine). Instead, the shapes are created with the 
     * translated coordinates of the points.<p/>
     * Each profile is created as a <code>ProfileShape3D</code> and inserted as
     * the single child of a <code>BranchGroup</code> with the 
     * <code>ALLOW_DETACH</code> capability. This structure has the purpouse
     * of enabling the detachment of individual profile shapes when the profile
     *  list changes.
     * @param profiles (<code>List</code>) of <code>ProfileVO</code> profiles
     *  to add to the scene
     * @param g (<code>Group</code>) Has to be a <code>Group</code> object with
     *  the ALLOW_CHILDREN_READ and ALLOW_CHILDREN_WRITE 
     * capabilities set if profiles will be later removed from the scene.
     * @param fp (<code>Point3D</code>) Translation 3D vector
     */
    private void addProfiles(List profiles, Group g, Point3D fp){
        if(profiles != null && profiles.size()>0) {
            Appearance appearance = ProfileShape3D.getDefaultAppearance();
            profileBGList = new ArrayList(profiles.size());
            Iterator it = profiles.iterator();
            int index = 0;
            while(it.hasNext()){
                ProfileVO profile = new ProfileVO((List) it.next());
                BranchGroup profileBG = addProfile(profile,fp,g,appearance);
                profileBGList.add(index,profileBG);
                index++;
            }
        }
    }
    /**
     * Adds a single <code>BranchGroup</code> to the given group.
     * The added group contains a <code>Shape3D</code> with a
     * <code>Text3D</code> geometry representing the PK of the
     * profile, placed by its first point.
     * @param profile
     * @param fp
     * @param g
     * @param appearance
     * @return
     */
    private BranchGroup addText(ProfileVO profile, Point3D fp, Group g,
            Appearance appearance) {
        int flags = Font.PLAIN;
        Font font = new Font("Helvetica",flags,1);
        Font3D font3D = new Font3D(font, 0.2 ,new FontExtrusion());
        Point3D firstPoint;
        try {
            firstPoint = ((PuntoVO)profile.getElements().get(0)).getPoint3D();
        } catch (TransformException e) {
            Logger.logError(this.getClass(),e);
            throw new InternalError("Error transforming point to native types");
        }
        // Use (0,0,0) as base point for all text to avoid being forced to risk 
        // loosing precission for lacking of a Tex3D constructor that takes de 
        // base point as a Point3d.
        // A trasnlation Transform3D is the used to place each piece of text on
        // its proper place. This method is also necessary when using a scale
        // Transform3D to resize the text, because that transform will also
        // affect the position of the base point of each piece of text, 
        // misplacing them in relation to the rest of the scene (which does
        // not have that scale applied)
        Point3f textBasePoint = new Point3f(0.0F,0.0F,0.0F);
        Text3D text = new Text3D(font3D,profile.getPK(),textBasePoint);
        text.setCapability(Text3D.ALLOW_BOUNDING_BOX_READ);
        BranchGroup detachable = new BranchGroup();
        detachable.setCapability(BranchGroup.ALLOW_DETACH);
        detachable.setCapability(BranchGroup.ALLOW_CHILDREN_READ);
        Transform3D scale = new Transform3D();
        // Initial scale, before nodes are live has to be set
        // to a constant value.
//        if(textScaleTransform == null) {
//            scale.setScale(1);
//        } else {
//            scale.set(textScaleTransform);
//        }
        Transform3D translation = new Transform3D();
        translation.setTranslation(new Vector3d((firstPoint.getX()-fp.getX()),
                (firstPoint.getY()-fp.getY()),
                (firstPoint.getZ()-fp.getZ())));
        TransformGroup scaleTg = new TransformGroup();
        scaleTg.setCapability(TransformGroup.ALLOW_CHILDREN_READ);
        scaleTg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        scaleTg.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        scaleTg.setTransform(scale);
        TransformGroup translateTg = new TransformGroup();
        translateTg.setCapability(TransformGroup.ALLOW_CHILDREN_READ);
        translateTg.setTransform(translation);
        Shape3D textShape = new Shape3D(text,appearance);
        textShape.setCapability(Shape3D.ALLOW_LOCAL_TO_VWORLD_READ);
        textShape.setCapability(Shape3D.ALLOW_GEOMETRY_READ);
        scaleTg.addChild(textShape);
        translateTg.addChild(scaleTg);
        detachable.addChild(translateTg);
        // Adjust the scale of the text element
        updateTextScale(detachable);
        g.addChild(detachable);
        return detachable;
    }
    /**
     * Adds to the given <code>Group</code> a set of BranchGroups, each 
     * containing a single <code>Tex3D</code> positioned by the first point of
     * each profile.<p/>
     * Positions are translated by the coordinates of the given 
     * <code>Point3D</code>
     * @param profiles
     * @param g
     * @param fp
     */
    private void addTexts(List profiles, Group g, Point3D fp){
        if(profiles != null && profiles.size()>0) {
            Appearance appearance = new Appearance();
            textBGList = new ArrayList(profiles.size());
            Iterator it = profiles.iterator();
            int index = 0;
            while(it.hasNext()){
                ProfileVO profile = new ProfileVO((List) it.next());
                BranchGroup textBG = addText(profile,fp,g,appearance);
                textBGList.add(index,textBG);
                index++;
            }
        }
    }
    /**
     * Recalculates the proper scale to apply on text shapes 
     * to make it of a fixed screen size.
     */
    private void updateTextScale(BranchGroup bg){
        boolean singleTextFlag = false;
        Canvas3D canvas = universe.getCanvas();
        if(canvas.getSize().getHeight()==0 || canvas.getSize().getWidth()==0){
            Logger.logDebug(this.getClass(),"Canvas has no size");
            return;
        }
        // Calculate the scale to apply to text shapes
        Transform3D localToVWorld = new Transform3D();
        Transform3D vWorldToImagePlate = new Transform3D();
        Transform3D imagePlateToVWorld= new Transform3D();
        Transform3D localToImagePlate = new Transform3D();
        Transform3D imagePlateToLocal = new Transform3D();
        // An empty file is loaded, no content available
        // and nothing to scale.
        if(textBGList == null)
            return;
        if(bg == null) {
	        // Take a piece of text, say the first of them
	        bg =  (BranchGroup)this.textBGList.get(0);
        } else {
            // If there's one, apply the same scale of the rest of text shapes
            if(textScaleTransform != null) {
    	        TransformGroup trTg = (TransformGroup) bg.getChild(0);
    	        TransformGroup scTg = (TransformGroup) trTg.getChild(0);
    	        scTg.setTransform(textScaleTransform);
    	        return;
            }
            // Else we will calculate the scale
            singleTextFlag = true;
        }
        // So if we are updating all elements or just one but we don't
        // have a saved scale transformation, we have to calculate the scale
        // and save it for later use on single text elements.
        if(bg != null){
            // Extract the nodes of the Branch Group. There should be
            // a Translation TransformGroup, then a scale TransformGroup
            // and then a Shape3D with the text Geometry.
	        TransformGroup trTg = (TransformGroup) bg.getChild(0);
	        TransformGroup scTg = (TransformGroup) trTg.getChild(0);
	        Node textNode = scTg.getChild(0);
	        double textScale = 1;
	        // If we got some text shape
	        // It has to be in live status to be able to get the LocalToVWorld
	        // and vWorldToImagePlate transforms
	        if((textNode != null) && (textNode.isLive())){
	            textNode.getLocalToVworld(localToVWorld);
	            // Don't use this Canvas3D method, it returns a non-updated
	            // transformation when the panel is first shown.
	            // canvas.getVworldToImagePlate(vWorldToImagePlate);
	            // Instead get the transformation from ViewInfo.
	            // See the comment at initialize()
	            ViewInfo vi = new ViewInfo(universe.getViewer().getView());
	            vi.updateCanvas(canvas);
	            vi.getImagePlateToVworld(canvas,imagePlateToVWorld,null);
	            vWorldToImagePlate.set(imagePlateToVWorld);
	            vWorldToImagePlate.invert();
	            // Composite transform to convert local coordinates to 
	            // image plate coordinates.
	            localToImagePlate.mul(localToVWorld,vWorldToImagePlate);
	            // Get the text dimensions in local coordinates
		        BoundingBox textBox = new BoundingBox();
		        Text3D text = (Text3D)((Shape3D)textNode).getGeometry();
		        text.getBoundingBox(textBox);
		        Point3d upper = new Point3d();
		        textBox.getUpper(upper);
		        Point3d lower = new Point3d();
		        textBox.getLower(lower);
		        // Convert the bounds of the text to ImagePlate coordinates
		        localToImagePlate.transform(upper);
		        localToImagePlate.transform(lower);
		        // Get the distance between the sides of the bounds
		        double dist = upper.distance(lower);
		        Logger.logDebug(this.getClass(),"Image plate distance = "+dist);
		        // Calculate scale to turn image plate distance into 1.5cm
	            textScale = 1.5 / (dist*100);
	            Logger.logDebug(this.getClass(),"Text scale = "+textScale);
                Transform3D newScale = new Transform3D();
                newScale.set(textScale);
                // Now apply this transform on the existing one and save
                // the resulting tranform to apply if later we update a 
                // single text element.
                if(textScaleTransform == null){
                    textScaleTransform = new Transform3D();
                    scTg.getTransform(textScaleTransform);
                }
                Logger.logDebug(this.getClass(),"Previous scale = "+textScaleTransform.getScale());
                textScaleTransform.mul(newScale);
                Logger.logDebug(this.getClass(),"Resulting scale = "+textScaleTransform.getScale());
	            if(singleTextFlag) { // Only updating one text
	                trTg = (TransformGroup) bg.getChild(0);
	                scTg = (TransformGroup) trTg.getChild(0);
	                scTg.setTransform(textScaleTransform);
	            } else {
		            // Apply the new scale to each text item
		            Iterator it = textBGList.iterator();
		            while(it.hasNext()){
		                bg = (BranchGroup) it.next();
		                trTg = (TransformGroup) bg.getChild(0);
		                scTg = (TransformGroup) trTg.getChild(0);
	                    scTg.setTransform(textScaleTransform);
		            }
	            }
	        }
        }
    }
    /**
     * Replaces the whole scene with a new set of profiles to draw. The 
     * previous profiles is removed by detaching the <code>BranchGroup<code>
     * that contained them. This allows to retains the same universe and canvas
     * while changing the contents.<p/>
     * New transformations are created to fit the scene in the viewport and so,
     * the new list of profiles is viewed with the initial scale and 
     * translation.
     * @param profiles (<code>List</code>) New set of <code>ProfileVO</code>
     *  profiles to display
     */
    public void setProfiles(List profiles) {
        this.profiles = profiles;
        if(detachableSceneBg != null){
            detachableSceneBg.detach();
        }
        if (profiles != null && profiles.size()>0) {
	        try {
	            ProfileVO profile = new ProfileVO((List)profiles.get(0));
	            fp = ((PuntoVO)(profile).getElements().
	                    get(0)).getPoint3D();
	        } catch (TransformException e) {
	            throw new InternalError(e.getMessage());
	        }
	        profilesBg = new BranchGroup();
	        profilesBg.setCapability(Group.ALLOW_CHILDREN_READ);
	        profilesBg.setCapability(Group.ALLOW_CHILDREN_WRITE);
	        profilesBg.setCapability(Group.ALLOW_CHILDREN_EXTEND);
	        profilesBg.setCapability(BranchGroup.ALLOW_DETACH);
	        profilesBg.setCapability(BranchGroup.ALLOW_BOUNDS_READ);
	        addProfiles(profiles,profilesBg,fp);
	        addTexts(profiles,profilesBg,fp);
            qhull(null);
	        //triangulate();
	        bounds = (BoundingSphere) profilesBg.getBounds();
	        
	        Point3d center = new Point3d();
	        bounds.getCenter(center);
	        
	        translateTg = new TransformGroup();
	        translateTg.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
	        translateTg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
	        translateTg.setCapability(BranchGroup.ALLOW_DETACH);
	        Transform3D translation = new Transform3D();
	        translation.setTranslation(new Vector3d(-center.x,-center.y,
	                -center.z));
	        translateTg.setTransform(translation);
	        translateTg.addChild(profilesBg);

	        Transform3D scale = new Transform3D();
	        scale.setScale(1/(bounds.getRadius()*1.5));
	        scaleTg = new TransformGroup(scale);
	        scaleTg.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
	        scaleTg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
	        scaleTg.setCapability(BranchGroup.ALLOW_DETACH);
	        
	        scaleTg.addChild(translateTg);
	        
	        detachableSceneBg = new BranchGroup();
	        detachableSceneBg.setCapability(BranchGroup.ALLOW_DETACH);

	        detachableSceneBg.addChild(scaleTg);
	        
	        mouseTg.addChild(detachableSceneBg);
        }
    }
    /**
     * @param index
     */
    public void performDelete(int index){
        ((BranchGroup)profileBGList.get(index)).detach();
        profileBGList.remove(index);
        ((BranchGroup)textBGList.get(index)).detach();
        textBGList.remove(index);
    }
    /**
     * @param index
     * @param profile
     */
    public void performInsert(int index){
        Appearance appearance = ProfileShape3D.getDefaultAppearance();
        ProfileVO profile= new ProfileVO((List) profiles.get(index));
        profileBGList.add(index,addProfile(profile,fp,profilesBg,appearance));
        BranchGroup bg = addText(profile,fp,profilesBg,null);
        textBGList.add(index,bg);
        updateTextScale(bg);
    }
    /**
     * Receives notification of changes in the list of <code>ProfileVO</code> 
     * profiles that's currently drawn.<p/>
     * Updates are handled detaching deleted profiles and creating and adding
     * new ones as children of the profiles <code>BranchGroup</code> for 
     * inserted profiles. This way the changes are permormed more efficiently
     * and the state of the zoom and traslation transformation does not change.
     * @param listChanges (<code>ListEvent</code>) The set of changes that 
     * happened on the profiles list
     * @see ca.odell.glazedlists.event.ListEventListener#listChanged
     * (ca.odell.glazedlists.event.ListEvent)
     */
    public void listChanged(ListEvent listChanges) {
        while(listChanges.next()){
            int type = listChanges.getType();
            int index = listChanges.getIndex();
            if(type == ListEvent.INSERT){
                performInsert(index);
            } else {
                if(type == ListEvent.UPDATE){
                    // Delete
                    performDelete(index);
                    // Insert
                    performInsert(index);
                } else {
                    if(type == ListEvent.DELETE){
                        performDelete(index);
                    }
                }
            }
        }
        // Adjust scale to fit the scene in the viewport after changes
        bounds = (BoundingSphere) this.profilesBg.getBounds();
        Transform3D transform = new Transform3D();
        scaleTg.getTransform(transform);
        double scale = (1/(bounds.getRadius()*1.5));
        transform.setScale(scale);
        scaleTg.setTransform(transform);
        transform = new Transform3D();
        translateTg.getTransform(transform);
        Point3d center = new Point3d();
        bounds.getCenter(center);
        transform.setTranslation(new Vector3d(-center.x,-center.y,
                -center.z));
        translateTg.setTransform(transform);
        // Update the scale of the text shapes according to the 
        // new size of the scene.
        updateTextScale(null);
    }

    public Point3d [] inversePoint3dArray(Point3d []input){
        Point3d []result = new Point3d[input.length];
        for(int i=0; i < input.length; i++){
            result[result.length-i-1] = input[i];
        }
        return result;
    }
    
    public void triangulate(){
        ArrayList list=new ArrayList();
        Iterator it = profileBGList.iterator();
        ProfileShape3D profileShapes[] = new ProfileShape3D[profileBGList.size()];
        for(int i=0;it.hasNext();i++){
            profileShapes[i] = (ProfileShape3D)((BranchGroup) it.next()).getChild(0);
        }
        for (int index = 0;index<profileShapes.length-1;index++){
//            Point3d [] profile1Points = inversePoint3dArray(profileShapes[index].getPoints());
//            Point3d [] profile2Points = inversePoint3dArray(profileShapes[index+1].getPoints());
          Point3d [] profile1Points = profileShapes[index].getPoints();
          Point3d [] profile2Points = profileShapes[index+1].getPoints();
            triangulate2Profiles(profile1Points,profile2Points);
        }
    }
    
    private void triangulate2Profiles(Point3d[] profile1, Point3d[] profile2){
        Point3d []pointArray = new Point3d[(profile1.length+profile2.length)];
        for(int i=0; i<profile1.length; i++){
            pointArray[i]=profile1[i];
        }
        for(int i=0; i<profile2.length; i++){
            pointArray[i+profile1.length]=profile2[i];
        }
        int [] stripCountArray = new int[1];
        stripCountArray[0] = profile1.length+profile2.length;
//        stripCountArray[1] = profile2.length;
        int [] contourCountArray = {1};
        GeometryInfo gi = new GeometryInfo(GeometryInfo.POLYGON_ARRAY);
        gi.setCoordinates(pointArray);
        gi.setStripCounts(stripCountArray);
        gi.setContourCounts(contourCountArray);
        NormalGenerator normalGenerator = new NormalGenerator();
        normalGenerator.generateNormals(gi);
        Appearance ap = new Appearance();
//          render as a wireframe
        PolygonAttributes polyAttrbutes = new PolygonAttributes();
        polyAttrbutes.setPolygonMode( PolygonAttributes.POLYGON_LINE );
        polyAttrbutes.setCullFace( PolygonAttributes.CULL_NONE ) ;
        ap.setPolygonAttributes( polyAttrbutes );
//            add both a wireframe and a solid version
//            of the triangulated surface
        Shape3D shape1 = new Shape3D( gi.getGeometryArray(), ap );
        Shape3D shape2 = new Shape3D( gi.getGeometryArray() );
        profilesBg.addChild(shape1);
//           profilesBg.addChild(shape2);
    }
    
    void qhull(Point3d[] points){
        quickhull3d.Point3d [] pointArray;
        if(points == null) {
            Iterator it = profileBGList.iterator();
            ArrayList pointsList = new ArrayList();
            for(int i=0;it.hasNext();i++){
                ProfileShape3D profileShape = (ProfileShape3D)((BranchGroup) it.next()).getChild(0);
                for (int j=0; j<profileShape.getPoints().length; j++){
                    Point3d profilePoint = profileShape.getPoints()[j];
                    quickhull3d.Point3d auxPoint = new quickhull3d.Point3d(profilePoint.x,profilePoint.y,profilePoint.z);
                    pointsList.add(auxPoint);
                }
            }
            pointArray = new quickhull3d.Point3d [pointsList.size()];
            for(int i=0; i < pointsList.size(); i++) {
                quickhull3d.Point3d auxPoint = (quickhull3d.Point3d)pointsList.get(i);
                pointArray[i] = new quickhull3d.Point3d(auxPoint.x,auxPoint.y,auxPoint.z);
            }
        } else {
            pointArray = new quickhull3d.Point3d [points.length];
            for(int i=0; i < points.length; i++) {
                pointArray[i] = new quickhull3d.Point3d(points[i].x,points[i].y,points[i].z);
            }
        }
        QuickHull3D qhull = new QuickHull3D();
        qhull.build(pointArray);
        quickhull3d.Point3d []vertices = qhull.getVertices();
        for (int i = 0; i < vertices.length; i++)
        {
            quickhull3d.Point3d pnt = vertices[i];
            System.out.println (pnt.x + " " + pnt.y + " " + pnt.z);
        }
        int[][] faceIndices = qhull.getFaces();
        for (int i = 0; i < vertices.length; i++) {
           Point3d[] facePoints = new Point3d[faceIndices[i].length];
           PointArray pointCloud = new PointArray(faceIndices[i].length,
                    GeometryArray.COORDINATES);
           for (int k = 0; k < faceIndices[i].length; k++) { 
               facePoints[k] = new Point3d(vertices[faceIndices[i][k]].x,
                       vertices[faceIndices[i][k]].y,
                       vertices[faceIndices[i][k]].z);
                pointCloud.setCoordinate(k,facePoints[k]);
           }
           Shape3D shape = new Shape3D();
           if(facePoints.length > 1){
                int[] stripCounts = new int[] {facePoints.length};
                LineStripArray geometry = new LineStripArray(facePoints.length,
                        GeometryArray.COORDINATES,stripCounts);
                geometry.setCoordinates(0,facePoints);
                shape.setGeometry(geometry);
           } else {
                shape.setGeometry(pointCloud);
           }
           profilesBg.addChild(shape);
        }
    }
}
