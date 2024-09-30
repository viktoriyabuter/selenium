package com.demoqa.pages.AlertsFramesPage;

import org.openqa.selenium.By;
import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage {
        private final By textInFrame = By.id("sampleHeading");
        private final String iFrameBigBox = "frame1";
        private final int iFrameSmallBoxIndex = 3;

        private final By smallBox = By.xpath("//div[@id = 'frame2Wrapper']/iframe");


        private void switchToBigBox() {
            switchToFrameString(iFrameBigBox);
        }

        private void switchToSmallBox() throws InterruptedException {
 //           switchToFrameIndex(iFrameSmallBoxIndex);
            switchToFrameWebElement(find(smallBox));
        }

        public String getTextInBigFrame() {
            switchToBigBox();
            String bigFrameText = find(textInFrame).getText();
            System.out.println("Big Frame text: " + bigFrameText);
            switchToDefaultPage();
            return bigFrameText;
        }

        public String getTextInSmallFrame() throws InterruptedException {
            switchToSmallBox();
            String smallFrameText = find(textInFrame).getText();
            System.out.println("Small Frame text: " + smallFrameText);
            switchToDefaultPage();
            return smallFrameText;
        }
}
