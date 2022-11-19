package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userdao;
import model.user;


@WebServlet("/alluser")
public class viewUser extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		userdao dao = new userdao();
		
		ArrayList<user> allUser = dao.viewUSer();
		
		
		req.setAttribute("data", allUser);
        req.getRequestDispatcher("viewUser.jsp").forward(req, resp);;	
	
	
	}
	
	
	
	
}
