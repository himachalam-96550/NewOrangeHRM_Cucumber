package HelperClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import StandardUtils.DriverFactory;

public class JavaScriptHelper extends DriverFactory {

	 public void getElementAndEnterDataWithJs(WebElement element, String text) {
			
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("arguments[0].value = arguments[1];", element, text);
			
		}
	   
	   public void getElementAndClickWithJs(WebElement element) {
			
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("arguments[0].click();", element);	
		}
	
	   public void scrollToElement(WebElement element) {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", element);
		}

	   public void scrollToTop() {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollTo(0, 0);");
		}
	   
	   public void scrollDownBy500() {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0, 500);");
		}
	   
	   public void scrollUpBy500() {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0, -500);");
		}

}
