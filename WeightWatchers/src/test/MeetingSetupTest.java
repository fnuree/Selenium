// Author: Angcon Podder
// Created: June 15th, 2018
// Objective: Automation Webdriver Sample

package test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.FindMeetingPage;
import page.Homepage;
import page.LocationDetailspage;
import page.SearchResultpage;
import util.BrowserFactory;

public class MeetingSetupTest {

@Test
public void MeetingSetup() throws IOException{


//navigating to the URL	
WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.weightwatchers.com/us/");	

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

//maximizing the browser
driver.manage().window().maximize();

//verifying home page title
assertEquals("Weight Loss Program, Recipes & Help | Weight Watchers" , driver.getTitle());


Homepage home = PageFactory.initElements(driver, Homepage.class);
//Clicking FindMeeting		
home.GoToFindMeeting();
//Verifying title (subString) of Find Meeting 
Assert.assertTrue(driver.getTitle().contains("Get Schedules & Times Near You"));



FindMeetingPage search = PageFactory.initElements(driver, FindMeetingPage.class);
//Searching the required zipcode
search.SearchZip("10011");


SearchResultpage result=PageFactory.initElements(driver, SearchResultpage.class);
//printing the result of the zipcode
String firstSearchLocationName = result.PrintZipResult();
//clicking of the first zipcode
result.ClickFirstZip();


LocationDetailspage clickresult=PageFactory.initElements(driver, LocationDetailspage.class);
//verify displayed location name matches with the name of the first searched result that was clicked.
assertEquals(firstSearchLocationName, clickresult.locationTitle());

//printing hours of operation for Today
Calendar calendar = Calendar.getInstance();
int day = calendar.get(Calendar.DAY_OF_WEEK); 
System.out.println("Hours of Operation");
clickresult.printTodaysHour(day);


//Tear down
driver.close();
driver.quit();
			
	
}

}
