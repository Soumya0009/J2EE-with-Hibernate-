
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;


public class DbProperties {
	public static void main(String[] args)throws Exception {
		FileInputStream fileInputStream = new FileInputStream("db.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String driverString=properties.getProperty("driver");
		String urlString = properties.getProperty("url");
		String urString = properties.getProperty("user");
		String passString = properties.getProperty("password");
		String query = "INSERT INTO car VALUES(102 , 'Ford Mustang' , 2500)" ;

		//step-1 load and register Driver class
		Class.forName(driverString);

		//step-2 establish the connection between java application and data base
		Connection con =  DriverManager.getConnection(urlString, urString, passString);

		//step-3 establish statement
		Statement st = con.createStatement() ;

		//step-4 execute query
		st.execute(query) ;

		//step-5 close connection
		con.close();
	}
}
