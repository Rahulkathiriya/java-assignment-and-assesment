package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.regForm;

@WebServlet("/update")
public class update extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer id = Integer.parseInt(req.getParameter("uid"));
		String action = req.getParameter("action");

		regForm form = new regForm();

		if (action.equals("delete")) {

			int i = form.deleteData(id);

			if (i > 0) {

				req.setAttribute("data", form.viewAllData());
				req.getRequestDispatcher("regForm.jsp").forward(req, resp);

			}

		}

		else if (action.equals("update")) {

			req.setAttribute("allData", form.getDataById(id));
			req.setAttribute("data", form.viewAllData());
			req.getRequestDispatcher("regForm.jsp").forward(req, resp);

		}

	}

}
