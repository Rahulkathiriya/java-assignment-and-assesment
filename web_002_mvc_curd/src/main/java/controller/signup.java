package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userdao;
import model.user;

@WebServlet("/signup")
public class signup extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
	       String name = req.getParameter("name");
	       String email = req.getParameter("email");
	       String password = req.getParameter("password");
	       String number = req.getParameter("number");
	       
	       user u = new user();
	       u.setUserName(name);
	       u.setEmail(email);
	       u.setPassword(password);
	       u.setNumber(number);
	        
	       userdao dao = new userdao();
	       boolean checkEmail = dao.emailExist(u); 
	      
	
	       if(checkEmail) {
	    	   
	    	   req.setAttribute("emailError", "Email already exist....!!");
	    	   req.getRequestDispatcher("signup.jsp").forward(req, resp);
	    	   
	       }
	       else {
	    	   
	    	   int user = dao.addUser(u);
	    	   if(user > 0) {
	    		   
	    		   req.setAttribute("adduser", "Account Created Successfully Login Hear....!!!");
	    		   req.getRequestDispatcher("login.jsp").forward(req, resp);
	    		   
	    	   }
	       }
	
	
	
	
	
	
	
	
	
	}
}
