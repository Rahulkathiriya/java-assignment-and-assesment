package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoUser.userProgress;
import project_model.user;

@WebServlet("/allUser")
public class viewAllUser extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		userProgress dao = new userProgress();

		ArrayList<user> allUser = dao.viewAllUSer();

		req.setAttribute("data", allUser);
		req.getRequestDispatcher("userDisplay.jsp").forward(req, resp);

	}

}
