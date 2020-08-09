package com.qa.demoqa.tests;


/**
 * @author SurajAnand
 *
 */


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoqa.base.BaseTest;
import com.qa.demoqa.pages.Slider;
import com.qa.demoqa.pages.Widgets;

public class SliderTest extends BaseTest {
	
	public Widgets widgets;
	public Slider slider;
	
	@BeforeClass
	public void classSetUp() {
		widgets = homePage.doClickWidgets();
		slider = widgets.doClickSlider();
	}
	
	
	@Test
	public void sliderTest() {
		slider.verifySlider(100, 0);
	}
	
	
	
}
