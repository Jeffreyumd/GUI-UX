import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableCity extends AbstractTableModel{
	
	private static final int NAME = 0;
	private static final int D = 1;
	private static final int CC = 2;
	private static final int P = 3;

	private String[] columnNames = { "Last Name", "First Name", "Email", "Salary" };
	private List<City> city;

	public TableCity(List<City> theCity) {
		city = theCity;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return city.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		
		City theCity = city.get(row);
		
		switch (col) {
		case NAME:
			return theCity.getName();
		case D:
			return theCity.getDistrict();
		case CC:
			return theCity.getCC();
		case P:
			return theCity.getPopulation();
		default:
			return theCity.getName();
		}
	}
	
}
