package testcases;

import org.testng.annotations.Test;


import pages.P2_Login;
import wrappers.KMABase;

public class TC000_Settings extends KMABase{
	

	@Test(priority=1, dataProvider="fetchData")
	public void personalDetails(String emailId, String pwdLogin, String address, String zipCode) throws InterruptedException{
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)	
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.clickAccount()
	.clickSettings()
	.updatePersonalDetails(address, zipCode);
	}
	
	
	@Test(priority=2, dataProvider="fetchData")
	public void phoneNumberVerified(String emailId, String pwdLogin) throws InterruptedException{
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)	
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.clickAccount()
	.clickSettings()
	.phoneNumberVerified();
	}
	
	
	
	@Test(priority=3, dataProvider="fetchData")
	public void settingsChangePassword(String emailId, String pwdLogin, String currentPassword, String newPassword, String confirmPassword) throws InterruptedException{
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)	
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.clickAccount()
	.clickSettings()
	.securityChangePassword(currentPassword, newPassword, confirmPassword);
	}
	
	
	
	@Test(priority=4, dataProvider="fetchData")
	public void settingsUpdatePIN(String emailId, String pwdLogin, String currentPIN, String newPIN, String confirmNewPIN) throws InterruptedException{
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)	
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.clickAccount()
	.clickSettings()
	.settingsUpdatePIN(currentPIN, newPIN, confirmNewPIN);
	}
	
	
	
	@Test(priority=5, dataProvider="fetchData")
	public void settingsUpdatePINWithPassword(String emailId, String pwdLogin, String currentPasswordResetPIN , String newPINRP, String confirmNewPINRP) throws InterruptedException{
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)	
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.clickAccount()
	.clickSettings()
	.settingsUpdatePINWithPassword(currentPasswordResetPIN, newPINRP, confirmNewPINRP);
	}
	
	
	@Test(priority=6, dataProvider="fetchData")
	public void settingsCPEnableToggle(String emailId, String pwdLogin) throws InterruptedException{
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)	
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.clickAccount()
	.clickSettings()
	.settingsCPenableSMStoggle();
	}
	
	
	@Test(priority=7, dataProvider="fetchData")
	public void settingsCPTurnOffToggle(String emailId, String pwdLogin) throws InterruptedException{
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)	
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.clickAccount()
	.clickSettings()
	.settingsCPdisabledSMStoggle();
	}
	
	@Test(priority=8, dataProvider="fetchData")
	public void settingsKiaConnectNotificationAlertsTurnOff(String emailId, String pwdLogin) throws InterruptedException{
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)	
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.clickAccount()
	.clickSettings()
	.settingsKiaConnectNotificationAlertsTurnOff();
	}
	
	
	@Test(priority=8, dataProvider="fetchData")
	public void settingsKiaConnectNotificationAlertsTurnOn(String emailId, String pwdLogin) throws InterruptedException{
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)	
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.clickAccount()
	.clickSettings()
	.settingsKiaConnectNotificationAlertsTurnOn();
	}
	
}
	
	
	
	
	
