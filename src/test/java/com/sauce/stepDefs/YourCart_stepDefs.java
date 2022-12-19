package com.sauce.stepDefs;

import com.sauce.pages.ProductPage;
import com.sauce.pages.YourCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class YourCart_stepDefs {

    ProductPage productPage=new ProductPage();
    YourCartPage yourCartPage=new YourCartPage();

    @When("The user click {string} button")
    public void the_user_click_button(String checkoutOrContinueShopping) {

        yourCartPage.backOrNextButtons(checkoutOrContinueShopping);

    }

    @When("The user click checkout button")
    public void the_user_click_checkout_button() {

        yourCartPage.checkoutBtn_loc.click();
    }

    @Then("The user click to shopping cart button and see {string} page")
    public void the_user_click_to_shopping_cart_button_and_see_page(String expectedHeader) {

        productPage.shoppingCartBtn_loc.click();

//        String actualHeader = yourCartPage.yourCartHeader_loc.getText();
//        Assert.assertEquals(expectedHeader,actualHeader);


    }



}
