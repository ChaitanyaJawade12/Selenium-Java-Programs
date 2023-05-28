package com.myhybridframework.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myhybridframework.pageObjects.AmountDepositPO;
import com.myhybridframework.pageObjects.LoginPO;

public class Deposit_TC007 extends BaseClass {
	@Test
	public void loginTest() throws Exception {
		driver.get(baseURL);

		LoginPO loginpo = new LoginPO(driver);
		loginpo.setUsername(username);
		loginpo.setPassword(password);
		loginpo.setLoginBtn();
		
		AmountDepositPO amountdepositpo = new AmountDepositPO(driver);
		amountdepositpo.setdeposit();
		Thread.sleep(2000);
		amountdepositpo.setaccoount_no(accountno);
		amountdepositpo.setamount(amount);
		amountdepositpo.setdescription(description);
		Thread.sleep(4000);
		amountdepositpo.setaccsubmit();
		
		String expectedresult = "https://demo.guru99.com/v4/manager/Deposit.php";
		
		//This is for actual result
	   String actualresult = "https://demo.guru99.com/v4/manager/Deposit.php";
	   
	   WebElement message;
	String actualresult = message.getText();
	   
	   Assert.assertEquals(actualresult,expectedresult);
		
	}	
}
