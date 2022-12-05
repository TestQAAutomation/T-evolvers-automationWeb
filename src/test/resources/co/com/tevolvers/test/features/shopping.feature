#Language: en
#Author: Brayant Gamboa Betancur
@RegressionTest
Feature: shopping with user in website

  Scenario: The user shopping in website
    Given the user selects the option in menu popular items
    When A user select items in the page for purchase
    Then user compare price of articles