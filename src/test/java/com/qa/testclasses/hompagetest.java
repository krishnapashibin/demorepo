package com.qa.testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.homepage;
import com.qa.pages.loginpage;
import com.qa.testbase.testbase;
import com.qa.pages.homepage;

public class hompagetest extends testbase{
	loginpage loginobj;
	homepage homepage;
	
	public  hompagetest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization();
		 loginobj=new loginpage();
		 homepage=loginobj.login(prop.getProperty("username"),prop.getProperty("password"));
		 Thread.sleep(4000);
	}
	
	@Test(priority=1)
	public void getusernametest() {
		
		 String username=homepage.getusername();
		 Assert.assertEquals(username, "Krishna P A");
		 System.out.println("success");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
}
