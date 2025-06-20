Feature: This is Admin module feature scenarios


Scenario: Verify the Add user scenario in the admin page
    Given  User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   Navigaates to adim page and add a user in the application
    Then  Verify the added user in the grid
 
@searchuser    
Scenario: Verify the search user with valid details in the admin page
    Given User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   Navigates to Admin page and search the user with "Admin"
    Then  Verify the searched user on below grid in the admin page
    
    
@edituser
Scenario: Verify the search and edit the user in the admin page
    Given User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   Navigates to Admin page and search the user with "Admin"
    And   Edit the searched user and change the details in the admin page
    Then  Verify the edited user on below grid in the admin page
    
@deleteuser    
Scenario: Verify the search and delete the user in the admin page
    Given User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   Navigates to Admin page and search the user with "parthi"   
    And   Delete the searched user in the admin page
    Then  Verify the deleted user on below grid in the admin page
    
    
@jobrole
Scenario: Verify the create a new job role in the admin page
    Given User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   Navigates to jobs and add job role in the Admin page
    Then  Verify the created job role on below grid in the jobs menu
    
@editjobrole @jobrole
Scenario: Verify the edit job role in the admin page
    Given User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   Navigates to jobs and edit the job role created by the admin user
    Then  Verify the edited job role on below grid in the jobs menu
    
@deletejobroll   @jobrole
Scenario: Verify the delete job role in the admin page
    Given User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   Navigates to jobs and delete the job role created by the admin user
    Then  Verify the edit job role on below grid in the jobs menu
    
        