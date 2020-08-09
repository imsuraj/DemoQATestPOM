package com.qa.demoqa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.AlertFrameWindows;
import com.qa.demoqa.pages.Alerts;
import com.qa.demoqa.util.Constants;

public class AlertsTest extends BaseTest{

	public Alerts alerts;
	public AlertFrameWindows alertFrameWindows;

	@BeforeClass
	public void classSetUp() {
		alertFrameWindows = homePage.doClickAlertFrameWindows();
		alerts = alertFrameWindows.doClickAlertsSideMenu();
	}
	
	
	@Test
	public void seeAlertTest() {
		alerts.clickSeeAlert(Constants.seeAlertMessage);
	}
	

	@Test
	public void timeAlertTest() throws InterruptedException {
		alerts.clickTimeAlert(Constants.timeAlertMessage);
	}
	
	
	@Test
	public void confirmBoxAlertTest() throws InterruptedException {
		alerts.clickConfirmBoxAlert(Constants.confirmBoxAlertMessage);
	}
	
	@Test
	public void promptBoxAlertTest() throws InterruptedException {
		alerts.clickPropmptBoxAlert(Constants.promptBoxAlertMessage, "Suraj");
	}
}
