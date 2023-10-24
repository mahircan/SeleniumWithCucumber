package com.eteration.com.test1515.selenium.base;

import com.eteration.com.test1515.selenium.util.Browser;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    private static RemoteWebDriver driver;
    protected Logger log = LoggerFactory.getLogger(getClass());
    protected static Browser browser = new Browser();


    @BeforeTest
    public void setUp() {
        log.info("SetUp işlemi yapılıyor...");
        browser.setBrowser("https://baykartech.com/tr/");
    }


    @AfterTest
    public void tearDown() {
        getDriver().close();
    }

    public static RemoteWebDriver getDriver() {
        return driver;
    }

    public static void setDriver(RemoteWebDriver driver) {
        BaseTest.driver = driver;
    }
}


