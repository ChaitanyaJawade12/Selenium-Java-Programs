package com.myhybridframework.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myhybridframework.pageObjects.LoginPO;

public class TC_InvalidPassword_004 extends BaseClass{

	@Test
	public void loginTest() throws Exception {
		driver.get(baseURL);

		LoginPO loginpo = new LoginPO(driver);
		loginpo.setUsername(username);
		loginpo.setPassword(invalidpassword);
		loginpo.setLoginBtn();

		String expectedresult = "https://demo.guru99.com/v4/index.php";

		//actual result code
		Thread.sleep(3000);
		driver.switchTo().alert().accept();


		String actualresult = driver.getCurrentUrl();

		Assert.assertEquals(actualresult,expectedresult);


	}
}

