package com.myhybridframework.testCases;

import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.myhybridframework.utilities.ReadConfig;



public class BaseClass {

	ReadConfig readconfig = new ReadConfig(); //creating constructor

	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPasssword();
	public String invalidusername = readconfig.getInvalidUsername();
	public String invalidpassword = readconfig.getInvalidPassword();

	//AddCustomerPO
	public String customername = readconfig.getcustomername();
	public String customerdd = readconfig.getcustomerdd();
	public String customermm = readconfig.getcustomermm();
	public String customeryyyy = readconfig.getcustomeryyyy();
	public String customeraddress = readconfig.getcustomeraddress();
	public String customercity = readconfig.getcustomercity();
	public String customerstate = readconfig.getcustomerstate();
	public String customerpin = readconfig.getcustomerpin();
	public String customermobile = readconfig.getcustomermobile();
	public String customeremail = readconfig.getcustomeremail();
	public String customeraddpassword = readconfig.getcustomeraddpassword();

	//AddAccountPO
	public String customerid = readconfig.getcustomerid();
	public String initialdeposit = readconfig.getinitialdeposit();

	//DepositPO
	public String accountno = readconfig.getaccountno();
	public String amount = readconfig.getamount();
	public String description = readconfig.getdescription();

	//WithdrawalPO
	public String accountno1 = readconfig.getaccountno1();
	public String amount1 = readconfig.getamount1();
	public String description1= readconfig.getdescription1();

	//Screenshots
//	public void Screenshot() throws Exception {
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File target = new File(".\\Screenshots\\HomePage1.png");
//		FileHandler.copy(source, target);
//	}

	public static WebDriver driver;
	public static Logger logger;

//	@BeforeClass
//	public void setup() {

//		logger=Logger.getLogger("ebanking");
//		PropertyConfigurator.configure("log4j.properties");
//
//		System.setProperty("webdriver.firefox.driver", "F:\\Selenium Java Programs\\com.myhybridframework\\Drivers\\geckodriver.exe");
//		driver = new EdgeDriver();
		
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "F:\\Selenium Java Programs\\com.myhybridframework\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java Programs\\com.myhybridframework\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "F:\\Selenium Java Programs\\com.myhybridframework\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}


	}
}
