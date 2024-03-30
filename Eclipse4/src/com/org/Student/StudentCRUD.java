package com.org.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.QueryReturnType;

public class StudentCRUD {
	public static boolean saveStudent(int roll, String name, int age, String email, String gender) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc_school_1?user=root&password=root");
			String sqlString = "Insert into student values(?,?,?,?,?)";
			PreparedStatement pStatement = connection.prepareStatement(sqlString);

			pStatement.setInt(1, roll);
			pStatement.setString(2, name);
			pStatement.setInt(3, age);
			pStatement.setString(4, email);
			pStatement.setString(5, gender);

			pStatement.execute();
			connection.close();
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static void displayStudentDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc_school_1?user=root&password=root");
			Statement statement = connection.createStatement();
			String sqlString = "Select * from student";
			ResultSet rsResultset = statement.executeQuery(sqlString);

			System.out.format(
					"------------------------------------------------------------------------------------------------------\n");
			System.out.format("|%-5s | %-34s | %-6s | %-34s | %-8s |\n", "roll", "name", "age", "email", "gender");

			while (rsResultset.next()) {
				System.out.format(
						"------------------------------------------------------------------------------------------------------\n");
				System.out.format("|%-6s| %-35s| %-7s| %-35s| %-9s|\n", rsResultset.getInt(1), rsResultset.getString(2),
						rsResultset.getInt(3), rsResultset.getString(4), rsResultset.getString(5));
			}

			System.out.format(
					"------------------------------------------------------------------------------------------------------\n");

			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int deleteStudentData(int roll) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc_school_1?user=root&password=root");
			Statement statement = connection.createStatement();
			String sqlString = "Delete from student where roll = " + roll;
			int res = statement.executeUpdate(sqlString);
			connection.close();
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

	public static boolean updateStudent(int roll, String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc_school_1?user=root&password=root");
			String sqlString = "update student set name = ? where roll = ?";
			PreparedStatement pStatement = connection.prepareStatement(sqlString);

			pStatement.setString(1, name);
			pStatement.setInt(2, roll);

			pStatement.executeUpdate();

			connection.close();
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static boolean updateStudent1(int roll, int age) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc_school_1?user=root&password=root");
			String sqlString1 = "update student set age = ? where roll = ?";
			PreparedStatement pStatement = connection.prepareStatement(sqlString1);

			pStatement.setInt(1, age);
			pStatement.setInt(2, roll);

			pStatement.executeUpdate();

			connection.close();
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static boolean updateStudent2(int roll, String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc_school_1?user=root&password=root");
			String sqlString2 = "update student set email = ? where roll = ?";
			PreparedStatement pStatement = connection.prepareStatement(sqlString2);

			pStatement.setString(1, email);
			pStatement.setInt(2, roll);

			pStatement.executeUpdate();

			connection.close();
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static boolean updateStudent3(int roll, String name, int age, String email, String gender) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc_school_1?user=root&password=root");
			String sqlString = "update student set name = ?, age = ?, email = ?, gender = ? where roll = ?";
			PreparedStatement pStatement = connection.prepareStatement(sqlString);

			pStatement.setString(1, name);
			pStatement.setInt(2, age);
			pStatement.setString(3, email);
			pStatement.setString(4, gender);
			pStatement.setInt(5, roll);

			pStatement.executeUpdate();

			connection.close();
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
