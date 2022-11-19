package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoUser.userProgress;

@WebServlet("/delete")
public class deleteUser extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int did = Integer.parseInt(req.getParameter("did"));

		userProgress dao = new userProgress();
		int deleteUser = dao.deleteProcess(did);

		if (deleteUser > 0) {

			req.getRequestDispatcher("allUser").forward(req, resp);
			
		}

	}
}
