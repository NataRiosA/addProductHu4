package com.indra.actions;

import com.indra.models.AddBuy;
import com.indra.pages.AddPage;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://advantageonlineshopping.com/")
public class AddActions extends AddPage {

    public AddActions(WebDriver driver) {
        super(driver);
    }

    public void clickOnSignIn(AddBuy signIn){
        getMenu2().click();
        fillRegistrationForm(signIn);
        getSignIn().waitUntilClickable().click();
    }

    public void seleccioanr(){
        getSpeakers().click();
        getBuyNow().click();
    }

    public void fillRegistrationForm(AddBuy signIn) {
        enter(signIn.getUsuario()).into(getUsername());
        enter(signIn.getContrasenia()).into(getPassword());
    }

    public void clicKOnAdd() {
        getWhite().click();
        getPlus().click();
        getAddCart().click();
    }

    public void specifi(){
        WebElement newAccount = getDriver().findElement(By.xpath("/html/body/div[3]/section/article[2]/h2"));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,420)"); //Scroll vertically down by 1000 pixels
        getSpecifi().isVisible();
    }

    public void pay(){
        getMenu().waitUntilClickable().click();
        getComprar().click();
        getComprar2().waitUntilClickable().click();
        waitFor(5);
    }


}
