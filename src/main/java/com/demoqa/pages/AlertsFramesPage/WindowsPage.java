package com.demoqa.pages.AlertsFramesPage;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.SwitchToUtility.*;

public class WindowsPage extends Alerts_Frames_WindowsPage {
        private final By newWindowButton = By.id("windowButton");

        public void clickNewWindowButton() {
            click(newWindowButton);
        }

        public void switchToNewWindow() {
            //step 1: get the current "Main" Window Handle

            String currentHandle = driver.getWindowHandle();
            System.out.println("Main Window ID: " + currentHandle + "\n");

            //step 2: get all window handles
            
            Set<String> allHandles = driver.getWindowHandles();
            System.out.println("Number of open Windows: " + allHandles.size() + "\n");

            for (String handle : allHandles) {
                if (currentHandle.equals(handle)) {
                    System.out.println("1st Window ID:" + handle);
                } else {
      //              driver.switchTo().window(handle);
                    switchToWindow(handle);
                    System.out.println("2st Window ID:" + handle);
                }
            }

            //step 3: switch to the new window using the window handle
        }
}
