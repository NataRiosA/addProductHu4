package com.indra.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://advantageonlineshopping.com/#/category/Speakers/4")

public class AddPage extends PageObject {
    public AddPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "menuUser")
    private WebElementFacade menu2;

    @FindBy(xpath = "//input[@name='username']")
    private WebElementFacade username;

    @FindBy(xpath = "//input[contains(@name,'password')]")
    private WebElementFacade password;

    @FindBy(xpath = "/html/body/login-modal/div/div/div[3]/sec-form/sec-sender/button")
    private WebElementFacade signIn;

    @FindBy(xpath = "(//span[@role='link'])[1]")
    private WebElementFacade speakers;

    @FindBy(xpath = "/html/body/div[3]/section/article/div[1]/a/button")
    private WebElementFacade buyNow;

    @FindBy(xpath = "//span[@title='WHITE']")
    private WebElementFacade white;

    @FindBy(xpath = "/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[2]/e-sec-plus-minus/div/div[3]")
    private WebElementFacade plus;

    @FindBy(xpath = "//button[contains(@translate,'ADD_TO_CART')]")
    private WebElementFacade addCart;

    @FindBy(xpath = "//html[contains(@lang,'en')]")
    private WebElementFacade down;

    @FindBy(xpath = "//h2[@class='roboto-regular product_specifications ng-scope'][contains(.,'PRODUCT SPECIFICATIONS')]")
    private WebElementFacade specifi;

    @FindBy(id = "menuCart")
    private WebElementFacade menu;

    @FindBy(xpath = "(//button[contains(@role,'button')])[3]")
    private WebElementFacade comprar;

    @FindBy(xpath = "(//button[@role='button'])[2]")
    private WebElementFacade comprar2;

    public WebElementFacade getComprar2() {
        return comprar2;
    }

    public WebElementFacade getUsername() {
        return username;
    }

    public WebElementFacade getPassword() {
        return password;
    }

    public WebElementFacade getSignIn() {
        return signIn;
    }

    public WebElementFacade getSpeakers() {
        return speakers;
    }

    public WebElementFacade getBuyNow() {
        return buyNow;
    }

    public WebElementFacade getWhite() {
        return white;
    }

    public WebElementFacade getPlus() {
        return plus;
    }

    public WebElementFacade getAddCart() {
        return addCart;
    }

    public WebElementFacade getDown() {
        return down;
    }

    public WebElementFacade getSpecifi() {
        return specifi;
    }

    public WebElementFacade getMenu() {
        return menu;
    }

    public WebElementFacade getComprar() {
        return comprar;
    }

    public WebElementFacade getMenu2(){
        return menu2;
    }
}

