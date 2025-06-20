Feature: recruitment page all scenarios

@addjobtitle @deletejobtitle @recruitment
Scenario: Verify the Add new vacancy in the recruitment page
    Given User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   User navigates to the recruitment page
    And   Create a new vacancy role in the recruitment page
    Then  Verify the newly created role in the recruitment page under vacancy section

@edit @recruitment
Scenario: Verify the Edit vacancy in the recruitment page
    Given User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   User navigates to the recruitment page
    And   Search and edit the created vacancy in the vacancy menu
    Then  Verify the edited vacancy in the vacancy page 