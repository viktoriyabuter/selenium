package part3.com.demoqa.com.base.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.com.base.BaseTest;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {

    public void assertInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.clickAlertsFramesWindows().clickAlerts();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\n Actual message doesn't match the expected \n");
        acceptAlert();
    }


    public void testConfirmationAlert() {
        String expectedConfirmationResult = "You selected Cancel";
        var alertsPage = homePage.clickAlertsFramesWindows().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        Assert.assertEquals(alertsPage.getConfirmationResult(), expectedConfirmationResult,
                "\n Actual result doesn't match the expected \n");
    }

    public void testPromptAlert() {
        String expectedConfirmationResult = "You entered text";
        var alertsPage = homePage.clickAlertsFramesWindows().clickAlerts();
        alertsPage.clickPromptAlertButton();
        setAlert();
        acceptAlert();
        Assert.assertEquals(alertsPage.getPromptResult(), expectedConfirmationResult,
                "\n Actual result doesn't match the expected \n");
    }
}
