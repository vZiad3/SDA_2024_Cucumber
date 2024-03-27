Feature: Search for Desired Words on Amazon


  Scenario Outline: Search for Keywords on Ebay
    * i open the browser
    Given the user navigates to the Ebay homepage
    When the user searches for "<value>"
    Then the user verifies that the search results contain "<value>"
    * I close the browser
    Examples:
      | value   | name     |
      | mac     | Suleyman |
      | windows | emir     |
      | linux   | ziad     |