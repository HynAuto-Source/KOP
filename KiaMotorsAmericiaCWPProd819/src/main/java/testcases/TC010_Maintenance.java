package testcases;

import org.testng.annotations.Test;

import pages.P2_Login;
import wrappers.KMABase;

public class TC010_Maintenance extends KMABase{
	
	
	
	@Test(priority=1, dataProvider="fetchData")
	public void checkNextMaintenanceMiles(String emailId, String pwdLogin, String vehicleModel, String expectedValue) throws InterruptedException {
		new P2_Login(driver,test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickMaintenance()
		.nextServiceMiles(expectedValue);
	}
	
	
	@Test(priority=2, dataProvider="fetchData")
	public void completeMilestone(String emailId, String pwdLogin, String vehicleModel, String serviceLocation, String serviceNotes) throws InterruptedException {
		new P2_Login(driver,test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickMaintenance()
		.completeMilestone(serviceLocation, serviceNotes);
	}
	
	
	
	@Test(priority=3, dataProvider="fetchData")
	public void updateMilestone(String emailId, String pwdLogin, String vehicleModel, String serviceLocation, String serviceNotes) throws InterruptedException {
		new P2_Login(driver,test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickMaintenance()
		.updateMilestone(serviceLocation, serviceNotes);
	}
	
	
	@Test(priority=4, dataProvider="fetchData")
	public void incompleteMilestone(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException {
		new P2_Login(driver,test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickMaintenance()
		.incompleteMilestone();
	}
	
	

	@Test(priority=5, dataProvider="fetchData")
	public void chooseAdealer(String emailId, String pwdLogin, String vehicleModel, String dealerDetails, String dealerName) throws InterruptedException {
		new P2_Login(driver,test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickMaintenance()
		.chooseDealer(dealerDetails, dealerName);
	}
	
	@Test(priority=6, dataProvider="fetchData")
	public void updateAdealer(String emailId, String pwdLogin, String vehicleModel, String dealerDetails, String dealerName) throws InterruptedException {
		new P2_Login(driver,test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickMaintenance()
		.updateDealer(dealerDetails, dealerName);
	}
	
	@Test(priority=7, dataProvider="fetchData")  // This is iframe
	public void requestDealerAppointments(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException {
		new P2_Login(driver,test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickMaintenance()
		.requestDealerAppointment();
	}
	
}

