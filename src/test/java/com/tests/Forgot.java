package com.tests;

import com.pages.LoginPage;
import com.utilities.BrowserUtilities;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

public class Forgot {
    @Test
    public void forgot() {
        LoginPage loginPage = new LoginPage();

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        loginPage.SignInButton.click();
        String title = "Sign in to GitHub · GitHub";

        Assert.assertEquals(title, Driver.getDriver().getTitle());

        BrowserUtilities.waitForVisibility(loginPage.SignIn, 3);

        Assert.assertTrue(loginPage.SignIn.isDisplayed());

        loginPage.Forgot.click();

        BrowserUtilities.waitForVisibility(loginPage.Email,3);

        loginPage.Email.sendKeys("mehmetalkann14@gmail.com");

        Driver.getDriver().switchTo().alert().accept();


    }
}