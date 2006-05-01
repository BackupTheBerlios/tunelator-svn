/*
 * Created on 30-ene-2005
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
package es.tunelator.gui.adv;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.net.URL;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JDialog;

import es.tunelator.UserMessageException;
import es.tunelator.log.Logger;
import es.tunelator.resources.Resourcer;

/**
 * Holds the about dialog<p/>
 * Responabilities:<p/>
 * <dir>
 * 	<li>Show a dialog vertically and horizontally centered on a frame</li>
 *  <li>Display a image as the contents of the dialog</li>
 * </dir>
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class AboutDialog extends JDialog {
    /**
     * The image that's shown as the content of the dialog
     */
	private Image image;
	/**
	 * Objects to be notified if errors occur. This is to relay error 
	 * management.
	 */
	private Vector errorListeners = new Vector();
	/**
	 * Inherited constructor, relays to the parent class contructor.
	 * 
	 * @see javax.swing.JDialog#JDialog(java.awt.Frame)
	 */
	public AboutDialog(Frame owner) throws HeadlessException {
		super(owner);
	}
	/**
	 * Add a listener to this class's errors
	 * @param listener
	 */
	public void addErrorListener(ErrorListener listener){
	    errorListeners.add(listener);
	}
	/**
	 * Remove a listener of this class's errors
	 * @param listener
	 */
	public void removeErrorListener(ErrorListener listener){
	    errorListeners.remove(listener);
	}
	/**
	 * Notify all listeners that an error has occurred
	 * @param msg
	 */
	public void fireError(String msg){
	    Iterator it = errorListeners.iterator();
	    while(it.hasNext()){
	        ErrorListener listener = (ErrorListener)it.next();
	        listener.respondToError(this,msg);
	    }
	}
	/**
	 * Loads an image from a file stored in the classpath
	 * @param fileName - Path to the file, relative to a location in the 
	 * classpath. For example "/es/tunelator/images/file.gif"
	 * @return
	 * @throws UserMessageException
	 */
	private Image loadImageFromClasspath(String fileName) 
	throws UserMessageException {
		URL resource = getClass().getResource(fileName);
		if (resource == null) {
			MessageFormat mf = new MessageFormat(Resourcer.getString(null,
			                                   "error.imageResourceNotFound"));
			Object[] params = { fileName };
			throw new UserMessageException(mf.format(params));
		}
		Image result = Toolkit.getDefaultToolkit().getImage(resource);
		return result;

	}
	/**
	 * Initializes the GUI elements of the dialog.
	 * 
	 * @see javax.swing.JDialog#dialogInit()
	 */
	protected void dialogInit() {
		try {
			super.dialogInit();
			this.setTitle(Resourcer.getString(this.getClass(),
			        "aboutDialog.title"));
			this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setImage(loadImageFromClasspath(Resourcer.getString(this.getClass(),
			        "aboutDialog.dialogIcon")));
		} catch (Exception e) {
		    Logger.logError(AboutDialog.class,e);
			fireError(e.getMessage());
		}
	}
	/**
	 * Assigns the image to the dialog and sets a default size
	 * @param image
	 */
	protected void setImage(Image image) {
		this.image = image;
		setSize(200,200);
	}
	/**
	 * Centers the dialog horizonally and vertically on the owner
	 * frame.
	 * If the resulting coordinates fall out of the screen, they are
	 * corrected to the closest visible location.
	 * 
	 * @param width
	 * @param height
	 */
	private void centerToOwner(int width, int height) {
		Insets insets = getInsets(); 
		int newWidth = insets.left+width+insets.right;
		int newHeight = insets.top+height+insets.bottom;
		setSize(newWidth,newHeight);
		Frame self = (Frame) this.getOwner();
		Point p = self.getLocation();
		int xpos = p.x+((self.getWidth()-this.getWidth())/2);
		xpos = xpos >= 0 ? xpos : p.x;
		int ypos = p.y+(self.getHeight()-this.getHeight())/2;
		ypos = ypos >= 0 ? ypos : p.y;
		setLocation(xpos, ypos);
	}
	/**
	 * @see java.awt.Component#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g){
		Insets insets = getInsets();
		g.drawImage(image,insets.left,insets.top, this);
		int height = image.getHeight(this);
		int width = image.getWidth(this);
		centerToOwner(width,height);
	}
	/**
	 * Is called periodically as the image is loaded. It waits until the 
	 * loading is complete and the centers the dialog on its owner.
	 * 
	 * @see java.awt.image.ImageObserver#imageUpdate(java.awt.Image, 
	 *      int, int, int, int, int)
	 */
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int width,
			int height) {
		boolean result = super.imageUpdate(img, infoflags, x, y, width, height);
		if((infoflags & ImageObserver.ALLBITS) != 0) {
			Insets insets = getInsets();
			int newWidth = insets.left+width+insets.right;
			int newHeight = insets.top+height+insets.bottom;
			centerToOwner(newWidth,newHeight);
		} else {
			if((infoflags & (ImageObserver.ABORT | ImageObserver.ERROR)) != 0) {
			    String msg = "";
			    try {
			        Resourcer.getString(null,"error.loadImage");
			    } catch (InternalError e) {
			        msg = "Error loading image, could not get message"+
			              " from bundle.\n"+e.getMessage();
			    }
			    Logger.logError(AboutDialog.class,msg);
				fireError(msg);
			} 	
		}
		return result;
	}
}
