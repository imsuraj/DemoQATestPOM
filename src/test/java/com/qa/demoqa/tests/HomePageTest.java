package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.util.Constants;

public class HomePageTest extends BaseTest{
	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.getHomePagetitle();
		Assert.assertEquals(homePageTitle, Constants.Home_Page_Title, "Title does not match.");
	}
	
	@Test(priority = 2)
	public void verifyElementsIsPresentTest() {
		Assert.assertTrue(homePage.verifyElementsIsPresent(), "Elements is missing in the page.");
	}
	
	@Test(priority = 3)
	public void verifyElementsClickTest() {
		homePage.doClickElements();
	}
}
