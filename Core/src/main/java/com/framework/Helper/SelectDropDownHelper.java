package com.framework.Helper;

import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHelper {
	
	public static void selectUsingValue(WebElement element, String value){
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void selectUsingIndex(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectUsingVisibleText(WebElement element, String visibleText){
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	public static void deSelectUsingValue(WebElement element, String value){
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	
	public static void deSelectUsingIndex(WebElement element, int index){
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	
	public static void deSelectUsingVisibleText(WebElement element, String visibleText){
		Select select = new Select(element);
		select.deselectByVisibleText(visibleText);
	}
	
	public static List<String> getAllDropDownData(WebElement element){
		Select select = new Select(element);
		List<WebElement> elementList = select.getOptions();
		List<String> valueList = new LinkedList<String>();
		for(WebElement ele: elementList){
			valueList.add(ele.getText());
		}
		return valueList;
	}
}
	
	