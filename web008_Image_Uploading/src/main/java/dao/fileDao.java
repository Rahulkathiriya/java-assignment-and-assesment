package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.addImage;

public class fileDao {

	Connection cn;

	public fileDao() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public int addImage(addImage img) {
		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into file values(?,?,?)");
			ps.setInt(1, 0);
			ps.setNString(2, img.getName());
			ps.setNString(3, img.getFileName());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

}
