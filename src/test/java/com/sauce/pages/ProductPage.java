package com.sauce.pages;

import com.sauce.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//span[.='Products']")
    public WebElement productHeader_loc;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement sortCantainer_loc;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    public List<WebElement> listofPrice_loc;

    @FindBy(xpath = "//div[@class='pricebar']//button")
    public List<WebElement> addToCartButtonOfProducts;

    @FindBy(xpath = "//*[.='Add to cart']")
    public WebElement addToChartBtn_loc;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement shoppingCartBtn_loc;


    public void sortTheProducts(String nameOfSort){

        Select select=new Select(sortCantainer_loc);
        select.selectByVisibleText(nameOfSort);


    }


    public void clickToProduct(int index){

        addToCartButtonOfProducts.get(index).click();
    }

    public List<String> listOfPrice_mtd(){

       List<String> prices = BrowserUtils.getElementsText(listofPrice_loc);

       return prices;

    }




}
