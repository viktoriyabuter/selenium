package com.demoqa.pages;

import com.demoqa.pages.AlertsFramesPage.Alerts_Frames_WindowsPage;
import com.saucedemo.pages.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private final By alertsFramesWindows =
            By.xpath("//*[contains(@class,'card-body')]/*[text() = 'Alerts, Frame & Windows']");

    public Alerts_Frames_WindowsPage clickAlertsFramesWindows() {
        find(alertsFramesWindows).click();
        return new Alerts_Frames_WindowsPage();
    }
}
