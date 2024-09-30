package com.demoqa.pages.AlertsFramesPage;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class Alerts_Frames_WindowsPage extends HomePage {
    private final By alertsMenuItem = By.xpath("//span[text() = 'Alerts']");
    private final By framesMenuItem = By.xpath("//span[text() = 'Frames']");
    private final By windowsMenuItem = By.xpath("//span[text() = 'Browser Windows']");

    public AlertsPage clickAlerts() {
        find(alertsMenuItem).click();
        return new AlertsPage();
    }

    public FramesPage clickFrames() {
        find(framesMenuItem).click();
        return new FramesPage();
    }

    public WindowsPage clickWindows() {
        find(windowsMenuItem).click();
        return new WindowsPage();
    }
}
