package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends BasePage {


    @FindBy (xpath = "//span[.='Your Cart']")
    public WebElement yourCartHeader_loc;

    @FindBy(xpath = "//button[@id='checkout']")
    public WebElement checkoutBtn_loc;


    public void backOrNextButtons(String backOrNextButtons){

        WebElement button = Driver.get().findElement(By.xpath("//*[@id='"+backOrNextButtons+"']"));
        button.click();
    }
}
