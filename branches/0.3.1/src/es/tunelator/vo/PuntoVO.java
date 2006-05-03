/*
 * Created on 19-ene-2005
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
package es.tunelator.vo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

import es.tunelator.Constants;
import es.tunelator.log.Logger;
import es.tunelator.plugins.transformers.TransformException;
import es.tunelator.plugins.transformers.vo.Point2D;
import es.tunelator.plugins.transformers.vo.Point3D;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Value Object (VO) to hold the data of a point.
 * All data is represented in <code>String</code> form to preserve its exact
 * value in the input files. <p/>
 * This requires a way to get a the data in their native types, which is 
 * provided by the <code>Point3D</code> type and the <code>getPoint3D()</code>
 * method.<p/>
 * Attributes are given static constant designations so they can be referred by
 * generic code in some convenience methods, related with the conversion from 
 * <code>String</code> to native values. Used for example to implement 
 * <code>PuntoVOSimpleComparator</code>.
 * 
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class PuntoVO implements Cloneable {
    
    /**
     * Constants that represent the attributes
     */
    public static final int POINT_ID = 1;
    public static final int PK_TEOR = 2;
    public static final int PK_REAL = 3;
    public static final int DEJE = 4;
    public static final int HINC = 5;
    public static final int X = 6;
    public static final int Y = 7;
    public static final int HEIGHT = 8;
    public static final int CODE = 9;
    public static final int DATE = 10;
    public static final int TIME = 11;
    public static final int PK_INDEX = 12;

	/**
	 * <code>date</code> - Date when measueremet was done by the equipment. 
	 * Date value in "dd.mm.YYYY" format. Time is allways considered at 
	 * 0 hours 0 minutes 0 seconds.
	 */
	private String date = null;
	/**
	 * <code>time</code> - Time when measurement was done by the equipment.
	 * Time value in "HH:MM:SS" format. Times are implicitly relative to a
	 * reference date defined in <code>Constants</code>
	 */
	private String time = null;
	/**
	 * <code>pkAct</code> - Kilometric point as measured by the equipment.
	 * Double value in "#######0.000000" format
	 */
	private String pkAct = null;
	/**
	 * <code>deje</code> - Distance to the axis. Double value in 
	 * "#######0.000000" format
	 */
	private String deje = null;
	/**
	 * <code>heightInc</code> - Increment in Z coordinate from the axis. Double
	 * value in "#######0.000000" format
	 */
	private String heightInc = null;
	/**
	 * <code>pkTeor</code> - Theoric kilometric point of the profile this point
	 * belongs to. Double value in "#######0.000000" format
	 */
	private String pkTeor = null;
	/**
	 * <code>height</code> - Z coordinate. Double value in "#######0.000000" 
	 * format
	 */
	private String height = null;
	/**
	 * <code>xCoord</code> - X coordinate. Double value in "#######0.000000" 
	 * format
	 */
	private String xCoord = null;
	/**
	 * <code>yCoord</code> - Y coordinate. Double value in "#######0.000000" 
	 * format
	 */
	private String yCoord = null;
	/**
	 * Comment for <code>pointID</code>
	 */
	private String pointID = null;
	/**
	 * <code>code</code> - Code set in the measure equipment at the user's 
	 * discrection
	 */
	private String code = null;
	/**
	 * <code>indexInPK</code> - Position of the point in the profile
	 */
	private String indexInPK = null;
	/**
	 * <code>support</code> - Provides implementation required to fire 
	 * PropertyChange events
	 */
	private PropertyChangeSupport support = new PropertyChangeSupport(this);
	/**
	 * <code>fireAttributeChanges</code> - Controls if the use of set methods
	 * fires chanve events
	 */
	private boolean fireAttributeChanges = true;
    /**
     * @return Returns the indexInPK.
     */
    public String getIndexInPK() {
        return indexInPK;
    }
    /**
     * @param indexInPK The indexInPK to set.
     */
    public void setIndexInPK(String indexInPK) {
        this.indexInPK = indexInPK;
	    if(!indexInPK.equals(this.indexInPK)){
	        String oldValue = this.indexInPK;
			this.indexInPK = indexInPK;
			if(fireAttributeChanges){
			    support.firePropertyChange("indexInPK",oldValue,indexInPK);
			}
	    }
    }
	/**
	 * @return Returns the code
	 */
	public final String getCode() {
		return code;
	}
	/**
	 * Adds a <code>PropertyChangeListener</code> to those that will receive 
	 * events when this bean's properties change.
	 * @param listener (<code>PropertyChangeListener</code>)
	 * @see java.beans.PropertyChangeSupport
	 */
	public void addPropertyChangeListener(PropertyChangeListener listener){
	    support.addPropertyChangeListener(listener);
	}
	/**
	 * Remove a <code>PropertyChangeListener</code> to those that will receive
	 * events when this bean's properties change.
	 * @param listener
	 * @see java.beans.PropertyChangeSupport
	 */
	public void removePropertyChangeListener(PropertyChangeListener listener){
	    support.removePropertyChangeListener(listener);
	}
	/**
	 * @param code (<code>String</code>) - The code value to set.
	 */
	public final void setCode(String code) { 
	    if(!code.equals(this.code)){
	        String oldValue = this.code;
			this.code = code;
			if(fireAttributeChanges){
			    support.firePropertyChange("code",oldValue,code);
			}
	    }
	}
	/**
	 * @return Returns the date.
	 */
	public final String getDate() {
		return date;
	}
	/**
	 * @param date The date to set.
	 */
	public final void setDate(String date) {
	    if(!date.equals(this.date)){
	        String oldValue = this.date;
			this.date = date;
			if(fireAttributeChanges){
			    support.firePropertyChange("date",oldValue,date);
			}
	    }
	}
	/**
	 * @return Returns the deje.
	 */
	public final String getDeje() {
		return deje;
	}
	/**
	 * @param deje The deje to set.
	 */
	public final void setDeje(String deje) {
	    if(!deje.equals(this.deje)){
	        String oldValue = this.deje;
			this.deje = deje;
			if(fireAttributeChanges){
			    support.firePropertyChange("deje",oldValue,deje);
			}
	    }
	}
	/**
	 * @return Returns the height.
	 */
	public final String getHeight() {
		return height;
	}
	/**
	 * @param height The height to set.
	 */
	public final void setHeight(String height) {
	    if(!height.equals(this.height)){
	        String oldValue = this.height;
			this.height = height;
			if(fireAttributeChanges){
			    support.firePropertyChange("height",oldValue,height);
			}
	    }
	}
	/**
	 * @return Returns the heightInc.
	 */
	public final String getHeightInc() {
		return heightInc;
	}
	/**
	 * @param heightInc The heightInc to set.
	 */
	public final void setHeightInc(String heightInc) {
	    if(!heightInc.equals(this.heightInc)){
	        String oldValue = this.heightInc;
			this.heightInc = heightInc;
			if(fireAttributeChanges){
			    support.firePropertyChange("heightInc",oldValue,heightInc);
			}
	    }
	}
	/**
	 * @return Returns the pkAct.
	 */
	public final String getPkAct() {
		return pkAct;
	}
	/**
	 * @param pkAct The pkAct to set.
	 */
	public final void setPkAct(String pkAct) {
	    if(!pkAct.equals(this.pkAct)){
	        String oldValue = this.pkAct;
			this.pkAct = pkAct;
			if(fireAttributeChanges){
			    support.firePropertyChange("pkAct",oldValue,pkAct);
			}
	    }
	}
	/**
	 * @return Returns the pkTeor.
	 */
	public final String getPkTeor() {
		return pkTeor;
	}
	/**
	 * @param pkTeor The pkTeor to set.
	 */
	public final void setPkTeor(String pkTeor) {
	    if(!pkTeor.equals(this.pkTeor)){
	        String oldValue = this.pkTeor;
			this.pkTeor = pkTeor;
			if(fireAttributeChanges){
			    support.firePropertyChange("pkTeor",oldValue,pkTeor);
			}
	    }
	}
	/**
	 * @return Returns the pointID.
	 */
	public final String getPointID() {
		return pointID;
	}
	/**
	 * @param pointID The pointID to set.
	 */
	public final void setPointID(String pointID) {
	    if(!pointID.equals(this.pointID)){
	        String oldValue = this.pointID;
			this.pointID = pointID;
			if(fireAttributeChanges){
			    support.firePropertyChange("pointID",oldValue,pointID);
			}
	    }
	}
	/**
	 * @return Returns the time.
	 */
	public final String getTime() {
		return time;
	}
	/**
	 * @param time The time to set.
	 */
	public final void setTime(String time) {
	    if(!time.equals(this.time)){
	        String oldValue = this.time;
			this.time = time;
			if(fireAttributeChanges){
			    support.firePropertyChange("time",oldValue,time);
			}
	    }
	}
	/**
	 * @return Returns the xCoord.
	 */
	public final String getXCoord() {
		return xCoord;
	}
	/**
	 * @param coord The xCoord to set.
	 */
	public final void setXCoord(String coord) {
	    if(!coord.equals(this.xCoord)){
	        String oldValue = this.xCoord;
			xCoord = coord;
			if(fireAttributeChanges){
			    support.firePropertyChange("xCoord",oldValue,coord);
			}
	    }
	}
	/**
	 * @return Returns the yCoord.
	 */
	public final String getYCoord() {
		return yCoord;
	}
	/**
	 * @param coord The yCoord to set.
	 */
	public final void setYCoord(String coord) {
	    if(!coord.equals(this.yCoord)){
	        String oldValue = this.yCoord;
			yCoord = coord;
			if(fireAttributeChanges){
			    support.firePropertyChange("yCoord",oldValue,coord);
			}
	    }
	}
	/**
	 * Sets the flag that controls the firing of events when individual 
	 * attributes are modified.
	 * This is to be used when updating several attributes, to avoid one
	 * event per change.
	 * 
	 * @param flag When true events are fired with each attribute value change,
	 * when false no event is thrown from the setX methods.
	 * @return The previous state of the flag to be saved and later set again 
	 */
	protected boolean fireAttributeChanges(boolean flag){
	    boolean previousValue = fireAttributeChanges;
	    fireAttributeChanges = flag;
	    return previousValue;
	}
	/**
	 * Updates the attributes with those of <code>newData</code>. If 
	 * <code>setEmpty</code> is false those attributes with empty string 
	 * values in <code>newData</code> are not updated.<p/>
	 * Will only fire a single <code>PropertyChangeEvent</code>, and only if 
	 * some change occurs.
	 * 
	 * @param newData <code>PuntoVO</code> with the data to update
	 * @param setEmpty if true all attributes are copied, else only those with
	 * non empty values in <code>newData</code>
	 */
	public void updateData(PuntoVO newData,boolean setEmpty) {
	    fireAttributeChanges(false);
	    if(newData != null){
	        boolean someChange = false;
	        if(setEmpty){
	            this.setCode(newData.getCode());
	            this.setDate(newData.getDate());
	            this.setDeje(newData.getDeje());
	            this.setHeight(newData.getHeight());
	            this.setHeightInc(newData.getHeightInc());
	            this.setPkAct(newData.getPkAct());
	            this.setPkTeor(newData.getPkTeor());
	            this.setIndexInPK(newData.getIndexInPK());
	            this.setPointID(newData.getPointID());
	            this.setTime(newData.getTime());
	            this.setXCoord(newData.getXCoord());
	            this.setYCoord(newData.getYCoord());
	            someChange = true;
	        } else {
	            if (newData.getCode().trim().length()>0) {
	                this.setCode(newData.getCode());
	                someChange = true;
	            }
	            if (newData.getDate().trim().length()>0){ 
	                this.setDate(newData.getDate());
                	someChange = true;
            	}
	            if (newData.getDeje().trim().length()>0){ 
	                this.setDeje(newData.getDeje());
                	someChange = true;
        		}
	            if (newData.getHeight().trim().length()>0){ 
	                this.setHeight(newData.getHeight());
                	someChange = true;
    			}
	            if (newData.getHeightInc().trim().length()>0){ 
	                this.setHeightInc(newData.getHeightInc());
                	someChange = true;
				}
	            if (newData.getPkAct().trim().length()>0){ 
	                this.setPkAct(newData.getPkAct());
                	someChange = true;
            	}
	            if (newData.getPkTeor().trim().length()>0){ 
	                this.setPkTeor(newData.getPkTeor());
                	someChange = true;
            	}
	            if (newData.getIndexInPK().trim().length()>0){ 
	                this.setIndexInPK(newData.getIndexInPK());
	                someChange = true;
	            }
	            if (newData.getPointID().trim().length()>0){ 
	                this.setPointID(newData.getPointID());
                	someChange = true;
            	}
	            if (newData.getTime().trim().length()>0){ 
	                this.setTime(newData.getTime());
	                someChange = true;
	            }
	            if (newData.getXCoord().trim().length()>0) {
	                this.setXCoord(newData.getXCoord());
	                someChange = true;
	            }
	            if (newData.getYCoord().trim().length()>0){ 
	                this.setYCoord(newData.getYCoord());
	                someChange = true;
	            }
	        }
		    fireAttributeChanges(true);
	        if(someChange) {
	            // As the PropertyChangeEvent class stablishes, if several 
	            // properties have changed the property name, old value and
	            // new value attributes of the event are set to null.
			    support.firePropertyChange(null,null,null);
	        }
	    }
	}
	/**
	 * Returns a <code>String</code> representation of the point as a 
	 * concatenation of its attributes; each of them preceded by an identfying
	 * label.<p/>
	 * This method is used for convenience when debuging.
	 * 
	 * @see java.lang.Object.toString()
	 */
	public String toString() {
	    return("ID:"+pointID+" Date:"+date+" Time:"+time+" PKT:"+pkTeor+" PKA:"
	            +pkAct+" index:"+indexInPK+" X:"+xCoord+" Y:"+yCoord+" Z:"+height+" IncZ:"
	            +heightInc+" Deje:"+deje+" Code:"+code);
	}
	/**
	 * Implements the <code>Cloneable</code> interface
	 * @see java.lang.Cloneable
	 */
	public Object clone() {
        PuntoVO result = new PuntoVO();
        result.update(this);
        return result;
	}
    /**
     * Returns a <code>DecimalFormat</code> to parse the <code>String</code> 
     * representation of the double values. Used by <code>getPoint3D</code>
     * @return <code>DecimalFormat</code> with pattern "#######0.000000"
     */
    protected static DecimalFormat getDoubleFormat() {
		DecimalFormat formatter = (DecimalFormat) DecimalFormat.getInstance();
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		formatter.setDecimalFormatSymbols(symbols);
		formatter.applyPattern("#######0.000000");
		return formatter;
    }
    /**
     * Returns a <code>SimpleDateFormat</code> to parse the <code>String</code>
     * representation of the date values. Used by <code>getPoint3D</code>
     * @return <code>SimpleDateFormat</code> with pattern "dd.MM.yyyy"
     */
    protected static SimpleDateFormat getDateFormat() {
		SimpleDateFormat formatter = (SimpleDateFormat) SimpleDateFormat.
			getInstance();
		formatter.applyPattern("dd.MM.yyyy");
		return formatter;
    }
    /**
     * Returns a <code>SimpleDateFormat</code> to parse the <code>String</code>
     * representation of the time values. Used by <code>getPoint3D</code>
     * This pattern needs day, month and year to which the time will be 
     * referenced.
     * @return <code>SimpleDateFormat</code> with pattern "dd.MM.yyyy HH:mm:ss"
     */
    protected static SimpleDateFormat getTimeFormat() {
		SimpleDateFormat formatter = (SimpleDateFormat) SimpleDateFormat.getInstance();
		formatter.applyPattern("dd.MM.yyyy HH:mm:ss");
		return formatter;
    }
    /**
     * Returns the adecuate <code>Format</code> to format and parse values 
     * of a certain attribute, specified with the constant that identifies
     * it as statically defined in this same type.
     * @param attributeKey Identifies the attribute
     * @return The format to convert the attribute to the native type ot its 
     * value
     * @throws <code>IllegalArgumentException</code> if the identifier of 
     * the attribute is to recognized
     */
    public static Format getFormat(int attributeKey){
        if(attributeKey == PuntoVO.CODE){
            return null;
        }
        if(attributeKey == PuntoVO.DATE) {
            return PuntoVO.getDateFormat();
        }
        if(attributeKey == PuntoVO.DEJE) {
            return PuntoVO.getDoubleFormat();
        }
        if(attributeKey == PuntoVO.HEIGHT){
            return PuntoVO.getDoubleFormat();
        }
        if(attributeKey == PuntoVO.HINC){
            return PuntoVO.getDoubleFormat();
        }
        if(attributeKey == PuntoVO.PK_REAL){
            return PuntoVO.getDoubleFormat();
        }
        if(attributeKey == PuntoVO.PK_TEOR){
            return PuntoVO.getDoubleFormat();
        }
        if(attributeKey == PuntoVO.POINT_ID){
            return DecimalFormat.getIntegerInstance();
        }
        if(attributeKey == PuntoVO.TIME){
            return PuntoVO.getTimeFormat();
        }
        if(attributeKey == PuntoVO.X){
            return PuntoVO.getDoubleFormat();
        }
        if(attributeKey == PuntoVO.Y){
            return PuntoVO.getDoubleFormat();
        }
        if(attributeKey == PuntoVO.PK_INDEX){
            return DecimalFormat.getIntegerInstance();
        }
        throw new IllegalArgumentException("Column identifier not known");
    }
	/**
	 * Returns a new <code>Point3D</code> with the data of this point
	 * @return <code>Point3D</code>
	 * @throws TransformException if some attribute can't be converted to 
	 * its native value
	 */
	public Point3D getPoint3D() throws TransformException {
        try {
			DecimalFormat formatter = getDoubleFormat();
			Point2D pt = null;
			String sX = getXCoord();
			String sY = getYCoord();
			String sZ = getHeight();
			String sDeje = getDeje();
			String sHeightInc = getHeightInc();
			String sPkT = getPkTeor();
			String sPkA = getPkAct();
			String sPkIndex = getIndexInPK();
			double x = formatter.parse(sX).doubleValue();
			double y = formatter.parse(sY).doubleValue();
			double z = formatter.parse(sZ).doubleValue();
			double deje = formatter.parse(sDeje).doubleValue();
			double heightInc = formatter.parse(sHeightInc).doubleValue();
			double pkT = formatter.parse(sPkT).doubleValue();
			double pkA = formatter.parse(sPkA).doubleValue();
			int pkIndex = DecimalFormat.getIntegerInstance().parse(sPkIndex).
				intValue();
			Point3D result = new Point3D(x,y,z,deje,heightInc,pkT,pkA,pkIndex);
			Date date = getDateFormat().parse(getDate());
			 // All times are relative by convention to the epoc date
			Date time = getTimeFormat().parse(Constants.TIME_REFERENCE_DATE+" "
			        	+getTime());
			result.setDate(date);
			result.setTime(time);
			return result;
        } catch (ParseException e) {
            Logger.logError(PuntoVO.class,e);
            Logger.logError(PuntoVO.class,"Offending point: "+toString());
            throw new TransformException(e);
        }
	}
	/**
	 * Returns a default <code>Comparator</code> that sorts the points
	 * by the pointID attribute values.
	 * @return instance of <code>PuntoVOSimpleComparator</code>
	 */
	public static Comparator defaultComparator(){
	    PuntoVOSimpleComparator sc = 
	        	new PuntoVOSimpleComparator(PuntoVO.POINT_ID);
	    return sc;
	}
	/**
     * @see es.tunelator.vo.DataElement#getDefaultComparator()
     */
    public Comparator getDefaultComparator() {
        return PuntoVO.defaultComparator();
    }
    /**
     * Shortcut to invoke <code>updateData</code> in default mode (full copy)
     * @param element The <code>PuntoVO</code> that'll be copied
     * @see es.tunelator.vo.PuntoVO#updateData(PuntoVO, boolean)
     */
    public void update(Object element) {
        updateData((PuntoVO)element,true);
    }
}
