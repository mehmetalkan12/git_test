package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement SignInButton;

    @FindBy(id = "login_field")
    public WebElement Username;

    @FindBy(id = "password")
    public WebElement Password;

    @FindBy(name = "commit")
    public WebElement SignIn;

    @FindBy(xpath = "//a[contains(text(),'Forgot password?')]")
    public WebElement Forgot;

    @FindBy(id = "email_field")
    public WebElement Email;

    @FindBy(xpath = "//*[@id=\"home_children_button\"]")
    public  WebElement verify;





}