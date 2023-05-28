package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium Java Programs\\com.mymorningbatch\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/social-icon.html"); //This cmd is used for launching the webpage

		//Maximize Window
		driver.manage().window().maximize();

		//Mail ToolTip Msg
		WebElement Mail = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		String Mail_TollTip_Msg = Mail.getAttribute("title");
		System.out.println("This is Mail tooltip message :- " + Mail_TollTip_Msg);

		//Google+ ToolTip Msg
		WebElement Google = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-google']"));
		String Google_TollTip_Msg = Google.getAttribute("title");
		System.out.println("This is Goolge+ tooltip message :- " + Google_TollTip_Msg);

		//Youtube ToolTip Msg
		WebElement Youtube = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-youtube']"));
		String Youtube_TollTip_Msg = Youtube.getAttribute("title");
		System.out.println("This is Youtube tooltip message :- " + Youtube_TollTip_Msg);

		//Github ToolTip Msg
		WebElement Github = driver.findElement(By.xpath("//div[@class='socialbtns']//div//a[@title='Github']"));
		String Github_TollTip_Msg = Github.getAttribute("title");
		System.out.println("This is Github tooltip message :- " + Github_TollTip_Msg);

		//FaceBook ToolTip Msg
		WebElement FaceBook = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-facebook']"));
		String FaceBook_TollTip_Msg = FaceBook.getAttribute("title");
		System.out.println("This is Github tooltip message :- " + FaceBook_TollTip_Msg);

		//Rss ToolTip Msg
		WebElement Rss = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-rss']"));
		String Rss_TollTip_Msg = Rss.getAttribute("title");
		System.out.println("This is Github tooltip message :- " + Rss_TollTip_Msg);
	}

}
