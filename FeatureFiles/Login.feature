Feature: Login Page feature for orange HRM Application 
  
  
Scenario: Verify the Login with valid credentials in the application
    Given  User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   User navigates to home page and verify the title of the application
    Then  Logged out the application and verify the login page title
    
Scenario: Verify the Login with invalid credentials in the application
    Given  User launch browser and enter application url
    When  User enters invalid username and invalid password and click login button
    And   User verified the error message in the login page of the application
    Then  Logged out the application and verify the login page title
    