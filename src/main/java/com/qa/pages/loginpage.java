package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.testbase;

public class loginpage extends testbase {
	//Pagefactory 
	//declaration
	
	@FindBy(xpath="//a[@href='https://register.cogmento.com/password/reset/request/']")
	WebElement forgotlink;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginbutton;
	
	public loginpage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String loginpagetitle()
	{
		return driver.getTitle();
	}
	
	public boolean forgotpasswordlink()
	{
	return forgotlink.isDisplayed();
	}

	public homepage login(String un,String pwd) throws IOException {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		return new homepage();
	}
}
