package gui.bedien;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class BedieningTableModel extends AbstractTableModel {
	private ArrayList<String> columnNames = new ArrayList<String>();
	private ArrayList<String[]> dataList = new ArrayList<String[]>();
	
	public BedieningTableModel() {
		//default
	}
	
	public BedieningTableModel(String[] columnNames){
		for(String c : columnNames){
			this.columnNames.add(c);
		}
	}
	
	public int getColumnCount() {
		return columnNames.size();
    }
	
    public int getRowCount() {
    	return dataList.size();
    }
    
    public String getColumnName(int col) {
    	return columnNames.get(col);
    }

    public Object getValueAt(int row, int col) {
    	return dataList.get(row)[col];
    }
    
    public void addNewRow(String[] row){
    	dataList.add(row);
    	this.fireTableDataChanged();
    }    
    
    public void removeAllRows(){
    	dataList.clear();
    }
}
