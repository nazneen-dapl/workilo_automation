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
import com.kms.katalon.core.webui.keyword.builtin.ScrollToElementKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.workilo.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/a_Log In'))

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_email_address'), 'nazneen.digitalaptec@gmail.com',
	FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_password'), 'admin#123', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_button'))
WebUI.scrollToElement(findTestObject('Object Repository/Edit Listing/Edit Button'), 0)
WebUI.click(findTestObject('Object Repository/Edit Listing/Edit Button'))
//WebUI.click(findTestObject('Add Listing/Page_Workilo  Service Provider Dash (2)/h2_Services you are offering'))
//WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Service Provider Dash/i_add-icon'))

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_title'), 'Tiles clean', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/select_Please SelectAssemblyCr'),
	'84', true)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), 'tiles clean', FailureHandling.STOP_ON_FAILURE)
WebUI.sendKeys(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), Keys.chord(Keys.ENTER),FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), 'tiles clean', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), 'tiles clean', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), Keys.chord(Keys.ENTER))

//WebUI.leftClick(findTestObject('Add Listing/Page_Workilo  Create Listing (2)/div_service or gig details    _1'))
//WebUI.scrollToElement(findTestObject('Add Listing/Page_Workilo  Create Listing (2)/input_price'), '100')
//WebUI.scrollToElement(findTestObject('Add Listing/Create listing (2)/input_price'), '100')
WebUI.scrollToPosition(0, 350)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/textarea_description'), 'tiles clean, tiles clean, tiles clean')

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_price'), '1.0', FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 350)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/textarea_description_material'),
	'cc')

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/select_Miles willing to travel'),
	'5', true)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_where_located'), 'Kol',
	FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_how_many_hours'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 1000)

////div[@class='add-photo-section']
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_image-upload1'), 'C:\\Users\\Asset-192\\Desktop\\sample images\\test.jpg',
	FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 5)
WebUI.scrollToElement(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 5)
/*
WebUI.waitForElementClickable(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 5)
WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'))

*/
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'),5)
//WebUI.click(findTestObject('Add Listing/Page_Workilo  Service Provider Dash (2)/span_menu-trigger'))
WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/a_Sign Out'))

//WebUI.click(findTestObject('Add Listing/Page_Workilo  Welcome (2)/button_OK'))
WebUI.closeBrowser()

