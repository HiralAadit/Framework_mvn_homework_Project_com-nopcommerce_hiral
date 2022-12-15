package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class ElectronicsPage extends Utility {
//2.1

    By clickOnElectronics = By.xpath("//ul[@class='top-menu notmobile']/li[2]");


    //2.2
    By clickCellPhone = By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul/li[2]/a");


    //2.3
    By verifyTextCellPhones = By.xpath("//h1[contains(text(),'Cell phones')]");


    //2.4
    By clickOnListTab = By.xpath("//a[contains(text(),'List')]");


    //2.5

    //
    By clickOnProduct = By.xpath("//div[@class='details']//a[contains(text(),'Nokia Lumia 1020')]");


    //2.6
    By verifyTextCellPhones1 = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");


    By verifyPrice = By.xpath("//span[@id='price-value-20']");


    By qtyUpdated = By.xpath("//input[@id='product_enteredQuantity_20']");


    By clickOnADDTOCART = By.xpath("//button[@id='add-to-cart-button-20']");


    By verifyText = By.xpath("//div[@id='bar-notification']/div/p");


    By click1 = By.xpath("//span[@class='close']");


    By hoverShoppingcart = By.xpath("//span[contains(text(),'Shopping cart')]");


    By click2 = By.xpath("//button[contains(text(),'Go to cart')]");


    By verifyText2 = By.xpath("//h1[contains(text(),'Shopping cart')]");


    //2.13 Verify the quantity is 2
    By qtyUpqte2 = By.xpath("//input[@class=\"qty-input\"]");
  /* public void getqtyUpqte2(String text){}
    WebElement quantity1 = driver.findElement(By.xpath("//input[@class=\"qty-input\"]"));
     String qty = text.getAttribute("value");
         Assert.("no value", "2");
     */

    // 2.14 Verify the Total $698.00
    By verifyPrice2 = By.xpath("//span[@class='product-subtotal']");


    By clickOnCheckbox = By.xpath("//input[@id='termsofservice']");


    //2.16 Click on “CHECKOUT”
    By clickOnCHECKOUT = By.xpath("//button[@id='checkout']");


    //  2.17 Verify the Text “Welcome, Please Sign In!”
    By verifyTextA = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");


    By clickOnREGISTER = By.xpath("//button[@onclick='location.href=\"https://demo.nopcommerce.com/register?returnUrl=%2Fcart\"']");


    By verifyText3 = By.xpath("//button[@onclick='location.href=\"https://demo.nopcommerce.com/register?returnUrl=%2Fcart\"']");


    By fillFirstName = By.id("FirstName");


    By fillLastName = By.id("LastName");


    By fillemail = By.id("Email");


    By fillPassword = By.id("Password");

    public void getFillPassword(String text) {
        sendTextToElement(fillPassword, text);
    }

    By fillconfirmPassword = By.id("ConfirmPassword");


    By registerID = By.id("register-button");


    //2.22
    By verifYourRegistrationCompleted = By.xpath("//div[text()='Your registration completed']");


    By clickOncontinueButton2 = By.xpath("//a[@class='button-1 register-continue-button']");


    By verifyShoppingCart = By.xpath("//h1[text()='Shopping cart']");

    By clickOnCheckBox = By.id("termsofservice");

    By textMessageYourRegistrationCompleted = By.xpath("//div[text()='Your registration completed']");


    //2.23 Click on “CONTINUE” tab
    By continueButton2 = By.xpath("//a[@class='button-1 register-continue-button']");


    //2.24 Verify the text “Shopping card”
    By getVerifyShoppingCart = By.xpath("//h1[text()='Shopping cart']");


    //2.25 click on checkbox “I agree with the terms of service”
    By checkBox1 = By.id("termsofservice");

    public void setCheckBox2() {
        clickOnElement(checkBox1);
    }

    //2.26 Click on “CHECKOUT”
    By Checkout = By.id("termsofservice");


    //2.27 Fill the Mandatory fields*****


    By country = By.id("BillingNewAddress_CountryId");


    By city = By.id("BillingNewAddress_City");


    By address1 = By.id("BillingNewAddress_Address1");


    By zipPostalCode = By.id("BillingNewAddress_ZipPostalCode");


    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");


    //2.28 Click on “CONTINUE”
    By continueButton3 = By.xpath("//button[text() = 'Continue']");


    //2.29 Click on Radio Button “2nd Day Air ($0.00)”
    By radiobutton1 = By.id("shippingoption_2");


    // 2.30 Click on “CONTINUE”
    By continueButton4 = By.xpath("//div[@id='shipping-method-buttons-container']/button");


    // 2.31 Select Radio Button “Credit Card”
    By clickOnRadioButton2 = By.xpath("//input[@id='paymentmethod_1']");
    By clickOnContinue4 = By.xpath("//div[@id='checkout-step-payment-method']/div/button");


    // 2.32 Select “Visa” From Select credit card dropdown
    By selectVisa = By.id("CreditCardType");


    //2.33 Fill all the details

    By cardholderName = By.xpath("//input[@data-val-required='Enter cardholder name']");


    By cardNumber = By.id("CardNumber");


    By ExpireMonth = By.id("ExpireMonth");


    By ExpireYear = By.id("ExpireYear");


    By CardCode = By.xpath("//input[@id='CardCode']");


    //2.34 Click on “CONTINUE”
    By getContinueButton5 = By.xpath("//div[@id='payment-info-buttons-container']/button");


    //2.35 Verify “Payment Method” is “Credit Card”
    By PaymentMethod1 = By.xpath("//li[@class='payment-method']/span[2]");


    //2.36 Verify “Shipping Method” is “2nd Day Air”
    By shippingMethod = By.xpath("//li[@class='shipping-method']/span[2]");


    //2.37 Verify Total is “$698.00”
    By total$698 = By.xpath("//td[@class='subtotal']/span");


    // 2.38 Click on “CONFIRM”
    By confirmButton5 = By.xpath("//button[text()='Confirm']");


    // 2.39 Verify the Text “Thank You”
    By thankYouMessage = By.xpath("//h1[contains(text(),'Thank you')]");


    // 2.40 Verify the message “Your order has been successfully processed!”
    By orderSuccessfullyProcessed = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");


    //2.41 Click on “CONTINUE”
    By ContinueButton6 = By.xpath("//button[contains(text(),'Continue')]");

    //2.42 Verify the text “Welcome to our store”
    By welcomeToOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    //2.43 Click on “Logout” link
    By logout1 = By.xpath("//a[contains(text(),'Log out')]");

    public void getclickOnElectronics() {
        mouseHoverToElementAndClick(clickOnElectronics);
    }

    public void getclickCellPhone() {
        mouseHoverToElementAndClick(clickCellPhone);
    }


    public String getverifyTextCellPhones() {
        return getTextFromElement(verifyTextCellPhones);
    }

    public void getclickOnProduct() {
        clickOnElement(clickCellPhone);
    }

    public String getverifyTextCellPhones1() {
        return getTextFromElement(verifyTextCellPhones1);
    }

    public String getverifyPrice() {
        return getTextFromElement(verifyPrice);
    }

    public void getqtyUpdated(String text) {
        WebElement Quantity = driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        Quantity.clear();
        Quantity.sendKeys(text);
        clickOnElement(qtyUpdated);
    }


    public void getclickOnADDTOCART() {
        clickOnElement(clickOnADDTOCART);
    }

    public String getverifyText() {
        return getTextFromElement(verifyText);
    }

    public void getclick1() {
        clickOnElement(click1);
    }

    public void gethoverShoppingcart() {
        mouseHoverToElement(hoverShoppingcart);
    }

    public void getclick2() {
        clickOnElement(click2);
    }

    public String geyverifyText2() {
        return getTextFromElement(verifyText2);
    }

    public String getverifyPrice2() {
        return getTextFromElement(verifyPrice2);
    }

    public void getclickOnCheckbox() {
        clickOnElement(clickOnCheckbox);
    }

    public void getclickOnCHECKOUT() {
        clickOnElement(clickOnCHECKOUT);
    }

    public String getverifyText2() {
        return getTextFromElement(verifyTextA);
    }

    public void getclickOnREGISTER() {
        clickOnElement(clickOnREGISTER);
    }

    public String getverifyText3() {
        return getTextFromElement(verifyText3);
    }

    public void getFillFirstName(String FirstName) {
        sendTextToElement(fillFirstName, FirstName);
    }

    public void getFillLastName(String LastName) {
        sendTextToElement(fillLastName, LastName);
    }

    public void getfillEmail(String text) {
        sendTextToElement(fillemail, text);
    }

    public void getfillConfirmPassword(String text) {
        sendTextToElement(fillconfirmPassword, text);
    }

    public void getregisterID(String text) {
        sendTextToElement(registerID, text);
    }

    public String getverifYourRegistrationCompleted() {
        return getTextFromElement(verifYourRegistrationCompleted);
    }

    public void getclickOncontinueButton2() {
        clickOnElement(clickOncontinueButton2);
    }

    public void getVerifyShoppingCart() {
        clickOnElement(verifyShoppingCart);
    }

    public void getlickOnCheckBox() {
        clickOnElement(clickOnCheckBox);
    }

    public String registrationCompleted() {

        return getTextFromElement(textMessageYourRegistrationCompleted);
    }

    public void continueB() {
        clickOnElement(continueButton2);
    }

    public String shoppingCart1() {

        return getTextFromElement(getVerifyShoppingCart);
    }

    public void checkout3() {
        clickOnElement(Checkout);
    }

    public void enterCountry(String text) {
        selectByVisibleTextFromDropDown(country, text);
    }

    public void enterCity(String text) {
        sendTextToElement(city, text);

    }

    public void enterAddress1(String text) {
        sendTextToElement(address1, text);

    }

    public void enterZipPostalCode(String text) {
        sendTextToElement(zipPostalCode, text);

    }

    public void enterPhoneNumber(String text) {
        sendTextToElement(phoneNumber, text);

    }

    public void setRadiobutton1() {
        clickOnElement(radiobutton1);
    }

    public void continue3() {
        clickOnElement(continueButton3);
    }

    public void setClickOnRadioButton2() {
        clickOnElement(clickOnRadioButton2);
        clickOnElement(clickOnContinue4);
    }

    public void continue4() {
        clickOnElement(continueButton4);
    }

    public void selectVisa(String text) {
        selectByVisibleTextFromDropDown(selectVisa, text);
    }

    public void setCardholderName(String text) {
        sendTextToElement(cardholderName, text);
    }

    public void setCardNumber(String text) {
        sendTextToElement(cardNumber, text);

    }

    public void getExpireMonth(String text) {
        sendTextToElement(ExpireMonth, text);

    }

    public void getExpireYear(String text) {
        sendTextToElement(ExpireYear, text);

    }

    public void getcardCode(String text) {
        sendTextToElement(CardCode, text);

    }

    public void setGetContinueButton5() {
        clickOnElement(getContinueButton5);

    }

    public String paymentMethod() {
        return getTextFromElement(PaymentMethod1);
    }

    public String shippingMethod1() {
        return getTextFromElement(shippingMethod);
    }

    public String gettotal$698() {
        return getTextFromElement(total$698);
    }

    public String orderProcessed() {
        return getTextFromElement(orderSuccessfullyProcessed);
    }

    public void getconfirm5() {
        clickOnElement(confirmButton5);
    }

    public String thankYou() {
        return getTextFromElement(thankYouMessage);
    }

    public void getcontinueButton6() {
        clickOnElement(ContinueButton6);
    }

    public void getlogout1() {
        clickOnElement(logout1);
    }

    //2.42 Verify the text “Welcome to our store”
    public String getstoretext() {
        return getTextFromElement(welcomeToOurStore);
    }
}



























