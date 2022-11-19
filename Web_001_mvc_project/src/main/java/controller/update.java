package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoUser.userProgress;
import project_model.user;

@WebServlet("/updateData")
public class update extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		int uid = Integer.parseInt(req.getParameter("uid"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String number = req.getParameter("number");
		
		user u = new user();
		u.setId(uid);
		u.setUserName(name);
		u.setEmail(email);
		u.setPassword(password);
		u.setNumber(number);
		
	    userProgress dao = new userProgress();
	    int i = dao.updateUser(u);
	   
	    req.getRequestDispatcher("alluser").forward(req, resp);
	
	}

	
	
}
