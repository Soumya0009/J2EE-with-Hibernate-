package com.org.dbmetadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import com.org.helper.ConnectionHelper;
public class FetchDatabaseMetadata {
	public static void main(String[] args) throws SQLException {
		Connection connection = ConnectionHelper.getConnectionObject();
		DatabaseMetaData dbMetaData = connection.getMetaData();
		System.out.println(dbMetaData.getURL());
		System.out.println(dbMetaData.getUserName());
		System.out.println(dbMetaData.getDatabaseMajorVersion());
		System.out.println(dbMetaData.getDatabaseMinorVersion());
		System.out.println(dbMetaData.getDatabaseProductName());
		System.out.println(dbMetaData.getDatabaseProductVersion());
		System.out.println(dbMetaData.getDriverName());
		
	}

}
