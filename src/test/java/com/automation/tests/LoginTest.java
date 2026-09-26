package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.driver.DriverFactory;
import com.automation.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage loginPage =
                new LoginPage(
                        DriverFactory.getDriver()
                );

        loginPage.login(
                "standard_user",
                "secret_sauce"
        );

        String currentUrl =
                DriverFactory.getDriver().getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("inventory")
        );
    }
}