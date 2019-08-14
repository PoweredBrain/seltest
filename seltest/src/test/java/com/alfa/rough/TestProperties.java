package com.alfa.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main (String[] args) throws IOException
	{
		Properties config = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
		//System.out.println(System.getProperty("user.dir"));
		config.load(fis);
		System.out.println(config.getProperty("browser"));
				
		// fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
	
		// System.out.println(config.getProperty(key));
	}
}
