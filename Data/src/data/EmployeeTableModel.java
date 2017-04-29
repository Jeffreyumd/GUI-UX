

import java.util.List;

import javax.swing.table.AbstractTableModel;



class EmployeeTableModel extends AbstractTableModel {

	private static final int LAST_NAME_COL = 0;
	private static final int FIRST_NAME_COL = 1;
	private static final int EMAIL_COL = 2;
	private static final int SALARY_COL = 3;

	private String[] columnNames = { "Last Name", "First Name", "Email",
			"Salary" };
	private List<City> employees;

	public EmployeeTableModel(List<City> theEmployees) {
		employees = theEmployees;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return employees.size();
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {

		City tempEmployee = employees.get(row);

		switch (col) {
		case LAST_NAME_COL:
			return tempEmployee.getName();
		case FIRST_NAME_COL:
			return tempEmployee.getCC();
		case EMAIL_COL:
			return tempEmployee.getDistrict();
		case SALARY_COL:
			return tempEmployee.getPopulation();
		default:
			return tempEmployee.getName();
		}
	}

	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}
}
