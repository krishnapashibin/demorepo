package com.qa.testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.loginpage;

import com.qa.pages.homepage;
import com.qa.testbase.testbase;

public class loginpagetest extends testbase {
	loginpage loginobj;
	com.qa.pages.homepage homepage;

	public loginpagetest() throws IOException {
		
		super();
		
		
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization();
		 loginobj=new loginpage();
		Thread.sleep(3000);
	}
	@Test(priority=1)
	public void loginpagetitletest() throws InterruptedException {
		String title=loginobj.loginpagetitle();
	Assert.assertEquals(title, "Cogmento CRM");	
	Thread.sleep(4000);
	}
	@Test(priority=2)
	public void forgotpasswordlinktest() throws InterruptedException {
		
		boolean flag=loginobj.forgotpasswordlink();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
public void logintest() throws InterruptedException, IOException {
		loginobj.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(10000);
	}
		
	//}
	@AfterMethod
public void tearDown() {
driver.quit();
	}
}
