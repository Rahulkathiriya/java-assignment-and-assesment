package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoUser.userProgress;
import project_model.user;

@WebServlet("/newAccountSignup")
public class userSignup extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pasword = req.getParameter("password");
		String number = req.getParameter("number");

		user u = new user();
		u.setUserName(name);
		u.setEmail(email);
		u.setPassword(pasword);
		u.setNumber(number);

		
		userProgress dao = new userProgress();
		
		boolean emailExist = dao.checkEmail(u);
		
		
		
		if(emailExist) {
			
			req.setAttribute("error", "Email Already Exist...!!");
			req.getRequestDispatcher("userNewAccount.jsp").forward(req, resp);

		}
		else {
			int user = dao.addUser(u);
			if(user> 0) {
				req.setAttribute("account", "Account Created successfully login Hear");
				req.getRequestDispatcher("userLogin.jsp").forward(req, resp);
			}
		}
		
		
	}

}















