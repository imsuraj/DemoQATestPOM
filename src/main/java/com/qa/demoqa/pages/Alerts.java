package com.qa.demoqa.pages;


/**
 * @author SurajAnand
 *
 */


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.demoqa.base.BasePage;
import com.qa.demoqa.util.ElementUtil;

public class Alerts extends BasePage{
	private WebDriver driver;

	public Alerts(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(this.driver);
	}


	By alertElem = By.id("alertButton");
	By timeAlertElem = By.id("timerAlertButton");

	By confirmBtnELem = By.id("confirmButton");
	By confirmResultElem = By.id("confirmResult");

	By promptBtnElem = By.id("promtButton");
	By promptResultMsgElem = By.id("promptResult");


	public void clickSeeAlert(String message) {
		eu.doClick(alertElem);
		verifyAlertMessage(message);
	}

	public void clickTimeAlert(String message) throws InterruptedException {
		eu.doClick(timeAlertElem);
//		Thread.sleep(6000);
		Alert alert = eu.waitForAlertPresent(10);
		Assert.assertEquals(alert.getText(), message);
//		verifyAlertMessage(message);
	}

	public void clickConfirmBoxAlert(String message) throws InterruptedException {
		eu.doClick(confirmBtnELem);

		Alert alert = eu.waitForAlertPresent(5);
		String alertText = alert.getText();
		System.out.println(alertText);

		if (alertText.equals(message)) {
			System.out.println("Correct alert message");
			alert.accept();
			Assert.assertEquals(eu.doGetText(confirmResultElem), "You selected Ok");
		}else {
			System.out.println("Wrong alert message");
			alert.dismiss();
			Assert.assertEquals(eu.doGetText(confirmResultElem), "You selected Cancel");
		}

		driver.switchTo().defaultContent();
	}

	public void clickPropmptBoxAlert(String message, String name) throws InterruptedException {
		eu.doClick(promptBtnElem);

		Alert alert = eu.waitForAlertPresent(5);
		String alertText = alert.getText();
		System.out.println(alertText);

		if (alertText.equals(message)) {
			System.out.println("Correct alert message");
			alert.sendKeys(name);
			alert.accept();
			Assert.assertEquals(eu.doGetText(promptResultMsgElem), "You entered " +name);
		}else {
			System.out.println("Wrong alert message");
			alert.dismiss();
			//Assert.assertEquals(eu.doGetText(promptResultMsgElem), "");
		}

		driver.switchTo().defaultContent();
	}


	public  void verifyAlertMessage(String message) {
		Alert alert = eu.waitForAlertPresent(5);
		String alertText = alert.getText();
		System.out.println(alertText);

		if (alertText.equals(message)) {
			System.out.println("Correct alert message");
		}else {
			System.out.println("Wrong alert message");
		}

		alert.accept();
		driver.switchTo().defaultContent();
	}
}
