package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.AlertFrameWindows;
import com.qa.demoqa.pages.NestedFrames;

public class NestedFramesTest extends BaseTest{
	public AlertFrameWindows alertFrameWindows;
	public NestedFrames nestedFrames;

	@BeforeClass
	public void classSetUp() {
		alertFrameWindows = homePage.doClickAlertFrameWindows();
		nestedFrames = alertFrameWindows.doClickNestedFramesSideMenu();
	}

	@Test
	public void framesTest() {
		nestedFrames.verifyNestedFrame();
	}

}
