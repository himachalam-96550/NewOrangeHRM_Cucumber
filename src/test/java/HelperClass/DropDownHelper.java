package HelperClass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import StandardUtils.DriverFactory;

public class DropDownHelper extends DriverFactory{

	
	public void selectUsingVisibleValue(WebElement element, String text)
	{
	    Select selectElement = new Select(element);
	    selectElement.selectByVisibleText(text);
	}

	public void selectUsingValue(WebElement element, String text)
	{
		 Select selectElement = new Select(element);
	    selectElement.selectByValue(text);
	}

	public void selectUsingIndex(WebElement element, int index)
	{
		 Select selectElement = new Select(element);
	    selectElement.selectByIndex(index);
	}
	
	public void selectDropDownByText(List<WebElement> elements , String text) {
		
		for(WebElement option : elements) {
			
			String elemtext = option.getText();
			
			  if(elemtext.equals(text)) {
				  
				  option.click();
			  }
			}

	}
	
	
}
