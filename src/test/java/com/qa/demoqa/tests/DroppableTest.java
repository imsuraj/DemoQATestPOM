package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Droppable;
import com.qa.demoqa.pages.Interactions;
import com.qa.demoqa.util.Constants;

public class DroppableTest extends BaseTest {

	public Interactions interactions;
	public Droppable droppable;

	@BeforeClass
	public void classSetUp() {
		interactions = homePage.doClickInteractions();
		droppable =interactions.doClickDroppable();
	}
				


	@Test(priority = 1)
	public void simpleDroppableTest() {
		droppable.doSimpleDroppable(Constants.afterDropMessage);
	}
	
	@Test (priority = 2)
	public void acceptDroppableTest() {
		droppable.doAcceptDroppable(Constants.beforeDropMessage, Constants.afterDropMessage);
	}



}
