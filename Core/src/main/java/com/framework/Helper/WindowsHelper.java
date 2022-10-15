package com.framework.Helper;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowsHelper {

	/**
	 * This method will switch to parent window
	 */
	public static  void switchToParentWindow(WebDriver driver) {
	
		driver.switchTo().defaultContent();
	}

	/**
	 * This method will switch to child window based on index
	 * @param index
	 */
	public static void switchToWindow(int index,WebDriver driver ) {
		Set<String> windows = driver.getWindowHandles();
		int i = 1;
		for (String window : windows) {
			if (i == index) {
				
				driver.switchTo().window(window);
			} else {
				i++;
			}
		}
	}
	
	/**
	 * This method will close all tabbed window and 
	 * switched to main window
	 */
	public static void closeAllTabsAndSwitchToMainWindow(WebDriver driver)  {
		Set<String> windows = driver.getWindowHandles();
		String mainwindow = driver.getWindowHandle();

		for (String window : windows) {
			if (!window.equalsIgnoreCase(mainwindow)) {
				driver.close();
			}
		}
		driver.switchTo().window(mainwindow);
	}
	
	/**
	 * This method will do browser back navigation
	 */
	public static void navigateBack(WebDriver driver){

		driver.navigate().back();
	}
	
	/**
	 * This method will do browser forward navigation
	 */
	public static void navigateForward(WebDriver driver){
		driver.navigate().forward();
	}
	
	public static void navigateToUrl(String url,WebDriver driver) {
		driver.navigate().to(url);;
	}
	
	public static void switchToPopupAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public static void switchToPopupAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();;
	}
	
}
