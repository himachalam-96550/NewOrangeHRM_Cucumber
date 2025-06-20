package HelperClass;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import StandardUtils.DriverFactory;

public class BrowserHelper extends DriverFactory {

	  public String getUrl() {
			
		  String url = driver.getCurrentUrl();
		  return url;
	  }
	
	  public void enterUrl(String url)
	  {
	      
	      driver.navigate().to(url);
	  }
	
	
	  public void goBack()
	  {
	      driver.navigate().back();
	  }
	  public void goForward()
	  {
	      driver.navigate().forward();
	  }
	  public void refresh()
	  {
	      driver.navigate().refresh();
	  }
	  public String getWindowHandle()
	  {
	      return driver.getWindowHandle();
	  }
	  public Set<String> getWindowHandles()
	  {
	      return driver.getWindowHandles();
	  }

	  public void switchToLastWindow()
	  {
	      for(String winHandle : getWindowHandles())
	      {
	          driver.switchTo().window(winHandle);
	      }
	  }
	  
	  public void clickTheElementIfPresent(WebElement element)
	  {
	      try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      try
	      {
	          if (element.isEnabled())
	          {
	              element.click();
	          }
	      }
	      catch (Exception e)
	      {
	         
	      }
	  }
	  
	  
	  // Scrolls an element into view (aligns at the top)
	    public static void scrollToElement(WebDriver driver, WebElement element) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    }

	    // Scrolls an element into view (aligns at the bottom)
	    public static void scrollToElementBottom(WebDriver driver, WebElement element) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
	    }

	    // Scrolls to the bottom of the web page
	    public static void scrollToBottom(WebDriver driver) {
	        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
	    }

	    // Scrolls to the top of the web page
	    public static void scrollToTop(WebDriver driver) {
	        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
	    }

	    // Scrolls down by a specified number of pixels
	    public static void scrollDownByPixels(WebDriver driver, int pixels) {
	        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0]);", pixels);
	    }

	    // Scrolls up by a specified number of pixels
	    public static void scrollUpByPixels(WebDriver driver, int pixels) {
	        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0]);", -pixels);
	    }
	    
	    
	    
	    public void Backspace()
	    {
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.BACK_SPACE).build().perform();
	    }
	    public void Enter()
	    {
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.ENTER).build().perform();
	    }
	    public void TAB()
	    {
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.TAB).build().perform();
	    }
	    public void SendkeyStorkes(String key)
	    {
	        Actions action = new Actions(driver);
	        action.sendKeys(key).build().perform();
	    }

	    public void MoveToElement(WebElement element)
	    {
	        Actions action = new Actions(driver);
	        action.moveToElement(element).build().perform();
	    }

	    public void MoveToElementAndClick( WebElement element )
	    {
	        Actions action = new Actions(driver);
	        action.moveToElement(element).click().build().perform();
	    }

	    public void DragandDrop(WebElement element1, WebElement element2)
	    {
	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(element1, element2).build().perform();
	    }
	    public void scrolltoleft()
	    {
	    	JavascriptExecutor	js = (JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(-200, 0);");
	    }

	    public void ScrollToRight()
	    {
	    	JavascriptExecutor	js = (JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(200, 0);");
	    }
	  


	
	
	
}
