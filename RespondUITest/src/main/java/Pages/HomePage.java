package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.Helper.ActionHelper;
import com.framework.Helper.WaitHelper;
import com.framework.base.IntializeBrowser;


public class HomePage {
	
	public HomePage(WebDriver driver) {
		IntializeBrowser.driver = driver;
		PageFactory.initElements(IntializeBrowser.driver, this);

	}

	@FindBy(how = How.ID, using = "search_query_top")
	WebElement searchBar;
	
	@FindBy(how = How.CSS, using = "button[name='submit_search']")
	WebElement submitSearch;
	
	@FindBy(how = How.XPATH, using = "//a[@class='product-name' and @title='Blouse']")
	WebElement resultOFSerach;
	
	@FindBy(how = How.CSS, using = "a[title='Women']")
	WebElement womenCategoryFilter;	
	
	@FindBy(how = How.CSS, using = "input[class='color-option  ']")
	List<WebElement>colorCategory;
	
	@FindBy(how = How.CSS, using = "span[class='cat-name']")
	WebElement filterSearchResultTitle;	
	
	@FindBy(how = How.XPATH, using = "//ul[@class='product_list grid row']//p//img")
	WebElement loaderGif;	
	
	
	@FindBy(how = How.CSS, using = "div[class='product-image-container']")
	WebElement firstPopularItem;	
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Add to cart')]")
	WebElement addItemToCart;	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class,'layer_cart_product')]/h2")
	WebElement SuccessMessageToAddItemInCart;	
	
	
	
	

	
	public HomePage clickAndTypeOnSerachBar(String search) {

		WaitHelper.isvisible(searchBar, IntializeBrowser.driver);
		 searchBar.click();
		 searchBar.clear();
		 searchBar.sendKeys(search);
		return new  HomePage(IntializeBrowser.driver);
	}
	

	public HomePage serachResults() {

	   WaitHelper.isvisible(submitSearch, IntializeBrowser.driver);
	   submitSearch.click();
	   return new  HomePage(IntializeBrowser.driver);
	}
	
	public String resultOFSerach(String searchResultList) {
		WebElement resultForSearch=IntializeBrowser.driver.findElement(By.xpath(String.format("//a[@class='product-name' and @title='%s']",searchResultList)));
		return resultForSearch.getText();
	}
	
	public HomePage womenCategoryFilter() {

		   WaitHelper.isClickable(womenCategoryFilter, IntializeBrowser.driver);
		   womenCategoryFilter.click();
		   return new  HomePage(IntializeBrowser.driver);
		}
	
	public HomePage colorFilter(int num) {
		   WaitHelper.isClickable(womenCategoryFilter, IntializeBrowser.driver);
		   colorCategory.get(num).click();
		   return new  HomePage(IntializeBrowser.driver);
		   
		}
	
	
	public String filterSearchResultTitle() {
		   WaitHelper.isvisible(filterSearchResultTitle, IntializeBrowser.driver);
		   return filterSearchResultTitle.getText();
		   
		}
	
	public HomePage waitForLoder() {
		   WaitHelper.isNotVisible(loaderGif, IntializeBrowser.driver);
		   return new  HomePage(IntializeBrowser.driver);
		 
	   }
	
	
	public  HomePage hoverOnFirstPopularItem() {
		  WaitHelper.isvisible(firstPopularItem, IntializeBrowser.driver);
		  ActionHelper.mouseHover(IntializeBrowser.driver, firstPopularItem);
		   return new  HomePage(IntializeBrowser.driver);
		 
	   }
	
	public  HomePage addItemToCart() {
		  WaitHelper.isClickable(addItemToCart, IntializeBrowser.driver);
		  addItemToCart.click();
		   return new  HomePage(IntializeBrowser.driver);
		 
	   }
	
	public  String successMessageToAddItemInCart() {
		  WaitHelper.isvisible(SuccessMessageToAddItemInCart, IntializeBrowser.driver);
		 return SuccessMessageToAddItemInCart.getText();
		  
		 
	   }
}


