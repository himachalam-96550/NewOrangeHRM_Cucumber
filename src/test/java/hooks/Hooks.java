package hooks;
import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import pages.BaseObjects;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks extends BaseObjects{

	
	
	@After
    public void takeScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshotByte = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment(scenario.getName(), new ByteArrayInputStream(screenshotByte));
        }
       
        driver.quit();
	}
	
	
	/*
	 * @After public void tearDown() {
	 * 
	 * 
	 * driver.quit();
	 * 
	 * }
	 */
	 
	
	
	
	
	
	
	
}
