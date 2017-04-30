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
public class DBcity {
    
    private Connection myConn;
    
    public DBcity() throws Exception {
		
		//variables for database connection
		String user = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/mail";
		
		// establish database connection
		myConn = DriverManager.getConnection(url, user, password);
		
		System.out.println("DB connection successful to:" + url);
    
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


