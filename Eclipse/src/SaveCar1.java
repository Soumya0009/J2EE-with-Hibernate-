import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class SaveCar1 {
	public static void main(String[] args) {
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			String driverString = properties.getProperty("driver");
			String urlString = properties.getProperty("url");
			String urString = properties.getProperty("ur");
			String passString = properties.getProperty("pass");
			
			Class.forName(driverString);
			Connection connection = DriverManager.getConnection(urlString,urString,passString);
			Statement statement = connection.createStatement();
			String query = "INSERT INTO car VALUES(103 , 'Dodge Challenger' , 2500)" ;
			statement.execute(query);
			connection.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

