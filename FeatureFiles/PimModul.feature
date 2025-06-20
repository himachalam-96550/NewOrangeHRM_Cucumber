Feature:  PIM Modul scenarios in te OrangeHrm New

@addpim  @pim
Scenario: Create a PIM employee in the PIM menu
   Given User launch browser and enter application url
    When User enters valid user name and valid password and click login button
    And  Create a New PIM employee in the PIM page
    Then Verify the created employee in the below grid
    
@editpim  @pim  
Scenario: Edit a PIM employee in the PIM menu
   Given User launch browser and enter application url
    When User enters valid user name and valid password and click login button
    And  Navigate to the pim module in the application
    And  Search a pim employee and edit a New PIM employee in the PIM page
    Then Verify the edited employee in the below grid
    
@deletepim  @pim  
Scenario: Delete a PIM employee in the PIM menu
   Given User launch browser and enter application url
    When User enters valid user name and valid password and click login button
    And  Navigate to the pim module in the application
    And  Search a pim employee and delete a New PIM employee in the PIM page
    Then Verify the deleted employee in the below grid
    

       