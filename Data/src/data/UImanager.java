import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UImanager extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	
	//private List<City> city;
	 DBcity db;
	static Table table1;
	static TableCity table2;
	static EmployeeTableModel t;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					UImanager frame = new UImanager();
					
					//table.setModel(table1);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public UImanager() {
		

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnShowData = new JButton("Refresh Data");
		btnShowData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/// reload the db to the most current form 
				try {
					db = new DBcity();
					table1 = new Table(db.getAllcity());
					table.setModel(table1);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		panel.add(btnShowData);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int n = JOptionPane.showConfirmDialog(null, 
						"Do you want to Exit the Application ?",
						"Warning Question !", JOptionPane.YES_NO_OPTION);
				
				if(n == 0)
				{
					//Close Application
					System.exit(0);
				} 
	
			}
		});
		
		JButton btnAddcity = new JButton("Add city");
		btnAddcity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// create dialog
				AddcityD dialog = new AddcityD(UImanager.this, db);
				
				//show dialog 
				dialog.setVisible(true);
			}
		});
		panel_1.add(btnAddcity);
		panel_1.add(btnExit);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}

}
