package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.KMABase;

public class P9_Locations extends KMABase {
	
	public P9_Locations(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		
		if(!verifyTitle("Locations")) {
			reportStep("This is not Locations Page", "FAIL");
		}
		
	}
	
	
		public P9_Locations vehicleCurrentLocation() {
			waitUntilElementVisisble("//*[@id='autoSearchInput']");
			Assert.assertTrue(driver.findElement(By.id("pinrefresh")).isDisplayed());
			return this;
		}
	
	
	
		public P9_Locations searchIsPresent_5754511() {
			waitUntilElementVisisble("//*[@id='autoSearchInput']");	
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='autoSearchInput']")).isDisplayed());
			return this; 
		}
		
		
		public P9_Locations savePOI(String locationPOI) {
			
			waitUntilElementVisisble("//*[@id='autoSearchInput']");						//waitUntilElementVisisble("//*[@id='poiDetailID']//*[@id='autoSearchInput']");
			enterByXpath("//*[@id='autoSearchInput']", locationPOI);					//enterByXpath("//*[@id='poiDetailID']//*[@id='autoSearchInput']", "Hertz");
			waitUntilElementVisisble("//ul[@class='locations-search-results-list']//li");
			List<WebElement> optionsToSelect = driver.findElementsByXPath("//ul[@class='locations-search-results-list']//li");
			optionsToSelect.get(0).click();
			
			waitUntilElementVisisble("//*[@class='button add-to-pois']");
			clickByXpathJavascriptExecutor("//*[@class='button add-to-pois']");
			waitUntilElementVisisble("(//*[@class='close'])[8]");
			return this;	
		}
		
		
		
		public P9_Locations deletePOI() {
			
			waitUntilElementVisisble("//*[@id='autoSearchInput']");
			clickByXpath("//*[text()='MY POIS']");
			waitUntilElementVisisble("(//*[@class='locations-search-results-list'])[2]");				////*[@class='locations-search-results-list']/li[2]
			clickByXpath("(//*[@class='locations-search-results-list'])[2]");
			waitUntilElementVisisble("(//*[@class='delete'])[1]");
			clickByXpath("(//*[@class='delete'])[1]");
			waitUntilElementVisisble("(//*[@class='close'])[8]");			
			return this;
		}
				
		
		public P9_Locations savePOIAddnSendToVehicle(String locationPOI) {
			waitUntilElementVisisble("//*[@id='autoSearchInput']");					
			enterByXpath("//*[@id='autoSearchInput']", locationPOI);					
			waitUntilElementVisisble("//ul[@class='locations-search-results-list']//li");
			List<WebElement> optionsToSelect = driver.findElementsByXPath("//ul[@class='locations-search-results-list']//li");
			optionsToSelect.get(0).click();
			//waitUntilElementVisisble("//*[@class='button add-to-pois']");
			clickByXpathJavascriptExecutor("(//*[@title='Add to POIS'])[2]");
			waitUntilElementVisisble("(//*[@class='close'])[8]");
			return this; 
		}
		
		
		public P9_Locations clickMyTrips() {
			waitUntilElementVisisble("//*[@class='page-view-subnav-items']/li[2]");
			clickByXpathJavascriptExecutor("(//*[@href='javascript:void(0)'])[6]");		
			//waitUntilElementVisisble("div#reportrange");
			return this;
		}
		
		
		public P9_Locations selectDateType() throws InterruptedException {
			waitUntilElementVisisble("(//*[text()='No trips found'])");
			clickById("reportrange");
			waitUntilElementVisisble("(//*[text()='This Month'])[1]");
			//waitElementToBeClickableXpathFW();
			clickByXpathJavascriptExecutor("(//*[text()='This Month'])[1]");
			waitUntilElementVisisble("(//*[@class='export-btn'])");
			return this;
		}
		
		
		
		public P9_Locations addTags(String tripType) throws InterruptedException {
			
			waitElementToBeClickableXpathFW();
			clickByCSSTagClass("span[class='badge add new-tag']");
			waitElementToBeClickableXpathFW();
			enterByXpathJSExecutor("(//*[@name='trip_tags'])[1]", tripType);
			waitElementToBeClickableXpathFW();
			waitUntilElementVisisble("(//*[@class='close'])[6]");
			return this; 
		}
		
		
		public P9_Locations deleteTags() {
			waitElementToBeClickableXpathFW();
			clickByCSSTagClass("span[class='badge add new-tag']");
			waitElementToBeClickableXpathFW();
			clearbyXpath("(//*[@name='trip_tags'])[1]");
			waitElementToBeClickableXpathFW();
			return this;
		}
		
		
		public P9_Locations deleteTagsForMergedTrip() {
			waitElementToBeClickableXpathFW();
			clickByCSSTagClass("span[class='badge add new-tag']");
			waitElementToBeClickableXpathFW();
			clearbyXpath("(//*[@name='trip_tags'])[1]");
			waitElementToBeClickableXpathFW();
			return this;
		}
		
		public P9_Locations mergeTrips() throws InterruptedException {
			waitUntilElementVisisble("(//*[text()='No trips found'])");
			clickByXpathJavascriptExecutor("//*[@id='myTrips_results']/div/div[1]/div[1]/label/em");
			waitUntilElementVisisble("(//*[@class='icon-trip-alert-geo'])");
			clickByXpathJavascriptExecutor("//*[@id='myTrips_results']/div/div[2]/div[1]/label/em");
			waitElementToBeClickableXpathFW();
			clickByXpathJavascriptExecutor("//*[@class='merge active']");
			waitUntilElementVisisble("(//*[@class='close'])[6]");
			return this;
		}
		
		
		public P9_Locations addTagsForMergedTrips(String tripType) throws InterruptedException {
			waitElementToBeClickableXpathFW();
			//waitUntilElementVisisble("(//*[@class='badge add new-tag'])[1]");
			clickByXpathJavascriptExecutor("(//*[@name='trip_tags'])[2]");
			//clickByCSSTagClass("span[class='badge add new-tag']");
			waitElementToBeClickableXpathFW();
			//enterByXpathJSExecutor("(//*[@name='trip_tags'])[1]", tripType);
			enterByXpathJSExecutor("(//*[@name='trip_tags'])[2]", tripType);
			waitElementToBeClickableXpathFW();	
			waitUntilElementVisisble("(//*[@class='close'])[6]");
			return this;
		}
		
		
		public P9_Locations unMergeTrips() {
			waitElementToBeClickableXpathFW();
			clickByXpathJavascriptExecutor("//*[@id='myTrips_results']/div/div[1]/div[1]/label/em");
			waitUntilElementVisisble("//*[@class='unmerge active']");
			clickByXpathJavascriptExecutor("//*[@class='unmerge active']");
			waitUntilElementVisisble("(//*[@class='close'])[6]");
			return this;
		}
}


