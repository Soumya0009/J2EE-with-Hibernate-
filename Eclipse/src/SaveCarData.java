import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
public class SaveCarData {
	public static void main(String[] args)throws IOException, Exception {
		FileInputStream fileInputStream = new FileInputStream("db.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String driverString=properties.getProperty("driver");
		String urlString = properties.getProperty("url");
		String urString = properties.getProperty("user");
		String passString = properties.getProperty("password");
		System.out.println(driverString+"\n"+urlString+"\n"+urString+"\n"+passString);
		String qurr1 = "CREATE TABLE car(id int(3) PRIMARY KEY, name VARCHAR(45) NOT NULL, price INT(6))";
		String qurr2="INSERT INTO car value (100,'Lamborghini', 100000)";
		Class.forName(driverString);
		Connection connection = DriverManager.getConnection(urlString, urString, passString);
		Statement statement = connection.createStatement();
		statement.execute(qurr1);
		statement.execute(qurr2);
		connection.close();
	}
}



