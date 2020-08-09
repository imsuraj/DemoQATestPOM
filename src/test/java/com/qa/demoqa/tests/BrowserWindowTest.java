package com.qa.demoqa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.AlertFrameWindows;
import com.qa.demoqa.pages.BrowserWindows;
import com.qa.demoqa.util.Constants;

public class BrowserWindowTest extends BaseTest{
	
	public BrowserWindows browserWindows;
	public AlertFrameWindows alertFrameWindows;
	
	@BeforeClass
	public void classSetUp() {
		alertFrameWindows = homePage.doClickAlertFrameWindows();
		browserWindows = alertFrameWindows.doClickbrowserWindowsSideMenu();
	}
	
	
	@Test(priority = 1)
	public void newTabTest() {
		browserWindows.clickNewTab(Constants.message);
	}
	
	@Test(priority = 2)
	public void newWindowTest() throws InterruptedException {
		browserWindows.clickNewWindow(Constants.message);
	}
	
	@Test(priority = 3, enabled = false)
	public void newWindowMessageTest() throws InterruptedException {
		browserWindows.clickNewWindowMessage(Constants.expectedNewWinMsg);
	}
}
