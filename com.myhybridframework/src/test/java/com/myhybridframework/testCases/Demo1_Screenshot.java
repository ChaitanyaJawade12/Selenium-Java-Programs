package com.myhybridframework.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.myhybridframework.pageObjects.AddCustomerPO;
import com.myhybridframework.pageObjects.LoginPO;

public class Demo1_Screenshot extends BaseClass{

	@Test(dataProvider="LoginData")
	public void newcustomerDDT( String user_name, String pass, String name, String day, String month, String year, String address, String city, String state,String pin, String mobile, String email, String password) throws Exception {

		driver.get(baseURL);

		LoginPO loginpo = new LoginPO(driver);
		loginpo.setUsername(user_name);
		loginpo.setPassword(pass);
		loginpo.setLoginBtn();

		Screenshot();
		
		AddCustomerPO addcustomerpo = new AddCustomerPO(driver);
		addcustomerpo.setnew_customer();
		Thread.sleep(9000);
		addcustomerpo.setcustomername(name);
		addcustomerpo.setcustomerdd(day);
		addcustomerpo.setcustomermm(month);
		addcustomerpo.setcustomeryyyy(year);
		addcustomerpo.setcustomeraddress(address);
		addcustomerpo.setcustomercity(city);
		addcustomerpo.setcustomerstate(state);
		addcustomerpo.setcustomerpin(pin);
		addcustomerpo.setcustomermobile(mobile);
		addcustomerpo.setcustomeremail(email);
		addcustomerpo.setcustomeraddpassword(password);
		addcustomerpo.setsubmit();
		Thread.sleep(3000);
	
	}
	@DataProvider(name="LoginData")
	public String[][] getData(){

		String logindata[][]= {

				{"mngr487641","hYmYqym","Alok","16","02","2002","wardha","nagpur","maharashtra","442001","9884574878","djo23@gmail.com","AbCd@1123"}
		};
		return logindata; 
	}


}
