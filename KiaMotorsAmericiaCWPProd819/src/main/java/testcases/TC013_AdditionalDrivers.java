package testcases;

import org.testng.annotations.Test;

import pages.P2_Login;
import wrappers.KMABase;

public class TC013_AdditionalDrivers extends KMABase {

		
	@Test(priority=1, dataProvider="fetchData")
	public void addSecondaryDriver(String emailId, String pwdLogin, String secondaryDriverEmailId) throws InterruptedException {
		new P2_Login(driver, test)
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.clickAdditionalDrivers()
		.addSecondaryDriver(secondaryDriverEmailId);
	}	
	
	@Test(priority=2, dataProvider="fetchData")
	public void acceptRequestFromPrimaryAccount(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException {
		new P2_Login(driver, test)
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.acceptRequestFromPrimaryAccount(vehicleModel);
	}	
	
	
	
	@Test(priority=3, dataProvider="fetchData")
	public void linkedDriverIsDisplayed(String emailId, String pwdLogin) throws InterruptedException {
		new P2_Login(driver, test)
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.clickAdditionalDrivers()
		.verifyTheLinkedDriver();
	}	
	
	
	@Test(priority=4, dataProvider="fetchData")
	public void deleteTheVehicleFromSecondaryDriverAccount(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException {
		new P2_Login(driver, test)
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.deleteTheVechileFromSecondaryDriversAccount();		
	}
	
	
	@Test(priority=5, dataProvider="fetchData")
	public void rejectThePrimaryDriverRequest(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException {
		new P2_Login(driver, test)
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.rejectThePrimaryDriverRequest(vehicleModel);	
	}
	
	
	@Test(priority=3, dataProvider="fetchData")
	public void addRequestBySecondaryDriver(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException {
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.addRequestBySecondaryDriver(vehicleModel);
	}
	

	@Test(priority=4, dataProvider="fetchData")
	public void scRequestAcceptedByPrimaryDriver(String emailId, String pwdLogin) throws InterruptedException {
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.clickAdditionalDrivers()
		.sdRequestAcceptedByPrimaryDriver();
	}
	
	
	@Test(priority=5, dataProvider="fetchData")
	public void unLinkTheSCAccountByPrimaryDriver(String emailId, String pwdLogin) throws InterruptedException {
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.clickAdditionalDrivers()
		.unlinkTheSDAccount();	
	}
	
	
	@Test(priority=6, dataProvider="fetchData")
	public void deleteTheSCDriversAccountByPrimaryDriver(String emailId, String pwdLogin) throws InterruptedException {
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.clickAdditionalDrivers()
		.deleteTheSCDriversAccountByPrimaryDriver();
	}
	
	
	/*@Test(priority=5, dataProvider="fetchData")
	public void secondaryDriverInitiateTheRequest(String emailId, String pwdLogin, String VINNumber) throws InterruptedException {
		new P2_Login(driver, test)
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.secondaryDriverInitiateTheRequest(VINNumber);
	}*/
	
	
	/*@Test(priority=4, dataProvider="fetchData")
	public void secondaryDriverAddVehicle(String emailId, String pwdLogin, String enterVIN, String vehicleModel) throws InterruptedException {
		new P2_Login(driver, test)
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.secondaryDriverAddVehicle(enterVIN, vehicleModel);
	}	*/
	
	
	
	
	
/*	@Test(priority=4, dataProvider="fetchData")
	public void acceptRequestFromSecondaryDriver(String emailId, String pwdLogin, String enterVIN, String vehicleModel) throws InterruptedException {
		new P2_Login(driver, test)
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.clickAdditionalDrivers()
		.
	}*/	
	
	
}
