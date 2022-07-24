@test
Feature: F05_hoverCategories | users could use Hover categories functionality
  Scenario: user hover on random category and select subCategory
    Given user hover on random category
    When user select random subCategory
    Then subCategory page is opened
