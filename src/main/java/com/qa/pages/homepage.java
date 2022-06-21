package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.testbase;

public class homepage extends testbase {


	@FindBy(xpath="//*[@id=\"top-header-menu\"]/div[2]/span[1]")
	WebElement username;
	public  homepage() throws IOException {
		PageFactory.initElements(driver,this);
	}
	
	public String getusername() {
		
		return username.getText();
		
	}

}
