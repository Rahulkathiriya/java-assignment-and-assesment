package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoUser.userProgress;
import project_model.user;

@WebServlet("/update")
public class updateUserData extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
		  int uid = Integer.parseInt(req.getParameter("uid"));
		  
		  userProgress dao = new userProgress();
		  user u = dao.getUserbyId(uid);
	
		 
		  req.setAttribute("user", u);
		  req.getRequestDispatcher("updateUserData.jsp").forward(req, resp);
	
		  
		  
	}
	
}
