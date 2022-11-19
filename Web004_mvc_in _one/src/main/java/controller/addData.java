package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.regForm;
import model.form;

@WebServlet("/registration")
public class addData extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("uid");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String number = req.getParameter("number");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String city = req.getParameter("city");

		form reg = new form();

		reg.setFname(fname);
		reg.setLname(lname);
		reg.setNumber(number);
		reg.setEmail(email);
		reg.setGender(gender);
		reg.setCity(city);

		regForm form = new regForm();

		boolean check = form.checkEmail(reg);

		if (id == "" || id == null) {

			if (check) {

				req.setAttribute("data", form.viewAllData());
				req.setAttribute("emailError", "email already Exist.....!!!!");
				req.getRequestDispatcher("regForm.jsp").forward(req, resp);
			} else {

				int i = form.addData(reg);

				if (i > 0) {

					req.setAttribute("data", form.viewAllData());
					req.setAttribute("addData", "data Added Successfully....!!");
					req.getRequestDispatcher("regForm.jsp").forward(req, resp);

				}
			}
		} else {

			reg.setId(Integer.parseInt(id));

			int i = form.updateData(reg);

			if (i > 0) {

				req.setAttribute("data", form.viewAllData());
				req.setAttribute("update", "data Updated......!!");
				req.getRequestDispatcher("regForm.jsp").forward(req, resp);
			}

		}

	}

}
