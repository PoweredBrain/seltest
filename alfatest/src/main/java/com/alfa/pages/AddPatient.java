package com.alfa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.alfa.base.TestBase;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPatient extends TestBase{

	@FindBy(xpath="//a[text()='Patient']/@href")
	WebElement Pat;
	
	@FindBy(xpath="//a[text()='Add New Patient']/@href")
	WebElement AddPat;
	
	@FindBy(id="card_number")
	WebElement cardn;
	
	//public AddPatient(){
		//PageFactory.initElements(driver, this);
//	}
	public AddPatient addp(String num)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", Pat);
    	System.out.println("click");
    	
    	JavascriptExecutor js1 = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", AddPat);
    	cardn.sendKeys(num);
		
		return null;
	}
		    
}
