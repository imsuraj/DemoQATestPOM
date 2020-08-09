package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Draggable;
import com.qa.demoqa.pages.Interactions;

public class DraggableTest extends BaseTest {

	public Interactions interactions;
	public Draggable draggable;

	@BeforeClass
	public void classSetUp() {
		interactions = homePage.doClickInteractions();
		draggable =interactions.doClickDraggable();
	}

	@Test(priority = 1)
	public void simpleDraggableTest() {
		draggable.doSimpleDrag(825, -18);
	}

	@Test (priority = 2)
	public void axisDraggableTest() {
		draggable.doAxisRestrictedDrag(400, 200);

	}

}
