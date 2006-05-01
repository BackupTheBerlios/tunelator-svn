/*
 * Created on 28-jun-2005
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
package es.tunelator.gui.models;

import java.util.Comparator;

import ca.odell.glazedlists.gui.AdvancedTableFormat;
import ca.odell.glazedlists.gui.WritableTableFormat;
import es.tunelator.gui.adv.MainFrame;
import es.tunelator.resources.Resourcer;
import es.tunelator.vo.PuntoVO;
import es.tunelator.vo.PuntoVOColumnComparator;

/**
 * &COPY; 2005 Juan Alvarez Ferrando<br/><br/>
 * 
 * Holds the table format required to use Glazed Lists table model
 * <p/>
 * @author <a href="mailto:jaferrando@users.berlios.de">Juan Alvarez Ferrando</a>
 */
public class PointsTableFormat implements AdvancedTableFormat,
	WritableTableFormat {
    /**
     * Names that will appear as headers of the columns in the table
     */
    private String [] columnIdentifiers = null;
    /**
     * Type of the values in each column
     */
    private Class [] columnTypes = null;
    /**
     * Creates and initializes a new <code>PointsTableFormat</code>
     */
    public PointsTableFormat(){
        initialize();
    }
    /**
     * Initializes column identifiers and types.
     * The identifiers are read from the resource file of this class that
     * corresponds to the default locale.
     */
    private void initialize() {
        columnIdentifiers = new String[] {
                Resourcer.getString(MainFrame.class,
                        "editpoints.grid.columns.pointID"),
                Resourcer.getString(MainFrame.class,
                        "editpoints.grid.columns.pkteor"),
                Resourcer.getString(MainFrame.class,
                        "editpoints.grid.columns.pkindex"),
                Resourcer.getString(MainFrame.class,
                        "editpoints.grid.columns.pkact"),
                Resourcer.getString(MainFrame.class,
                        "editpoints.grid.columns.deje"),
                Resourcer.getString(MainFrame.class,
                        "editpoints.grid.columns.heightInc"),
                Resourcer.getString(MainFrame.class,
                        "editpoints.grid.columns.x"),
                Resourcer.getString(MainFrame.class,
                        "editpoints.grid.columns.y"),
                Resourcer.getString(MainFrame.class,
                        "editpoints.grid.columns.height"),
                Resourcer.getString(MainFrame.class,
                        "editpoints.grid.columns.code"),
                Resourcer.getString(MainFrame.class,
                        "editpoints.grid.columns.date"),
                Resourcer.getString(MainFrame.class,
                        "editpoints.grid.columns.time")
        };
        columnTypes = new Class [] {
                String.class, // ID
                String.class, // PK Teor.
                String.class, // PK Index
                String.class, // PK Act.
                String.class, // Dist Eje
                String.class, // Heignht Inc.
                String.class, // X
                String.class, // Y
                String.class, // Height
                String.class, // Code
                String.class,   // Date
                String.class    // Time
        };
    }
    /**
     * @see ca.odell.glazedlists.gui.TableFormat#getColumnCount()
     */
    public int getColumnCount() {
        return columnIdentifiers.length;
    }
    /**
     * @see ca.odell.glazedlists.gui.TableFormat#getColumnName(int)
     */
    public String getColumnName(int columnIndex) {
        return columnIdentifiers[columnIndex];
    }
    /**
     * Returns the value of the attribute of the <code>PuntoVO</code> object 
     * received in <code>data</code> that corresponds to the specified column
     * index.<br/>
     * The correspondence used is:
     * <dir>
     *    <li>0 = pointID</li>
     *    <li>1 = PKTeor</li>
     *    <li>2 = IndexInPK</li>
     *    <li>3 = PKAct</li>
     *    <li>4 = Deje</li>
     *    <li>5 = HeightInc</li>
     *    <li>6 = XCoord</li>
     *    <li>7 = YCoord</li>
     *    <li>8 = Height</li>
     *    <li>9 = Code</li>
     *    <li>10 = Date</li>
     *    <li>11 = Time</li>
     * </dir>
     * @see ca.odell.glazedlists.gui.TableFormat#
     * getColumnValue(java.lang.Object, int)
     */
    public Object getColumnValue(Object data, int columnIndex) {
        if(data == null)
            return "NULL";
        PuntoVO punto = (PuntoVO) data;
        switch (columnIndex) {
        	case 0: return punto.getPointID();
        	case 1: return punto.getPkTeor();
        	case 2: return punto.getIndexInPK();
        	case 3: return punto.getPkAct();
        	case 4: return punto.getDeje();
        	case 5: return punto.getHeightInc();
        	case 6: return punto.getXCoord();
        	case 7: return punto.getYCoord();
        	case 8: return punto.getHeight();
        	case 9: return punto.getCode();
        	case 10: return punto.getDate();
        	case 11: return punto.getTime();
        	default: throw new InternalError("Invalid table model column "+
        	        "index "+columnIndex);
        }
    }
    /**
     * @see ca.odell.glazedlists.gui.AdvancedTableFormat#getColumnClass(int)
     */
    public Class getColumnClass(int columnIndex) {
        return columnTypes[columnIndex];
    }
    /**
     * Creates a <code>PuntoVOColumnComparator</code> for that compares 
     * <code>PuntoVO</code>
     * objects on the attribute that corresponds to the specified column index.
     * The correspondence used is:
     * <dir>
     *    <li>0 = pointID</li>
     *    <li>1 = PKTeor</li>
     *    <li>2 = IndexInPK</li>
     *    <li>3 = PKAct</li>
     *    <li>4 = Deje</li>
     *    <li>5 = HeightInc</li>
     *    <li>6 = XCoord</li>
     *    <li>7 = YCoord</li>
     *    <li>8 = Height</li>
     *    <li>9 = Code</li>
     *    <li>10 = Date</li>
     *    <li>11 = Time</li>
     * </dir>
     * @see ca.odell.glazedlists.gui.AdvancedTableFormat#
     * getColumnComparator(int)
     */
    public Comparator getColumnComparator(int columnIndex) {
        Comparator result = null;
	    switch (columnIndex) {
	    	case 0: result = new PuntoVOColumnComparator(PuntoVO.POINT_ID);
	    			break;
	    	case 1: result = new PuntoVOColumnComparator(PuntoVO.PK_TEOR);
	    			break;
	    	case 2: result = new PuntoVOColumnComparator(PuntoVO.PK_INDEX);
	    			break;
	    	case 3: result = new PuntoVOColumnComparator(PuntoVO.PK_REAL);
					break;
	    	case 4: result = new PuntoVOColumnComparator(PuntoVO.DEJE);
					break;
	    	case 5: result = new PuntoVOColumnComparator(PuntoVO.HINC);
					break;
	    	case 6: result = new PuntoVOColumnComparator(PuntoVO.X);
					break;
	    	case 7: result = new PuntoVOColumnComparator(PuntoVO.Y);
					break;
	    	case 8: result = new PuntoVOColumnComparator(PuntoVO.HEIGHT);
					break;
	    	case 9: result = new PuntoVOColumnComparator(PuntoVO.CODE);
					break;
	    	case 10: result = new PuntoVOColumnComparator(PuntoVO.DATE);
					break;
	    	case 11: result = new PuntoVOColumnComparator(PuntoVO.TIME);
					break;
	    	default: throw new InternalError("Invalid table model column "+
	    	        "index "+columnIndex);
	    }
	    return result;
    }
    /**
     * Allways returns true
     * @see ca.odell.glazedlists.gui.WritableTableFormat#isEditable
     * (java.lang.Object, int)
     */
    public boolean isEditable(Object baseObject, int column) {
        return true;
    }
    /**
     * Sets the given value to the attribue that corresponds to the specified column.
     * The correspondence used is:
     * <dir>
     *    <li>0 = pointID</li>
     *    <li>1 = PKTeor</li>
     *    <li>2 = IndexInPK</li>
     *    <li>3 = PKAct</li>
     *    <li>4 = Deje</li>
     *    <li>5 = HeightInc</li>
     *    <li>6 = XCoord</li>
     *    <li>7 = YCoord</li>
     *    <li>8 = Height</li>
     *    <li>9 = Code</li>
     *    <li>10 = Date</li>
     *    <li>11 = Time</li>
     * </dir>
     * @see ca.odell.glazedlists.gui.WritableTableFormat#setColumnValue
     * (java.lang.Object, java.lang.Object, int)
     */
    public Object setColumnValue(Object baseObject, Object editedValue,
            int column) {
        PuntoVO element = (PuntoVO) baseObject;
        switch(column){
	    	case 0: element.setPointID((String)editedValue);
	    			break;
			case 1: element.setPkTeor((String)editedValue);
					break;
			case 2: element.setIndexInPK((String)editedValue);
					break;
			case 3: element.setPkAct((String)editedValue);
					break;
			case 4: element.setDeje((String)editedValue);
					break;
			case 5: element.setHeightInc((String)editedValue);
					break;
			case 6: element.setXCoord((String)editedValue);
					break;
			case 7: element.setYCoord((String)editedValue);
					break;
			case 8: element.setHeight((String)editedValue);
					break;
			case 9: element.setCode((String)editedValue);
					break;
			case 10: element.setDate((String)editedValue);
					break;
			case 11: element.setTime((String)editedValue);
					break;
			default: throw new InternalError("Invalid table model "+
			        "column index "+column);
        }
        // BEWARE: Usually we would return element, but as we are using event 
        // lists and an ObservableElementList in particular, it happens that 
        // when the user edits the value of a cell in a sorted column, the 
        // element emits an event at which the SortedList of the table 
        // responds reordering the element and thus moving it to another row.
        // Just after that, the EventTableModel sets the updated element in 
        // the row where it was, but now it is no more there, some other 
        // element gets replaced and we find we have the edited element 
        // duplicated.
        // Returning null tells EventTableModel not to call set on the table.
        return null;
    }
}
