package daoUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import project_model.user;

public class userProgress {

	Connection cn;

	public userProgress() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean checkUser(user u) {

		boolean isUser = false;

		try {
			PreparedStatement ps = cn.prepareStatement("select * from userLogin where email=? and password=?");
			ps.setString(1, u.getEmail());
			ps.setString(2, u.getPassword());

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				isUser = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return isUser;
	}

	public int addUser(user u) {

		int user = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into userLogin value(?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, u.getUserName());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPassword());
			ps.setString(5, u.getNumber());

			user = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

	public ArrayList<user> viewAllUSer() {

		ArrayList<user> al = new ArrayList<user>();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from userLogin");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				user u = new user();

				u.setId(rs.getInt(1));
				u.setUserName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPassword(rs.getString(4));
				u.setNumber(rs.getString(5));

				al.add(u);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return al;
	}

	public int deleteProcess(int did) {

		int deleteUser = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("delete from userLogin where id=?");
			ps.setInt(1, did);

			deleteUser = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return deleteUser;
	}

	public user getUserbyId(int uid) {

		user u = new user();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from userLogin where id=?");
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				u.setId(rs.getInt(1));
				u.setUserName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPassword(rs.getString(4));
				u.setNumber(rs.getString(5));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return u;
	}

	public int updateUser(user u) {
		int user = 0;

		try {
			PreparedStatement ps = cn
					.prepareStatement("update userLogin set userName=?, email=?, password=?, number=? where id=?");
			ps.setInt(5, u.getId());
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPassword());
			ps.setString(4, u.getNumber());

			user = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

	public boolean checkEmail(user u) {

		boolean b = false;

		try {
			PreparedStatement ps = cn.prepareStatement("select * from userLogin where email=?");
			ps.setString(1, u.getEmail());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				b = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return b;
	}

}
