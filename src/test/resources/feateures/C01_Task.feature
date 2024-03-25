Feature: Name of the feature file
  This is the description of feature file

  Background:  The name of background
    Given I open the browser
    And I am on the google homepage

  @mytag
  Scenario: The name of scenario1
    When I search for Samsung on google
    Then I should see Samsung on the result
    Then I close the browser


  Scenario: The name of scenario2
    When I search for "Cucamber" on google
    Then I should see "Cucamber" on the result
    Then I close the browser
