package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws InterruptedException,IOException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		Thread.sleep(3000);
		AddCustomerPage custPage = new AddCustomerPage(driver);
		custPage.clickAddNewCustomer();
		custPage.addCustomerName("Edgar");
		custPage.selectGenderCkbox();
		//custPage.custdob("10","15","1985");
		custPage.custdob("10151985");
		Thread.sleep(3000);
		custPage.addAddress("Babajanyan Str 28");
		custPage.addCity("Yerevan");
		custPage.addState("Yerevan");
		custPage.addPin("123456");
		custPage.addMobileNumber("+37477889988");
		String email=randomestring()+"@gmail.com";
		custPage.addEmail(email);
		custPage.addpassword("UHjhdf");
		custPage.custSubmit();
		
Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			Assert.assertTrue(false);
		}
		
	}

}
