package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Elements;
import com.qa.demoqa.pages.Links;

public class LinkTest extends BaseTest{
	public Elements elements;
	public Links links;
	
	@BeforeClass
	public void classSetUp() {
		elements = homePage.doClickElements();
		links = elements.doClickLinkSubMenu();
	}
	
	@Test
	public void simpleLinkTest() {
		links.doClickLinks();
	}
	
	@Test
	public void dynamicLinkTest() {
		links.doClickDynamicLink();
	}
	
}
