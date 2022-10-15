package UiTest.UiTestRespond;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.Helper.AssertionHelper;
import com.framework.base.IntializeBrowser;
import com.framework.base.JsonReader;

import Pages.HomePage;
import TestBase.TestBase;
import Utility.ConfigReader;
import bsh.ParseException;

public class Tc_03_Verify_If_User_Able_To_View_Any_Clothing_Item_And_Add_That_To_Cart extends TestBase {
	
	ConfigReader reader = new ConfigReader();
	
	@Test(priority=0,dataProvider="TestData")
	public void verify_If_User_Able_To_View_Any_Clothing_Item_And_Add_That_To_Cart (String successMessage) {
		HomePage homePage=new HomePage(IntializeBrowser.driver);

		String result=homePage
		.hoverOnFirstPopularItem()
		.addItemToCart()
		.successMessageToAddItemInCart();
	
		AssertionHelper.softAssertToCompareString(successMessage,"Product successfully added to your shopping cart","Item is not added to cart");
	

}
	
	 @DataProvider(name="TestData")
		public Object[][] passData() throws IOException, ParseException
		{
		return JsonReader.getdata(System.getProperty("user.dir")+reader.testDataPath(), 
					"Tc_03_Verify_If_User_Able_To_View_Any_Clothing_Item_And_Add_That_To_Cart", 1, 1);
			 
		}
	
}
