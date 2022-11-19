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
 * Servlet Filter implementation class validation
 */
@WebFilter("/signUp")
public class validation extends HttpFilter implements Filter {

	/**
	 * @see HttpFilter#HttpFilter()
	 */
	public validation() {
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

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String number = req.getParameter("number");
		String regex = "^[a-zA-Z]+ [a-zA-Z]+$";
		String regemail = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		

		RequestDispatcher rd = req.getRequestDispatcher("validation.jsp");

		if (name.equals("") || name.equals(null)) {

			req.setAttribute("NameError", "fname can not be blank");
			rd.forward(req, resp);
		}

		if (email.equals("") || email.equals(null)) {
			req.setAttribute("emailError", "email can not be blank");
			rd.forward(req, resp);
		}
		if (!email.matches(regemail)) {
			req.setAttribute("email", "Enter valid email");
			rd.forward(req, resp);
		}
		if (password.equals("") || password.equals(null)) {
			req.setAttribute("password", "password not be blank");
			rd.forward(req, resp);
		}
		
		if (number.equals("") || number.equals(null)) {
			req.setAttribute("number", "number can not be blank");
			rd.forward(req, resp);
		}
		if (number.length() != 10) {
			req.setAttribute("numberError", "Enter Only 10 dighit number");
			rd.forward(req, resp);
		}

		else {
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
