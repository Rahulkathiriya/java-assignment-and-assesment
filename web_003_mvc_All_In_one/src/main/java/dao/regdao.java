package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.regForm;

public class regdao {

	Connection cn;

	public regdao() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public int addBook(regForm reg) {

		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into regform values(?,?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, reg.getFname());
			ps.setString(3, reg.getLname());
			ps.setString(4, reg.getNumber());
			ps.setString(5, reg.getEmail());
			ps.setString(6, reg.getGender());
			ps.setString(7, reg.getCity());

			i = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;

	}

	public ArrayList<regForm> getAllData() {

		ArrayList<regForm> form = new ArrayList<regForm>();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from regform");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				regForm reg = new regForm();

				reg.setId(rs.getInt(1));
				reg.setFname(rs.getString(2));
				reg.setLname(rs.getString(3));
				reg.setNumber(rs.getString(4));
				reg.setEmail(rs.getString(5));
				reg.setGender(rs.getString(6));
				reg.setCity(rs.getString(7));

				form.add(reg);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return form;

	}

	public boolean checkEmail(regForm reg) {

		boolean check = false;

		try {
			PreparedStatement ps = cn.prepareStatement("select * from regform where email=?");
			ps.setString(1, reg.getEmail());

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				check = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return check;
	}

	public regForm getAllDataById(int id) {

		regForm reg = new regForm();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from regform where id=?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				reg.setId(rs.getInt(1));
				reg.setFname(rs.getString(2));
				reg.setLname(rs.getString(3));
				reg.setNumber(rs.getString(4));
				reg.setEmail(rs.getString(5));
				reg.setGender(rs.getString(6));
				reg.setCity(rs.getString(7));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return reg;

	}

	public int updateData(regForm reg) {

		int update = 0;

		try {
			PreparedStatement ps = cn.prepareStatement(
					"update regform set fname=?, lname=?, number=?, email=?, gender=?, city=? where id=?");
			ps.setInt(7, reg.getId());
			ps.setString(1, reg.getFname());
			ps.setString(2, reg.getLname());
			ps.setString(3, reg.getNumber());
			ps.setString(4, reg.getEmail());
			ps.setString(5, reg.getGender());
			ps.setString(6, reg.getCity());

			update = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return update;

	}

	public int deleteData(int id) {

		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("delete from regform where id=?");
			ps.setInt(1, id);

			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;

	}

}
