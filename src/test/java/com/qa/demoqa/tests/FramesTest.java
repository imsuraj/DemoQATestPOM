package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.AlertFrameWindows;
import com.qa.demoqa.pages.Frames;

public class FramesTest extends BaseTest{
	public AlertFrameWindows alertFrameWindows;
	public Frames frames;

	@BeforeClass
	public void classSetUp() {
		alertFrameWindows = homePage.doClickAlertFrameWindows();
		frames = alertFrameWindows.doClickFrameSideMenu();
	}

	@Test
	public void framesTest() {
		frames.verifyFrame();

	}

}
