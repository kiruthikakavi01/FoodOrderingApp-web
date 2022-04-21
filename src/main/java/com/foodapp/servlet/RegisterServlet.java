
package com.foodapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foodapp.User;
import com.foodapp.UserDAO;
import com.foodapp.UserValidator;



//import com.foodapp.validator.UserValidator;

//import com.google.gson.Gson;
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try{User user = new User();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contactNumber=request.getParameter("contactNumber");
		String createPassword=request.getParameter("createPassword");
		String conformPassword=request.getParameter("conformPassword");
		
		
		user.setName(name);
		user.setEmail(email);
		user.setContactNumber(contactNumber);
		user.setCreatePassword(createPassword);
		user.setConformPassword(conformPassword);
		
		
		UserValidator.validatorUserDetails(user);
		UserDAO userDAO=new UserDAO();
		
		userDAO.register(user);
	
		
	
		out.println(0);
		
		
		out.flush();		
		}
		catch(Exception e) {
			out.println(e);
		}
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
