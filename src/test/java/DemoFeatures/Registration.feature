@register
Feature: DemoBlaze Registration Functionality

  Scenario: To validate the sucessful Navigation to Demo_blaze Signup page
    Given r-User enters DemoBlaze url
    Then r-User should be able to navigate to url successfully

  Scenario Outline: Test Registration Functionality
    Given r-User is on Registration Page
    When r-User enters <username> and <password>
    And r-User clicks on Signup Button
    Then r-User should be able to Register successfully
    Examples:
      |username|password|
      |test|test123|
      |abc|abc123|


