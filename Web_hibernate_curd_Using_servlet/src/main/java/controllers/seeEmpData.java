package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.employeeDao;

/**
 * Servlet implementation class seeEmpData
 */

@WebServlet("/viewEmployee")
public class seeEmpData extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		employeeDao dao = new employeeDao();
		
		req.setAttribute("emp", dao.viewAllEmployee());
		req.getRequestDispatcher("viewEmploye.jsp").forward(req, resp);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
