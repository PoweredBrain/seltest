package com.alfa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.alfa.pages.LoginPage;
import com.alfa.base.TestBase;
import com.alfa.pages.AddPatient;
import org.testng.Assert;


public class AddPatientTest extends TestBase{
	AddPatient addpat;
	LoginPage loginPage;
	
	public AddPatientTest(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		addpat  = new AddPatient();	
		loginPage = new LoginPage();
	}
	@Test
	public void AddTest(){
	loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		addpat.addp(prop.getProperty("card"));
		System.out.println(prop.getProperty("card"));
		
		
	}
}
