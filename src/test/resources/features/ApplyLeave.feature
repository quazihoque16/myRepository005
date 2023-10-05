Feature: Apply Leave Form Functionality

  Description
  As an employee
  I want to login as an employee
  So that I can apply for leave

  Scenario: Verify Apply Leave Form Functionality

    Given I am in landing page
    Then I click on Login menu
    And I enter Employee User Id
    And I enter Employee User Password
    When  I click on Login button
    And I click on Apply Leave menu
    And I enter Reason for leave
    And I enter Start Date for leave
    And I enter End Date for leave
    When I click on Submit button
    Then Verify I my Leave Satus



