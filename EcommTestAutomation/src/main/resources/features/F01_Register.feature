@smoke
  Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with new valid data successfully
    Given user go to register page
    When user enters new valid registration data
    And user click register button
    Then register is successful


