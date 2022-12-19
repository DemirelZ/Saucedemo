package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class InformationPage extends BasePage{


    @FindBy(xpath = "//span[.='Checkout: Your Information']")
    public WebElement informationHeader;

    @FindBy(xpath = "//input[@id='first-name']")
    public WebElement inputFistName_loc;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueBtn_loc;

    public void inputYourInformations(String firstName, String lastName, String zipCode){

        Actions actions=new Actions(Driver.get());
        actions.click(inputFistName_loc).sendKeys(firstName)
                .sendKeys(Keys.TAB)
                .sendKeys(lastName)
                .sendKeys(Keys.TAB)
                .sendKeys(zipCode)
                .perform();


    }

    public void cancelOrContinueButton(String cancelOrContinue){

        Driver.get().findElement(By.xpath("//*[@id='"+cancelOrContinue+"']")).click();
    }
}
