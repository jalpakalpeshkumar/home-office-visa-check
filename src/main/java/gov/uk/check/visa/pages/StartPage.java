package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class StartPage extends Utility {

    @CacheLookup
    @FindBy()
    WebElement acceptCookie;

    @CacheLookup
    @FindBy(xpath = "//a[@rel='nofollow']")
    WebElement clickOnStart;

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement selectTheCountry;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickContinue;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectTourisum;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement verifyMessageone;


    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement selectIntendent;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickOnContinue2;


    @CacheLookup
    @FindBy(id = "response-1")
    WebElement selectStay;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement selectReason2;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickOnContinue3;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement planningWorkFor;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickOnContinue4;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement verifyseconMessage;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement selectReason3;

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement selectPeraMeter;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement verifyMessage3;


    /**
     * This method will click on start button
     */
    public void clickOnStartButton() {
        clickOnElement(clickOnStart);
        CustomListeners.test.log(Status.PASS, "click on" + clickOnStart);
        Reporter.log("click On");
    }


    /**
     * This method will select nationality
     */
    public void selectNationality(String name) {
        selectByVisibleTextFromDropDown(selectTheCountry, name);

        Reporter.log("select nationality");
        CustomListeners.test.log(Status.PASS, "select nationality" + selectTheCountry);
    }

    /**
     * This method will click on continue button
     */
    public void clickOnContinueButton() {
        clickOnElement(clickContinue);
        Reporter.log("click on button" + clickContinue.toString());
        CustomListeners.test.log(Status.PASS, "click on button" + clickContinue);
    }

    /**
     * This method will select torisum
     */
    public void selectReason(String reason) {
        clickOnElement(selectTourisum);
        CustomListeners.test.log(Status.PASS, "click on" + selectTourisum);
        Reporter.log("select");
    }

    /**
     * This method for second reason
     */
    public void selectReason2(String reason2) {
        clickOnElement(selectReason2);
        CustomListeners.test.log(Status.PASS, "click on" + selectReason2);
        Reporter.log("select 2");

    }

    /**
     * This method will click on continue
     */
    public void setClickOnContinue2() {
        clickOnElement(clickOnContinue2);
        CustomListeners.test.log(Status.PASS,"select button"+clickOnContinue2);
        Reporter.log("select"+clickOnContinue2.toString());
    }

    /**
     * This method will verify message
     */
    public String verifyMessageOne() {
        Reporter.log("verify text");
        CustomListeners.test.log(Status.PASS,"verify text"+verifyMessageOne());
        return getTextFromElement(verifyMessageone);



    }

    /**
     * This method will select stay
     */
    public void clickOnStay() {
        clickOnElement(selectStay);
        CustomListeners.test.log(Status.PASS,"select stay"+selectStay);
        Reporter.log("click On stay"+selectStay.toString());
    }

    /**
     * This method will select button
     */
    public void clickOnContinueButton3() {
        clickOnElement(clickOnContinue3);
        CustomListeners.test.log(Status.PASS,"click on Button"+clickOnContinue3);
        Reporter.log("click On button");


    }
    /**
     * This method will palnning work For
     */
    public void planningWorkFor(){
        clickOnElement(planningWorkFor);
        Reporter.log("planning for stay");
        CustomListeners.test.log(Status.PASS,"planning for working"+planningWorkFor);
    }
    /**
     * This method will click On Button
     */
    public void clickOnContinue4(){
        clickOnElement(clickOnContinue4);
        Reporter.log("click On button"+clickOnContinue4.toString());
        CustomListeners.test.log(Status.PASS,"click On button"+clickOnContinue4);
    }
    /**
     * This method will verify second messase
     */
    public String verifySecondMessage(){
        Reporter.log("verify message");
        CustomListeners.test.log(Status.PASS,"verify text"+verifyseconMessage);
        return getTextFromElement(verifyseconMessage);
    }
    /**
     * This method will select reaosn 3
     */
    public void selectReason3(){
        clickOnElement(selectReason3);
        CustomListeners.test.log(Status.PASS,"select "+selectReason3);
        Reporter.log("select reason");
    }
    /**
     * This method will select perameter
     */
    public void selectParaMeter(){
        clickOnElement(selectPeraMeter);
    }
    /**
     * This method will verify second messase
     */
    public String verifyMessage3(){
        Reporter.log("verify message");
        CustomListeners.test.log(Status.PASS,"verify text"+verifyMessage3);
        return getTextFromElement(verifyMessage3);
}

}
