@test
Feature: F01_Register | users could register with new accounts

  #Test Scenario 1
  Scenario: guest user could register with valid data successfully
    #Preconditions
    Given user go to register page
    #Actions
    When user select gender type
    And user enter first name "automation"
    And user enter last name "tester"
    And user enter date of birth
    And user enter email "test@example.com" field
    And user fills Password fields "P@ssw0rd" "P@ssw0rd"
    And user clicks on register button
    #Expected results
    Then success message is displayed