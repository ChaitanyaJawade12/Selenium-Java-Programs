package com.myhybridframework.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.myhybridframework.pageObjects.AddAccountPO;
import com.myhybridframework.pageObjects.LoginPO;



public class AddAccountDDFTC003 extends BaseClass {

	@Test(dataProvider="AddCustomer")
	public void newcust_blankvalidation(String user, String pass, String cust_id, String deposite) throws Exception
	{
		driver.get(baseURL);

		LoginPO loginpo = new LoginPO(driver);
		loginpo.setUsername(user);
		loginpo.setPassword(pass);
		loginpo.setLoginBtn();

		AddAccountPO addaccountpo = new AddAccountPO(driver);
		addaccountpo.setnew_account();
		Thread.sleep(4000);
		addaccountpo.setcustomer_id(cust_id);
		addaccountpo.setinitial_deposit(deposite);
		addaccountpo.setsubmit2();
		
	}
		
	@DataProvider(name="AddCustomer")
	public String[][] getaddcustomerData()       //method
	{

		String addcustomerdatadata[][]= {            //array name
				{"mngr487641","hYmYqym","35907","80000"}

		};
		return addcustomerdatadata;

	}}