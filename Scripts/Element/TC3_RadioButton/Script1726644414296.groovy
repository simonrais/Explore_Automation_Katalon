import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/RadioButton/div_Elements'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('RadioButton/li_Radio Button'), 2)

WebUI.click(findTestObject('Object Repository/RadioButton/li_Radio Button'))

WebUI.delay(2)

WebUI.verifyElementNotChecked(findTestObject('RadioButton/div_Yes'), 0)

WebUI.click(findTestObject('RadioButton/div_Yes'))

WebUI.verifyElementVisible(findTestObject('RadioButton/div_Yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementNotChecked(findTestObject('RadioButton/div_Impressive'), 0)

WebUI.click(findTestObject('RadioButton/div_Impressive'))

WebUI.verifyElementVisible(findTestObject('RadioButton/div_Impressive'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotChecked(findTestObject('RadioButton/div_No'), 0)

WebUI.click(findTestObject('RadioButton/div_No'))

WebUI.verifyElementVisible(findTestObject('RadioButton/div_Impressive'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

