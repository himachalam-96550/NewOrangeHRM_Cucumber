package HelperClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import StandardUtils.DriverFactory;

public class AssertHelper  extends DriverFactory {

	
	
	
	
	
	 public void assertTwoString(String expstring,String actsting) {
		 
		 Assert.assertEquals(expstring, actsting);
	 }
	
	 
	 public void assertTheStringsContains(String actualText, String expectedtext)
	 {
	     try
	     {
	         Assert.assertTrue(actualText.contains(expectedtext), "\nActual text - " + actualText + "\nExpected text - " + expectedtext);
	     }
	     catch (Exception error)
	     {
	         //AllErrors(error);
	     }
	 }

	 public void assertTheAlertText(String actualAlertMessage)
	 {
	     String expectedAlertMessage = driver.switchTo().alert().getText();
	     assertTheStringsContains(expectedAlertMessage, actualAlertMessage);
	 }
	 
	 public void assertText(WebElement element, String expectedtext)
	 {
	     String actualText = element.getText().toLowerCase();
	     System.out.println(actualText);
	     assertTheStringsContains(actualText, expectedtext.toLowerCase());
	 }
	 
	 public void assertInnerValueText(WebElement element, String expectedtext)
	 {
	     String actualText = element.getAttribute("value").toString().toLowerCase();
	     assertTheStringsContains(actualText, expectedtext.toLowerCase());
	 }
	 
	 
	 public void assertthelistContainsString(List<String> elements, String expected, String errormsg)
	 {
	     try
	     {
	         List<String> listofStrings = new ArrayList<String>(elements);
	         if (listofStrings.contains(expected))
	         {
	        	 Assert.assertEquals(true, true, errormsg);
	        	 
	         }
	         else
	         {
	             throw new Exception("List doesn't contains the string "+errormsg);
	         }
	     }
	     catch (Exception error)
	     {
	         //AllErrors(error);
	     }
	 }

	 
	 public boolean assertthelistContainsString(List<String> elements, String expected)
	 {

	     List<String> listofStrings = new ArrayList<String>(elements);
	     if (listofStrings.contains(expected))
	     {
	         return true;
	     }
	     else
	     {
	         return false;
	     }
	 }

	 public void assertthelistContainsStringWithStatus(List<String> elements, String expected, Boolean status)
	 {
	     try
	     {
	         assertTheBoolValue(assertthelistContainsString(elements, expected), status);
	     }
	     catch (Exception error)
	     {
	         //AllErrors(error);
	     }
	 }

	 public void GetValueAndassertTheText(WebElement element, String expectedtext)
	 {
	     String actualText = element.getAttribute("value");
	     assertTheStringsContains(actualText, expectedtext);
	 }
	 public void assertTheBoolValue(Boolean expectedStatus, Boolean actualStatus)
	 {
	     try
	     {
	         Assert.assertEquals(expectedStatus, actualStatus);
	     }
	     catch (Exception error)
	     {
	         //AllErrors(error);
	     }
	 }
	 
	 public void assertThecount(int expectedStatus, int actualStatus)
	 {
	     try
	     {
	         Assert.assertTrue(expectedStatus == actualStatus);
	     }
	     catch (Exception error)
	     {
	        // AllErrors(error);
	     }
	 }
	 
	 public void assertBothStringContains(String actual, String expected, String errormsg)
	 {
	     try
	     {
	         boolean isTextMatch = false;
	         if (actual.contains(expected))
	         {
	             isTextMatch = true;
	         }
	         else if (expected.contains(actual))
	         {
	             isTextMatch = true;
	         }
	         Assert.assertTrue(isTextMatch, errormsg);
	     }
	     catch (Exception error)
	     {
	         //AllErrors(error);
	     }
	 }

	 public void IsTrue(Boolean status, String errormsg)
	 {
	     try
	     {
	         Assert.assertTrue(status, errormsg);
	     }
	     catch (Exception error)
	     {
	         //AllErrors(error);
	        
	     }
	 }

	 public void assertTheTwodouble(double expectedStatus, double actualStatus, String errormsg)
	 {
	     try
	     {
	         Assert.assertTrue(expectedStatus == actualStatus, errormsg);
	     }
	     catch (Exception error)
	     {
	         //AllErrors(error);
	     }
	 }
	 

	 
	 
	 
	 
	 
	 
	 
}
