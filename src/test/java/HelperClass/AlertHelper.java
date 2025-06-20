package HelperClass;

import org.openqa.selenium.Alert;

import StandardUtils.DriverFactory;

public class AlertHelper extends DriverFactory {

	public void acceptAlert() {

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void dismissAlert() {

		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void sendkeysAndAcceptAlert(String text) {

		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
		alert.accept();
	}

}
