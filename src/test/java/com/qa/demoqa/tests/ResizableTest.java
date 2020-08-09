package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Interactions;
import com.qa.demoqa.pages.Resizable;

public class ResizableTest extends BaseTest {

	public Interactions interactions;
	public Resizable resizable;

	@BeforeClass
	public void classSetUp() {
		interactions = homePage.doClickInteractions();
		resizable =interactions.doClickResizable();
	}


	@Test
	public void resizableBoxTest() {
		resizable.verifyResizableBox(250, 250);
	}
	
	@Test 
	public void resizableTest() {
		resizable.verifyResizable(200, 200);
	}



}
