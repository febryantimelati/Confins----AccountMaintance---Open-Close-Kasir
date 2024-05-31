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

TestData Datahohendy = findTestData('Data Files/Payment Reversal/Payment Reversal')

WebUI.click(findTestObject('Object Repository/Menu/Account Maintenance/Payment Reversal/Menu_Payment Reversal'))

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++)
	{
	if (Datahohendy.getValue('Use', baris) == 'Yes') {
		
		WebUI.setText(findTestObject('Object Repository/Menu/Account Maintenance/Payment Reversal/input_Agreement No'), Datahohendy.getValue('Agreement No', baris))
		
		WebUI.click(findTestObject('Object Repository/Menu/Account Maintenance/Payment Reversal/button_search'))
		
		WebUI.click(findTestObject('Object Repository/Menu/Account Maintenance/Payment Reversal/button_edit'))
		
		WebUI.click(findTestObject('Object Repository/Menu/Account Maintenance/Payment Reversal/button_Reverse'))
		
		// Batasan nilai maksimum yang diizinkan oleh tipe data integer
		def maxValue = Integer.MAX_VALUE
		
		// Buat objek Randoms
		def random = new Random()
		
		// Menghasilkan nilai acak dari rentang 1 sampai maxValue
		def randomValue = random.nextInt(maxValue) + 1
		
		// Set text input dengan nilai yang baru
		WebUI.setText(findTestObject("Object Repository/Menu/Account Maintenance/Payment Reversal/input_Reference No"), randomValue.toString())
		
		WebUI.setText(findTestObject('Object Repository/Menu/Account Maintenance/Payment Reversal/notes_payment_detail'), Datahohendy.getValue('Notes Payment Detail', baris))
		
		WebUI.click(findTestObject('Object Repository/Menu/Cashier/Payment Reversal/Reason Description/select_'+ Datahohendy.getValue('Reason Description', baris)))
		
		WebUI.setText(findTestObject('Object Repository/Menu/Account Maintenance/Payment Reversal/notes_approval'), Datahohendy.getValue('Notes Approval', baris))
		
		WebUI.click(findTestObject('Object Repository/Menu/Cashier/Payment Reversal/Approved By/By_'+ Datahohendy.getValue('Approved By', baris)))
		
//		WebUI.click(findTestObject('Object Repository/Menu/Account Maintenance/Payment Reversal/button_submit'))
//		
		
		}
	}





















