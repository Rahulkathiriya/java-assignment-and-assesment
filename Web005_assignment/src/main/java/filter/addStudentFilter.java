package filter;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import dao.studentDao;

/**
 * Servlet Filter implementation class addStudentFilter
 */
@WebFilter("/addStudent")
public class addStudentFilter extends HttpFilter implements Filter {

	/**
	 * @see HttpFilter#HttpFilter()
	 */
	public addStudentFilter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	

	 
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String number = req.getParameter("number");
		String gender = req.getParameter("gender");
		String city = req.getParameter("city");
		
		

		RequestDispatcher rd = req.getRequestDispatcher("form.jsp");
		studentDao dao = new studentDao();
		
		if (fname.equals("") || fname.equals(null)) {
			req.setAttribute("fnameError", "fname can not be blank....");
			rd.forward(req, resp);
		}

		else if (lname.equals("") || lname.equals(null)) {
			req.setAttribute("lnameError", "lname can not be blank....");
			rd.forward(req, resp);
		}
		else if (!dao.emailRegEx(email)) {

			req.setAttribute("emailError", "Invalid formeting....");
			rd.forward(req, resp);
		} 
		
		else if(!dao.passCheck(password)) {
			req.setAttribute("passError", "Invalid formeting......");
			rd.forward(req, resp);
		}
		
		else {
			chain.doFilter(req, resp);

		}

	}
	

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
