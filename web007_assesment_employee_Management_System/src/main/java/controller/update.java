package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.empDao;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int id = Integer.parseInt(req.getParameter("uid"));
		String action = req.getParameter("action");
		
		empDao dao = new empDao();
		
		if(action.equals("delete")) {
			
			int i = dao.deleteEmployee(id);
			
			if(i>0) {
				
				req.setAttribute("data", dao.viewAllData());
				req.getRequestDispatcher("viewEmployee").forward(req, resp);
			}
			
		}
		else if(action.equals("update")) {
			
			req.setAttribute("allData", dao.getDataById(id));
			req.setAttribute("data", dao.viewAllData());
			req.getRequestDispatcher("addEmployee.jsp").forward(req, resp);
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
