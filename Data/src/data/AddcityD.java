
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddcityD extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldName;
	private JTextField textFieldCC;
	private JTextField textFieldDistrict;
	private JTextField textFieldPopulation;

	  DBcity dbCity;
	private UImanager uiManager;
	
	/**
	 * 
	 * Constructor 
	 */
	public AddcityD(UImanager theUImanager, DBcity theDBcity)
	{
		
		this();
		dbCity = theDBcity;
		uiManager = theUImanager;
	}
	
	/**
	 * Create the dialog.
	 */
	public AddcityD() {
		setTitle("Add City Table");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 11, 434, 108);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{48, 338, 0};
		gbl_contentPanel.rowHeights = new int[]{20, 14, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		
		JLabel lblNewLabel = new JLabel("City name");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		GridBagConstraints gbc_textFieldName = new GridBagConstraints();
		gbc_textFieldName.anchor = GridBagConstraints.NORTH;
		gbc_textFieldName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldName.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldName.gridx = 1;
		gbc_textFieldName.gridy = 0;
		contentPanel.add(textFieldName, gbc_textFieldName);
		
		JLabel lblCountryCode = new JLabel("Country Code");
		GridBagConstraints gbc_lblCountryCode = new GridBagConstraints();
		gbc_lblCountryCode.anchor = GridBagConstraints.EAST;
		gbc_lblCountryCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblCountryCode.gridx = 0;
		gbc_lblCountryCode.gridy = 1;
		contentPanel.add(lblCountryCode, gbc_lblCountryCode);
		
		textFieldCC = new JTextField();
		GridBagConstraints gbc_textFieldCC = new GridBagConstraints();
		gbc_textFieldCC.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCC.gridx = 1;
		gbc_textFieldCC.gridy = 1;
		contentPanel.add(textFieldCC, gbc_textFieldCC);
		textFieldCC.setColumns(10);
		
		JLabel lblDistrict = new JLabel("District");
		GridBagConstraints gbc_lblDistrict = new GridBagConstraints();
		gbc_lblDistrict.anchor = GridBagConstraints.EAST;
		gbc_lblDistrict.insets = new Insets(0, 0, 5, 5);
		gbc_lblDistrict.gridx = 0;
		gbc_lblDistrict.gridy = 2;
		contentPanel.add(lblDistrict, gbc_lblDistrict);
		
		textFieldDistrict = new JTextField();
		GridBagConstraints gbc_textFieldDistrict = new GridBagConstraints();
		gbc_textFieldDistrict.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldDistrict.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldDistrict.gridx = 1;
		gbc_textFieldDistrict.gridy = 2;
		contentPanel.add(textFieldDistrict, gbc_textFieldDistrict);
		textFieldDistrict.setColumns(10);
		
		JLabel lblPopulation = new JLabel("Population");
		GridBagConstraints gbc_lblPopulation = new GridBagConstraints();
		gbc_lblPopulation.anchor = GridBagConstraints.EAST;
		gbc_lblPopulation.insets = new Insets(0, 0, 0, 5);
		gbc_lblPopulation.gridx = 0;
		gbc_lblPopulation.gridy = 3;
		contentPanel.add(lblPopulation, gbc_lblPopulation);
		
		textFieldPopulation = new JTextField();
		GridBagConstraints gbc_textFieldPopulation = new GridBagConstraints();
		gbc_textFieldPopulation.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPopulation.gridx = 1;
		gbc_textFieldPopulation.gridy = 3;
		contentPanel.add(textFieldPopulation, gbc_textFieldPopulation);
		textFieldPopulation.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 128, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton saveButton = new JButton("save");
				saveButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						saveCity();	
						
					}
				});
				saveButton.setActionCommand("OK");
				buttonPane.add(saveButton);
				getRootPane().setDefaultButton(saveButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//close dialog
						setVisible(false);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	protected void saveCity(){
		
		
		//get the info from gui
		String name = textFieldName.getText();
		String cc = textFieldCC.getText();
		String district = textFieldDistrict.getText();
		
		String popStr = textFieldPopulation.getText();
		int population = Integer.parseInt(popStr);
		
		City theCity = new City(name,cc,district,population);
		
		//save to the database
		try{
			
			dbCity = new DBcity();
			
			
			// add city to database
			dbCity.addCity(theCity);
			
			
			//close dialog
			setVisible(false);
			dispose();
			
			//frefresh gui list
			
			
			// display success message
			JOptionPane.showMessageDialog(uiManager, "City added Succesfully", "City Added",
					JOptionPane.INFORMATION_MESSAGE);
			
		} catch(Exception exc){
			JOptionPane.showMessageDialog(uiManager, "Error saving info: " + exc.getMessage(),
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	
		//System.out.println(theCity.toString())		
	}
	
	
	
	
}
