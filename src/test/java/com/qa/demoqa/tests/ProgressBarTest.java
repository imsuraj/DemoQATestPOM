package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.ProgressBar;
import com.qa.demoqa.pages.Widgets;

public class ProgressBarTest extends BaseTest {
	
	public Widgets widgets;
	public ProgressBar progressBar;
	
	@BeforeClass
	public void classSetUp() {
		widgets = homePage.doClickWidgets();
		progressBar = widgets.doClickProgress();
	}
	
	
	@Test
	public void progressBarTest() {
		progressBar.verifyProgressBar();
		progressBar.clickResetButton();
		
	}
	
	
	
}
