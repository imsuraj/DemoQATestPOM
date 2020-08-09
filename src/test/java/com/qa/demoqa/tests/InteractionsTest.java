package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Interactions;

public class InteractionsTest extends BaseTest {
	
	public Interactions interactions;
	
	@BeforeClass
	public void classSetUp() {
		interactions = homePage.doClickInteractions();
	}
	
	@Test(priority = 1)
	public void clickSortableTest() {
		interactions.doClickSortable();
	}
	
	
	@Test(priority = 2)
	public void clickSelectableTest() {
		interactions.doClickSelectable();
	}
	
	
	@Test(priority = 3)
	public void clickResizableTest() {
		interactions.doClickResizable();
	}
	
	@Test(priority = 4)
	public void clickDroppableTest() {
		interactions.doClickDroppable();
	}
	
	
	@Test(priority = 5)
	public void clickDraggableTest() {
		interactions.doClickDraggable();
	}
	
	
	
	
	
	
	
	
}
