package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoUser.userProgress;
import project_model.user;

@WebServlet("/UserLogin")
public class userLoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		user u = new user();

		u.setEmail(email);
		u.setPassword(password);

		userProgress dao = new userProgress();
		boolean check = dao.checkUser(u);

		if (check) {

			req.getRequestDispatcher("userIndex.jsp").forward(req, resp);

		}
		else {
			
			req.setAttribute("error", "Invalid email or password..");
			req.getRequestDispatcher("userLogin.jsp").forward(req, resp);
			
		}
	}

}
