package com.qa.demoqa.base;

/**
 * @author SurajAnand
 *
 */

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.demoqa.pages.HomePage;

public class BaseTest {

	public WebDriver driver;
	public BasePage basePage;
	public HomePage homePage;
	public Properties prop;

	@BeforeTest
	public void SetUp() {

		basePage = new BasePage();
		prop = basePage.init_prop();
		driver = basePage.init_driver(prop);
		homePage = new HomePage(driver);

	}


	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
