package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Interactions;
import com.qa.demoqa.pages.Selectable;

public class SelectableTest extends BaseTest {
	
	public Interactions interactions;
	public Selectable selectable;
	
	@BeforeClass
	public void classSetUp() {
		interactions = homePage.doClickInteractions();
		selectable =interactions.doClickSelectable();
	}
	
	
	@Test
	public void selectableTest() {
	selectable.verifySelectableList(2);
	selectable.verifySelectableGrid(3);
	}
	
	
	
}
