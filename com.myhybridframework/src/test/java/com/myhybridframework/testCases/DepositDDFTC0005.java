package com.myhybridframework.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.myhybridframework.pageObjects.AmountDepositPO;
import com.myhybridframework.pageObjects.LoginPO;

public class DepositDDFTC0005 extends BaseClass{
	@Test(dataProvider="Deposit")
	public void Amount_Deposit( String cust_id, String cust_pass, String acc_no, String amt, String desc) throws Exception {
		
		driver.get(baseURL);
		
		LoginPO loginpo = new LoginPO(driver);
		loginpo.setUsername(cust_id);
		logger.info("User is able to enter UserID");
		
		loginpo.setPassword(cust_pass);
		logger.info("User is able to enter Password");
		
		loginpo.setLoginBtn();
		logger.info("User is able to login");
		
		AmountDepositPO amountdepositpo = new AmountDepositPO(driver);
		amountdepositpo.setdeposit();
		Thread.sleep(3000);
		
		amountdepositpo.setaccoount_no(acc_no);
		logger.info("User is able to enter Account No ");
		
		amountdepositpo.setamount(amt);
		logger.info("User is able to enter Amount ");
		
		amountdepositpo.setdescription(desc);
		logger.info("User is able to enter Description ");
		
		amountdepositpo.setaccsubmit();
		logger.info("User is able to submit");
		
	}

	
	@DataProvider(name="Deposit")
	public String[][] getdata(){
		
		String data[][]= {
				{"mngr487641","hYmYqym","119989","75000","Hello"}
		};
		return data;
	}
}
