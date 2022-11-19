package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.PreparableStatement;

import model.user;

public class userDao {

	Connection cn;

	public userDao() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean isAvalable(user u) {

		boolean checkUser = false;

		try {
			PreparedStatement ps = cn.prepareStatement("select * from user where email=? and password=?");
			ps.setString(1, u.getEmail());
			ps.setString(2, u.getPassword());

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				checkUser = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return checkUser;
	}

	public int addUser(user u) {

		int newUser = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into user value(?,?,?,?,?)");

			ps.setInt(1, 0);
			ps.setString(2, u.getUserName());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPassword());
			ps.setString(5, u.getNumber());

			newUser = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return newUser;
	}

	public ArrayList<user> getAllUser() {

		ArrayList<user> al = new ArrayList<user>();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from user");
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

	public int deleteUser(int did) {

		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("delete from user where id=?");
			ps.setInt(1, did);

			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;
	}

}
