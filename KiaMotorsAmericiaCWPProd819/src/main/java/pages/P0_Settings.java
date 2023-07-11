package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.KMABase;

public class P0_Settings extends KMABase {
	
	public P0_Settings(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test =test;
		
		
		waitUntilElementVisisble("//*[@class='personal-tab active']");
		if(!verifyTitle("Settings")){
			reportStep("This is not Kia Owners Portal", "FAIL");	
		}		
	}

	
	
	public P0_Settings updatePersonalDetails(String address, String zipCode) {
		waitUntilElementVisisble("//*[text()='First Name ']");
	
		enterByXpath("//*[@name='addressLine1']", address);
		waitElementToBeClickableXpathFW();
		enterByXpath("//*[@id='personal_zipcode']", zipCode);
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("(//*[@type='submit'])[2]");
		waitUntilElementVisisble("(//*[@class='close'])[6]");
		return this;
	}
	
	
	public P0_Settings phoneNumberVerified() {
		waitUntilElementVisisble("//*[text()='First Name ']");
		Assert.assertTrue(driver.findElement(By.xpath("//*[@class='badge verified']")).isDisplayed());
		waitElementToBeClickableXpathFW();
		return this;
	}

	
	public P0_Settings securityChangePassword(String currentPassword, String newPassword, String confirmPassword) throws InterruptedException {
		
		waitUntilElementVisisble("//*[@class='personal-tab active']");
		clickByXpathJavascriptExecutor("//*[@class='security-tab']");
		waitUntilElementVisisble("//*[text()='CHANGE PASSWORD']");
		enterByXpath("//*[@name='oldPassword']", currentPassword);
		enterByXpath("//*[@id='newPwdInput']", newPassword);
		enterByXpath("//*[@name='confirmNewPwd']", confirmPassword);
		waitUntilElementVisisble("//*[@title='CHANGE PASSWORD']");
		clickByXpathJavascriptExecutor("//*[@title='CHANGE PASSWORD']");		
		waitUntilElementVisisble("(//*[@class='close'])[6]");
		return this; 
	}
	
	
	
	public P0_Settings settingsUpdatePIN(String currentPIN, String newPIN, String confirmNewPIN) {
		waitUntilElementVisisble("//*[@class='personal-tab active']");
		clickByXpathJavascriptExecutor("//*[@class='security-tab']");
		waitUntilElementVisisble("//*[text()='CHANGE 4-DIGIT PIN']");
		enterByXpath("//*[@name='currentPin']", currentPIN);
		enterByXpath("//*[@id='pinValueNew']", newPIN);
		enterByXpath("//*[@id='pinValueConfirm']", confirmNewPIN);
		waitElementToBeClickableXpathFW();
		clickByXpathJavascriptExecutor("(//*[@type='submit'])[3]");
		waitUntilElementVisisble("(//*[@class='close'])[6]");
		return this;
	}
	
	
	public P0_Settings settingsUpdatePINWithPassword(String currentPasswordResetPIN, String newPINRP, String confirmNewPINRP) {
		waitUntilElementVisisble("//*[@class='personal-tab active']");
		clickByXpathJavascriptExecutor("//*[@class='security-tab']");	
		waitUntilElementVisisble("//*[text()='forgot pin?']");
		clickByXpathJavascriptExecutor("//*[text()='forgot pin?']");
		enterByXpath("//*[@name='currPassword']", currentPasswordResetPIN);
		enterByXpath("//*[@id='pinValueNew']", newPINRP);
		enterByXpath("//*[@id='pinValueConfirm']", confirmNewPINRP);
		clickByXpathJavascriptExecutor("(//*[@type='submit'])[3]");
		waitUntilElementVisisble("(//*[@class='close'])[6]");		
		return this;
	} 
	
	
	
	public P0_Settings settingsCPenableSMStoggle() throws InterruptedException {
		waitUntilElementVisisble("(//*[contains(text(),'Communication Preferences')])[1]");
		clickByXpath("(//*[contains(text(),'Communication Preferences')])[1]");
		waitElementToBeClickableXpathFW();
		clickByXpath("(//*[@class='w-100 d-inline-block'])[1]");
		scrollDownJavaScriptExecutor("//*[text()='SAVE CHANGES']");
		waitElementToBeClickableXpathFW();
		clickByXpath("//*[text()='SAVE CHANGES']");
		waitUntilElementVisisble("(//*[@class='close'])[6]");
		return this;
	}
	
	
	public P0_Settings settingsCPdisabledSMStoggle() throws InterruptedException {
		waitUntilElementVisisble("(//*[contains(text(),'Communication Preferences')])[1]");
		clickByXpath("(//*[contains(text(),'Communication Preferences')])[1]");
		waitElementToBeClickableXpathFW();
		clickByXpath("(//*[@class='w-100 d-inline-block'])[1]");
		scrollDownJavaScriptExecutor("//*[text()='SAVE CHANGES']");
		waitElementToBeClickableXpathFW();
		clickByXpath("//*[text()='SAVE CHANGES']");
		waitUntilElementVisisble("(//*[@class='close'])[6]");
		return this;
	}
	
	
	
	public P0_Settings settingsKiaConnectNotificationAlertsTurnOff() {
		waitUntilElementVisisble("//*[contains(text(),'KIA Connect Notifications')]");
		clickByXpath("//*[contains(text(),'KIA Connect Notifications')]");
		waitElementToBeClickableXpathFW();
		clickByXpath("//*[text()='MAINTENANCE & DIAGNOSTICS ALERTS']");
		waitElementToBeClickableXpathFW();
		clickByXpath("(//*[contains(text(),'All On/Off')])[2]");
		waitElementToBeClickableXpathFW();
		clickByXpath("//*[text()='MAINTENANCE & DIAGNOSTICS ALERTS']");
		/*clickByXpath("//*[contains(text(),'KIA CONNECT MESSAGES')]");
		waitUntilElementVisisble("(//*[contains(text(),'All On/Off')])[3]");
		clickByXpath("(//*[contains(text(),'All On/Off')])[3]");*/
		clickByXpath("//*[contains(text(),' Save')]");
		waitUntilElementVisisble("(//*[contains(text(),'Close')])[2]");		
		return this;
	}
	
	
	public P0_Settings settingsKiaConnectNotificationAlertsTurnOn() {
		waitUntilElementVisisble("//*[contains(text(),'KIA Connect Notifications')]");
		clickByXpath("//*[contains(text(),'KIA Connect Notifications')]");
		waitElementToBeClickableXpathFW();
		clickByXpath("//*[text()='MAINTENANCE & DIAGNOSTICS ALERTS']");
		waitElementToBeClickableXpathFW();
		clickByXpath("(//*[contains(text(),'All On/Off')])[2]");
		waitElementToBeClickableXpathFW();
		clickByXpath("//*[text()='MAINTENANCE & DIAGNOSTICS ALERTS']");
		waitElementToBeClickableXpathFW();
		/*clickByXpath("//*[contains(text(),'KIA CONNECT MESSAGES')]");
		waitUntilElementVisisble("(//*[contains(text(),'All On/Off')])[3]");
		clickByXpath("(//*[contains(text(),'All On/Off')])[3]");*/
		clickByXpath("//*[contains(text(),' Save')]");
		waitUntilElementVisisble("(//*[contains(text(),'Close')])[2]");		
		return this;
	}
	
}
