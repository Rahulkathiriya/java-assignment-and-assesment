package studentServelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.studentDao;

/**
 * Servlet implementation class viewData
 */
@WebServlet("/viewData")
public class viewData extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		studentDao dao = new studentDao();
		
		req.setAttribute("data", dao.viewAllData());
		req.getRequestDispatcher("show.jsp").forward(req, resp);
		
		
	}


}
