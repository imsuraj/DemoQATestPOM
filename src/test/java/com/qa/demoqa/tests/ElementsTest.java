package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Elements;

public class ElementsTest extends BaseTest{
	public Elements elements;
	
	
	@BeforeClass
	public void classSetUp() {
		elements = homePage.doClickElements();
	}
	
	@Test
	public void clickTextBoxTest() {
		elements.doClickTextBoxSideSubMenu();
	}
	
}
