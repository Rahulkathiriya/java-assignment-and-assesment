package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.regForm;

@WebServlet("/displayData")
public class viewData extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		regForm reg = new regForm();

		req.setAttribute("data", reg.viewAllData());
		req.getRequestDispatcher("regForm.jsp").forward(req, resp);

	}
}
