package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import com.google.gson.Gson;

import dao.studentDao;
import model.student;

/**
 * Servlet implementation class updateDelete
 */
@WebServlet("/update")
public class updateDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    studentDao dao = new studentDao();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter pw = resp.getWriter();
		Integer uid = Integer.parseInt(req.getParameter("uid"));
		
		int i = dao.deleteStudent(uid);
		
		if(i > 0) {
			
			pw.append("Data deleted..");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter pw = resp.getWriter();
		Integer uid = Integer.parseInt(req.getParameter("uid"));
		
		student s = dao.getDataById(uid);
		Gson gson = new Gson();
		pw.append(gson.toJson(s));
		
		
	}

}
