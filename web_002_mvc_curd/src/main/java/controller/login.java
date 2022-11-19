package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userdao;
import model.user;

@WebServlet("/login")
public class login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		user u = new user();
		u.setEmail(email);
		u.setPassword(password);

		userdao dao = new userdao();
		boolean check = dao.checkUser(u);

		if (check) {

			req.getRequestDispatcher("index.jsp").forward(req, resp);
		} else {
			req.setAttribute("Error", "Invalid email or password......!!");
			req.getRequestDispatcher("login.jsp").forward(req, resp);

		}

	}

}