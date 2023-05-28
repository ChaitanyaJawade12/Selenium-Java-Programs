package com.myhybridframework.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myhybridframework.pageObjects.LoginPO;

public class ValidLoginTC001 extends BaseClass {

	@Test
	public void loginTest() throws Exception {
		driver.get(baseURL);
		
		LoginPO loginpo = new LoginPO(driver);
		loginpo.setUsername(username);
		logger.info("User is able to enter username");
		loginpo.setPassword(password);
		logger.info("User is able to enter password");
		loginpo.setLoginBtn();
		logger.info("User is able to login");
		Thread.sleep(3000);
		
		String expectedresult = "Welcome To Manager's Page of Guru99 Bank";
		
		//This is for actual result
	   WebElement message = driver.findElement(By.xpath("//marquee[@class='heading3']"));
	   
	   String actualresult = message.getText();
	   
	   Assert.assertEquals(actualresult,expectedresult);
		
		
	}
}
