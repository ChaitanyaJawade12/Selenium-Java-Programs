package com.myhybridframework.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myhybridframework.pageObjects.LoginPO;

public class TCInvalidUsername002 extends BaseClass  {

		@Test
		public void loginTest() throws Exception {
			driver.get(baseURL);
			
			LoginPO loginpo = new LoginPO(driver);
			loginpo.setUsername(invalidusername);
			logger.info("This is invalidusername");
			loginpo.setPassword(password);
			logger.info("User is able to enter password");
		
			
			loginpo.setLoginBtn();
			logger.info("User is able to view alert message");
			
			String expectedresult = "https://demo.guru99.com/v4/index.php";
			
			//actual result code
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
		   
		   
		   String actualresult = driver.getCurrentUrl();
		   
		   Assert.assertEquals(actualresult,expectedresult);
			
			
		}
	}

	

	

