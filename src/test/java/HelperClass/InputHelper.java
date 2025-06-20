package HelperClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import StandardUtils.DriverFactory;

public class InputHelper extends DriverFactory{

	
	
	
	public void getElementAndEnterData(WebElement element, String text) {
		
		element.clear();
		element.sendKeys(text);
	}
	
	public void getElementAndClick(WebElement element) {
		
		element.click();
	}
	
  
}
