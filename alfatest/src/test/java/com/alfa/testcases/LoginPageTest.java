package com.alfa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.alfa.base.TestBase;
import com.alfa.pages.HomePage;
import com.alfa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	
	
	@Test
	public void loginTest(){
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void close(){
		driver.quit();
	}
	
	
	
	

}
