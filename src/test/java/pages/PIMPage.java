package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage extends BaseObjects {

	public PIMPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[2]/a")
	private WebElement pim_menu;

	@FindBy(xpath = "//div[@class='orangehrm-header-container']/button[normalize-space(text()='Add')]")
	private WebElement addEmp_btn;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement emp_firstname;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement emp_lastname;

	@FindBy(xpath = "//div[@class='employee-image-wrapper']/following::button[1]")
	private WebElement profilePic_btn;

	@FindBy(xpath = "//div[@class='oxd-form-actions']/button[text()=' Save ']")
	private WebElement first_saveBtn;

	@FindBy(xpath = "//div[@class='oxd-switch-wrapper']//span")
	private WebElement logindetails_togglebtn;

	@FindBy(xpath = "//label[.='Username']/following::input[1]")
	private WebElement userName_ele;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement password_ele;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement confirmPassword;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement secondSave_btn;

	@FindBy(xpath = "//label[.='Nationality']/following::div[4]")
	private WebElement nationality_dd;

	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/div[position()>1]/span")
	private WebElement nationality_dd_option;

	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/div[position()>1]/span[.='Indian']")
	private WebElement Indian_nationality_option;

	@FindBy(xpath = "//label[.='Marital Status']/following::div[3]")
	private WebElement maritalStatus_dd;

	@FindBy(xpath = "//div[@role='listbox']/div[position()>1]/span")
	private WebElement maritalStatus_dd_option;

	@FindBy(xpath = "//div[@role='listbox']/div[position()>1]/span[.='Married']")
	private WebElement married_status_option;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement thirdSave_Btn;

	@FindBy(xpath = "//label[.='Date of Birth']/following::input[1]")
	private WebElement dob_ele;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement pim_searchbtn;

	@FindBy(xpath = "//div[@class='oxd-table-card']/div/div[9]/div/button[1]")
	private WebElement pim_editbtn;

	@FindBy(xpath = "//div[@class='oxd-table-card']/div/div[9]/div/button[2]")
	private WebElement pim_deletebtn;

	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private WebElement searchemp_name;

	@FindBy(xpath = "//label[.='Male']/input[@type='radio']")
	private WebElement male_checkbox;

	@FindBy(xpath = "//label[.='Blood Type']/following::div[3]")
	private WebElement bloodgrp_dd;

	@FindBy(xpath = "//div[@class = 'oxd-select-option'][4]/span")
	private WebElement bloodgrp_dd_option;

	@FindBy(xpath = "//div[@class='orangehrm-modal-footer']/button[2]")
	private WebElement confirmdelete_btn;

	@FindBy(xpath = "//label[.='Blood Type']/following::button[@type='submit']")
	private WebElement editSave_btn;

	public void navigateToPimMenu() {

		inputhelper.getElementAndClick(pim_menu);
	}

	public void addPimEmployee(String firstname, String lastname, String pwd, String confirmPwd, String dob) {

		generalhelper.waitForWebElementPresent(addEmp_btn, 10);
		inputhelper.getElementAndClick(addEmp_btn);

		generalhelper.waitForWebElementPresent(emp_firstname, 10);

		inputhelper.getElementAndClick(emp_firstname);
		inputhelper.getElementAndEnterData(emp_firstname, firstname);

		inputhelper.getElementAndClick(emp_lastname);
		inputhelper.getElementAndEnterData(emp_lastname, lastname);

		inputhelper.getElementAndClick(logindetails_togglebtn);

		generalhelper.waitForWebElementPresent(userName_ele, 10);

		inputhelper.getElementAndClick(userName_ele);
		inputhelper.getElementAndEnterData(userName_ele, firstname);

		inputhelper.getElementAndClick(password_ele);
		inputhelper.getElementAndEnterData(password_ele, pwd);

		inputhelper.getElementAndClick(confirmPassword);
		inputhelper.getElementAndEnterData(confirmPassword, confirmPwd);

		inputhelper.getElementAndClick(first_saveBtn);

		generalhelper.waitForWebElementPresent(nationality_dd, 10);
		inputhelper.getElementAndClick(nationality_dd);
		inputhelper.getElementAndClick(Indian_nationality_option);

		generalhelper.waitForWebElementPresent(maritalStatus_dd, 10);
		inputhelper.getElementAndClick(maritalStatus_dd);
		inputhelper.getElementAndClick(married_status_option);

		generalhelper.waitForWebElementPresent(dob_ele, 10);
		inputhelper.getElementAndEnterData(dob_ele, dob);
		// inputhelper.getElementAndClick(male_checkbox);
		inputhelper.getElementAndClick(secondSave_btn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputhelper.getElementAndClick(thirdSave_Btn);
	}

	public void verifyThePimEmployee() {

		generalhelper.waitForWebElementPresent(searchemp_name, 10);

		inputhelper.getElementAndEnterData(searchemp_name, "suman");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputhelper.getElementAndClick(pim_searchbtn);
	}
	
	public void editPimEmployee() {

		inputhelper.getElementAndClick(pim_editbtn);
		generalhelper.waitForWebElementPresent(bloodgrp_dd, 10);
		inputhelper.getElementAndClick(bloodgrp_dd);

		inputhelper.getElementAndClick(bloodgrp_dd_option);

		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputhelper.getElementAndClick(editSave_btn);
		//inputhelper.getElementAndClick(thirdSave_Btn);
	}
	
	public void deletePIMEmploye() {

		inputhelper.getElementAndClick(pim_deletebtn);

		inputhelper.getElementAndClick(confirmdelete_btn);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
