package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.fileDao;
import model.addImage;

/**
 * Servlet implementation class addFile
 */
@WebServlet("/upload")
@MultipartConfig
public class addFile extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String path = "D:\\top assignment\\JAVA____ASSIGNMENT\\web008_Image_Uploading\\src\\main\\webapp\\image";
		String name = req.getParameter("name");
		Part file = req.getPart("fileName");

		String fileName = Paths.get(file.getSubmittedFileName()).getFileName().toString();
		file.write(path + File.separator + fileName);
		
		addImage img = new addImage();
		img.setName(name);
		img.setFileName(fileName);
		
		fileDao dao = new fileDao();
		int i = dao.addImage(img);
		
		if(i>0) {
			
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			
		}

	}

}
