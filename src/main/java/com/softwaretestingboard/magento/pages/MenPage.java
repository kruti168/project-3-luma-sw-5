package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlistners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MenPage extends Utility {
    public MenPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement clickOnPants;

    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-175']")
    WebElement cronusYogaPantClickOnSize32;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement cronusYogaPantClickColourBlack;

    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement clickOnAddToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyText;

    @CacheLookup
    @FindBy(xpath = "//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]")
    WebElement clickOnShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyShopping;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyCronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifyProductSize32;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyProductColourBlack;

    public void clickPants() {

        clickOnElement(clickOnPants);
        CustomListeners.test.log(Status.PASS, "Click on Pants" + clickOnPants);

    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;

    //Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    public void productNameCronusYogaPantCLickOnSize32() {
        mouseHoverToElement1(cronusYogaPant);
        mouseHoverToElementAndClick(cronusYogaPantClickOnSize32);
        CustomListeners.test.log(Status.PASS, "Mouse Hover on product name Cronus Yoga Pant and click on size 32");
    }
    public void clickOnBlack() {
        clickOnElement(cronusYogaPantClickColourBlack);
        CustomListeners.test.log(Status.PASS, "Mouse Hoover and click on Black" + cronusYogaPantClickColourBlack);
    }
    public void cronusYogaPantClickAddToCartButton(){

        mouseHoverToElement1(clickOnAddToCart);
        CustomListeners.test.log(Status.PASS,"click on Black" + clickOnAddToCart);
    }
    // Verify the text You added Cronus Yoga Pant to your shopping cart.
    public void verifyTextMessage()
    {
        String expectedMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualMessage = getTextFromElement(verifyText);
        Assert.assertEquals(expectedMessage,actualMessage);
        CustomListeners.test.log(Status.PASS,"You added Cronus Yoga Pant  to your ");
    }


    public void shoppingCartLink()
    {
       clickOnElement(clickOnShoppingCart);
        CustomListeners.test.log(Status.PASS,"Click on ‘shopping cart’ Link into message"+clickOnShoppingCart);
    }
    // Verify the text ‘Shopping Cart.'
    public void verifyShoppingCart()
    {
        String expectedMessage = "Shopping Cart";
        String actualMessage = getTextFromElement(verifyShopping);
        Assert.assertEquals(expectedMessage,actualMessage);
        CustomListeners.test.log(Status.PASS,"Shopping Cart");

    }


    // Verify the product name ‘Cronus Yoga Pant’
    public void verifyProductNameCronusYogaPant()
    {
        String expectedMessage = "Cronus Yoga Pant";
        String actualMessage = getTextFromElement(verifyCronusYogaPant);
        Assert.assertEquals(expectedMessage,actualMessage);
        CustomListeners.test.log(Status.PASS,"Verify the product name ‘Cronus Yoga Pant’");

    }

    // Verify the product size ‘32’
public void verifyProductSize32()
{
    String expectedMessage = "32";
    String actualMessage = getTextFromElement(verifyProductSize32);
    Assert.assertEquals(expectedMessage,actualMessage);
    CustomListeners.test.log(Status.PASS,"Verify the product size ‘32’");

}

    // Verify the product colour ‘Black’
    public void verifyProductColourBlack()
    {
        String expectedMessage = "Black";
        String actualMessage = getTextFromElement(verifyProductColourBlack);
        Assert.assertEquals(expectedMessage,actualMessage);
        CustomListeners.test.log(Status.PASS,"Verify the product colour ‘Black’");

}
    }



