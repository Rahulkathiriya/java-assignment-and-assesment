package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.userDao;
import model.user;

@WebServlet("/displayUser")
public class displayUser extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 
          	 userDao dao = new userDao();
          	 
          	 ArrayList<user> allUser = dao.getAllUser();
	 
	
	      req.setAttribute("data", allUser);
	      req.getRequestDispatcher("displayUser.jsp").forward(req, resp);
	
	}
	
}
