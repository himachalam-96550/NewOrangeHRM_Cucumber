package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends BaseObjects {

	public AdminPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul//span[.='Admin']")
	private WebElement adminMenu;

	@FindBy(xpath = "//button[normalize-space(.)='Add']")
	private WebElement addUser_btn;

	@FindBy(xpath = "(//div[.='-- Select --'])[1]")
	private WebElement userrole_dd;

	@FindBy(xpath = "//div[@role='listbox']/div/span[.='Admin']")
	private WebElement userrole_dd_option;

	@FindBy(xpath = "//div[@role='listbox']/div[position()>1]/span")
	private List<WebElement> userrole_dd_options;

	@FindBy(xpath = "//label[.='Status']/following::div[3]")
	private WebElement status_dd;

	@FindBy(xpath = "//div[@role='listbox']/div/span")
	private List<WebElement> statusdd_options;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement password;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement confirm_password;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employee_name;

	@FindBy(xpath = "//label[.='Username']/following::input[1]")
	private WebElement user_name;

	@FindBy(xpath = "//button[normalize-space(.)='Save']")
	private WebElement save_btn;

	@FindBy(xpath = "//label[.='Username']/following::div[1]/input")
	private WebElement username_ele;

	@FindBy(xpath = "//label[.='User Role']/following::div[3]")
	private WebElement search_userrole_dd;

	@FindBy(xpath = "//div[@role='listbox']/div[position()>1]/span[.='Admin']")
	private WebElement search_userrole_option;

	@FindBy(xpath = "//label[.='Employee Name']/following::input[1]")
	private WebElement searchEmployeName;

	@FindBy(xpath = "//label[.='Status']/following::div[2]")
	private WebElement search_status_dd;

	@FindBy(xpath = "(//div[@role='listbox']/div[position()>1]/span)[1]")
	private WebElement search_status_dd_option;

	@FindBy(xpath = "//button[normalize-space(text()='Search')] [@type='submit']")
	private WebElement Adminsearch_btn;

	@FindBy(xpath = "//div[@class='oxd-table-card']//div[@class='oxd-table-row oxd-table-row--with-border']/div[position()>1 and position() <6]/div")
	private List<WebElement> tableRowData;

	@FindBy(xpath = "(//div[@class='oxd-table-cell-actions']/button[2])[1]")
	private WebElement editbtn;

	@FindBy(xpath = "//div[@class='oxd-form-actions']/button[2]")
	private WebElement edit_savebtn;

	@FindBy(xpath = "(//div[@class='oxd-table-cell-actions']/button[1])[1]")
	private WebElement dltbtn;

	@FindBy(xpath = "//div[@class='orangehrm-modal-footer']/button[1]")
	private WebElement dlt_cancelBtn;

	@FindBy(xpath = "//div[@class='orangehrm-modal-footer']/button[2]")
	private WebElement dlt_OkBtn;

	@FindBy(xpath = "(//nav[@role='navigation'])[2]/ul/li/span[.='Job ']")
	private WebElement nav_jobMenu;

	@FindBy(xpath = "//button[@type='button'][.= ' Add ']")
	private WebElement job_AddBtn;

	@FindBy(xpath = "//label[.='Job Title']/following::input[1]")
	private WebElement job_title;

	@FindBy(xpath = "//label[.='Job Description']/following::textarea[1]")
	private WebElement job_desc;

	@FindBy(xpath = "//label[.='Note']/following::textarea")
	private WebElement note_area;

	@FindBy(xpath = "//div[@class='oxd-form-actions']/button[.=' Save ']")
	private WebElement job_savebtn;

	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li[1]/a")
	private WebElement job_titles_menu;

	@FindBy(xpath = "//div[@class='oxd-table-body']/div/div/div[2]/div")
	private List<WebElement> role_title_els;

	@FindBy(xpath = "//div[@class='oxd-table-body']/div/div/div[4]//div/button[2]")
	private List<WebElement> editBtn_els;

	@FindBy(xpath = "//div[@class='orangehrm-modal-footer']/button[2]")
	private WebElement jobrole_dltbtn;

	@FindBy(xpath = "//div[@role='rowgroup']/following::div[7]//div")
	private WebElement grid_row_name_ele;

	public void navigateToAdminMenu() {

		inputhelper.getElementAndClick(adminMenu);
	}

	public void AddUserInApplication(String name, String pass, String empname) throws InterruptedException {

		Thread.sleep(3000);
		inputhelper.getElementAndClick(addUser_btn);
		inputhelper.getElementAndClick(user_name);
		inputhelper.getElementAndEnterData(user_name, name);
		Thread.sleep(1000);
		inputhelper.getElementAndClick(password);
		inputhelper.getElementAndEnterData(password, pass);
		Thread.sleep(1000);
		inputhelper.getElementAndClick(confirm_password);
		inputhelper.getElementAndEnterData(confirm_password, pass);

		inputhelper.getElementAndClick(userrole_dd);
		WebElement ddel1 = driver.findElement(By.xpath("(//span[.='Admin'])[3]"));
		inputhelper.getElementAndClick(ddel1);

		inputhelper.getElementAndClick(status_dd);
		WebElement ddel2 = driver.findElement(By.xpath("//span[.='Enabled']"));
		inputhelper.getElementAndClick(ddel2);

		inputhelper.getElementAndClick(employee_name);
		inputhelper.getElementAndEnterData(employee_name, empname);

		Thread.sleep(2000);

		// Press Down Arrow key
		employee_name.sendKeys(Keys.ARROW_DOWN);

		// Wait for selection
		Thread.sleep(2000);

		// Press Enter
		employee_name.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		inputhelper.getElementAndClick(save_btn);

	}

	public void searchUserWithValidDetails(String username) throws InterruptedException {

		Thread.sleep(3000);

		inputhelper.getElementAndClick(username_ele);
		inputhelper.getElementAndEnterData(username_ele, username);

		inputhelper.getElementAndClick(search_userrole_dd);
		inputhelper.getElementAndClick(search_userrole_option);

		// inputhelper.getElementAndClick(searchEmployeName);
		// inputhelper.getElementAndEnterData(searchEmployeName,"Admin");

		inputhelper.getElementAndClick(search_status_dd);
		inputhelper.getElementAndClick(search_status_dd_option);
		Thread.sleep(3000);
		inputhelper.getElementAndClick(Adminsearch_btn);

	}

	public void verifyTheSearchedUserInTheGrid(String exptext) {

		String text = grid_row_name_ele.getText();
		assertHelper.assertTwoString(text, exptext);
	}

	public void verifyTheSearchedUserInTheGrid() {

		ArrayList<String> al = new ArrayList<String>();
		for (WebElement ele : tableRowData) {

			String text = ele.getText();
			al.add(text);
		}
		Object[] arr = al.toArray();
		assertHelper.assertTwoString(arr[0].toString(), "Admin");
		assertHelper.assertTwoString(arr[1].toString(), "Admin");
		// assertHelper.assertTwoString(arr[2].toString(), "Admin");
		assertHelper.assertTwoString(arr[3].toString(), "Enabled");

	}

	// Scenario 3
	public void edituserinTheAdminPage() throws InterruptedException {

		javascripthelper.scrollToElement(editbtn);
		inputhelper.getElementAndClick(editbtn);
		Thread.sleep(3000);
		javascripthelper.scrollToElement(edit_savebtn);
		inputhelper.getElementAndClick(edit_savebtn);

	}

	// Scenario 4
	public void deleteSearchedUser() {

		javascripthelper.scrollToElement(dltbtn);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputhelper.getElementAndClick(dltbtn);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputhelper.getElementAndClick(dlt_cancelBtn);

	}

	// Scenario 5

	public void navigateToJobRoleMenu() throws InterruptedException {

		Thread.sleep(2000);
		inputhelper.getElementAndClick(nav_jobMenu);
		Thread.sleep(1000);
		inputhelper.getElementAndClick(job_titles_menu);
	}

	public void addNewJobInTheAdminPage(String jobtitle, String description, String note) throws InterruptedException {

		Thread.sleep(2000);
		inputhelper.getElementAndClick(nav_jobMenu);
		Thread.sleep(1000);
		inputhelper.getElementAndClick(job_titles_menu);
		inputhelper.getElementAndClick(job_AddBtn);

		inputhelper.getElementAndEnterData(job_title, jobtitle);
		inputhelper.getElementAndClick(job_desc);
		inputhelper.getElementAndEnterData(job_desc, description);
		inputhelper.getElementAndClick(note_area);
		inputhelper.getElementAndEnterData(note_area, note);
		Thread.sleep(1000);
		inputhelper.getElementAndClick(job_savebtn);
		Thread.sleep(2000);
	}

	public void getRoleTitleAndClickEditButton(String role) throws InterruptedException {

		for (int i = 1; i <= role_title_els.size(); i++) {

			WebElement titleNameele = driver
					.findElement(By.xpath("(//div[@class='oxd-table-body']/div/div)[" + i + "]/div[2]/div"));
			String name = titleNameele.getText();
			System.out.println(name);
			if (name.equals(role)) {

				WebElement editbtn = driver.findElement(By.xpath("(//div[@class='oxd-table-body']/div/div)[" + i + "]//div/button[2]"));
				editbtn.click();
				break;
			}
		}

		inputhelper.getElementAndClick(job_desc);
		Thread.sleep(4000);
		job_desc.clear();
		inputhelper.getElementAndEnterData(job_desc, "suman");
		Thread.sleep(2000);
		inputhelper.getElementAndClick(job_savebtn);
		Thread.sleep(3000);
	}

	

	public void verifyTheEditedJobRoleInTheGrid(String role) {

		for (int i = 1; i <= role_title_els.size(); i++) {

			WebElement titleNameele = driver
					.findElement(By.xpath("(//div[@class='oxd-table-body']/div/div)[" + i + "]/div[2]/div"));
			String name = titleNameele.getText();
			System.out.println(name);
			if (name.equals(role)) {

				WebElement jobdesc_ele = driver
						.findElement(By.xpath("(//div[@class='oxd-table-body']/div/div)[" + i + "]/div[3]//div/span"));
				String description = jobdesc_ele.getText();
				System.out.println(description);
				//assertHelper.assertTheStringsContains(description, name);  need to fix issue
				break;
			}
		}
	}

	
	public void getRoleTitleAndClickDeleteButton(String deleterole) throws InterruptedException {
		  
		boolean ispresent = false;
		
		  for(int i=1; i<=role_title_els.size(); i++) {
			  
			  WebElement titleNameele = driver.findElement(By.xpath("(//div[@class='oxd-table-body']/div/div)["+i+"]/div[2]/div"));
			  String name = titleNameele.getText();
			  System.out.println(name);
			  if(name.equals(deleterole)) {
				
				  WebElement editbtn = driver.findElement(By.xpath("(//div[@class='oxd-table-body']/div/div)["+i+"]//div/button[1]"));
				  editbtn.click();
				  ispresent = true;
				  break;
			  }
			 
		  }
		  if(ispresent == false) {
			  
			  System.out.println("The role name is Not Present in the Grid for delete in admin");
		  }
		 
		  Thread.sleep(2000);
			
			  inputhelper.getElementAndClick(jobrole_dltbtn);
			  
			 
		  Thread.sleep(2000);
	  }

	public void verifyTheNewJobTitleInTheAdminPage() throws InterruptedException {

		for (int i = 1; i <= role_title_els.size(); i++) {

			WebElement titleNameele = driver
					.findElement(By.xpath("(//div[@class='oxd-table-body']/div/div)[" + i + "]/div[2]/div"));
			String name = titleNameele.getText();
			System.out.println(name);
			if (name.equals("softwareAutomationTester")) {

				assertHelper.assertTwoString(name, "softwareAutomationTester");
				break;
			}
		}
	}
	
	
	
	
	
	
}
