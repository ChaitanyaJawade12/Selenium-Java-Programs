package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeachBox_Dropdown {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/maps/d/"); //This cmd is used for launching the webpage


		driver.manage().window().maximize(); //cmd for maximize the window
		
		WebElement Create_New_Map = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		Create_New_Map.click();
		
		Thread.sleep(3000);
		WebElement search_box = driver.findElement(By.xpath("//input[@id='mapsprosearch-field']"));
		search_box.clear();
		search_box.sendKeys("Pune");
		
		Thread.sleep(3000);
		String text = null;
		
		do {
			Thread.sleep(3000);
			search_box.sendKeys(Keys.ARROW_DOWN);
			
			text = search_box.getAttribute("value");
			
			if(text.equals(" International Airport (PNQ)")) {
				
				Thread.sleep(3000);
				search_box.sendKeys(Keys.ENTER);
				break;
			}
		}while(!text.isEmpty());
	}

}
