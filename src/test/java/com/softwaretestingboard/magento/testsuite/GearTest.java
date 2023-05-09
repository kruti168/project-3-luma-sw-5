package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlistners.CustomListeners;
import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {

    HomePage homePage;
    GearPage gearPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){

        homePage = new HomePage();
        gearPage = new GearPage();

    }@Test(groups = {"sanity","regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart(){

        homePage.mouseHoveOnGearMenu();
        gearPage.clickOnBags();
        gearPage.productNameOvernightDuffle();
        gearPage.changeQty3();
        gearPage.addToCart();
        gearPage.shoppingCartLinkMessage();
        gearPage.changeQty5();
        gearPage.updateShoppingCartButton();
    }

}
