package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage extends BasePage{

    @FindBy(xpath = "//h2[.='THANK YOU FOR YOUR ORDER']")
    public WebElement thankYouForYourOrderMessage_loc;

}
