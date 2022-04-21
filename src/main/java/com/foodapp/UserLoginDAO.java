
package com.foodapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import com.foodapp.home.ListMenus;

public class UserLoginDAO {
	public static int login(String email,String password) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
    String url="jdbc:mysql://101.53.133.59:3306/revature_training_db";
    String username="rev_user";
    String upassword="rev_user";
    Connection connection= DriverManager.getConnection(url,username,upassword);
	String query = "select S_N0,Email,Conform_Password from Food_Ordering_App_User_Register_Form where Email= ?";
    PreparedStatement statement=connection.prepareStatement(query);
	statement.setString(1,email);
	ResultSet result = statement.executeQuery();
	
	int id=0;
	String userEmail= null;
	String userPassword= null;
	while (result.next()) {
		id=result.getInt("S_N0");
		userEmail= result.getString("Email");
		userPassword= result.getString("Conform_Password");
	}
	int a=0;
	try {
		
	 if (userPassword.equals(password)) {
		a=1;
		
	}}
	catch(Exception e) {
		e.printStackTrace();
	}
	return a; 
	
}
}