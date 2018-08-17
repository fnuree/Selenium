package page;

import org.openqa.selenium.By;
//import org.junit.Assert;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {

WebDriver driver;
	
	public Homepage(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.ID,using="ela-menu-visitor-desktop-supplementa_find-a-meeting")
	WebElement findmeeting;	
		
     
	public void GoToFindMeeting()
     {
		findmeeting.click();
		
     }  
    	 
     }



