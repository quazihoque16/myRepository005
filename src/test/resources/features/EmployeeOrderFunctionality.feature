
@Employee
Feature: Employee Order Functionality

  Description:

  As an employee
  I want to login as an employee to order a product.
  So that I can see my product order status

  Scenario: Verify Employee Order Functionality
    Given I am in landing page
    Then  I click on Login menu
    And I enter Employee User Id
    And I enter Employee User Password
    When I click on Employee Login button
    And I click on employee menu product order
    And I chosen my product
    And I put order date
    And  I click on btn product order
    Then  I Verify product order confirm
    Then I confirmed product order




