 package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.regdao;
import model.regForm;

@WebServlet("/registration")
public class addData extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uid = req.getParameter("uid");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String number = req.getParameter("number");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String city = req.getParameter("city");

		regForm form = new regForm();

		form.setFname(fname);
		form.setLname(lname);
		form.setNumber(number);
		form.setEmail(email);
		form.setGender(gender);
		form.setCity(city);

		regdao dao = new regdao();

		if (uid == "" || uid == null) {

			boolean checkEmail = dao.checkEmail(form);

			if (checkEmail) {
				req.setAttribute("data", dao.getAllData());
				req.setAttribute("error", "email already exist...!!");
				req.getRequestDispatcher("form.jsp").forward(req, resp);
			} else {

				int i = dao.addBook(form);

				if (i > 0) {

					req.setAttribute("data", dao.getAllData());
					req.setAttribute("msg", "data added Successfully.....");
					req.getRequestDispatcher("form.jsp").forward(req, resp);
				}

			}

		}

		else {

			form.setId(Integer.parseInt(uid));

			int i = dao.updateData(form);
			if (i > 0) {
				req.setAttribute("data", dao.getAllData());
				req.setAttribute("updateMsg", "Data updated Successfully....!!");
				req.getRequestDispatcher("form.jsp").forward(req, resp);
			}

		}

	}

}
