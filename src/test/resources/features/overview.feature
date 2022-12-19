@wip
Feature: Checkkout Overview

  Background:
    Given The user is on the login page
    When The user enters "standard_user" and "secret_sauce" credentials
    When The user should be able to sort the product "Price (high to low)"
    And The user add the cheapest and the 2nd costliest products to basket
    When The user click to shopping cart button and see "YOUR CART" page
    And The user click "checkout" button
    When The user should fill firstname: "zafer" , lastname: "demir" and zipcode: "06530"
    And The user click "continue" button

  Scenario:
    When The user click "finish" button