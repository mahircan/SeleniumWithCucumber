package com.eteration.com.test1515.selenium.base;

import com.eteration.com.test1515.selenium.page.MainPage;

import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BasePage {


    protected WebDriver driver;
    protected Logger log = LoggerFactory.getLogger(getClass());
    WebDriverWait wait;
    private  List<String> stringList=new ArrayList<>();


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    protected JavascriptExecutor getJSExecutor() {
        return (JavascriptExecutor) driver;
    }


    public void getTextList(By by){
        waitUntilPresence(by);
        WebElement element;
        element = findElement(by);
        String text = element.getText();
        String NewText = text.replace("(","").replace(")","").replace("1","").replace("2","").replace("3","").replace("0","").replace("4","").replace("5","").replace("6","").replace("7","").replace("8","").replace("9","").replace(" ","");
        stringList.add(NewText);
        log.info(text+" texti dizine atıldı");
    }
    public void compareTwoString(int index1, int index2) {
        assertionTrue(index1+". eleman, "+index2+". elemana eşit değil.Elemanlar: "+stringList.get(index1-1)+" ve "+stringList.get(index2-1), stringList.get(index1-1).compareTo(stringList.get(index2-1)) == 0);
        log.info(index1+". eleman, "+index2+". elemana eşit.Elemanlar: "+stringList.get(index1-1)+" ve "+stringList.get(index2-1));

    }
    public void clearListsFromRam() {
        stringList.clear();

    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public void backPage(){
        driver. navigate(). back();
    }

    public void clickElement(By by) {
        waitUntilPresence(by);
        WebElement element;
        element = findElement(by);
        if (!element.isDisplayed()) {
            scrollTo(element.getLocation().getX(), element.getLocation().getY());
        }
        try {
            waitUntilElementClickable(by);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            Assert.fail("Element tıklanabilir değil!");
        }
        element.click();

    }


    public void languageCheck(By by, By by1, By by2){
        WebElement element;
        element = findElement(by);
        String text = element.getText();
        if(text.equals("EN")){
            waitUntilPresence(by1);
        }else
            waitUntilPresence(by2);
    }
    public void clickElementAndCheck(By by, By by1) {
        waitUntilPresence(by);
        WebElement element;
        element = findElement(by);
        if (!element.isDisplayed()) {
            scrollTo(element.getLocation().getX(), element.getLocation().getY());
        }
        try {
            waitUntilElementClickable(by);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            Assert.fail("Element tıklanabilir değil!");
        }
        element.click();
        waitUntilPresence(by1);

    }

    public void printNumberOfElements(By by) {
        List<WebElement> elementSayisi = findElements(by);
        int a = elementSayisi.size();
        log.info(by+" elementinden " + a + " tane var.");
    }




    List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }





    /**
     * scrollTo WebElement location
     *
     * @param x
     * @param y
     */
    protected void scrollTo(int x, int y) {
        String jsStmt = String.format("window.scrollTo(%d, %d);", x, y);
        getJSExecutor().executeScript(jsStmt, true);
    }





    public void assertionTrue(String message, boolean condition) {
        Assert.assertTrue(condition,message);
    }

    public void waitUntilPresence(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }


    public void waitUntilElementClickable(By by) {
        log.info("Elementin tıklanabilir olması bekleniyor.");
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }




    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }


    public MainPage callMainPage() {
        return new MainPage(driver);
    }

}
