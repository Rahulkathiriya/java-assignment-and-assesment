package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.Driver;

import Dao.userDao;
import model.user;

@WebServlet("/signupFile")
public class signupControl extends HttpServlet {

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

		userDao dao = new userDao();
		int isUser = dao.addUser(u);

		if (isUser > 0) {
			req.setAttribute("success", "Account created successfully login hear......");
			req.getRequestDispatcher("loginFile.jsp").forward(req, resp);
		}
	}

}
