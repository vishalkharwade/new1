package libraryfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	 public static String getvishalFileData(String key) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Himalayas\\propertyFile.properties"); 
	Properties p = new Properties();
p.load(file);
java.lang.String value = p.getProperty(key);
return value;
}

	}
