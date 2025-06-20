package StandardUtils;


import pages.AdminPage;
import pages.LoginPage;
import pages.PIMPage;
import pages.RecruitmentPage;


public class InitPageObjectClasses {

	
	  public LoginPage loginpage() {
	  
	  return new LoginPage();
	  
	  }
	 
	  public AdminPage adminpage() {
		  
		  return new AdminPage();
	  }
	
	  public PIMPage pimpage() {
		  
		  return new PIMPage();
	  }

	  public RecruitmentPage recruitmentpage() {
		  
		  return new RecruitmentPage();
	  }
}
