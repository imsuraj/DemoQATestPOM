package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.AlertFrameWindows;
import com.qa.demoqa.pages.ModalDialogs;

public class ModalDialogsTest extends BaseTest{
	public AlertFrameWindows alertFrameWindows;
	public ModalDialogs modalDialogs;

	@BeforeClass
	public void classSetUp() {
		alertFrameWindows = homePage.doClickAlertFrameWindows();
		modalDialogs = alertFrameWindows.doClickModalDialogsMenu();
	}

	@Test
	public void smallModalDialogsTest() {
		modalDialogs.verifySmallModalDialog();

	}
	
	
	@Test
	public void largeModalDialogsTest() {
		modalDialogs.verifyLargeModalDialog();

	}

}
