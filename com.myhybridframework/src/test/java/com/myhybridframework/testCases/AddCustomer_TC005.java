package com.myhybridframework.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myhybridframework.pageObjects.AddCustomerPO;
import com.myhybridframework.pageObjects.LoginPO;

public class AddCustomer_TC005 extends BaseClass {
	@Test
	public void loginTest() throws Exception {
		driver.get(baseURL);

		LoginPO loginpo = new LoginPO(driver);
		loginpo.setUsername(username);
		loginpo.setPassword(password);
		loginpo.setLoginBtn();
		AddCustomerPO addcustomerpo = new AddCustomerPO(driver);
		addcustomerpo.setnew_customer();
		Thread.sleep(4000);
		addcustomerpo.setcustomername(customername);
		addcustomerpo.setcustomerdd(customerdd);
		addcustomerpo.setcustomermm(customermm);
		addcustomerpo.setcustomeryyyy(customeryyyy);
		addcustomerpo.setcustomeraddress(customeraddress);
		addcustomerpo.setcustomercity(customercity);
		addcustomerpo.setcustomerstate(customerstate);
		addcustomerpo.setcustomerpin(customerpin);
		addcustomerpo.setcustomermobile(customermobile);

		String email= randomemail() + "@gmail.com";
		addcustomerpo.setcustomeremail(email);
		addcustomerpo.setcustomeraddpassword(customeraddpassword);
		Thread.sleep(3000);
		addcustomerpo.setsubmit();
	}
	public String randomemail() {

		String generateString = RandomStringUtils.randomAlphabetic(8); 
		return generateString;
		
		
	}
	//for generating numbers
	/*public String randomnumber() {

		String generatenumber = RandomStringUtils.randomNumeric(10);
		return generatenumber;
	} */ 
	
	
}




