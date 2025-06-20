package pages;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.fasterxml.jackson.databind.ObjectMapper;

import HelperClass.AlertHelper;
import HelperClass.AssertHelper;
import HelperClass.BrowserHelper;
import HelperClass.ButtonHelper;
import HelperClass.DropDownHelper;
import HelperClass.GeneralHelper;
import  HelperClass.InputHelper;
import HelperClass.JavaScriptHelper;
import StandardUtils.DriverFactory;
import io.qameta.allure.Allure;
import testData.ReadTestData;

public class BaseObjects extends DriverFactory{

	
	
	 //public WebDriver  driver;
	 public static AlertHelper alertHelper = new AlertHelper();
	 public static AssertHelper assertHelper = new AssertHelper();
    public static ButtonHelper butonhelper = new ButtonHelper();
	 public static DropDownHelper dropdownhelper = new DropDownHelper();
	 public static GeneralHelper generalhelper = new GeneralHelper();
	 public static InputHelper inputhelper = new InputHelper();
	 public static JavaScriptHelper javascripthelper = new JavaScriptHelper();
	 public static DriverFactory  DriverFactory = new DriverFactory();
	 public static BrowserHelper  browserHelper = new BrowserHelper();
	 
	 
	 
		
	 
	    // Generic method to read any JSON file and map it to a given POJO class
	    public static <T> T readJsonFile(String fileName, Class<T> clazz) {
	        ObjectMapper objectMapper = new ObjectMapper();
	        T testData = null;

	        try {
	            File file = new File(BaseObjects.class.getClassLoader().getResource(fileName).getFile());
	            testData = objectMapper.readValue(file, clazz);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return testData;
	    }
	 
	 
	 
	 
	 public void screenShot(String screenshotName) {
		 
		 byte [] screenshotByte = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	     Allure.addAttachment(screenshotName, new ByteArrayInputStream(screenshotByte));
	 }
	 
}
