package com.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;


public class BrowserUtilities {

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
