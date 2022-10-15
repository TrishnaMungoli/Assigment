

package com.framework.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionHelper{


	 
	public static  void mouseHover(WebDriver driver,WebElement element) {
		Actions builder=new Actions(driver);
		Action mouseHover=builder.moveToElement(element).build();
		mouseHover.perform();	
	}
	
	public static void clickonElement(WebElement element,WebDriver driver) {
		Actions builder=new Actions(driver);
		Action click=builder.click(element).build();
		click.perform();	
	}
	
	public static void clickAndHold(WebDriver driver,WebElement element) {
		Actions builder=new Actions(driver);
		Action clickAndHold=builder.clickAndHold(element).build();
		clickAndHold.perform();	
	}
	

	public static  void contextClick(WebDriver driver,WebElement element) {
		Actions builder=new Actions(driver);
		Action contextClick=builder.contextClick(element).build();
		contextClick.perform();	
	}
	
	public static void doubleClick(WebDriver driver,WebElement element) {
		Actions builder=new Actions(driver);
		Action doubleClick=builder.doubleClick(element).build();
		doubleClick.perform();	
	}
	
	public static void dragAndDrop(WebDriver driver,WebElement source ,WebElement target) {
		Actions builder=new Actions(driver);
		Action doubleClick=builder.dragAndDrop(source, target).build();
		doubleClick.perform();	
	}
	
	public static void keyDown(WebDriver driver,CharSequence key) {
		Actions builder=new Actions(driver);
		Action doubleClick=builder.keyDown(key).build();
		doubleClick.perform();	
	}
	
	public static void keyup(WebDriver driver,CharSequence key) {
		Actions builder=new Actions(driver);
		Action keyup=builder.keyUp(key).build();
		keyup.perform();	
	}
	
	public  void moveToElement(WebDriver driver,WebElement element) {
		Actions builder=new Actions(driver);
		Action moveToElement=builder.moveToElement(element).build();
		moveToElement.perform();	
	}
	
	public  void release(WebDriver driver) {
		Actions builder=new Actions(driver);
		Action release=builder.release().build();
		release.perform();	
	}
	}
	
	

	
	
	