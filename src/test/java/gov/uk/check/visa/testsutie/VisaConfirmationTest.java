package gov.uk.check.visa.testsutie;

import gov.uk.check.visa.pages.StartPage;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends BaseTest {

    StartPage startPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        startPage = new StartPage();


    }

    @Test(groups = {"sanity","regression"})
    public void anAustralianCominToUKForTourism() {

        // Click on start button
        startPage.clickOnStartButton();


        // Select a Nationality 'Australia'
        startPage.selectNationality("Australia");


        // Click on Continue button
        startPage.clickOnContinueButton();


        // Select reason 'Tourism'
        startPage.selectReason("Tourism or visiting family and friends");


        // Click on Continue button
        startPage.setClickOnContinue2();

        //  verify result 'You will not need a visa to come to the UK'
        String expected = "You will not need a visa to come to the UK";
        String actual = startPage.verifyMessageOne();
        Assert.assertEquals(expected, actual, "invalid");


    }

    @Test(groups = {"sanity","smoke","regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {

        // Click on start button
        startPage.clickOnStartButton();

        // Select a Nationality 'Chile'
        startPage.selectNationality("Chile");

        //  Click on Continue button
        startPage.clickOnContinueButton();

        // Select reason 'Work, academic visit or business'
        startPage.selectReason2("Work, academic visit or business");


        // Click on Continue button
        startPage.setClickOnContinue2();

        //  Select intendent to stay for 'longer than 6 months'
        startPage.clickOnStay();


        // Click on Continue button
        startPage.clickOnContinueButton3();


        //  Select have planning to work for 'Health and care professional'
        startPage.planningWorkFor();


        //  Click on Continue button
        startPage.clickOnContinue4();


        //  verify result 'You need a visa to work in health and care'
        String expectedMessage = "You need a visa to work in health and care";
        String actualMessage = startPage.verifySecondMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "invalid message");

    }

    @Test(groups = {"regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {

        // Click on start button
        startPage.clickOnStartButton();

        // Select a Nationality 'Colombia'
        startPage.selectNationality("Colombia");


        //  Click on Continue button
        startPage.clickOnContinueButton();

        //  Select reason 'Join partner or family for a long stay'
        startPage.selectReason3();


        //  Click on Continue button

        startPage.setClickOnContinue2();
        //   Select state My partner of family member have uk immigration status 'yes'
        startPage.selectParaMeter();


        //   Click on Continue button

        startPage.clickOnContinue4();

        //  verify result 'You’ll need a visa to join your family or partner in the UK'
        Assert.assertEquals(startPage.verifyMessage3(),"You’ll need a visa to join your family or partner in the UK","invalid");


}

}
