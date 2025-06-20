package HelperClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import StandardUtils.DriverFactory;

public class ButtonHelper extends DriverFactory  {

	
	public void waitAndClick(WebElement element)
	 {
	     element.click();
	 }

	 public void clickAction(WebElement element)
	 {
	     new Actions(driver).moveToElement(element).click().perform();
	 }

	 public void Doubleclick(WebElement element)
	 {
	     new Actions(driver).doubleClick(element).perform();
	 }



	
}
