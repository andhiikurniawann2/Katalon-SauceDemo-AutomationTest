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
import static sauce.SauceObjects.*

/*
 * TC08 - Login dengan performance_glitch_user
 * Expected: login berhasil namun proses loading lebih lambat dari user biasa
 */
WebUI.openBrowser('')
WebUI.navigateToUrl(BASE_URL)
WebUI.setText(usernameInput(), 'performance_glitch_user')
WebUI.setText(passwordInput(), 'secret_sauce')
long startTime = System.currentTimeMillis()
WebUI.click(loginButton())
WebUI.verifyElementPresent(inventoryContainer(), 15)
long duration = System.currentTimeMillis() - startTime
WebUI.comment("Waktu loading setelah login: ${duration} ms")
WebUI.closeBrowser()
