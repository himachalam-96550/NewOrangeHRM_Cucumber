package stepsDefinitions;

import StandardUtils.DriverFactory;
import StandardUtils.InitPageObjectClasses;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BaseObjects;
import testData.AdminReadTestData;
import testData.ReadTestData;


public class AdminSteps extends InitPageObjectClasses{

	AdminReadTestData.Root admindata = BaseObjects.readJsonFile("AdminTestData.json", AdminReadTestData.Root.class);
	
	@When("Navigaates to adim page and add a user in the application")
	public void navigaates_to_adim_page_and_add_a_user_in_the_application() throws InterruptedException {
	    
		adminpage().navigateToAdminMenu();
		//adminpage().AddUserInApplication(admindata.add_User_Data.userName,admindata.add_User_Data.password,admindata.add_User_Data.emp_Name);
	 
	}
	@Then("Verify the added user in the grid")
	public void verify_the_added_user_in_the_grid() throws InterruptedException {
	    
		adminpage().searchUserWithValidDetails("suman");
		adminpage().verifyTheSearchedUserInTheGrid("suman");
	}

	//Scenario 2 search user
	@When("Navigates to Admin page and search the user with {string}")
	public void navigates_to_admin_page_and_search_the_user_with(String userName) throws InterruptedException {
		  adminpage().navigateToAdminMenu();
		  adminpage().searchUserWithValidDetails(userName);
	}
	
	  
	@Then("Verify the searched user on below grid in the admin page")
	public void verify_the_searched_user_on_below_grid_in_the_admin_page() {
	   
		adminpage().verifyTheSearchedUserInTheGrid();
	}

   //Scenario 3 edit user
	
	@When("Edit the searched user and change the details in the admin page")
	public void edit_the_searched_user_and_change_the_details_in_the_admin_page() {
	    
		try {
			
			adminpage().edituserinTheAdminPage();
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Then("Verify the edited user on below grid in the admin page")
	public void verify_the_edited_user_on_below_grid_in_the_admin_page() {
	    
		
	}


	//Scenario 4
		@When("Delete the searched user in the admin page")
		public void delete_the_searched_user_in_the_admin_page() throws InterruptedException {
		    
			adminpage().deleteSearchedUser();
			
		}
		@Then("Verify the deleted user on below grid in the admin page")
		public void verify_the_deleted_user_on_below_grid_in_the_admin_page() {
		   
			
		}

		@When("Navigates to jobs and add job role in the Admin page")
		public void navigates_to_jobs_and_add_job_role_in_the_admin_page() throws InterruptedException {
		    
			adminpage().navigateToAdminMenu();
			
			adminpage().addNewJobInTheAdminPage("softwareAutomationTester","software Tester is write script to automate a software with help of tool","This is software Automation Tester");
			
		}
		@Then("Verify the created job role on below grid in the jobs menu")
		public void verify_the_created_job_role_on_below_grid_in_the_jobs_menu() {
		   
			
		} 

		 
		@When("Navigates to jobs and edit the job role created by the admin user")
		public void navigates_to_jobs_and_edit_the_job_role_created_by_the_admin_user() throws InterruptedException {
			adminpage().navigateToAdminMenu();
			adminpage().navigateToJobRoleMenu();
			adminpage().getRoleTitleAndClickEditButton("softwareAutomationTester");
		}
		
		@Then("Verify the edited job role on below grid in the jobs menu")
		public void verify_the_edited_job_role_on_below_grid_in_the_jobs_menu() {
		   
			adminpage().verifyTheEditedJobRoleInTheGrid("softwareAutomationTester");
		}
		
		//delete Scenario
		@When("Navigates to jobs and delete the job role created by the admin user")
		public void navigates_to_jobs_and_delete_the_job_role_created_by_the_admin_user() throws InterruptedException {
			adminpage().navigateToAdminMenu();
			adminpage().navigateToJobRoleMenu();
			adminpage().getRoleTitleAndClickDeleteButton("softwareAutomationTester");
			
		}
		@Then("Verify the edit job role on below grid in the jobs menu")
		public void verify_the_edit_job_role_on_below_grid_in_the_jobs_menu() {
		    
			
		}
		
		
		ReadTestData.Root loginData = BaseObjects.readJsonFile("LoginTestData.json", ReadTestData.Root.class);

		
		@Before("@addjobtitle")
		public void beforeAddJobTitle() throws InterruptedException {
			
			DriverFactory.launchBrowser();
			loginpage().login(loginData.login_Details.userName,loginData.login_Details.password);
			adminpage().navigateToAdminMenu();
			adminpage().addNewJobInTheAdminPage("softwareAutomationTester","software Tester is write script to automate a software with help of tool","This is software Automation Tester");
			loginpage().terarDown();
			
		}
		
		@After("@deletejobtitle")
		public void afterDeleteJobTitle() throws InterruptedException {
			
			DriverFactory.launchBrowser();
			loginpage().login(loginData.login_Details.userName,loginData.login_Details.password);
			adminpage().navigateToAdminMenu();
			//adminPage().addNewJobInTheAdminPage();
			adminpage().navigateToJobRoleMenu();
			adminpage().getRoleTitleAndClickDeleteButton("softwareAutomationTest");
			loginpage().terarDown();
			
		}
		

}
