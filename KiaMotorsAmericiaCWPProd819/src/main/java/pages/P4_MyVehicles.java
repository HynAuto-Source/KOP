package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.KMABase;

public class P4_MyVehicles extends KMABase{

	
	public P4_MyVehicles(RemoteWebDriver driver, ExtentTest test) throws InterruptedException{
		this.driver = driver;
		this.test =test;
		waitUntilElementVisisble("//*[@class='vehicle-tab active']");
		if(!verifyTitle("Welcome")){
			reportStep("This is not Welcome Page", "FAIL");	
		}		
	}
		
	// For Prod Environment 
	public P5_Dashboard pickTheCar(String vehicleModel) throws InterruptedException {
		waitUntilElementVisisble("(//*[@title='TELLURIDE'])[1]");
		pickTheCar("//div[@class='my-vehicles-grid-item-header']/strong", vehicleModel, "(//*[@title='TELLURIDE'])[1]");   
		waitUntilElementVisisble("//*[@class='dropdown-toggle']");
		return new P5_Dashboard(driver, test);
	}
		
	
	//For Stage Environment
/*	public P5_Dashboard pickTheCarStg(String vehicleModel) throws InterruptedException {
		waitUntilElementVisisble("(//*[@title='TELLURIDE'])[2]");
		pickTheCar("//div[@class='my-vehicles-grid-item-header']/strong", vehicleModel, "(//*[@title='TELLURIDE'])[2]");   
		waitUntilElementVisisble("//*[@class='dropdown-toggle']");
		return new P5_Dashboard(driver, test);
	}*/
		
		public P4_MyVehicles clickAccount() throws InterruptedException {
			waitUntilElementVisisble("//*[@class='dropdown-toggle']");
			clickByXpathJavascriptExecutor("//*[@class='dropdown-toggle']");
			return new P4_MyVehicles(driver, test);
		}
		
		
		public P0_Settings clickSettings() {
			waitUntilElementVisisble("//*[@class='dropdown-toggle']");
			clickByXpathJavascriptExecutor("(//*[text()='Settings'])[1]");
			waitUntilElementVisisble("//*[@class='personal-tab active']");
			return new P0_Settings(driver, test);
		}
		
		public P2_Login clickLogout() throws InterruptedException {
			waitUntilElementVisisble("(//*[text()='Log Out'])[2]");
			clickByXpath("(//*[text()='Log Out'])[2]");
			return new P2_Login(driver, test);
		}
		
		
		
		public P4_MyVehicles clickAddVehicle() {
			waitUntilElementVisisble("(//*[@title='Add Vehicle'])[1]");
			clickByXpathJavascriptExecutor("(//*[@title='Add Vehicle'])[1]");
			//clickByXpath("//span[normalize-space()='Add Vehicle']");
			waitUntilElementVisisble("//*[@title=' Where can I find my VIN?']");
			return this;
		}
		
		
		
		
		
		public P13_AdditionalDrivers clickAdditionalDrivers() throws InterruptedException {
			waitUntilElementVisisble("(//*[@class='additional-driver-tab'])[2]");
			clickByXpathJavascriptExecutor("(//*[@class='additional-driver-tab'])[2]");
			waitUntilElementVisisble("//*[contains(text(),'Additional Drivers')]");			
			return new P13_AdditionalDrivers(driver, test);
		}
		
		
		
		public P13_AdditionalDrivers acceptRequestFromPrimaryAccount(String vehicleModel) throws InterruptedException {
			waitUntilElementVisisble("//*[@class='acceptRejectLinkBtn button outline red']");
			pickTheCar("//div[@class='my-vehicles-grid-item-header']/strong", vehicleModel, "//*[@class='acceptRejectLinkBtn button outline red']");
			//waitUntilElementVisisble("//*[text()=' DRIVER ACCESS']");
			waitUntilElementVisisble("(//*[@class='icon-close'])[5]");
			clickByXpath("(//*[@class='checkmark'])[1]");
			clickByXpath("(//*[@class='checkmark'])[2]");
			clickByXpath("(//*[@class='checkmark'])[3]");
			waitUntilElementVisisble("//*[contains(text(),'LINK ACCOUNT')]");
			clickByXpath("//*[contains(text(),'LINK ACCOUNT')]");
			waitUntilElementVisisble("//*[contains(text(),'Linking in progress')]");
			return new P13_AdditionalDrivers(driver, test);
		}

		
		
		
		public P4_MyVehicles rejectThePrimaryDriverRequest(String vehicleModel) {		
			waitUntilElementVisisble("(//*[contains(text(),'REJECT')])[1]");
			pickTheCar("//div[@class='my-vehicles-grid-item-header']/strong", vehicleModel, "(//*[contains(text(),'REJECT')])[1]");
			//clickByXpath("(//*[contains(text(),'REJECT')])[1]");
			waitUntilElementVisisble("//*[contains(text(),' Unlinking in progress')]");			
			return this;
		}
		
		
		public P4_MyVehicles addRequestBySecondaryDriver(String vehicleModel) {
			waitUntilElementVisisble("(//*[@title='TELLURIDE'])[1]");
			pickTheCar("//div[@class='my-vehicles-grid-item-header']/strong", vehicleModel, "(//*[@title='TELLURIDE'])[1]");   
		    waitUntilElementVisisble("//*[contains(text(),'Request Access?')]");
		    clickByXpath("//*[contains(text(),'Request Access?')]");
		    waitUntilElementVisisble("(//*[contains(text(),'2023 TELLURIDE')])[3]"); 
		   // waitUntilElementVisisble("(//*[contains(text(),'Cancel ')])[3]");
		    clickByXpath("(//*[@class='checkmark'])[1]");
		    clickByXpath("(//*[@class='checkmark'])[2]");
		    clickByXpath("(//*[@class='checkmark'])[3]");
		    waitUntilElementVisisble("//*[contains(text(),'SEND REQUEST')]");
		    clickByXpath("//*[contains(text(),'SEND REQUEST')]");
		    waitUntilElementVisisble("//*[@class='icon-info']");	
		return this;
	}
		
		
		
		
		
	/*	public P13_AdditionalDrivers secondaryDriverInitiateTheRequest(String VINNumber) throws InterruptedException {
			waitUntilElementVisisble("(//*[@title='Add Vehicle'])[1]");
			clickByXpath("(//*[@title='Add Vehicle'])[1]");
			//enterValuesInAlert(VINNumber);
			//waitUntilElementVisisble("//*[@name='vin']");
			waitUntilElementVisisble("//*[@id='add-my-vehicle-slider']/div/div[1]/app-add-vehicle-modal/div/div/form/ul/li/span/input");
			enterByXpathJavascriptExecutor("//*[@id='add-my-vehicle-slider']/div/div[1]/app-add-vehicle-modal/div/div/form/ul/li/span/input", VINNumber);
			waitUntilElementVisisble("//*[@title='Verify VIN']");
			clickByXpath("//*[@title='Verify VIN']");
			waitUntilElementVisisble("//*[@title='Save and Close']");
			clickByXpath("//*[@title='Save and Close']");
			waitUntilElementVisisble("(//*[contains(text(),'My TELLURIDE')])[1]");			
			return new P13_AdditionalDrivers(driver, test);
		}*/
		
}
		
	


