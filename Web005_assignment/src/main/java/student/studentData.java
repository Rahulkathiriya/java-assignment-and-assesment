package student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class studentData
 */
@WebServlet("/student")
public class studentData extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String number = request.getParameter("number");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String password = request.getParameter("password");
		
		
		PrintWriter pw = response.getWriter();
		pw.print("<h1>"+fname+"</h1>");
		pw.print("<h1>"+lname+"</h1>");
		pw.print("<h1>"+number+"</h1>");
		pw.print("<h1>"+email+"</h1>");
		pw.print("<h1>"+gender+"</h1>");
		pw.print("<h1>"+password+"</h1>");
		
		
		
		
		
	}

}
