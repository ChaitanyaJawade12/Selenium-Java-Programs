package com.myhybridframework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig(){

		File src= new File("./Configuration/config.properties");
		try {

			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public String getApplicationURL() {

		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUsername() {

		String username = pro.getProperty("username");
		return username;
	}

	public String getPasssword() {

		String password = pro.getProperty("password");
		return password;
	}
	public String getInvalidUsername() {

		String invalidusername = pro.getProperty("invalidusername");
		return invalidusername;
	}
	public String getInvalidPassword() {

		String invalidpassword = pro.getProperty("invalidpassword");
		return invalidpassword;
	}
	
	//AddCustomerPO
	public String getcustomername() {

		String customername = pro.getProperty("customername");
		return customername;
	}
	public String getcustomerdd() {

		String customerdd = pro.getProperty("customerdd");
		return customerdd;
	}
	public String getcustomermm() {

		String customermm = pro.getProperty("customermm");
		return customermm;
	}
	public String getcustomeryyyy() {

		String customeryyyy = pro.getProperty("customeryyyy");
		return customeryyyy;
	}
	public String getcustomeraddress() {

		String customeraddress = pro.getProperty("customeraddress");
		return customeraddress;
	}
	public String getcustomercity() {

		String customercity = pro.getProperty("customercity");
		return customercity;
	}
	public String getcustomerstate() {

		String customerstate = pro.getProperty("customerstate");
		return customerstate;
	}
	
	public String getcustomerpin() {

		String customerpin = pro.getProperty("customerpin");
		return customerpin;
	}
	public String getcustomermobile() {

		String customermobile = pro.getProperty("customermobile");
		return customermobile;
	}
	public String getcustomeremail() {

		String customeremail = pro.getProperty("customeremail");
		return customeremail;
	}
	public String getcustomeraddpassword() {

		String customeraddpassword = pro.getProperty("customeraddpassword");        
		return customeraddpassword;
	}
	//AddAccountPO
	public String getcustomerid() {

		String customerid = pro.getProperty("customerid");        
		return customerid;
	}
	public String getinitialdeposit() {

		String initialdeposit = pro.getProperty("initialdeposit");        
		return initialdeposit;
	}
	//DepositPO
	public String getaccountno() {

		String accountno = pro.getProperty("accountno");        
		return accountno;
	}
	public String getamount() {

		String amount = pro.getProperty("amount");        
		return amount;
	}
	public String getdescription() {

		String description = pro.getProperty("description");        
		return description;
	}
	//WithdrawalPO
		public String getaccountno1() {

			String accountno1 = pro.getProperty("accountno");        
			return accountno1;
		}
		public String getamount1() {

			String amount1 = pro.getProperty("amount");        
			return amount1;
		}
		public String getdescription1() {

			String description1 = pro.getProperty("description");        
			return description1;
		}
}
	



