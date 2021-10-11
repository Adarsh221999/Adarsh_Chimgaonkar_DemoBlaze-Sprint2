@search
Feature: DemoBlaze Search Functionality

  Scenario: To validate that user can filter products by PHONE category
    Given  User is on homepage
    When User clicks on Phone category
    Then  User should be able to successfully filter products by PHONE category.

  Scenario: To validate that user can filter products by LAPTOP category
    Given  User is on homepage
    When User clicks on LAPTOP category
    Then  User should be able to successfully filter products by LAPTOP category.


  Scenario: To validate that user can filter products by MONITORS category
    Given  User is on homepage
    When User clicks on MONITOR category
    Then  User should be able to successfully filter products by MONITORS category.

  Scenario: To validate that add to cart button is functional.
    Given  User is on homepage
    When User clicks on a product
    And User clicks on add to cart button
    And  User clicks on cart button
    Then  User should be able to successfully see the product in their cart.
