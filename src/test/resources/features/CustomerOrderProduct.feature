@Customer

Feature: Customer Order Product Confirmation

  Description:
  As a customer
  I want to login as a customer
  So that I can see my product order status

  Scenario: Verify Customer Order Product Confirmation
    Given I am in landing page
    Then I click on Login menu
    And I click on Customer Login menu
    And I enter User Id
    And I enter User Password
    When  I click on Login button
    And I click on menu Product Order
    And I select Product Name
    And I enter Order Date
    And  I click on button Order Product
    Then  Verify Order List



