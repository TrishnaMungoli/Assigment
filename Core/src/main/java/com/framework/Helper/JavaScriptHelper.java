package com.framework.Helper;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptHelper {
	
	
	public static void executeScript(String script,WebDriver driver){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		 exe.executeScript(script);
	}
	
	/**
	 * This method will execute Java script with multiple arguments
	 * @param script
	 * @param args
	 * @return
	 */
	public static  void executeScript(WebDriver driver,String script, Object...args){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		 exe.executeScript(script,args);
		 
	}
	
	/**
	 * This method will scroll till element
	 * @param element
	 */
	public static void scrollToElement(WebElement element,WebDriver driver){
		//Loggers.getInfoLog("scroll to WebElement...");
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("window.scrollTo(arguments[0],arguments[1])",element.getLocation().x,element.getLocation().y);
	}
	
	
	/**
	 * Scroll till element view
	 * @param element
	 */
	public static void scrollIntoView(WebElement element,WebDriver driver){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		//Loggers.getInfoLog("scroll till web element");
		exe.executeScript("arguments[0].scrollIntoView()");
	}
	
	
	/**
	 * This method will scroll down vertically
	 */
	public static void scrollDownVertically(WebDriver driver){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		//Loggers.getInfoLog("scrolling down vertically...");
		exe.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	/**
	 * This method will scroll up vertically
	 */
	public static void scrollUpVertically(WebDriver driver){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		//Loggers.getInfoLog("scrolling up vertically...");
		exe.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}
	
	/**
	 * This method will scroll till given pixel (e.g=1500)
	 * @param pixel
	 */
	public static void scrollDownByPixel(int pixel,WebDriver driver){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("window.scrollBY(0,"+pixel+")");
	}
	
	public static void scrollUpByPixel(int pixel,WebDriver driver){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("window.scrollBY(0,-"+pixel+")");
	}
	
	/**
	 * This method will zoom screen by 100%
	 */
	public static void zoomInBy100Percentage(WebDriver driver){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("document.body.style.zoom='100%'");
	}
	
	/**
	 * This method will zoom screen by 60%
	 */
	public static void zoomInBy60Percentage(WebDriver driver){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("document.body.style.zoom='40%'");
	}
	
	/**
	 * This method will click on element
	 * @param element
	 */
	public static void clickElement(WebElement element,WebDriver driver){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("arguments[0].click();",element);
	}

}