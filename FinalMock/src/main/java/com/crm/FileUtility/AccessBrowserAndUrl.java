package com.crm.FileUtility;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AccessBrowserAndUrl {

	public static Properties prop;
	public static FileInputStream fis;
	
	public String accessBrowser(String key) throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		prop.load(fis);
		String br = prop.getProperty(key);
		return br;
	}
	
}