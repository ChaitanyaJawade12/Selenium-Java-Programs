package com.myhybridframework.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.myhybridframework.pageObjects.AmountWithdrawalPO;
import com.myhybridframework.pageObjects.LoginPO;

public class WithdrawalDDFTC0006 extends BaseClass {
	@Test(dataProvider="Withdrawal")
public void Amount_Deposit( String cust_id, String cust_pass, String acc_no1, String amt1, String desc1) throws Exception {
		
		driver.get(baseURL);
		
		LoginPO loginpo = new LoginPO(driver);
		loginpo.setUsername(cust_id);
		logger.info("User is able to enter UserID");
		
		loginpo.setPassword(cust_pass);
		logger.info("User is able to enter Password");
		
		loginpo.setLoginBtn();
		logger.info("User is able to login");
		
		AmountWithdrawalPO amountwithdrawalpo = new AmountWithdrawalPO(driver); 
		amountwithdrawalpo.setwithdrawal();
		Thread.sleep(3000);
		
		amountwithdrawalpo.setaccoount_no1(acc_no1);
		logger.info("User is able to enter Account No ");
		
		amountwithdrawalpo.setamount1(amt1);
		logger.info("User is able to enter Amount ");
		
		amountwithdrawalpo.setdescription1(desc1);
		logger.info("User is able to enter Description ");
		
		amountwithdrawalpo.setaccsubmit1();
		logger.info("User is able to submit");
		
	}

	
	@DataProvider(name="Withdrawal")
	public String[][] getdata(){
		
		String data[][]= {
				{"mngr487641","hYmYqym","119989","75000","Withdrawal"}
		};
		return data;
	}
}



