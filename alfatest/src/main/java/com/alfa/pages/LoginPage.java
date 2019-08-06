package com.alfa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.alfa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(id="username")
	WebElement email;
	
	@FindBy(id="password")
	WebElement pswd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	
	
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	
	public LoginPage login(String un, String pwd){
		email.sendKeys(un);
		pswd.sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", login);
				return null;
		    	
		
	}
	
}
