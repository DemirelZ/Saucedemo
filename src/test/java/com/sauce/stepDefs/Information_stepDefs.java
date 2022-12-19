package com.sauce.stepDefs;

import com.sauce.pages.InformationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Information_stepDefs {

    InformationPage informationPage=new InformationPage();

    @When("The user should fill firstname: {string} , lastname: {string} and zipcode: {string}")
    public void the_user_should_fill_firstname_lastname_and_zipcode(String firstName, String lastName, String zipCode) {

        informationPage.inputYourInformations(firstName, lastName, zipCode);


    }

    @Then("The user see {string} page")
    public void the_user_see_page(String expectedTitle) {

        String actualTitle = informationPage.titleOfPages(expectedTitle);
        Assert.assertEquals(expectedTitle.toUpperCase(),actualTitle);
    }







//    @Then("The user see {string} page")
//    public void the_user_see_page(String expectedHeader) {
//        String actualHeader = informationPage.informationHeader.getText();
//        System.out.println("expectedHeader = " + expectedHeader);
//        System.out.println("actualHeader = " + actualHeader);
//        Assert.assertEquals(expectedHeader,actualHeader);
//    }
}
