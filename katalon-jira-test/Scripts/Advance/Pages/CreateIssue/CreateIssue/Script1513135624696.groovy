import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat

CustomKeywords.'controls.JSelect.selectByText'(findTestObject('Page - CreateIssue/label_Project'), project)

CustomKeywords.'controls.JSelect.selectByText'(findTestObject('Page - CreateIssue/label_IssueType'), issue_type)

def date = new Date()

def simpleFormat = new SimpleDateFormat('MMddyyyy_HHmmss')

WebUI.setText(findTestObject('Page - CreateIssue/input_summary'), (summary + ' - ') + simpleFormat.format(date))

WebUI.switchToFrame(findTestObject('Page - CreateIssue/iframe_description'), 0)

WebUI.setText(findTestObject('Page - CreateIssue/description'), description)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Page - CreateIssue/button_Create'))

