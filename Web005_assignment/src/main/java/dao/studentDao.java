package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import studentForm.studentIfo;

public class studentDao {

	Connection cn;

	public studentDao() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<studentIfo> viewAllData() {

		ArrayList<studentIfo> al = new ArrayList<studentIfo>();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from studentdata");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				studentIfo st = new studentIfo();

				st.setId(rs.getInt(1));
				st.setFname(rs.getString(2));
				st.setLname(rs.getString(3));
				st.setEmail(rs.getString(4));
				st.setPassword(rs.getString(5));
				st.setNumber(rs.getString(6));
				st.setGender(rs.getString(7));
				st.setCity(rs.getString(8));

				al.add(st);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return al;

	}

	public int addStudent(studentIfo st) {

		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into studentdata values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, st.getFname());
			ps.setString(3, st.getLname());
			ps.setString(4, st.getEmail());
			ps.setString(5, st.getPassword());
			ps.setString(6, st.getNumber());
			ps.setString(7, st.getGender());
			ps.setString(8, st.getCity());

			i = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;

	}

	public boolean checkEmail(studentIfo st) {
		boolean check = false;

		try {
			PreparedStatement ps = cn.prepareStatement("select * from studentdata where email=?");
			ps.setString(1, st.getEmail());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				check = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return check;
	}

	public int deletData(int id) {
		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("delete from studentdata where id=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;
	}

	public studentIfo getDataById(int id) {

		studentIfo st = new studentIfo();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from studentdata where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				st.setId(rs.getInt(1));
				st.setFname(rs.getString(2));
				st.setLname(rs.getString(3));
				st.setEmail(rs.getString(4));
				st.setPassword(rs.getString(5));
				st.setNumber(rs.getString(6));
				st.setGender(rs.getString(7));
				st.setCity(rs.getString(8));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return st;

	}

	public int updateStudent(studentIfo st) {

		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement(
					"update studentdata set fname=?, lname=?, email=?, password=?, number=?, gender=?, city=? where id=?");
			ps.setInt(8, st.getId());
			ps.setString(1, st.getFname());
			ps.setString(2, st.getLname());
			ps.setString(3, st.getEmail());
			ps.setString(4, st.getPassword());
			ps.setString(5, st.getNumber());
			ps.setString(6, st.getGender());
			ps.setString(7, st.getCity());

			i = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;
	}

	public boolean emailRegEx(String email) {

		String checkEmail = "^[a-zA-Z0-9+_.-]+@(.+)$";

		Pattern pattern = Pattern.compile(checkEmail);
		Matcher match = pattern.matcher(checkEmail);

		return match.matches();

	}

	public boolean passCheck(String password) {

		String pass = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]) (?=\\S+$).{8,20}$";

		Pattern pattern = Pattern.compile(pass);
		Matcher match = pattern.matcher(pass);

		return match.matches();
	}

}
