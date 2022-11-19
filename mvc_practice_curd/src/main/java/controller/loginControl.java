package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.userDao;
import model.user;

@WebServlet("/loginFile")
public class loginControl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		user u = new user();
		u.setEmail(email);
		u.setPassword(password);
		
		userDao dao = new userDao();
		boolean check = dao.isAvalable(u);
		
		
		if(check) {
			
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			
		}
		else {
			
			req.setAttribute("Erorr", "Invalid email or password.....");
			req.getRequestDispatcher("loginFile.jsp").forward(req, resp);
		}
		
	
	} 
	
	
}
