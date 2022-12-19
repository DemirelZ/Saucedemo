package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages extends BasePage {

    @FindBy(id = "user-name")
    public WebElement inputUserName_loc;

    @FindBy(css = "#password")
    public WebElement inputPassword_loc;

    @FindBy(css = "#login-button")
    public WebElement loginBtn_loc;

    public void login_mtd(String userName, String password){

        inputUserName_loc.sendKeys(userName);
        inputPassword_loc.sendKeys(password);
        loginBtn_loc.click();
    }

}
