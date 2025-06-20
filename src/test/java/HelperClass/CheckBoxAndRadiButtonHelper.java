package HelperClass;

import java.util.List;

import org.openqa.selenium.WebElement;

import StandardUtils.DriverFactory;

public class CheckBoxAndRadiButtonHelper extends DriverFactory {

	
	
	
	public void Select(WebElement element)
	   {
	       if (element.isSelected() == false)
	       {
	           element.click();
	       }
	   }
	   public void DeSelect(WebElement element)
	   {
	       if (element.isSelected() == true)
	       {
	           element.click();
	       }
	   }
	   public void SelectAll(List<WebElement> elements)
	   {
	       for (WebElement element : elements)
	       {
	           Select(element);
	       }

	   }
	   public void DeSelectAll(List<WebElement> elements)
	   {
	       for(WebElement element : elements)
	       {
	           DeSelect(element);
	       }

	   }
	   public void Select(WebElement checkbox, WebElement clickableElement)
	   {
	       if (checkbox.isSelected() == false)
	       {
	           clickableElement.click();
	       }
	   }
	   public void DeSelect(WebElement checkbox, WebElement clickableElement)
	   {
	       if (checkbox.isSelected() == true)
	       {
	           clickableElement.click();
	       }
	   }

	
	
}
