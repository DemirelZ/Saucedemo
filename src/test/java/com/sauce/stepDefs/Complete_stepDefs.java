package com.sauce.stepDefs;

import com.sauce.pages.CompletePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Complete_stepDefs {

CompletePage completePage=new CompletePage();
    @Then("The user see the message about complete order")
    public void the_user_see_the_message_about_complete_order() {

        String actualMessage = completePage.thankYouForYourOrderMessage_loc.getText();
        String expectedMessage= "THANK YOU FOR YOUR ORDER";
        Assert.assertEquals(expectedMessage,actualMessage);


    }
}
