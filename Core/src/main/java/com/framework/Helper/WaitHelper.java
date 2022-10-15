package com.framework.Helper;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	public static boolean explictWait(WebDriver driver ) {
		try {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return true;
		}
		catch (Exception e) {
			
			return false;
		}
						
	}

	public static boolean elementToBeSelected(WebElement element,WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			
			return false;
		}
	}
	
	public static boolean frameToBeAvaliableAndSwitchToIt(WebElement element,WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean invisibilityOfTheElementLocated(WebElement element,WebDriver driver)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.invisibilityOf(element));
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public static boolean alertToBePresent(WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean isClickable(WebElement element, WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean isStale(WebElement element, WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;	    
	       } catch (Exception StaleElementReferenceException) {
			driver.navigate().refresh();
			return false;
		}
	}
	
	public static boolean invisibilityOfTheElementLocate(WebElement element, WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOf(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean presenceOfAllElementsLocatedBy(By element, WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean invisibilityOfElementWithText(By element, WebDriver driver,String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementWithText(element, text));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean textToBePresentInElement(WebElement element, WebDriver driver,String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.textToBePresentInElement(element, text));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean textToBePresentInElementLocated(By element, WebDriver driver,String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.textToBePresentInElementLocated(element, text));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean textToBePresentInElementValue(WebElement element, WebDriver driver,String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.textToBePresentInElementValue(element, text)); 
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean titleContains( WebDriver driver,String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.titleContains(text)); 
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean visibilityOfAllElements( WebDriver driver,WebElement element ) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfAllElements(element)); 
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean visibilityOfElementLocated( WebDriver driver,By element ) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(element)); 
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isvisible(WebElement element, WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf((element))); 
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean isNotVisible(WebElement element, WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOf(element));
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public static boolean isElementPresent(WebElement element, WebDriver driver) {
		try {
			element.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
		}
		
}

