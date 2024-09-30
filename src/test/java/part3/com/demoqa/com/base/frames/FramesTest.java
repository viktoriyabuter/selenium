package part3.com.demoqa.com.base.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.com.base.BaseTest;

public class FramesTest extends BaseTest {
    @Test
    public void testFramesBigBox() {
        var framesPage = homePage.clickAlertsFramesWindows().clickFrames();
        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText, expectedBigBoxText);
    }

    @Test
    public void testFramesSmallBox() throws InterruptedException {
        var framesPage = homePage.clickAlertsFramesWindows().clickFrames();
        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText);
    }
}
