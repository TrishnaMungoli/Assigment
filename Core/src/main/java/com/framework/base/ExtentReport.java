package com.framework.base;

import java.io.File;


import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport {
	
	public  static  ExtentReports extent;
	public static ExtentTest Reportlogger;
	
	
	public static void initiliazeExtentReport(String filePath,String extentXML) {
		extent = new ExtentReports(filePath, false);
		extent.loadConfig(new File("core//test-output//extent-config.xml"));
	}

}
	