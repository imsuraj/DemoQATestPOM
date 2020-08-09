package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Menu;
import com.qa.demoqa.pages.Widgets;

public class MenuTest extends BaseTest {
	
	public Widgets widgets;
	public Menu menu;
	
	@BeforeClass
	public void classSetUp() {
		widgets = homePage.doClickWidgets();
		menu = widgets.doClickMenu();
	}
	
	
	@Test
	public void menuTest() throws InterruptedException {
		menu.verifyMainItemOne();
		menu.verifyMainItemTwo();
		menu.verifyMainItemThree();
	}
	
	
	
}
