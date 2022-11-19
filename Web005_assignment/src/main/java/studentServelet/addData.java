package studentServelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.studentDao;
import studentForm.studentIfo;

/**
 * Servlet implementation class addData
 */
@WebServlet("/addStudent")
public class addData extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("uid");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String number = req.getParameter("number");
		String gender = req.getParameter("gender");
		String city = req.getParameter("city");

		studentIfo st = new studentIfo();

		st.setFname(fname);
		st.setLname(lname);
		st.setEmail(email);
		st.setPassword(password);
		st.setNumber(number);
		st.setGender(gender);
		st.setCity(city);

		studentDao dao = new studentDao();
		boolean checkEmail = dao.checkEmail(st);
		if (id == "" || id == null) {
			
			if (checkEmail) {

				req.setAttribute("data", dao.viewAllData());
				req.setAttribute("error", "Email already Exist...");
				req.getRequestDispatcher("form.jsp").forward(req, resp);
			} else {

				int add = dao.addStudent(st);

				if (add > 0) {
					req.setAttribute("data", dao.viewAllData());
					req.setAttribute("add", "Data added Successfully.....");
					req.getRequestDispatcher("form.jsp").forward(req, resp);
				}
			}
		}
		else {
			
			st.setId(Integer.parseInt(id));
			
			int update = dao.updateStudent(st);
			
			if(update > 0) {
				
				req.setAttribute("data", dao.viewAllData());
				req.setAttribute("success", "Data Updated........");
				req.getRequestDispatcher("show.jsp").forward(req, resp);
				
			}
			
		}

	}

}
