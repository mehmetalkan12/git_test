package com.tests;

import com.pages.LoginPage;
import com.utilities.BrowserUtilities;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

public class SignIn {


    @Test
    public void SignIn(){
        LoginPage loginPage = new LoginPage();

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        loginPage.SignInButton.click();
        String title = "Sign in to GitHub · GitHub";

        Assert.assertEquals(title,Driver.getDriver().getTitle());

        BrowserUtilities.waitForVisibility(loginPage.SignIn,3);

        Assert.assertTrue(loginPage.SignIn.isDisplayed());

        loginPage.Username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.Password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.SignIn.click();

        String title2 = "GitHub";

        Assert.assertEquals(title2,Driver.getDriver().getTitle());

        Driver.getDriver().quit();

    }

}
