Feature: This is Homework2
  This is the description of feature file

  Background:
    Given open the website


  Scenario: S01: Filling The input Form
    Then Insert "Sara" and "Abdulaizi" and "23"
    And Select the "Saudi Arabia"
    Then Click on submit button
    Then Verfiy "Input Validation Response" Displayed
    And Close the browser


  Scenario: S02: Filling The input Form
    Then Insert "Reemo" and "Yousef" and "29"
    And Select the "Bahamas"
    Then Click on submit button
    Then Verfiy "Input Validation Response" Displayed
    And Close the browser

  Scenario: S03: Filling The input Form
    Then Insert "Alixander" and "AhamadAlii" and "34"
    And Select the "Egypt"
    Then Click on submit button
    Then Verfiy "Input Validation Response" Displayed
    And Close the browser



