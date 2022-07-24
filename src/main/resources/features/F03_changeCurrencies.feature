@test
Feature: F03_changeCurrencies | users could use change currency functionality

  Scenario: user could change currency to Euro
  When user select Euro currency
  Then Euro Symbol is shown on the 4 products displayed in Home page