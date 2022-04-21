package com.foodapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foodapp.Menu;
import com.foodapp.MenuSearchDAO;
import com.google.gson.Gson;


/**
 * Servlet implementation class listMenuServlet
 */
@WebServlet("/listMenuServlet")
public class listMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		MenuSearchDAO menuSearch=new MenuSearchDAO();
		try {
			List<Menu> menus=menuSearch.findAll();
			Gson gson= new Gson();
			String json=gson.toJson(menus);
			out.println(json);
			System.out.println(json);
			out.flush();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		out.flush();
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
