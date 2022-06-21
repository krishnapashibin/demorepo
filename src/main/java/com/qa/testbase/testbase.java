package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase  {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public  testbase() throws IOException
	{
		prop=new Properties();
		 FileInputStream is = new FileInputStream("C:\\Users\\91859\\pomdesignpattern\\src\\main\\java\\com\\qa\\config\\config.properties");
		 prop.load(is);
		 
	}
	
	public void initialization()  {
		String browser=prop.getProperty("browser");
		if(browser.equals ("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
		 driver=new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //  driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}
	

}
