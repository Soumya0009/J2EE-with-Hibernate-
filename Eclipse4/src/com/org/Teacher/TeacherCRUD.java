package com.org.Teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TeacherCRUD {
	public static boolean saveTeacher(int id, String name, String department, String email, String gender, int salery) {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_school_1?user=root&password=root");
	        String sqlString = "Insert into teacher values(?,?,?,?,?,?)";
	        PreparedStatement pStatement = connection.prepareStatement(sqlString);
	        
	        pStatement.setInt(1,id);
	        pStatement.setString(2,name);
	        pStatement.setString(3,department);
	        pStatement.setString(4,email);
	        pStatement.setString(5,gender);
	        pStatement.setInt(6,salery);
	        
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
}
