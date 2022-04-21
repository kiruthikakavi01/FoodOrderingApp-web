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
import com.foodapp.User;
import com.foodapp.UserDAO;
import com.google.gson.Gson;

/**
 * Servlet implementation class listUserServlet
 */
@WebServlet("/listUserServlet")
public class listUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public listUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
		
		
		try {
			List<User> user=UserDAO.findAllUser();
			Gson gson= new Gson();
			String json=gson.toJson(user);
			out.println(json);
			System.out.println(json);
			out.flush();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
