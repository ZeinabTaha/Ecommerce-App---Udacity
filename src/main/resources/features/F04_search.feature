@test
Feature: F04_search | users could use search functionality

Scenario Outline: user could search for product using product name
  When user search with product name as "<productName>"
  Then user is redirected to search page
  And Search shows relevant results

  Examples:
    | productName |
    | book        |
    | laptop      |
    | nike        |

Scenario Outline: user could search for product using sku
  When user search with sku as "<sku>"
  And user Select the product
  Then product page contains the same sku

  Examples:
    | sku        |
    | SCI_FAITH  |
    | APPLE_CAM  |
    | SF_PRO_11  |