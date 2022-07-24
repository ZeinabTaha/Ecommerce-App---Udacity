@test
Feature: F08_WishList | users could add product to wishList

  Scenario: user click on wishList
    When user click on wishList button
    Then Success message appears
    And Success message is green

  Scenario: user opens wishlist tab
    When user click on wishList button for same product
    And wait success message to disappear
    Then user click on WishList tab
    And Qty value is bigger than 0