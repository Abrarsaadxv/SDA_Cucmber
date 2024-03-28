Feature:  Scenario Outline Example
  Scenario Outline:  Dynamic  url

    Given the user navigates to the "<page_url>" page
    Then  the user waites for 5 seconds
    And  the user verifies that the page contains "<keyword>"
    And the user close the page

    Examples:
    |page_url| keyword|
    |googleUrl| google|
    |amazoneUrl| amazon|
    |trendyolUrl| Trendyol|


