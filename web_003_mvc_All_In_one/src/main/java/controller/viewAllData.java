 package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.regdao;

@WebServlet("/display")
public class viewAllData extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		regdao dao = new regdao();

		req.setAttribute("data", dao.getAllData());
		req.getRequestDispatcher("form.jsp").forward(req, resp);

	}

}
