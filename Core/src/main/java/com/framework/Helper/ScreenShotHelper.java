package com.framework.Helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotHelper {
	


	 public static String   captureScreenshot(WebDriver driver , String path) throws IOException {
		 
		 TakesScreenshot ts = (TakesScreenshot)driver ;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 String destination=path;
		 File finalDestination = new File(destination);
		 FileUtils.copyFile(source, finalDestination);
		 
		 return destination;
		  }

}