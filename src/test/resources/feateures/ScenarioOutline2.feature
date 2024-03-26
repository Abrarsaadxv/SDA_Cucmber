Feature: scanario outline feature
#
#  Scenario Outline:
#    Given  I open the browser
#    And I am on the google homepage
#    When  I search for "<String>" on google
#    Then  I should see "<String>" on the result
#    Then  I close the browser
#    Examples:
#    | searchInput |
#    | Linkedin    |
#    | profile    |

  Scenario Outline: Search for Keywords on Amazon
    Given the user navigates to the Amazon homepage
    When the user searches for "‹ value >"
    Then the user verifies that the search results contain "‹value>"
    * User closes the page
    Examples:
    |  value|
    |mac    |
    |windwos|
    |Liux  |




