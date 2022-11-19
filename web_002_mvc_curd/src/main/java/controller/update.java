package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userdao;
import model.user;

@WebServlet("/update")
public class update extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	    int uid = Integer.parseInt(req.getParameter("uid"));
	    
	    userdao dao = new userdao();
	    user u = dao.getUserById(uid);
	    
	   req.setAttribute("data", u);
	   req.getRequestDispatcher("updateUser.jsp").forward(req, resp);
	
	
	
	}
	
}
