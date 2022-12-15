package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;
/*create class "TopMenuTest"
1.1 create method with name "selectMenu" it has one parameter name "menu" of type
string
1.2 This method should click on the menu whatever name is passed as parameter.
1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
select the Menu and click on it and verify the page navigation.*/

public class HomePage extends Utility {

    public void selectMenu(String menu) {
        List<WebElement> menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        try {
            for (WebElement options : menuList) {
                if (options.getText().equals(menu)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        }
    }

    @CacheLookup
    @FindBy(xpath ="//a[@href='/computers']" )
    WebElement verifyComputer;

    @CacheLookup
    @FindBy(xpath ="//a[@href='/electronics']")
    WebElement verifyElectronics;

    @CacheLookup
    @FindBy(xpath ="//a[@href='/apparel']")
    WebElement verifyApparel;


    public String getVerifyComputer() {
        Reporter.log("Verify text"+ verifyComputer.toString());
        return getTextFromElement(verifyComputer);
    }

    public String getVerifyElectronics() {
        Reporter.log("Verify text"+ verifyElectronics.toString());
        return getTextFromElement(verifyElectronics);
    }

    public String getVerifyApparel() {
        Reporter.log("Verify text"+ verifyApparel.toString());
        return getTextFromElement(verifyApparel);
    }

}
