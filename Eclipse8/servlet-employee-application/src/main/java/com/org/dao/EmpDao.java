package com.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDao {
	public static int saveEmp(int id, String name, String job, double sal, int deptno) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_employee", "root",
					"root");
			String sql = "INSERT INTO emp VALUES(? , ? , ? , ? , ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, job);
			ps.setDouble(4, sal);
			ps.setInt(5, deptno);
			int res = ps.executeUpdate();
			con.close();
			return res;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	public static int updateEmp(int id, String name, String job, double sal, int deptno) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_employee", "root",
					"root");
			String sql = "UPDATE emp SET name= ? , job=?, sal=?,deptno=? WHERE id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, job);
			ps.setDouble(3, sal);
			ps.setInt(4, deptno);
			ps.setInt(5, id);
			int res = ps.executeUpdate();
			con.close();
			return res;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}
}