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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.click(findTestObject('Object Repository/TC4_OR/Page_Facebook  log in or sign up/div_Create an accountIts quick and easydiv _c47818'))

WebUI.setText(findTestObject('Object Repository/TC4_OR/Page_Facebook  log in or sign up/input_An error occurred Please try again_firstname'), 
    'Abdul')

WebUI.setText(findTestObject('Object Repository/TC4_OR/Page_Facebook  log in or sign up/input_An error occurred Please try again_lastname'), 
    'hai')

WebUI.setText(findTestObject('Object Repository/TC4_OR/Page_Facebook  log in or sign up/input_An error occurred Please try again_re_156e42'), 
    '0345343212')

WebUI.setEncryptedText(findTestObject('Object Repository/TC4_OR/Page_Facebook  log in or sign up/input_An error occurred Please try again_re_976ced'), 
    'aeHFOx8jV/A=')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC4_OR/Page_Facebook  log in or sign up/select_MonthJanFebMarAprMayJunJulAugSeptOctNovDec'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC4_OR/Page_Facebook  log in or sign up/select_Year20192018201720162015201420132012_f545cb'), 
    '1998', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC4_OR/Page_Facebook  log in or sign up/select_Day123456789101112131415161718192021_40ab5b'), 
    '23', true)

WebUI.click(findTestObject('Object Repository/TC4_OR/Page_Facebook  log in or sign up/input_Female_sex'))

WebUI.click(findTestObject('Object Repository/TC4_OR/Page_Facebook  log in or sign up/button_Sign Up'))

WebUI.closeBrowser()

