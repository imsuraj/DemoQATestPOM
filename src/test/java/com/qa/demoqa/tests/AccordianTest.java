package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Accordian;
import com.qa.demoqa.pages.Widgets;

public class AccordianTest extends BaseTest {
	
	public Widgets widgets;
	public Accordian accordian;
	
	@BeforeClass
	public void classSetUp() {
		widgets = homePage.doClickWidgets();
		accordian = widgets.doClickAccordian();
	}
	
	
	@Test
	public void accordianTest() throws InterruptedException {
		accordian.verifyAccordian();
	}
	
	
	
}
