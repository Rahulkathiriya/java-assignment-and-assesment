package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.empDao;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("uid"));

		empDao dao = new empDao();

		req.setAttribute("allData", dao.getDataById(id));
		req.setAttribute("data", dao.viewAllData());
		req.getRequestDispatcher("addEmployee.jsp").forward(req, resp);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		PrintWriter pw = resp.getWriter();
		empDao dao = new empDao();

		int delete = dao.deleteEmployee(id);

		if (delete > 0) {
			req.getRequestDispatcher("viewEmployee").forward(req, resp);
		}

	}

}
