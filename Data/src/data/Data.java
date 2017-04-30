/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.*;
/**
 *
 * @author Jeffrey A
 */
public class Data {
    
  

                
      private static Connection myConn;
      
    public static void main(String[] args) throws Exception{
        

		String user = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/mail";
                
                //Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		// establish database connection
		myConn = DriverManager.getConnection(url, user, password);
		
		System.out.println("DB connection successful to:" + url);
                
                getAllcity();
                //T a = new T();
                //a.setVisible(true);
    }
    
    	public static void getAllcity() throws Exception {
		
		//instance for ArrayList city
		//List<City> list = new ArrayList<>();
		
		Statement sqlState = null;
		ResultSet rows = null;
		
		try
		{
			sqlState = myConn.createStatement();
			rows = sqlState.executeQuery("Select * from city");
			
			while(rows.next())
			{	
			 System.out.println(rows.getString("Name") + rows.getString("ID"));
			}
			
			//return list;
		} 
                		finally
		{
			//close(sqlState, rows);
		}
        }
        
        private City createCity(ResultSet rows) throws SQLException{
		
		//store required parameters for city instance
		int id = rows.getInt("ID");
		int population = rows.getInt("Population");
		String name = rows.getString("Name");
		String district = rows.getString("District");
		String cc = rows.getString("CountryCode");
		
		//instance of city
		City tempCity = new City(id, name, cc, district, population);
		
		return tempCity;
	}
    
}
