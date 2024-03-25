Feature: first task

  @samsung
  Scenario: TC01_samsungSearch
    Given user goes to goole page
    When user searches for "samsung"
    Then tests that the page titile contains the word "samsung"
    And closes the page