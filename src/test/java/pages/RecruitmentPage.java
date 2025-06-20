package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage extends BaseObjects {

	public RecruitmentPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@type='button'][.=' Add ']")
	private WebElement add_vacancybtn;

	@FindBy(xpath = "//label[.='Vacancy Name']/following::input[1]")
	private WebElement vacancy_name_input;

	@FindBy(xpath = "//label[.='Job Title']/following::div[3]")
	private WebElement jobTitle_dd;

	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/div[.='softwareAutomationTester']")
	private WebElement jobTitle_dd_option;

	@FindBy(xpath = "//label[.='Description']/following::textarea")
	private WebElement description_area;

	@FindBy(xpath = "//label[.='Hiring Manager']/following::input[1]")
	private WebElement hiring_manager_input;

	@FindBy(xpath = "//label[.='Number of Positions']/following::input[1]")
	private WebElement numberOfPositions_input;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement vacancy_savebtn;

	@FindBy(xpath = "//ul/li[@class='oxd-main-menu-item-wrapper'][5]/a")
	private WebElement recruitment_menu;

	@FindBy(xpath = "//ul/li/a[.='Vacancies']")
	private WebElement vacancies_menu;

	@FindBy(xpath = "//label[.='Job Title']/following::div[3]")
	private WebElement jobTitle_dd_duplicate; // Kept this in case it's used in a different context

	@FindBy(xpath = "//div[@class='oxd-select-option']/span[.='softwareAutomationTester']")
	private WebElement jobTitle_dd_option_automation_tester;

	@FindBy(xpath = "//label[.='Vacancy']/following::div[3]")
	private WebElement vacancy_dd;

	@FindBy(xpath = "(//div[@class='oxd-select-option']/span)[.='AutomationTestEngineer']")
	private WebElement vacancy_dd_option;

	@FindBy(xpath = "//label[.='Hiring Manager']/following::div[3]")
	private WebElement hiringmanager_dd;

	@FindBy(xpath = "(//div[@class='oxd-select-option']/span)[1]")
	private WebElement hiringmanager_dd_option;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement recruitment_search_btn;

	@FindBy(xpath = "//div[@class='oxd-table-card']/div/div[2]/div")
	private WebElement table_vacancy_title;

	public void navigateToRecruitmentPage() {

		generalhelper.waitForElementToBeClickable(recruitment_menu, 10);
		inputhelper.getElementAndClick(recruitment_menu);
	}

	
	public void searchVacancy() {
		
		generalhelper.waitForElementToBeClickable(vacancies_menu, 10);
		inputhelper.getElementAndClick(vacancies_menu);
		
		generalhelper.waitForElementToBeClickable(jobTitle_dd_duplicate, 10);
		inputhelper.getElementAndClick(jobTitle_dd_duplicate);
		inputhelper.getElementAndClick(jobTitle_dd_option);

		inputhelper.getElementAndClick(vacancy_dd);
		inputhelper.getElementAndClick(vacancy_dd_option);
		
		inputhelper.getElementAndClick(recruitment_search_btn);
		
	}
	public void verifyTheCreatedVacancyInTheGrid() {

		browserHelper.goBack();
		generalhelper.waitForElementToBeClickable(jobTitle_dd_duplicate, 10);
		inputhelper.getElementAndClick(jobTitle_dd_duplicate);
		inputhelper.getElementAndClick(jobTitle_dd_option);

		/*
		 * inputhelper.getElementAndClick(vacancy_dd);
		 * inputhelper.getElementAndClick(vacancy_dd_option);
		 * 
		 * inputhelper.getElementAndClick(recruitment_search_btn);
		 * 
		 * assertHelper.assertText(table_vacancy_title, "AutomationTestEngineer");
		 */

	}

	public void AddNewVacancyInrecruitmentMenu() {

		generalhelper.waitForElementToBeClickable(vacancies_menu, 10);
		inputhelper.getElementAndClick(vacancies_menu);

		inputhelper.getElementAndClick(add_vacancybtn);
		inputhelper.getElementAndClick(vacancy_name_input);
		inputhelper.getElementAndEnterData(vacancy_name_input, "QA_123");

		inputhelper.getElementAndClick(jobTitle_dd);
		inputhelper.getElementAndClick(jobTitle_dd_option);
		inputhelper.getElementAndClick(description_area);
		inputhelper.getElementAndEnterData(description_area, "this is job vacancy area");
		
		inputhelper.getElementAndEnterData(hiring_manager_input, "a");
		generalhelper.hardWait(3000);
		hiring_manager_input.sendKeys(Keys.DOWN);
		hiring_manager_input.sendKeys(Keys.ENTER);

		inputhelper.getElementAndEnterData(numberOfPositions_input, "4");
		generalhelper.hardWait(3000);
		inputhelper.getElementAndClick(vacancy_savebtn);
	}

}
