import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SaveImage {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blob_cr?user=root&password=root");
		String sqlString = "Insert into doc values(?,?)";
		PreparedStatement  pStatement = connection.prepareStatement(sqlString);
		
		pStatement.setInt(1, 4);

		
		File f = new File("E:/All Language/Adavnce Java/New folder/load.jpg");
		FileInputStream fileInputStream = new FileInputStream(f);
		pStatement.setBlob(2, fileInputStream);

		
		pStatement.execute();
		connection.close();
		System.out.println("Image Has been Stored");
	}
}
