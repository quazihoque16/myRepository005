@Customer
Feature: Customer Login Functionality

  Description:
  As a customer
  I want to login as a customer
  So that I can see customer home page

  Scenario: Verify Customer Login Functionality

    Given I am in landing page
    Then I click on Login menu
    And I click on Customer Login menu
    And I enter User Id
    And I enter User Password
    When I click on Login button
    Then Verify I am in Customer Home Page