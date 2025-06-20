package stepsDefinitions;

import StandardUtils.DriverFactory;
import StandardUtils.InitPageObjectClasses;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BaseObjects;
import testData.ReadTestData;

public class RecruitmentSteps  extends InitPageObjectClasses {

	
	@When("User navigates to the recruitment page")
	public void user_navigates_to_the_recruitment_page() {
	    
		recruitmentpage().navigateToRecruitmentPage();
		
	}
	@When("Create a new vacancy role in the recruitment page")
	public void create_a_new_vacancy_role_in_the_recruitment_page() {
	   
		recruitmentpage().AddNewVacancyInrecruitmentMenu();
		
	}
	@Then("Verify the newly created role in the recruitment page under vacancy section")
	public void verify_the_newly_created_role_in_the_recruitment_page_under_vacancy_section() {
	   
		recruitmentpage().verifyTheCreatedVacancyInTheGrid();
		
	}
	
	//Edit Scenario
	@When("Search and edit the created vacancy in the vacancy menu")
	public void search_and_edit_the_created_vacancy_in_the_vacancy_menu() {
	   // recruitmentpage().searchVacancy();
		
	}
	@Then("Verify the edited vacancy in the vacancy page")
	public void verify_the_edited_vacancy_in_the_vacancy_page() {
	   
		
	}
	
	
	ReadTestData.Root loginData = BaseObjects.readJsonFile("LoginTestData.json", ReadTestData.Root.class);

	
	@Before("@addjobtitle")
	public void beforeAddJobTitle() throws InterruptedException {
		
		DriverFactory.launchBrowser();
		loginpage().login(loginData.login_Details.userName,loginData.login_Details.password);
		adminpage().navigateToAdminMenu();
		adminpage().addNewJobInTheAdminPage("softwareAutomationTester123","software Tester is write script to automate a software with help of tool","This is software Automation Tester");
		loginpage().terarDown();
		
	}
	
	@After("@deletejobtitle")
	public void afterDeleteJobTitle() throws InterruptedException {
		
		DriverFactory.launchBrowser();
		loginpage().login(loginData.login_Details.userName,loginData.login_Details.password);
		adminpage().navigateToAdminMenu();
		//adminPage().addNewJobInTheAdminPage();
		adminpage().navigateToJobRoleMenu();
		adminpage().getRoleTitleAndClickDeleteButton("softwareAutomationTest123");
		loginpage().terarDown();
		
	}
	
}
