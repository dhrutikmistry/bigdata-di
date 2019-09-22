package com.myapp.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String propFilePath = "/Users/kamal/workspace/Json_Ex/di-json-parser/config/di-env-config.properties";
		
		Properties prop = new Properties();
		prop.load(new FileInputStream(propFilePath));
		
		System.out.println("hostname = "+prop.getProperty("sftp.hostname"));
		System.out.println("user = "+prop.getProperty("sftp.user"));
	}

}
