import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://vivblind.play2pay.me/volunteer/register')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Email Address _EMAIL'), 'mkfluke@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ -/input_Password _PASSWORD'), 'p4y+y39Ir5NU6yy7FRSd0Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ -/input_Confirm Password _passwo'), 'p4y+y39Ir5NU6yy7FRSd0Q==')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_First Name Thai _FIRST_N'), 'ชื่อทดสอบ')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Last Name Thai _LAST_NAM'), 'นามสกุลทดสอบ')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_First Name Eng _FIRST_NA'), 'FirstNameTest')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Last Name Eng _LAST_NAME'), 'LastNameTest')

WebUI.click(findTestObject('Object Repository/Page_ -/th_February 1994'))

WebUI.doubleClick(findTestObject('Object Repository/Page_ -/th_'))

WebUI.click(findTestObject('Object Repository/Page_ -/span_Nov'))

WebUI.click(findTestObject('Object Repository/Page_ -/td_19'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_Select ReligionBuddhism'), 'พุทธ', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_Select Educational Back'), 'ปริญญาตรี', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_Select OccupationFarmer'), 'อื่นๆ', true)

WebUI.setText(findTestObject('Object Repository/Page_ -/input_House No _ADDRESS_NO'), '28')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Village No. _ADDRESS_MOO'), '1')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Road _ADDRESS_ROAD'), 'ช่อแฮ')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_Select Province'), '42', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_'), '625', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_ (1)'), '31774', true)

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Postal Code _ADDRESS_POS'), '54000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ -/select_  Select Currently Stat'), 'กำลังทำงาน', true)

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Home Address _ADDRESS_AL'), '28 หมู่ 1 จ.แพร่')

WebUI.setText(findTestObject('Object Repository/Page_ -/input_Mobile Number _CELL_PHON'), '0123456789')

WebUI.click(findTestObject('Object Repository/Page_ -/input_Fax Number _submit'))

