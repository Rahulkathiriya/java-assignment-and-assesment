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
 * Servlet implementation class updateData
 */
@WebServlet("/update")
public class updateData extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer id = Integer.parseInt(req.getParameter("uid"));
		String action = req.getParameter("action");

		studentDao dao = new studentDao();

		if (action.equals("delete")) {

			int i = dao.deletData(id);

			if (i > 0) {
				req.setAttribute("data", dao.viewAllData());
				req.getRequestDispatcher("show.jsp").forward(req, resp);
			}

		}

		else if (action.equals("update")) {

			req.setAttribute("allData", dao.getDataById(id));
			req.setAttribute("data", dao.viewAllData());
			req.getRequestDispatcher("form.jsp").forward(req, resp);;

		}
	}

}
