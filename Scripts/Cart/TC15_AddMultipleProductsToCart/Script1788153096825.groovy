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
 * TC15 - Menambahkan beberapa produk sekaligus ke cart
 * Expected: badge cart menunjukkan angka sesuai jumlah produk yang ditambahkan
 */
WebUI.openBrowser('')
WebUI.navigateToUrl(BASE_URL)
WebUI.setText(usernameInput(), 'standard_user')
WebUI.setText(passwordInput(), 'secret_sauce')
WebUI.click(loginButton())
WebUI.click(addToCartButtonByProduct('sauce-labs-backpack'))
WebUI.click(addToCartButtonByProduct('sauce-labs-bike-light'))
WebUI.click(addToCartButtonByProduct('sauce-labs-bolt-t-shirt'))
WebUI.verifyElementText(cartBadge(), '3')
WebUI.click(cartIcon())
WebUI.verifyElementPresent(cartItem(), 5)
WebUI.closeBrowser()
