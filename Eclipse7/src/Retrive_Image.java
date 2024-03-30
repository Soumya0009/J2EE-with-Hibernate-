import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class Retrive_Image {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blob_cr?user=root&password=root");
		Statement statement = connection.createStatement();
		String sqlString = "Select * from doc where id = 1";
		ResultSet resultset = statement.executeQuery(sqlString);
		resultset.next();
		int id = resultset.getInt(1);
		Blob blob = resultset.getBlob(2);
		
		byte arr[] = blob.getBytes(1,(int)blob.length());
		
		FileOutputStream fileOutputStream = new FileOutputStream("E:/All Language/Adavnce Java/New folder/fetch.png");
		fileOutputStream.write(arr);
		
		connection.close();
		
		System.out.println("Data hasbeen fatched.");
		
		
	}
}
