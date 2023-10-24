package com.eteration.com.test1515.selenium.test;


import com.eteration.com.test1515.selenium.base.BaseTest;
import com.eteration.com.test1515.selenium.page.MainPage;
import cucumber.api.java.Before;
import org.testng.annotations.Test;


public class MainPageTest extends BaseTest {

    MainPage mainPage;

    @Before
    public void before(){
        mainPage = new MainPage(getDriver());
    }
    @Test
    public void mainControl() {
        mainPage.callMainPage().EgitmenlerGiris();
    }
    @Test
    public void LanguageCheck() {
        mainPage.callMainPage().LanguageCheck();
    }
    @Test
    public void Filter() {
        mainPage.callMainPage().Filter();
    }


}
