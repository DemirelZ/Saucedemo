@wip5
Feature: Purchase E2E test

  Background:
    Given The user is on the login page
    When The user enters "standard_user" and "secret_sauce" credentials

    Scenario: Sauce Purchase
      When The user should be able to sort the product "Price (high to low)"
      #And The user add the cheapest and the 2nd costliest products to basket
      And The user should be able to select the products by using index "2"
      And The user should be able to select the products by using index "5"
      And The user should be able to select the products by using index "cheapest"
     # Then The user click to shopping cart button and see "YOUR CART" page
      Then The user click to shopping cart button
      When The user click "checkout" button
      When The user should fill firstname: "zafer" , lastname: "demir" and zipcode: "06530"
      And The user click "continue" button
      When The user click "finish" button
      Then The user see the message about complete order