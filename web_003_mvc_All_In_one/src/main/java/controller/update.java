package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.regdao;

@WebServlet("/update")
public class update extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	Integer uid = Integer.parseInt(req.getParameter("uid"));
	String action = req.getParameter("action");
	
	regdao dao = new regdao();
	
	if(action.equals("delete")) {
		
		int i = dao.deleteData(uid);
		if(i > 0) {
			
			req.setAttribute("data", dao.getAllData());
            req.getRequestDispatcher("form.jsp").forward(req, resp);
		}
	}
	
	else if(action.equals("update")) {
		
		req.setAttribute("getData", dao.getAllDataById(uid));
		req.setAttribute("data", dao.getAllData());
		req.getRequestDispatcher("form.jsp").forward(req, resp);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	}
	
}
