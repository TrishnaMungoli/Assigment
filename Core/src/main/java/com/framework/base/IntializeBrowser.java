package com.framework.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.github.bonigarcia.wdm.WebDriverManager;

public class IntializeBrowser {
	
	public static WebDriver driver=null;

	public static  WebDriver setup(String url, String browserName,String env){
		
		if (driver == null && env.equals("prod") && browserName.equals("FireFox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		else if(driver == null && env.equals("prod") && browserName.equals("Chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		
		else if(driver == null && env.equals("prod") && browserName.equals("Edge")){
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url); 
			
		}
		
       else if(driver == null && env.equals("prod") && browserName.equals("Chromeheadless")){
    	   WebDriverManager.chromedriver().setup();
	       ChromeOptions chromeOptions = new ChromeOptions();
	       chromeOptions.addArguments("--no-sandbox");
	       chromeOptions.addArguments("--headless");
	       chromeOptions.addArguments("disable-gpu");
	       chromeOptions.addArguments("window-size=1920,1080");
	        driver = new ChromeDriver(chromeOptions);
	    	driver.manage().window().maximize(); 
			driver.get(url);
			
		}
		
		
		else if(driver == null && env.equals("dev") && browserName.equals("FireFox")) {
			FirefoxProfile profile = new FirefoxProfile(); 
			profile.setPreference("permissions.default.desktop-notification", 1);
			profile.setAcceptUntrustedCertificates(true);
			profile.setAssumeUntrustedCertificateIssuer(false);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			 
			driver.manage().window().maximize(); 
			driver.get(url);
			
		}
		
		
		else if(driver == null && env.equals("dev") && browserName.equals("Chrome")) {
	
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-user-media-security=true");
			WebDriverManager.chromedriver().setup();
			
			DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome (); 
			
			handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, false);
			handlSSLErr.setCapability (CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
			driver= new ChromeDriver(handlSSLErr);
		
			
			
			driver.manage().window().maximize(); 
			driver.get(url);
			
		}
		else {
			String.format("%s browser is not valid please provide valid browserName", browserName);
		}
		return driver;
			
	}
	
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver=null;

		}
	}

}