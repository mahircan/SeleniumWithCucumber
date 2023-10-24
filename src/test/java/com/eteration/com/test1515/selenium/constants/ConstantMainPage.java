package com.eteration.com.test1515.selenium.constants;

import org.openqa.selenium.By;

public class ConstantMainPage {
    // Ortak locator'ların olması

    public static final By KizilElmaPopUpEscapeButton = By.xpath("//div[@class='modal-content']/button[@class='close']");
    public static final By NavbarTextHakkimizda= By.xpath("//a[normalize-space(text()) = 'HAKKIMIZDA']");
    public static final By NavbarBizBaykariz = By.xpath("//a[text()='Biz Baykarız']");
    public static final By NavbarTextNelerYapiyoruz= By.xpath("//a[normalize-space(text()) = 'NELER YAPIYORUZ']");
    public static final By NavbarInsansizHavaAraciTexti = By.xpath("//a[text()='İnsansız Hava Aracı Sistemleri']");
    public static final By NavbarTextGelecegimiz= By.xpath("//a[normalize-space(text()) = 'GELECEĞİMİZ']");
    public static final By NavbarBayraktarTB3 = By.xpath("//a[text()='Bayraktar TB3']");
    public static final By NavbarTextKariyer= By.xpath("//a[normalize-space(text()) = 'KARİYER']");
    public static final By KariyerPageAcikPozisyonlarButonu = By.cssSelector("button[class='fix-btn']");
    public static final By NavbarTextMagaza= By.xpath("//a[normalize-space(text()) = 'MAĞAZA']");
    public static final By MagazaPageGiyimButonu = By.xpath("//a[normalize-space(text()) = 'GİYİM']");
    public static final By NavbarTextIletisim= By.xpath("//a[normalize-space(text()) = 'İLETİŞİM']");
    public static final By IletisimPageIletisimBaslik= By.xpath("//div[@class='pageTitle']/h1[text()='İletişim']");
    public static final By NavbarTextAboutUs= By.xpath("//a[normalize-space(text()) = 'ABOUT US']");
    public static final By MainPageLanguageTags = By.xpath("//div[@class='lang']/a");
    public static final By KariyerPageFilterFirstCheckbox = By.xpath("//input[@onchange='filterProgram(this)']/..");
    public static final By KariyerBirimText = By.xpath("//div[@class='position-category']");

}
