package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.TestNGUtils;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.KMABase;

public class P10_Maintenance extends KMABase {

	public P10_Maintenance(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test =test;
		
		
		waitUntilElementVisisble("//*[@id='maintenancetab']");
		if(!verifyTitle("Maintenance")){
			reportStep("This is not Kia Owners Portal", "FAIL");	
		}		
	}
	
	public 	P10_Maintenance preferredDealer(String xpathValue, String dealerDetails) {
		waitUntilElementVisisble("(//*[@class='settings-icon'])[4]");
		clickByXpathJavascriptExecutor("(//*[@class='settings-icon'])[3]");
		waitUntilElementVisisble("//*[@name='dealer_map_search']");
		enterByXpathJSExecutor(xpathValue, dealerDetails);
		return this;
	}
	
	
	public P10_Maintenance nextServiceMiles(String expectedValue) {
		waitUntilElementVisisble("(//*[@class='settings-icon'])[4]");
		clickByXpath("(//*[@class='icon-arrow-right'])[1]");
		//Assert.assertTrue(driver.findElement(By.xpath("//*[@class='badge verified']")).isDisplayed());  //*[text()='22,500 miles']
		Assert.assertTrue(driver.findElement(By.xpath("//*[text()='30,000 miles']")).isDisplayed());
		//compareValues("//*[text()='30,000 miles']", expectedValue);
		return this;
	}
	
	
	public P10_Maintenance completeMilestone(String serviceLocation, String serviceNotes) {
		waitUntilElementVisisble("(//*[@class='settings-icon'])[3]");
		clickById("completeMilestone");
		enterByXpath("(//*[@id='serviceLocation'])[1]", serviceLocation);
		enterByXpath("(//*[@id='notes'])[1]", serviceNotes);
		clickByXpathJavascriptExecutor("(//*[contains(text(),'Save')])[1]");
		//clickByXpath("//*[@name='SAVE NOTE']");
		waitUntilElementVisisble("(//*[@class='close'])[10]");
		return this;
	}
	
	
	public P10_Maintenance updateMilestone(String serviceLocation, String serviceNotes) throws InterruptedException {
		waitUntilElementVisisble("(//*[@class='settings-icon'])[3]");
		clickByXpath("(//*[contains(text(),'History')])[1]");
		waitUntilElementVisisble("(//*[@class='print'])[1]");
		clickByXpath("//*[contains(text(),' COLLAPSE ALL ')]");
		//clickByXpath("(//*[@id='timeline-header-1']/span/text())[2]");
		waitUntilElementVisisble("(//*[contains(text(),'COMPLETE')])[3]");
		clickByXpath("(//*[contains(text(),'COMPLETE')])[3]");
		//scrollDownJavaScriptExecutor("(//*[contains(text(),'EDIT')])[2]");
		Thread.sleep(10000);
		waitUntilElementVisisble("(//*[contains(text(),'LOCATION')])[2]");
		scrollDownJavaScriptExecutor("(//*[contains(text(),'LOCATION')])[2]");
		clickByXpath("(//*[contains(text(),'EDIT')])[2]");
		waitUntilElementVisisble("(//*[@class='icon-close'])[5]");
		enterByXpath("(//*[@name='serviceLocation'])", serviceLocation);
		enterByXpath("(//*[@id='notes'])", serviceNotes);
		waitElementToBeClickableXpathFW();
		clickByXpath("//*[text()='UPDATE']");
		waitUntilElementVisisble("(//*[@class='print'])[1]");		
		return this;
	}
	
	
	public P10_Maintenance incompleteMilestone() throws InterruptedException {
		waitUntilElementVisisble("(//*[@class='settings-icon'])[3]");
		clickByXpath("(//*[contains(text(),'History')])[1]");
		waitUntilElementVisisble("(//*[@class='print'])[1]");
		clickByXpath("//*[contains(text(),' COLLAPSE ALL ')]");
		
		waitUntilElementVisisble("(//*[contains(text(),'COMPLETE')])[3]");
		clickByXpath("(//*[contains(text(),'COMPLETE')])[3]");
		Thread.sleep(10000);
		waitUntilElementVisisble("(//*[contains(text(),'LOCATION')])[2]");
		scrollDownJavaScriptExecutor("(//*[contains(text(),'LOCATION')])[2]");
		clickByXpath("(//*[contains(text(),'EDIT')])[2]");
		waitUntilElementVisisble("(//*[@class='icon-close'])[5]");
		waitElementToBeClickableXpathFW();
		clickByXpath("//*[contains(text(),'INCOMPLETE')]");
		waitUntilElementVisisble("(//*[@class='print'])[1]");		
		return this;
}
	
	
	public P10_Maintenance chooseDealer(String dealerDetails, String dealerName) {
		waitUntilElementVisisble("//*[@title='Choose a Dealer']");
		clickByXpath("//*[@title='Choose a Dealer']");
		waitUntilElementVisisble("(//*[@class='icon-close'])[7]");
		enterByXpathJSExecutor("//*[@name='dealer_map_search']", dealerDetails);
		waitUntilElementVisisble("//*[contains(text(),'2.Garden Grove Kia ')]");
		chooseTheDealer("//*[@class='address']/strong", dealerName, "//*[contains(text(),'2.Garden Grove Kia ')]");
		waitUntilElementVisisble("//*[contains(text(),'Use this Dealer')]");
		clickByXpath("//*[contains(text(),'Use this Dealer')]");
		waitUntilElementVisisble("(//*[@class='close'])[10]");		
		return this;
	}
	
	
	public P10_Maintenance updateDealer(String dealerDetails, String dealerName) {
		waitUntilElementVisisble("//*[@title='Choose a Dealer']");
		clickByXpath("//*[@title='Choose a Dealer']");
		waitUntilElementVisisble("(//*[@class='icon-close'])[7]");
		enterByXpathJSExecutor("//*[@name='dealer_map_search']", dealerDetails);
		waitUntilElementVisisble("//*[contains(text(),'1.Kia of Irvine ')]");
		chooseTheDealer("//*[@class='address']/strong", dealerName, "//*[contains(text(),'1.Kia of Irvine ')]");
		waitUntilElementVisisble("//*[contains(text(),'Use this Dealer')]");
		clickByXpath("//*[contains(text(),'Use this Dealer')]");
		waitUntilElementVisisble("(//*[@class='close'])[10]");		
		return this;
	}
	
	
	public P10_Maintenance requestDealerAppointment() {									// need to handle this 
		scrollDownJavaScriptExecutor("//*[contains(text(),' Safety Recalls ')]");
		clickByXpath("//*[contains(text(),'Request Dealer Appointment')]");
		waitUntilElementVisisble("(//*[contains(text(),'Request Appointment ')])[1]");
		clickByXpath("(//*[contains(text(),'Request Appointment ')])[1]");
		
		scrollDownJavaScriptExecutor("(//*[@class='service__col col-7 col-md-9'])[1]");			// This is iframe
		waitUntilElementVisisble("(//*[@class='service__col col-7 col-md-9'])[1]");
		clickByXpath("(//*[@class='service__col col-7 col-md-9'])[1]");   
		waitUntilElementVisisble("//*[@id='continue_button']");
		clickByXpath("//*[@id='continue_button']");
		waitUntilElementVisisble("//*[contains(text(),'I have a ride')]");
		clickByXpath("//*[contains(text(),'I have a ride')]");
		waitUntilElementVisisble("//*[contains(text(),'NEXT')]");
		clickByXpath("//*[contains(text(),'NEXT')]");
		waitUntilElementVisisble("//*[contains(text(),'Appointment Time')]");
		scrollDownJavaScriptExecutor("//*[@class='data-slot']/div");
		clickByXpath("//*[contains(text(),'8:00')]");
		waitUntilElementVisisble("//*[contains(text(),'REVIEW')]");
		clickByXpath("//*[contains(text(),'REVIEW')]");
		waitUntilElementVisisble("//*[contains(text(),'BOOK SERVICE')]");
		clickByXpath("//*[contains(text(),'BOOK SERVICE')]");
		waitUntilElementVisisble("//*[@class='success__middle--title']");
		
		return this;
	}
}
