package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;

public class Loginsteps {
	
	public WebDriver driver;
	
	@Given("user enters URL and navigates to login screen")
	public void user_enters_url_and_navigates_to_login_screen() {
		
//		 WebDriverManager.chromedriver().setup();
//		 driver = new ChromeDriver();
		
		System.setProperty("webdriver.firefox.driver", "F:\\Selenium Java Programs\\mymorningbatchbddframework\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/v4/");
	   
	}

	@Given("user enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	  
	}

	@Given("click on Login button.")
	public void click_on_login_button() {
	    
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}

}
