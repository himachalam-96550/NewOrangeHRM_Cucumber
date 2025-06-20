package HelperClass;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import StandardUtils.DriverFactory;

public class GeneralHelper extends DriverFactory {

	
	
	
	 public void waitForWebElementPresent(WebElement element, int timeoutInSeconds) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	        wait.until(ExpectedConditions.visibilityOf(element)); // Waits until the element is visible
	 }
	 
	 
	 public void hardWait(int wait) {
		 try {
				Thread.sleep(wait);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 
	 //need to alter
		/*
		 * FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
		 * .withTimeout(Duration.ofSeconds(10)) // Max wait time
		 * .pollingEvery(Duration.ofSeconds(1)) // Check every second
		 * .ignoring(Exception.class);
		 * 
		 * WebElement element = fluentWait.until(new Function<WebDriver, WebElement>() {
		 * public WebElement apply(WebDriver driver) { return
		 * driver.findElement(By.id("element_id")); } });
		 */
	
	
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("return document.readyState").equals("complete");
		public void waitForElementToBeVisible(WebElement element, int timeout) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	        wait.until(ExpectedConditions.visibilityOf(element));
	    }

	    // Wait for Element to be Clickable
	    public void waitForElementToBeClickable(WebElement element, int timeout) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	    }

	    // Wait for Element to be Present in DOM
	    public void waitForElementToBePresent(By locator, int timeout) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	    }

	    public WebElement waitForElementWithFluentWait(final By locator) {
	        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	                .withTimeout(Duration.ofSeconds(30))           
	                .pollingEvery(Duration.ofSeconds(5))          
	                .ignoring(NoSuchElementException.class);       

	        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                WebElement el = driver.findElement(locator);
	                if (el.isDisplayed()) {
	                    return el;
	                }
	                return null;
	            }
	        });

	        return element;
	    }

	
}
