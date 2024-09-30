package part3.com.demoqa.com.base.windows;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.com.base.BaseTest;

import static utilities.SwitchToUtility.*;

public class WindowsTests extends BaseTest {

    @Test
    public void testNewWindowURL() {
        var windowsPage = homePage.clickAlertsFramesWindows().clickWindows();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualUrl = getURL();
        String expectedUrl = "https://demoqa.com/sample";
        Assert.assertEquals(actualUrl, expectedUrl, "\n Actual and expected urls don't match \n");
    }
}
