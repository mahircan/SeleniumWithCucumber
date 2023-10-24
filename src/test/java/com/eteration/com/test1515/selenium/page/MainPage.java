package com.eteration.com.test1515.selenium.page;

import com.eteration.com.test1515.selenium.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.eteration.com.test1515.selenium.constants.ConstantMainPage.*;


public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }



    public MainPage EgitmenlerGiris() {
        clickElement(KizilElmaPopUpEscapeButton);
        clickElementAndCheck(NavbarTextHakkimizda,NavbarBizBaykariz);
        clickElementAndCheck(NavbarTextNelerYapiyoruz,NavbarInsansizHavaAraciTexti);
        clickElementAndCheck(NavbarTextGelecegimiz,NavbarBayraktarTB3);
        clickElementAndCheck(NavbarTextKariyer,KariyerPageAcikPozisyonlarButonu);
        backPage();
        clickElement(KizilElmaPopUpEscapeButton);
        clickElementAndCheck(NavbarTextMagaza,MagazaPageGiyimButonu);
        backPage();
        clickElement(KizilElmaPopUpEscapeButton);
        clickElementAndCheck(NavbarTextIletisim,IletisimPageIletisimBaslik);
        return new MainPage(driver);
    }

    public MainPage LanguageCheck() {
        clickElement(KizilElmaPopUpEscapeButton);
        languageCheck(MainPageLanguageTags,NavbarTextHakkimizda,NavbarTextAboutUs);
        clickElement(MainPageLanguageTags);
        clickElement(KizilElmaPopUpEscapeButton);
        languageCheck(MainPageLanguageTags,NavbarTextHakkimizda,NavbarTextAboutUs);
        return new MainPage(driver);
    }

    public MainPage Filter(){
        clickElement(KizilElmaPopUpEscapeButton);
        clickElement(NavbarTextKariyer);
        clickElement(KariyerPageAcikPozisyonlarButonu);
        clickElement(KariyerPageFilterFirstCheckbox);
        getTextList(KariyerPageFilterFirstCheckbox);
        getTextList(KariyerBirimText);
        compareTwoString(1,2);
        clearListsFromRam();
        return new MainPage(driver);
    }

}
