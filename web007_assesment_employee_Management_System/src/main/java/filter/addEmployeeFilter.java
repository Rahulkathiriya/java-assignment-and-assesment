package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class addEmployeeFilter
 */
@WebFilter("/addEmployee")
public class addEmployeeFilter extends HttpFilter implements Filter {

	/**
	 * @see HttpFilter#HttpFilter()
	 */
	public addEmployeeFilter() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String number = req.getParameter("number");
		String address = req.getParameter("address");
		String gender = req.getParameter("gender");
		String password = req.getParameter("password");
		String conpass = req.getParameter("conpass");

		RequestDispatcher rd = req.getRequestDispatcher("addEmployee.jsp");
		if (fname.equals("") || fname.equals(null)) {
			req.setAttribute("fnameError", "first name can not be blank..");
			rd.forward(req, resp);
		} else if (lname.equals("") || lname.equals(null)) {
			req.setAttribute("lnameError", "last name can not be blank..");
			rd.forward(req, resp);
		} else if (email.equals("") || email.equals(null)) {
			req.setAttribute("enailError", "email address can not be blank..");
			rd.forward(req, resp);
		} else if (number.equals("") || number.equals(null)) {
			req.setAttribute("numberError", "number can not be blank..");
			rd.forward(req, resp);
		} else if (number.length() > 10) {

			req.setAttribute("numberDightError", "Number length is more then 10 dights....");
			rd.forward(req, resp);
		}else if(address.equals("") || address.equals(null)) {
			req.setAttribute("addressError", "address can not be blank..");
			rd.forward(req, resp);
		} else if (password.equals("") || password.equals(null)) {
			req.setAttribute("passError", "password can not be blank..");
			rd.forward(req, resp);
		} else if (!password.equals(conpass)) {
			req.setAttribute("conpassError", "password and confirm paassword both are defferent.....");
			rd.forward(req, resp);
		} else {
			chain.doFilter(req, resp);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
