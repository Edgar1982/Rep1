package com.inetBanking.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

	
	@Test
	public void LoginTest() {
		
		//driver.get(baseURL);
		
		logger.info("Url Is Opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		

		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
		}
		else {
			
			Assert.assertTrue(false);
		}
	}
	
	
}
