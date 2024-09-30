package com.demoqa.pages.AlertsFramesPage;


import org.openqa.selenium.By;

public class AlertsPage extends Alerts_Frames_WindowsPage {
    private final By informationAlertButton = By.id("alertButton");
    private final By confirmationAlertButton = By.id("confirmButton");
    private final By confirmationResult = By.id("confirmResult");

    private final By promptAlertButton = By.id("promtButton");
    private final By promptAlertResult = By.id("promptResult");
    public void clickInformationAlertButton() {
        click(informationAlertButton);
    }

    public void clickConfirmationAlertButton() {
        click(confirmationAlertButton);
    }

    public String getConfirmationResult() {
        return find(confirmationResult).getText();
    }

    public void clickPromptAlertButton() {
        click(promptAlertButton);
    }

    public String getPromptResult() {
        return find(promptAlertResult).getText();
    }
}
