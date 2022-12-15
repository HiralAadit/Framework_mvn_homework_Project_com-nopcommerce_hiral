package com.nopcommerce.testsuite;

import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.ElectronicsPage;
import com.nopcommerce.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ElectronicPageTest {
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
    public void TestNameVerifyUserShouldNavigateToCellPhonesPageSuccessfully() {
//electronicsPage.mouseHoverToElement("");
      //  Assert.assertEquals(electronicsPage.getverifyTextCellPhones(),expected, "Message is not displayed");
    }
  @Test(groups = {"smoke","regression"})
  public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
      electronicsPage.getclickOnElectronics();
      electronicsPage.getclickCellPhone();
      electronicsPage.getverifyTextCellPhones();
      electronicsPage.getclickOnProduct();
      electronicsPage.getverifyTextCellPhones1();
      electronicsPage.getverifyPrice();
      electronicsPage.getqtyUpdated("2");
      electronicsPage.getclickOnADDTOCART();
      electronicsPage.getverifyText();
      electronicsPage.getclick1();
      electronicsPage.gethoverShoppingcart();
      electronicsPage.getclick2();
      electronicsPage.geyverifyText2();
      electronicsPage.getverifyPrice2();
      electronicsPage.getclickOnCheckbox();
      electronicsPage.getclickOnCHECKOUT();
      electronicsPage.getverifyText2();
      electronicsPage.getclickOnREGISTER();
      electronicsPage.getverifyText3();
      electronicsPage.getFillFirstName("aaa");
      electronicsPage.getFillLastName("bbb");
      electronicsPage.getfillEmail("xyz@gmail.com");
      electronicsPage.getfillConfirmPassword("11223344");
      electronicsPage.getregisterID("userU");
      electronicsPage.getverifYourRegistrationCompleted();
      electronicsPage.getclickOncontinueButton2();
      electronicsPage.getVerifyShoppingCart();
      electronicsPage.getlickOnCheckBox();
      electronicsPage.registrationCompleted();
      electronicsPage.continueB();
      electronicsPage.shoppingCart1();
      electronicsPage.checkout3();
      electronicsPage.enterCountry("usa");
      electronicsPage.enterCity("florida");
      electronicsPage.enterAddress1("victor road");
      electronicsPage.enterZipPostalCode("HA5 6JH");
      electronicsPage.enterPhoneNumber("12345678910");
      electronicsPage.setRadiobutton1();
      electronicsPage.checkout3();
      electronicsPage.setClickOnRadioButton2();
      electronicsPage.continue4();
      electronicsPage.selectVisa("visa");
      electronicsPage.setCardholderName("Prince");
      electronicsPage.setCardNumber("4545454545454545");
      electronicsPage.getExpireMonth("12");
      electronicsPage.getExpireYear("20225");
      electronicsPage.getcardCode("0504");
      electronicsPage.setGetContinueButton5();
      softAssert.assertEquals(electronicsPage.paymentMethod(),"Credit Card","Method is not correct");
      softAssert.assertEquals(electronicsPage.shippingMethod1(),"Next Day Air","method is not correct");
      softAssert.assertEquals(electronicsPage.gettotal$698(),"$2,950.00","Price is not Match");
      electronicsPage.getconfirm5();
      softAssert.assertEquals(electronicsPage.thankYou(),"Text is not displayed");
      //softAssert.assertEquals(electronicsPage.getcontinueButton6(),"Your order has been successfully processed!","Text isnot Display");
     // softAssert.assertEquals(electronicsPage.getcontinueButton6(),"$2,950.00","Price is not Match");
      electronicsPage.getlogout1();
      softAssert.assertEquals(electronicsPage.getstoretext(),"Welcome to our store","Text is not displayed");
      softAssert.assertAll();


  }}
