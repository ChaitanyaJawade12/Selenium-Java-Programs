package com.myhybridframework.testCases;

import org.testng.annotations.Test;

import com.myhybridframework.pageObjects.AddAccountPO;
import com.myhybridframework.pageObjects.LoginPO;
import com.myhybridframework.utilities.ScreenshotUtility;

public class MultipleScreenshots extends BaseClass {

	@Test
	public void loginTest() throws Exception {
		driver.get(baseURL);

		LoginPO loginpo = new LoginPO(driver);
		loginpo.setUsername(username);
		loginpo.setPassword(password);
		loginpo.setLoginBtn();
		
		ScreenshotUtility.takeScreenshots(driver, "one.png");

		AddAccountPO addaccountpo = new AddAccountPO(driver);
		addaccountpo.setnew_account();
		
		ScreenshotUtility.takeScreenshots(driver, "two.png");
		
		Thread.sleep(4000);
		addaccountpo.setcustomer_id(customerid);
		logger.info("User is ab;le to enter id");
		addaccountpo.setinitial_deposit(initialdeposit);
		logger.info("User is able to enter initialdeposit");

		addaccountpo.setsubmit2();
		logger.info("User is able to submit");
		
		ScreenshotUtility.takeScreenshots(driver, "three.png");



	}
}





