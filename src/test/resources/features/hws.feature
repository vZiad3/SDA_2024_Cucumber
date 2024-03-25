Feature: first task

  @samsung
  Scenario: TC01_samsungSearch
    Given user goes to goole page
    When user searches for "samsung"
    Then tests that the page titile contains the word "samsung"
    And closes the page

    @cucumber
    Scenario: TC02_cucumberSearch
      Given user goes to google page
      When user searches for "cucumber"
      Then tests that the page title contains the word cucumber
      And closes the page