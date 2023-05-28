package com.myhybridframework.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {

	public static void takeScreenshots(WebDriver driver,String screenshotName){

		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File destination = new File(".\\Screenshots\\" + screenshotName + ".png");

		try{

			FileUtils.copyFile(source, destination);



		}catch(IOException e){


			System.out.println("Error taking screenshot" + e.getMessage());



		}






	}


}
