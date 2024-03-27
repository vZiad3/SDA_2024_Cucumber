Feature: Data tables feature
  Scenario: The name of second scenario
    When I search for String on google
      | amazon |  |
    Then I should see String on the results
      | amazon |
    Then I close the browser