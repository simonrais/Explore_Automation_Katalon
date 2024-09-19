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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Page_TextBox/header'))

WebUI.click(findTestObject('Object Repository/Page_TextBox/div_Elements'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_TextBox/span_Text Box'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_TextBox/li_Text Box'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_TextBox/input_Full Name_userName'), 'rais')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_TextBox/input_Email_userEmail'), 'rais@gmail.com')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_TextBox/textarea_Current Address_currentAddress'), 'text box')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_TextBox/textarea_Permanent Address_permanentAddress'), 'text box permanet address')

WebUI.scrollToElement(findTestObject('Page_TextBox/textarea_Permanent Address_permanentAddress'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Page_TextBox/button_Submit'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_TextBox/div_NameraisEmailraisgmail.comCurrent Address text box Permananet Address text box permanent address'), 
    2)

WebUI.delay(3)

WebUI.closeBrowser()

