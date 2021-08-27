import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariableDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 1. Need to create object for properties file to get data from properties file.
		// 2. Need to create FileInputStream object and pass the properties file location
		// 3. Using pop method you can load the properties
		// 4. By using get property method
		// 5. Also we can change the properties by using setProperty method
		// 6. We can return properties file with FileoutStream and store method. It will update the changes in properties file
	
	Properties prop = new Properties();				// 1.
	FileInputStream fis = new FileInputStream("C:\\Users\\Bablu\\Mahesh\\Global VariablesJava\\src\\data.properties");   // 2.
	prop.load(fis);				// 3.
	System.out.println(prop.getProperty("browser"));	// 4. We mentioned browser in properties file
	System.out.println(prop.getProperty("url"));		// 4. We mentioned url in properties file
	prop.setProperty("browser", "firefox");			// 5. It will change browser from chrome to firefox
	System.out.println(prop.getProperty("browser"));
	
	FileOutputStream fos = new FileOutputStream("C:\\Users\\Bablu\\Mahesh\\Global VariablesJava\\src\\data.properties");	// Reading mode
	prop.store(fos, null);	// Store method
	System.out.println(prop.getProperty("browser"));
	
	
	prop.setProperty("browser", "internetexplorer");
	System.out.println(prop.getProperty("browser"));
	}

}
