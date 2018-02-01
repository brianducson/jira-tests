package controls

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.security.ProtectionDomain.JavaSecurityAccessImpl

import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.Wait
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.FluentWait
import java.util.function.Function;
import static java.util.concurrent.TimeUnit.*

import com.kms.katalon.core.logging.KeywordLogger


public class JSelect {
	KeywordLogger log = new KeywordLogger()
	
	private String type;
		
	private WebDriver driver = DriverFactory.getWebDriver();
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(10, SECONDS)
		.pollingEvery(1, SECONDS);
	
	public JSelect() {
	}
	
	public JSelect(String label) {
		this.type = driver.findElement(By.xpath(String.format(".//label[text()='%s']", label))).getAttribute("for"); 	
	}
	
	public JSelect(TestObject o) {
		this.type = WebUiBuiltInKeywords.findWebElement(o).getAttribute("for");
	}

	private void openDropDown() {
		driver.findElement(By.id(this.type)).click();
	}
	
	private void select(String text) {
		log.logInfo(text);
		WebElement input = driver.findElement(By.id(this.type));
		if (input.getAttribute("value").equals(text)) {
			return;
		}
		openDropDown();
		WebElement el = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.ajs-layer.box-shadow.active")));
		
		el.findElement(By.partialLinkText(text)).click();
	}
	
	@Keyword
	def selectByText(TestObject o, String optionText) {
		JSelect jselect = new JSelect(o);
		
		jselect.select(optionText);
	}
	
	@Keyword
	def selectByText(String labelSelect, String optionText) {
		JSelect jSelect = new JSelect(labelSelect);
		jSelect.select(optionText);
	}
	
}
