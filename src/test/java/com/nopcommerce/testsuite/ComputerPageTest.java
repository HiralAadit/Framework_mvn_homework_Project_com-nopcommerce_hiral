package com.nopcommerce.testsuite;

import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.ElectronicsPage;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Map;

public class ComputerPageTest extends BaseTest {
    ComputerPage computerPage;
    ElectronicsPage electronicsPage;
    HomePage homePage;
    SoftAssert softAssert;

    @BeforeMethod(alwaysRun = true)
    public void inIT() {

        computerPage = new ComputerPage();
        electronicsPage = new ElectronicsPage();
        homePage = new HomePage();
        softAssert = new SoftAssert();

    }
        @Test(groups = {"sanity", "regression"})
        public void verifyProductArrangeInAlphabeticalOrder(){
        computerPage.clickOnComputer();
        computerPage.clickOnDesktop();
        //1.3 Select Sort By position "Name: Z to A"
            //1.4 Verify the Product will arrange in Descending order.
        //computerPage.getSelectByValue("Name: Z to A");
          //  Map<String, ArrayList> mapArrays = computerPage.arrangeProductInDescendingOrder();
           // softAssert.assertEquals(mapArrays.get("originalProductsName"), mapArrays.get("afterSortByZToAProductsName"));
}
@Test(groups={"smoke","regression"})
public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
    computerPage.clickOnComputer();
    computerPage.clickOnDesktop();
    //computerPage.getSelectByValue("Name: A to Z");
    //Map<String, ArrayList> mapArrays = computerPage.arrangeProductInDescendingOrder();
   // softAssert.assertEquals(mapArrays.get("originalProductsName"), mapArrays.get("afterSortByZToAProductsName"));
computerPage.clickOnAddToCart();
computerPage.getVerifyBuildYourOwn();
computerPage.selectProcessorByValue("1");
computerPage.selectRamByValue("5");
    computerPage.clickOnOsVistaPremium();
    computerPage. clickOnSoftwareTotalCommander();
    softAssert.assertEquals(computerPage.verifyTotalPrice(),"$1,475.00" , "Price is not match");
    computerPage.clickOnAddToCartButton();
    //softAssert.assertEquals(ComputerPage.verifyCaryMessage(),"The product has been added to your shopping cart","Message doesnot match");
    computerPage.closeMessageBar();
    computerPage.mouseHoverOnElementShoppingCart();
   computerPage.clickOnUpdateShoppingCartButton();
   // softAssert.assertEquals(computerPage.clickOnConformButton(),"Shopping cart","Text is not display");
    Thread.sleep(5000);
    computerPage.clearTextInQuantityField();
    computerPage.sendTextToQuantityField();
    computerPage.clickOnUpdateShoppingCartButton();
    softAssert.assertEquals(computerPage.verifyTotalPrice(),"$2,950.00","Price is not match");
    computerPage.clickOnCheckBoxIAgreeWithTermsAndCondition();
    computerPage.clickOnCheckOutButton();
    softAssert.assertEquals(computerPage.getVerifyText1(),"Welcome, Please Sign In!","Text is not matched");
    computerPage.clickOnCheckOutAsGuest();
 computerPage.sendTextToFirstNameField("John");
  computerPage.sendTextToLastNameField("Smith");
//    computerPage.sendt("john@example.com");
    //computerPage.sendtext("233");
   // computerPage.selectStateFromDropDown("");
   computerPage.sendTextToCityField("London");

    computerPage.sendTextToAddressLine1("4,Oxford Street");
    computerPage.sendTextToPostcode("W2 4TR");
    computerPage.sendTextToPhoneNumberField("5665995116994");
    computerPage.clickOnCheckOutButton();
    Thread.sleep(5000);
    computerPage.clickOnNextDayAirButton();
   computerPage.selectCountryFromDropDownList();
computerPage.clickOnCreditCardButton();
   computerPage.selectClickOnContinue1();
    computerPage.sendTextTOCardHolderName("John Smith");
    computerPage.sendTextTOCardNumber("5555555555554444");
    computerPage.selectMonthAndYearForCreditCardExpireData();
   computerPage.selectMonthAndYearForCreditCardExpireData();
    computerPage.sendTextToCardCode("3101");
    computerPage.clickOnContinueButton2();
    softAssert.assertEquals(computerPage.getVerifyText1(),"Credit Card","Method is not correct");
    softAssert.assertEquals(computerPage.getVerifyText2(),"Next Day Air","method is not correct");
    softAssert.assertEquals(computerPage.getVerifyText3(),"$2,950.00","Price is not Match");
   computerPage.clickOnConformButton();
    softAssert.assertEquals(computerPage.getVerifyText4(),"Thank you","Text is not displayed");
    softAssert.assertEquals(computerPage.getVerifyText5(),"Your order has been successfully processed!","Text isnot Display");
    softAssert.assertEquals(computerPage.getVerifyText5(),"Welcome to our store","Text is not displayed");
    softAssert.assertAll();
}
}