package com.framework.Helper;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionHelper {
	
		
		
		public static void verifyText(String s1, String s2 ,String message){	
			Assert.assertEquals(s1, s1,message);
		}
		
		public static void markPass(){
		
			Assert.assertTrue(true);
		}
		
		public static void markPass(String message){
			Assert.assertTrue(true, message);
		}
		
		public static void markFail(){
	
			Assert.assertTrue(false);
		}
		
		public static void markFail(String message){
			Assert.assertTrue(false, message);
		}
		
		public static void verifyTrue(boolean status,String message){
			Assert.assertTrue(status,message);
		}
		
		public static void verifyFalse(boolean status){
			Assert.assertFalse(status);
		}
		
		public static void verifyNull(String s1,String message){
			Assert.assertNull(s1,message);
		}
		
		public static void verifyNotNull(String s1){
			Assert.assertNotNull(s1);
		}
		
		public static void fail(){
			Assert.assertTrue(false);
		}
		
		public static void pass(){
			Assert.assertTrue(true);
		}
		
		public static void updateTestStatus(boolean status){
			if(status){
				pass();
			}
			else{
				fail();
			}
		}
		
		public static void softAssertToCompareString(String s1,String s2,String message) {
			SoftAssert softAssertion= new SoftAssert();
			 softAssertion.assertEquals(s1, s2,message);
			 softAssertion.assertAll();
			
		}
		
		public static void softAssertToCompareIntegers(int s1,int s2,String message) {
			SoftAssert softAssertion= new SoftAssert();
			 softAssertion.assertEquals(s1, s2,message);	
			 softAssertion.assertAll();	
		}
		
		public static void softAssertsoftAssertVerifyNull(String S1,String message) {
			SoftAssert softAssertion= new SoftAssert();
			 softAssertion.assertNull(S1,message);	
			 softAssertion.assertAll();	
		}
		
		public static void softAssertverifyNotNull(String s1,String message){
			SoftAssert softAssertion= new SoftAssert();
			 Assert.assertNotNull(s1,message);
			 softAssertion.assertAll();	
		}
		
		
		public static void softAssertToCompareFloat(Float s1,Float s2,String message){
			SoftAssert softAssertion= new SoftAssert();
			softAssertion.assertEquals(s1,s2,message);
			 softAssertion.assertAll();	
		}
		

	}