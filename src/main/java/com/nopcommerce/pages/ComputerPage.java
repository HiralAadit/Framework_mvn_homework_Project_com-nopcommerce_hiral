package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;


public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[@href='/computers']")
    WebElement computerMenu;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='title']//a")
    WebElement desktopMenu;

    @CacheLookup
    @FindBy(xpath = "//select[@name='products-orderby']")
    WebElement selectSortZToA;
    @CacheLookup
    @FindBy
            (xpath = "//select[@id='products-orderby']")
    WebElement selectSortByAToZ;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyBuildYourOwn;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;


    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @CacheLookup
    @FindBy(id="product_attribute_3_7")
    WebElement selectHDD;

    @CacheLookup
    @FindBy
            (id = "product_attribute_4_9")
    WebElement selectRadioButton1;
    @CacheLookup
    @FindBy(xpath="//label[text()='Vista Premium [+$60.00]']")
    WebElement selectOS;

    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement selectSoftware;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyTotal;



    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyCartMsg;


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeMsg;



    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart;



    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 cart-button']")
    WebElement clickOnGoToCart;

    public void clickOnGoToCart() {
        Reporter.log("click to gotocart" + clickOnGoToCart);
        clickOnElement(clickOnGoToCart);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement clearText;



    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement sendTextToQuantity;

    public void sendTextToQuantityField() {
        Reporter.log("enter quantity"+ 2 +"to quantity field"+sendTextToQuantity.toString());
        sendTextToElement(sendTextToQuantity, "2");
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement clickOnUpdateShoppingCart ;



    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]']")
    WebElement verifyTotal1;


    public String verifyUpdatedPrice(){

        Reporter.log("verify total" + verifyTotal1.toString());
        return getTextFromElement(verifyTotal1);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox;


    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;



    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement clickOnCheckoutAsGuest;


    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement sendTextToFirstName;


    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement sendTextToLastName;


    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement sendTextToEmail;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Company")
    WebElement sendTextToCompany ;



    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement sendTextToCountry;


    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement sendTextToCity;



    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement sendTextToAddress1;


    @CacheLookup
    @FindBy(css="#BillingNewAddress_Address2")
    WebElement sendTextToAddress2;


    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement sendTextToPostalCode;


    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement sendTextToPhoneNumber;



    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]]")
    WebElement clickOnContinue;

    public void clickOnContinueButton() {
        Reporter.log("click on countinue"+clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement clickOnNextDayAir;



    @CacheLookup
            @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
WebElement clickOnContinueTab;


    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement clickOnCreditCard;


    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButton;



@CacheLookup
        @FindBy(id ="CardholderName" )
        WebElement cardHolderName;


@CacheLookup
        @FindBy (id = "CardNumber")
WebElement cardNumber;

    @CacheLookup
    @FindBy(id="CardCode")
            WebElement cardCode;


    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton2;



    @CacheLookup
            @FindBy(xpath ="//li[@class='payment-method']/span[2]" )
WebElement verifyText1;


    @CacheLookup
    @FindBy(xpath ="//li[@class='shipping-method']//span[2]")
    WebElement verifyText2;


    @CacheLookup
    @FindBy(xpath ="//tr[@class='order-total']/td[2]/span/strong" )
    WebElement verifyText3;


    @CacheLookup
    @FindBy(xpath ="//button[@class='button-1 confirm-order-next-step-button']" )
    WebElement confirm;


    @CacheLookup
    @FindBy(xpath ="//div[@class='page-title']/h1" )
    WebElement verifyText4;


    @CacheLookup
    @FindBy(xpath ="//strong[contains(text(),'Your order has been successfully processed!')]" )
    WebElement verifyText5;


    @CacheLookup
    @FindBy(css="div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button")
    WebElement continueButton3;

    public void clickOnContinueButton3() {
        Reporter.log("click to countinue button"+continueButton3.toString());
        clickOnElement(continueButton3);
    }

    @CacheLookup
    @FindBy(xpath ="//h2[contains(text(),'Welcome to our store')]" )
    WebElement verifyText6;




    //START
    public void clickOnComputer() {
        Reporter.log("clicking on computerMenu" + computerMenu.toString());
        clickOnElement(computerMenu);
    }

    public void clickOnDesktop() {
        Reporter.log("clicking on desktop" + desktopMenu.toString());
        clickOnElement(desktopMenu);
    }
    public void setSelectSortByZToA(String sortZToA) {
        clickOnElement(selectSortZToA);
        selectByVisibleTextFromDropDown(selectSortZToA, sortZToA);
    }

    public void setSelectSortByAToZ(String sortAToZ) {

        clickOnElement(selectSortByAToZ);
        selectByVisibleTextFromDropDown(selectSortByAToZ, sortAToZ);
    }


    public void clickOnAddToCart() {
        Reporter.log(" click in add to cart" + addToCart.toString());
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        clickOnElement(addToCart);
    }
        public String getVerifyBuildYourOwn() {
        Reporter.log("verify text" +verifyBuildYourOwn.toString());
        return getTextFromElement(verifyBuildYourOwn);

    }
    public void selectProcessorByValue(String value) {
        Reporter.log("select procesor" + selectProcessor.toString());
        selectByValueFromDropDown(selectProcessor, value);
    }
    public void selectRamByValue(String value) {
        Reporter.log("select Ram by dropdown" + selectProcessor.toString());
        selectByValueFromDropDown(selectRam, value);
    }
    public void clickOnHDD400GB() {
        Reporter.log("click on HDD" + selectHDD);
        clickOnElement(selectHDD);
    }
    public void clickOnOsVistaPremium() {
        Reporter.log("clickc to select os" + selectOS);
        clickOnElement(selectOS);
    }

    public void clickOnSoftwareTotalCommander() {
        Reporter.log("click select software" + selectSoftware);
        clickOnElement(selectSoftware);
    }
    public String verifyTotalPrice() {
        Reporter.log("verify total" + verifyTotal);
        return getTextFromElement(verifyTotal);
    }

    public void clickOnAddToCartButton() {
        Reporter.log("click add to cart" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }
    public String verifyCaryMessage() {
        Reporter.log("verify text" + verifyCartMsg.toString());
        return getTextFromElement(verifyCartMsg);
    }

    public void closeMessageBar() {
        Reporter.log("click close message" + closeMsg.toString());
        clickOnElement(closeMsg);
    }

    public void mouseHoverOnElementShoppingCart() {
        Reporter.log("hover shopping cart" + mouseHoverOnShoppingCart.toString());
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }
    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(By.xpath("//input[@value='1']"));
        quantity.clear();
    }

    public void clickOnUpdateShoppingCartButton() {

        Reporter.log("click to update shopping cart" + clickOnGoToCart.toString());
        clickOnElement(clickOnUpdateShoppingCart);
    }
    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        Reporter.log("click on Chackbox" + clickOnCheckbox.toString());
        clickOnElement(clickOnCheckbox);
    }

    public void clickOnCheckOutButton() {
        Reporter.log("click on Chack out" + clickOnCheckout.toString());
        clickOnElement(clickOnCheckout);
    }
    public void clickOnCheckOutAsGuest() {
        Reporter.log("click on Chack out as guest" + clickOnCheckoutAsGuest.toString());
        clickOnElement(clickOnCheckoutAsGuest);
    }

    public void sendTextToFirstNameField(String name) {

        Reporter.log("enter first name" +name+ " to First name field"+sendTextToFirstName.toString()) ;
        sendTextToElement(sendTextToFirstName, name);
    }
    public void sendTextToLastNameField(String lastName) {
        Reporter.log("enter text  to last name" + lastName+"to last name field"+ sendTextToLastName.toString());
        sendTextToElement(sendTextToLastName, lastName);
    }
    public void sendTextToCompanyField(String company) {
        Reporter.log("enter text  to company name" + company +"to company name field"+ sendTextToCompany.toString());
        sendTextToElement(sendTextToCompany, company);
    }
    public void sendTextToCityField(String city) {
        Reporter.log("eneter text to city"+ city+"city field"+sendTextToCity.toString());
        sendTextToElement(sendTextToCity, city);
    }
    public void sendTextToAddressLine1(String address) {
        Reporter.log("text to Address"+address+"to address field"+sendTextToAddress1);
        sendTextToElement(sendTextToAddress1, address);
    }
    public void sendTextToPostcode(String postcode) {

        Reporter.log("enter text to postalcode" + postcode+"to postal code field"+ sendTextToPostalCode);
        sendTextToElement(sendTextToPostalCode, postcode);
    }

    public void sendTextToAddressLine2(String address) {
        Reporter.log("Enter text to address2"+ address+"text to Address2 field"+sendTextToCountry);
        sendTextToElement(sendTextToAddress2, address);
    }

    public void sendTextToPhoneNumberField(String number) {
        Reporter.log("enter text to phone number" + number+"to phone number field"+sendTextToPhoneNumber.toString());
        sendTextToElement(sendTextToPhoneNumber, number);
    }

    public void clickOnNextDayAirButton() {
        Reporter.log("click on next dayair"+ clickOnContinue.toString());
        clickOnElement(clickOnNextDayAir);
    }

    public void clickOnContinueButtonAgain() {
        Reporter.log("click to countinue"+ clickOnContinue);
        clickOnElement(clickOnContinueTab);
    }

    public void selectMonthAndYearForCreditCardExpireData() {
        selectByValueFromDropDown(By.id("ExpireMonth"), "5");
        selectByValueFromDropDown(By.id("ExpireYear"), "2024");
    }

    public void selectCountryFromDropDownList() {
        Reporter.log("select country" + sendTextToCountry.toString());
        selectByValueFromDropDown(sendTextToCountry,"country");
    }
    public void clickOnCreditCardButton() {
        clickOnElement(clickOnCreditCard);
    }
    public void selectClickOnContinue1() {
        Reporter.log("click to continue"+continueButton.toString());
        clickOnElement(continueButton);
    }
    public void sendTextTOCardHolderName(String name) {
        Reporter.log("enter card holder name"+ name+"to card Holdername field"+ cardHolderName);
        sendTextToElement(cardHolderName, name);
    }
    public void sendTextTOCardNumber(String num) {
        Reporter.log("enter car number"+ num+"to card number field"+ cardNumber);
        sendTextToElement(cardNumber, num);
    }


    public void sendTextToCardCode(String code) {
        Reporter.log("enter card code"+code+"to cardcode field"+cardCode);
        sendTextToElement(cardCode, code);
    }
    public void clickOnContinueButton2() {

        Reporter.log("click continue button"+continueButton2.toString());
        clickOnElement(continueButton2);
    }
    public String getVerifyText1() {
        Reporter.log("verify text"+verifyText1.toString());
        return getTextFromElement(verifyText1);

    }
    public String getVerifyText2() {
        Reporter.log("verify text"+verifyText2.toString());
        return getTextFromElement(verifyText2);

    }
    public String getVerifyText3() {
        Reporter.log("verify text"+verifyText3.toString());
        return getTextFromElement(verifyText3);

    }
    public void clickOnConformButton() {
        Reporter.log("click to confirm"+confirm.toString());
        clickOnElement(confirm);
    }

    public String getVerifyText4() {
        Reporter.log("verify get text"+verifyText4.toString());
        return getTextFromElement(verifyText4);

    }
    public String getVerifyText5() {
        Reporter.log("get verify text"+verifyText5.toString());
        return getTextFromElement(verifyText5);
    }
    public String getVerifyText6() {
        Reporter.log("verify text from ge ttext" + verifyText6.toString());
        return getTextFromElement(verifyText6);
    }
    }