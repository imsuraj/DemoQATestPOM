package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Tabs;
import com.qa.demoqa.pages.Widgets;

public class TabsTest extends BaseTest {
	
	public Widgets widgets;
	public Tabs tabs;
	
	@BeforeClass
	public void classSetUp() {
		widgets = homePage.doClickWidgets();
		tabs = widgets.doClickTabs();
	}
	
	
	@Test
	public void tabTest() throws InterruptedException {
		tabs.clickOriginTab();
		tabs.clickUseTab();
		tabs.clickWhatTab();
	}
	
	
	
}
