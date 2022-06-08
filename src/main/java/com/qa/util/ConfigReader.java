package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ConfigReader {

	private Properties prop;
	
	public Properties init_prop() {

		prop = new Properties();
		try {
			FileInputStream File = new FileInputStream("C:\\Users\\Janki_project\\BDD_framwork\\Practice_OpenCartApp\\src\\test\\recorses\\config\\config.Properties");
			prop.load(File);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	System.out.println(prop.get("browser"));
		return prop;
	}

}
