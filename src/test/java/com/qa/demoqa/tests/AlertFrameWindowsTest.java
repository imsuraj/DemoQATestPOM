package com.qa.demoqa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.AlertFrameWindows;

public class AlertFrameWindowsTest extends BaseTest {
	
	public AlertFrameWindows alertFrameWindows;
	
	@BeforeClass
	public void classSetUp() {
		alertFrameWindows = homePage.doClickAlertFrameWindows();
	}
	
	@Test(priority = 1)
	public void clickBrowserWindowsTest() {
		alertFrameWindows.doClickbrowserWindowsSideMenu();
	}
	
	
	@Test(priority = 2)
	public void clickAlertTest() {
		alertFrameWindows.doClickAlertsSideMenu();
	}
	
	@Test(priority = 3)
	public void clickFramesTest() {
		alertFrameWindows.doClickFrameSideMenu();
	}
	
	@Test(priority = 4)
	public void clickNestedFramesTest() {
		alertFrameWindows.doClickNestedFramesSideMenu();
		
	}
	
	@Test(priority = 5)
	public void clickModalDialogsTest() {
		alertFrameWindows.doClickModalDialogsMenu();
		
	}
	
	
	
	
	
}
