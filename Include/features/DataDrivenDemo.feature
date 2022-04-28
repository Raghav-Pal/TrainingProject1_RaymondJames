Feature: demo data driven using data source

  Scenario Outline: Run with data from excel file
    Given user needs to login
    When user adds username from <rowCount>
    And click on the login
    Then user is logged in

    Examples: 
      | rowCount |
      |        1 |
      |        2 |
      |        3 |