package com.org.RSmetadata;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.org.helper.ConnectionHelper;

public class FetchResulsetMetatData {
	public static void main(String[] args) throws SQLException {
		Connection connection = ConnectionHelper.getConnectionObject();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("Select*from car");
		ResultSetMetaData resultSetMetaData = rs.getMetaData();
		System.out.println(resultSetMetaData.getColumnCount());
		System.out.println(resultSetMetaData.getColumnName(1));
		System.out.println(resultSetMetaData.getColumnClassName(2));
		System.out.println(resultSetMetaData.getColumnClassName(3));
		System.out.println(resultSetMetaData.isNullable(2));
		System.out.println(resultSetMetaData.isNullable(3));
		System.out.println(resultSetMetaData.getColumnTypeName(1));
		System.out.println(resultSetMetaData.getColumnTypeName(2));
		System.out.println(resultSetMetaData.getColumnTypeName(3));
		System.out.println(resultSetMetaData.getColumnDisplaySize(1));
		System.out.println(resultSetMetaData.getColumnDisplaySize(2));
		System.out.println(resultSetMetaData.getColumnDisplaySize(3));

	}
}
