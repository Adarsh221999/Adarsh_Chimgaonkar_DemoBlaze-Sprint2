@login
Feature: DemoBlaze Login Functionality

  Scenario: To validate the successfully Navigation to Demo_blaze Login page
    Given l-User enters DemoBlaze url
    Then l-User should be able to navigate to url successfully

  Scenario Outline: Test Login Functionality
    Given l-User is on Login Page
    When l-User enters <username> and <password>
    And l-User clicks on Login Button
    Then l-User should be able to Login successfully <username>
    Examples:
      |username|password|
      |test|test|
      |admin|admin|

  Scenario Outline: Test Login Functionality with invalid data.
    Given l-User is on Login Page
    When l-User enters <username> and <password>
    And l-User clicks on Login Button
    Then l-User should be not able to Login successfully
    Examples:
      |username|password|
      |test|test12|
      |admin|admin12|