@wip
Feature: Check in your cart

  Background:
    Given The user is on the login page
    When The user enters "standard_user" and "secret_sauce" credentials
    When The user should be able to sort the product "Price (high to low)"
    And The user add the cheapest and the 2nd costliest products to basket
    When The user click to shopping cart button and see "YOUR CART" page

    Scenario:
      When The user click "checkout" button
