package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import testData.ReadTestData;

public class LoginPage extends BaseObjects{

	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbtn;
	
	@FindBy(xpath = "//p[.='Invalid credentials']")
	private WebElement error_ele;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	

	public void login(String uname, String pwd) {

		inputhelper.getElementAndEnterData(userName,uname);
		inputhelper.getElementAndEnterData(password,pwd);
		inputhelper.getElementAndClick(loginbtn);
	}

	public void verifyTheUrlOfTheApplication(String acturl) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = browserHelper.getUrl();
		assertHelper.assertTwoString(url, acturl);
	}

    public void errorMessage(String error) {
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String text = error_ele.getText();
    	System.out.println("Error Message"+text);
    	assertHelper.assertTwoString(text,error);
    }
    
    public void terarDown() {

		driver.quit();
	}

}
