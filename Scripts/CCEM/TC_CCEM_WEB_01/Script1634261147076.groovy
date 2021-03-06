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

WebUI.navigateToUrl('https://daekyo-ccm.zendesk.com/access/unauthenticated?return_to=https%3A%2F%2Fdaekyo-ccm.zendesk.com%2Fagent')

WebUI.setText(findTestObject('CCEM/OR_CCEM_WEB_01/input__useremail'), 'seunghee_kim@daekyo.co.kr')

WebUI.setEncryptedText(findTestObject('CCEM/OR_CCEM_WEB_01/input__userpassword'), 'vMf77duh+KrTtHmfJtO4mg==')

WebUI.click(findTestObject('CCEM/OR_CCEM_WEB_01/input__commit'))

WebUI.click(findTestObject('CCEM/OR_CCEM_WEB_01/svg_Zendesk_ember2622'))

WebUI.click(findTestObject('CCEM/OR_CCEM_WEB_01/a_ (2)'))

WebUI.click(findTestObject('CCEM/OR_CCEM_WEB_01/div_ (2)'))

WebUI.setText(findTestObject('CCEM/OR_CCEM_WEB_01/input__searchInputCheck (2)'), '서지연')

WebUI.setText(findTestObject('CCEM/OR_CCEM_WEB_01/input__searchInputCheck_1 (2)'), '1049')

WebUI.doubleClick(findTestObject('CCEM/OR_CCEM_WEB_01/div_010-2382-1049'))

WebUI.click(findTestObject('CCEM/OR_CCEM_WEB_01/figure__ProfileMenu__StyledAvatar-sc-1ck6yn_754263'))

WebUI.click(findTestObject('CCEM/OR_CCEM_WEB_01/li_'))

WebUI.closeBrowser()

