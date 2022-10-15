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

public class Tc_01_Verify_User_Able_To_Serach_Item_Using_Search_Bar  extends TestBase{
	

	ConfigReader reader = new ConfigReader();
	@Test(priority=0,dataProvider="TestData")
	public void Verify_User_Able_To_Serach_Item_Using_Search_Bar(String serachResult) {
		
		
		HomePage homePage=new HomePage(IntializeBrowser.driver);
	
		homePage
		.clickAndTypeOnSerachBar(serachResult)
		.serachResults();
		
		AssertionHelper.softAssertToCompareString(serachResult, homePage.resultOFSerach(serachResult),"Search result not matach");
		
		
		
	}
	

	 @DataProvider(name="TestData")
		public Object[][] passData() throws IOException, ParseException
		{
		return JsonReader.getdata(System.getProperty("user.dir")+reader.testDataPath(), 
					"Tc_01_Verify_User_Able_To_Serach_Item_Using_Search_Bar", 1, 1);
			 
		}
	
	

}
