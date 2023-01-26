package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.employeeDao;
import model.employee;

/**
 * Servlet implementation class empAddInTableServlet
 */

@WebServlet("/addEmploye")
public class empAddInTableServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		employee e = new employee();
		String id = req.getParameter("id");

		e.setFname(req.getParameter("fname"));
		e.setLname(req.getParameter("lname"));
		e.setEmail(req.getParameter("email"));
		e.setNumber(req.getParameter("number"));
		e.setAddress(req.getParameter("address"));
		e.setGender(req.getParameter("gender"));
		e.setPassword(req.getParameter("password"));

		employeeDao dao = new employeeDao();

		if (id == "" || id == null) {

			dao.addEMployee(e);
			req.setAttribute("dataAdd", "Data Added Successfully...");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		} else {
			
			e.setId(Integer.parseInt(id));

			dao.addEMployee(e);
			req.setAttribute("emp", dao.viewAllEmployee());
			req.getRequestDispatcher("viewEmployee").forward(req, resp);
			
		}
	}

}
