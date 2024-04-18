Feature: gahwni

  Scenario: going to my page in gahwani
    Given i open the browser121
    When i click on the login button
    Then i should see the login page
    And i entered valid credentials
    Then i am on my account page
    Then i close the browser