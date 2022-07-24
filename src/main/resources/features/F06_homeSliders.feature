@test
Feature: F06_homeSliders | HomePage sliders are clickable

  Scenario: user click on first slider and is redirected to its page
    When user click on first slider
    Then user is redirected to first slider page

  Scenario: user click on second slider and is redirected to its page
    When user click on second slider
    Then user is redirected to second slider page
