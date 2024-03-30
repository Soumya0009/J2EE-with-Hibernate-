import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DetailseProperties {
	public static void main(String[] args)throws IOException {
		FileInputStream fileInputStream = new FileInputStream("details.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String nameString=properties.getProperty("Name");
		String phonString = properties.getProperty("Mob");
		String emaString = properties.getProperty("Email");
		System.out.println(nameString+" "+phonString+" "+emaString);
		
	}
	
	
}
