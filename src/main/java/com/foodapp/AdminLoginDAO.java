package com.foodapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class AdminLoginDAO {
	public static int adminLogin(String email,String password) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    String url="jdbc:mysql://101.53.133.59:3306/revature_training_db";
	    String username="rev_user";
	    String upassword="rev_user";
	    Connection connection= DriverManager.getConnection(url,username,upassword);
		String query="SELECT email,PASSWORD FROM admin_Login WHERE email=?";
		PreparedStatement statement=connection.prepareStatement(query);
		statement.setString(1,email);
		ResultSet result = statement.executeQuery();
		
		String adminEmail=null;
		String adminPassword=null;
		while(result.next()) {
			adminEmail=result.getString("email");
			adminPassword=result.getString("PASSWORD");	
		} 
		int a=0;
		try {
		if(adminPassword.equals(password)) {
			a=1;
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return a;
	}
	
}
