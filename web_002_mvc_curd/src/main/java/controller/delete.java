package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userdao;
@WebServlet("/delete")
public class delete extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
	 int did = Integer.parseInt(req.getParameter("did"));
	 
	 userdao dao = new userdao();
	 int deleteUser = dao.deleteUser(did);
	 
	 if(deleteUser > 0) {
		 
		 req.getRequestDispatcher("alluser").forward(req, resp);
		 
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	}
}
