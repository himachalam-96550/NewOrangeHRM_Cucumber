package stepsDefinitions;

import StandardUtils.InitPageObjectClasses;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMSteps extends InitPageObjectClasses {

	
	
	@When("Create a New PIM employee in the PIM page")
	public void create_a_new_pim_employee_in_the_pim_page() {
	    
		pimpage().navigateToPimMenu();
		
	}
	@Then("Verify the created employee in the below grid")
	public void verify_the_created_employee_in_the_below_grid() {
	   
		pimpage().addPimEmployee("suman", "mk","Hima@1122","Hima@1122","2000-13-03");
		pimpage().navigateToPimMenu();
		pimpage().verifyThePimEmployee();
	}
	
	//Scenario 2
		@When("Navigate to the pim module in the application")
		public void navigate_to_the_pim_module_in_the_application() {
			pimpage().navigateToPimMenu();
		}
		@When("Search a pim employee and edit a New PIM employee in the PIM page")
		public void search_a_pim_employee_and_edit_a_new_pim_employee_in_the_pim_page() {
		    
			pimpage().verifyThePimEmployee();
			pimpage().editPimEmployee();
			
		}
		@Then("Verify the edited employee in the below grid")
		public void verify_the_edited_employee_in_the_below_grid() {
			pimpage().navigateToPimMenu();
			pimpage().verifyThePimEmployee();
			
		}
		
		
		//Delete Scenario
		@When("Search a pim employee and delete a New PIM employee in the PIM page")
		public void search_a_pim_employee_and_delete_a_new_pim_employee_in_the_pim_page() {
		   
			pimpage().navigateToPimMenu();
			pimpage().verifyThePimEmployee();
			pimpage().deletePIMEmploye();
			
		}
		@Then("Verify the deleted employee in the below grid")
		public void verify_the_deleted_employee_in_the_below_grid() {
		    
			
		}
}
