package com.myhybridframework.testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.myhybridframework.pageObjects.LoginPO;

public class ValidLoginDDFTC001 extends BaseClass {
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwdd ) throws Exception {
		
		driver.get(baseURL);
		
		LoginPO loginpo = new LoginPO(driver);
		loginpo.setUsername(user);
		loginpo.setPassword(pwdd);
		loginpo.setLoginBtn();
		
		Thread.sleep(3000);		
		if(isAlertPresent()==true) {
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		Assert.assertTrue(false);
		
		}else {
			Assert.assertTrue(true);
			Thread.sleep(3000);	
			loginpo.setLogoutBtn();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
		}
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	

	@DataProvider(name="LoginData")
	public String[][] getData(){
		
		String logindata[][]= {
			
				{"mngr487641","hYmYqym"}
			
	  };
		return logindata; 
	}
		
	
}
