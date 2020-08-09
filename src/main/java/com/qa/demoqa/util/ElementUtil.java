package com.qa.demoqa.util;


/**
 * @author SurajAnand
 *
 */


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ElementUtil {
	WebDriver driver;


	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	

	//method to create web element on the basis of by locator.
	public WebElement getElement(By locator) {
		WebElement element = null;
		//System.out.println("locator is : " + locator);
		try {
		element = driver.findElement(locator);
		}catch (Exception e){
			System.out.println("element could not be created..." + locator);
		}
		return element;
	}
	
	public List<WebElement> getElements(By locator) {
		List<WebElement> elementList = driver.findElements(locator);
		return elementList;
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public void doSendKeys(By locator, int value) {
		getElement(locator).sendKeys(String.valueOf(value));
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
		
	}
	
	
	public Alert doSwitchToAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	
	public void doPressEnterKey(By locator) {
		getElement(locator).sendKeys(Keys.RETURN);
	}
	
	
	
	//****************Frame Utisl ***********
	
	public void doSwitchFrame(int index) {
		driver.switchTo().frame(index);
	}
	
	public void doSwitchFrame(String name) {
		driver.switchTo().frame(name);
	}
	
	public void doSwitchFrame(By locator) {
		WebElement element = getElement(locator);
		driver.switchTo().frame(element);
	}
	
	
	//**********************Actions Methods ********************
	public void doActionsSendKeys(By locator, String value) {
		Actions action = new Actions(driver);

		action.sendKeys(getElement(locator), value).build().perform();
	}
	
	public void doActionSelectDropDownUsingDownAndEnterKey() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).build().perform();
		action.sendKeys(Keys.RETURN).build().perform();
	}
	
	

	public void doActionsClick(By locator) {
		Actions action = new Actions(driver);

		action.click(getElement(locator)).build().perform();
	}
	
	public void doRightClick(By locator) {
		Actions action = new Actions(driver);
		action.contextClick(getElement(locator)).perform();
	}
	
	public void doDoubleClick(By locator) {
		Actions action = new Actions(driver);
		action.doubleClick(getElement(locator)).perform();
	}

	//method to drag and drop 
	public void doActionsDragAndDrop(By sourceLocator, By targetLocator) {
		Actions action = new Actions(driver);
		WebElement sourceElement = getElement(sourceLocator);
		WebElement targetElement = getElement(targetLocator);
		
		action.dragAndDrop(sourceElement, targetElement).build().perform();
		//action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
	}
	
	public void doActionsDragAndDropUsingMoveToElement(By sourceLocator, By targetLocator) {
		Actions action = new Actions(driver);
		WebElement sourceElement = getElement(sourceLocator);
		WebElement targetElement = getElement(targetLocator);
		
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
	}
	
	
	
	// **********************************Drop Down Utils*********************************
	
	
	
	public void doSelectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public void doSelectByindex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public int getDropDownOptionCount(By locator) {
		return getDropDownOptions(locator).size();
	}
	
	public List<String> getDropDownOptions(By locator) {
		List<String> optionList = new ArrayList<String>();
		
		Select select = new Select(getElement(locator));
		
		List<WebElement> dropDownList = select.getOptions();
		
		for (int i = 0; i < dropDownList.size(); i++) {
			String text = dropDownList.get(i).getText();
			optionList.add(text);
		}
		return optionList;
	}
	
	
	public void selectDropDownValueWithSelect(By locator, String value) {
		Select select = new Select(getElement(locator));
		List< WebElement> optionList = select.getOptions();
		
		
		for (int i = 0; i < optionList.size(); i++) {
			String text = optionList.get(i).getText();
			if (text.equals(value)) {
				optionList.get(i).click();
				break;
			}
		}
	}
	
	public void selectDropDownValueWithoutSelect(By locator, String value) {
		List<WebElement> optionList =  getElements(locator);
		
		
		for (int i = 0; i < optionList.size(); i++) {
			String text = optionList.get(i).getText();
			if (text.equals(value)) {
				optionList.get(i).click();
				break;
			}
		}
	}
	
	
	public  void selectChoicesValue(By locator, String... value) {
		List<WebElement> choiceList =  getElements(locator);
		
		if (!value[0].equalsIgnoreCase("ALL")) {
			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int k = 0; k < value.length; k++) {
					if (text.equals(value[k])) {
						choiceList.get(i).click();
						break;
					}
				}
			}
		}
		// select all the values:
		else {
			try {
				for (int all = 0; all < choiceList.size(); all++) {
					choiceList.get(all).click();
				}
			} catch (Exception e) {

			}
		}
	}
	
	
	// **********************************Drop Down Utils*********************************
	
	public String doGetPageTitleWithContains(int timeout, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	public String doGetPageTitleWithIsTitle(int timeout, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
	
	public void doGetCurrentPageUrl(int timeout, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.urlContains(urlValue));
		driver.getCurrentUrl();
	}
	
	public WebElement waitForElementPresent(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public WebElement waitForElementToBeClickable(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	public Boolean waitForInvisibilityOfElementLocated(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	
	
	public WebElement waitForElementToBeVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
	
	public List<WebElement> visibilityOfAllElements(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	
	
	
	public void clickWhenReady(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();;
	}
	
	
	
	public Alert waitForAlertPresent(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	
	public boolean isElementDisplayed(By locator, int timeout) {
		WebElement element = null;
		boolean flag = false;
		for (int i = 0; i < timeout; i++) {

			try {
				element = driver.findElement(locator);
				flag = element.isDisplayed();
				break;
			} catch (Exception e) {
				System.out.println("waiting for element to be present on the page -->" + i + "secs");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
				}
			}

		}
		return flag;

	}
	
	
	//******************* FluentWait Utils ***********************
		public WebElement waitForElementWithFluentWaitConcept(By locator, int timeOut){
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(2))
					.ignoring(NoSuchElementException.class);
			
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		
		public WebElement waitForElementWithFluentWait(final By locator, int timeOut) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(2))
					.ignoring(NoSuchElementException.class);

			WebElement element = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(locator);
				}
			});
			
			return element;
		}
}
