package com.sauce.stepDefs;

import com.sauce.pages.ProductPage;
import com.sauce.pages.YourCartPage;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Purchase_stepDefs {


    ProductPage productPage=new ProductPage();
    YourCartPage yourCartPage=new YourCartPage();
    @When("The user should be able to sort the product {string}")
    public void the_user_should_be_able_to_sort_the_product(String typeOfSort) {

        productPage.sortTheProducts(typeOfSort);



    }

    @When("The user add the cheapest and the 2nd costliest products to basket")
    public void the_user_add_the_cheapest_and_the_2nd_costliest_products_to_basket() {

        int indexForCheapest = productPage.listOfPrice_mtd().size() - 1;
        String cheapestPrice = productPage.listOfPrice_mtd().get(indexForCheapest);
        String secondPriceOfCostliest = productPage.listOfPrice_mtd().get(1);

        WebElement locateOfcheapestPrice = Driver.get().findElement(By.xpath("//div[.='" + cheapestPrice + "']/..//button"));
        locateOfcheapestPrice.click();

        WebElement locateOfSecondPriceOfCostliest = Driver.get().findElement(By.xpath("//div[.='" + secondPriceOfCostliest + "']/..//button"));
        locateOfSecondPriceOfCostliest.click();





    }


    @And("The user should be able to select the products by using index {string}")
    public void theUserShouldBeAbleToSelectTheProductsByUsingIndex(String indexNumber) {

        if(indexNumber.equals("cheapest")){

            productPage.clickToProduct(productPage.addToCartButtonOfProducts.size()-1);

        }else {
            productPage.clickToProduct(Integer.parseInt(indexNumber)-1);

        }


    }

    @Then("The user click to shopping cart button")
    public void theUserClickToShoppingCartButton() {

    productPage.shoppingCartBtn_loc.click();

    }
}
