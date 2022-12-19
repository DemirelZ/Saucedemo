package com.sauce.stepDefs;

import com.sauce.pages.LoginPages;
import com.sauce.pages.ProductPage;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_stepDefs {

    LoginPages loginPages = new LoginPages();
    ProductPage productPage=new ProductPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("The user enters {string} and {string} credentials")
    public void the_user_enters_and_credentials(String userName, String password) {

        loginPages.login_mtd(userName, password);

    }

    @Then("The user should be able to login and see {string} page")
    public void the_user_should_be_able_to_login_and_see_page(String expectedHeader) {



        String actualHeader = productPage.productHeader_loc.getText();
        Assert.assertEquals("verify that header is desplayed",expectedHeader,actualHeader);

    }
}
