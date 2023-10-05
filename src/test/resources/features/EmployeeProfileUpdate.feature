@Employee
Feature: Employee Profile Update Functionality
  Description:
  As an employee
  I want to login as an employee to update my profile
  So that I can see my updated profile

  Scenario: Verify Employee Profile Update Functionality
    Given I am in landing page
    Then  I click on Login menu
    And I enter Employee User Id
    And I enter Employee User Password
    When I click on Employee Login button
    And  I click on menu My Profile
    And I click on button Update
    And  I clear the existing address
    And I enter new address
    When I click on btn Submit
    Then  Verify updated profile page