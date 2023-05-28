package com.myhybridframework.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myhybridframework.pageObjects.LoginPO;

public class TC_BothInvalid_Crendentials003 extends BaseClass {

	@Test
	public void loginTest() throws Exception {
		driver.get(baseURL);

		LoginPO loginpo = new LoginPO(driver);
		loginpo.setUsername(invalidusername);
		loginpo.setUsername(invalidusername);
		loginpo.setPassword(invalidpassword);
		loginpo.setUsername(invalidusername);
		
		loginpo.setLoginBtn();
		

		String expectedresult = "https://demo.guru99.com/v4/index.php";

		//actual result code
		Thread.sleep(3000);
		driver.switchTo().alert().accept();


		String actualresult = driver.getCurrentUrl();

		Assert.assertEquals(actualresult,expectedresult);


	}
}

