Feature: Test login functionality

  @smoke
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to homepage

		@valid
    Examples: 
      | username | password |
      | test     | test     |

		@invalid
    Examples: 
      | username | password |
      | abc      |      123 |
