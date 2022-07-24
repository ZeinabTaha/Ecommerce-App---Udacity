@test
Feature: F02_Login | users could use login functionality to use their accounts

  #Test Scenario 1
  Scenario: user could login with valid email and password
  Given user go to login page
  When user login with "valid" "test@example.com"
  And user login with "valid" "P@ssw0rd"
  And user press on login button
  Then user login to the system successfully

  #Test Scenario 2
 Scenario: user could login with invalid email and password
  Given user go to login page again
  When user login with "invalid" "invalidtest@example.com"
  And user login with "invalid" "P@ssw0rd"
  And user click on login button
  Then user could not login to the system