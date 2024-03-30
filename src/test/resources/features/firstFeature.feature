Feature: Name of the feature file

  This is the description that i am adding to the feature file


    @mytage
  Scenario: The name of second scenario
    Given I open the browser
    And I am on the google homepage
    When I search for "emir" on google
    Then I should see "emir" on the results
    Then I close the browser

@DynamicTask
  Scenario: The name of first Scenario
    Given i open the browser
    Then i am on the google homepagea
    When i search for "ziad" on google
    Then I should see "ziad on the page " on the result

                  #Assert


#
#  BBackground is like @ Before like
#  Background: The name of  background
#    Given I open the browser
#    And I am on the google homepage



