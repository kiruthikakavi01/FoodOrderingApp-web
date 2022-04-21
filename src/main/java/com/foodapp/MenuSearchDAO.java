package com.foodapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class MenuSearchDAO {
	public List<Menu> findAll() throws SQLException, ClassNotFoundException {
		List<Menu> menuList = new ArrayList<Menu>();
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		Class.forName("com.mysql.cj.jdbc.Driver");
	    String url="jdbc:mysql://101.53.133.59:3306/revature_training_db";
	    String username="rev_user";
	    String upassword="rev_user";
	    connection= DriverManager.getConnection(url,username,upassword);
		String sql = "select id,Veg_dishes,Veg_Dishes_price,Non_Veg_dishes,Non_Veg_dishes_price from Food_Ordering_App_Menus";
		statement = connection.prepareStatement(sql);
		rs = statement.executeQuery();
		//System.err.println("\nId \t\t Veg_Dishes \t\t Veg_Dishes_Price \t\t Non_Veg_Dishes \t\t Non_Veg_Dishes_Price");
		while (rs.next()) {
			Integer id = rs.getInt("id");
			String vegDishes = rs.getString("Veg_dishes");
			Integer vegDishesPrice = rs.getInt("Veg_Dishes_price");
			String nonVegDishes = rs.getString("Non_Veg_dishes");
			Integer nonVegDishesPrice = rs.getInt("Non_Veg_dishes_price");

			Menu menuObj = new Menu();
			menuObj.setId(id);
			menuObj.setVegDishes(vegDishes);
			menuObj.setVegDishesPrice(vegDishesPrice);
			menuObj.setNonVegDishes(nonVegDishes);
			menuObj.setNonVegDishesPrice(nonVegDishesPrice);
			//System.out.format("\n%d \t\t %s \t\t %d \t\t %s \t\t %d\n", id, vegDishes, vegDishesPrice, nonVegDishes,
					//nonVegDishesPrice);
			menuList.add(menuObj);

		}
		return menuList;	
}
}
