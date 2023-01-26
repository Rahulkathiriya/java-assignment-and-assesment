package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.employeeDao;
import jakarta.persistence.criteria.CriteriaBuilder.In;
import model.employee;

/**
 * Servlet implementation class deleteAndUpdate
 */

@WebServlet("/delete")
public class deleteAndUpdate extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		employeeDao dao = new employeeDao();
		dao.deleteEmployee(id);

		req.setAttribute("emp", dao.viewAllEmployee());
		req.getRequestDispatcher("viewEmployee").forward(req, resp);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
	}

}
