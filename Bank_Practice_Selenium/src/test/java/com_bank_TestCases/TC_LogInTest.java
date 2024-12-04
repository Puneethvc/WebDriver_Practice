package com_bank_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com_bank_PageObjects.LogInpage;

public class TC_LogInTest extends BaseClass{
	
	@Test
	public void logInTest() {
		
		driver.get(url);
		logger.info("Opening the browswe");
		
		LogInpage lp = new LogInpage(driver);
		logger.info("Login page opened");
		
		lp.setUserName(userName);
		logger.info("Enter User Name");
		
		lp.setPassword(password);
		logger.info("Enter password");
		
		lp.clickSubmit();
		logger.info("Click on Submit");
		
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			System.out.println("Login success Full");
		}else {
			Assert.assertTrue(false);
			System.out.println("Invalid Credentials to login");
		}
		
	}

}
