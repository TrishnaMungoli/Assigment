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

public class Tc_02_Verify_User_Able_To_Filter_Search_Result_Under_Women_Category_By_Color extends TestBase {
	
	ConfigReader reader = new ConfigReader();
	
	@Test(priority=0,dataProvider="TestData")
	public void Verify_User_Able_To_Filter_Search_Result_Under_Women_Category_By_Color(String filterResult) {
		HomePage homePage=new HomePage(IntializeBrowser.driver);

		String getResult=homePage.
		womenCategoryFilter()
		.colorFilter(1)
		.waitForLoder()
		.filterSearchResultTitle();
		
		AssertionHelper.softAssertToCompareString(getResult,filterResult,"Search result for filters does not match");
		
		
	}
	
	 @DataProvider(name="TestData")
		public Object[][] passData() throws IOException, ParseException
		{
		return JsonReader.getdata(System.getProperty("user.dir")+reader.testDataPath(), 
					"Tc_02_Verify_User_Able_To_Filter_Search_Result_Under_Women_Category_By_Color", 1, 1);
			 
		}
	

}
