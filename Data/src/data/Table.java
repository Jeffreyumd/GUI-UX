import java.util.List;

import javax.swing.table.AbstractTableModel;

 class Table extends AbstractTableModel {
	
	private static final int NAME_COL = 0;
	private static final int CC_COL = 1;
	private static final int DISTRICT_COL = 2;
	private static final int POPULATION_COL = 3;
	
	private String[]  columnNames = {"Name of city", "CountryCode", "District", "Population"};
	
	private List<City> citys;
	
	// Constructor
	public Table (List<City> theCity){
		 citys = theCity;
	}
	
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return citys.size();
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}
	
	@Override
	public Object getValueAt(int row, int col) {

		City city = citys.get(row);

		switch (col) {
		case NAME_COL:
			return city.getName();
		case CC_COL:
			return city.getCC();
		case DISTRICT_COL:
			return city.getDistrict();
		case POPULATION_COL:
			return city.getPopulation();
		default:
			return city.getName();
		}
	}


	public Class getColumnClass(int c){
		return getValueAt(0, c).getClass();
	}
	
}

