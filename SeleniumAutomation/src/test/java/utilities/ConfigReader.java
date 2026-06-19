package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	private static Properties properties;
	
	static {
		try {
			String env = System.getProperty("env");
			String filePath = "src/test/resources/config.properties";
			
			if (env != null && !env.isEmpty()) {
				filePath = "src/test/resources/config." + env + ".properties";
				System.out.println("Execution Environment: " + env.toUpperCase());
			} else {
				System.out.println("Execution Environment: DEFAULT");
			}
			
			FileInputStream file = new FileInputStream(filePath);
			properties = new Properties();
			properties.load(file);
			file.close();
		} catch (Exception e) {
			System.out.println("Error reading config file!");
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
	
}
