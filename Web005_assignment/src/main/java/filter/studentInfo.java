package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class studentInfo
 */
@WebServlet("/signUp")
public class studentInfo extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String number = req.getParameter("number");
		
		PrintWriter pw= resp.getWriter();
		pw.print("<h1>"+name+"</h1>");
		pw.print("<h1>"+email+"</h1>");
		pw.print("<h1>"+password+"</h1>");
		pw.print("<h1>"+number+"</h1>");
		
		
	}

}
