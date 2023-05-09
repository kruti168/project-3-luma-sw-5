package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlistners.CustomListeners;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {

    HomePage homePage;
    MenPage menPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){

         homePage = new HomePage();
         menPage = new MenPage();

    }@Test(groups = {"sanity","regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart(){

        homePage.mouseHoverOnMenMenu();
        homePage.mouseHoverOnBottom();
        menPage.clickPants();
        menPage.productNameCronusYogaPantCLickOnSize32();
        menPage.clickOnBlack();
        menPage.cronusYogaPantClickAddToCartButton();
        menPage.shoppingCartLink();



    }

}
