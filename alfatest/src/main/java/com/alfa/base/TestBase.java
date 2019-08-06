package com.alfa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.alfa.pages.LoginPage;



public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	static LoginPage loginP;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/alfa"
					+ "/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", ".//Browsers//chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		prop.getProperty("common");
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	
	
	
	

}
