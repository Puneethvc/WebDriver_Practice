package com_bank_TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com_Bank_Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String url= readconfig.getApplicationURL();
	public String userName = readconfig.getUserName();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	
	
	
	public static Logger logger;
	
	 static {
	        logger = LogManager.getLogger(BaseClass.class);
	    }
	
	@BeforeClass 
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	
	@AfterClass
	public void teardown() {
		driver.close();
	}	 
}
