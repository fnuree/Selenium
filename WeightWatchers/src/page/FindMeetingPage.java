package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindMeetingPage {

WebDriver driver;
	
	public FindMeetingPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.ID,using="meetingSearch")
	WebElement searchbox;

	@FindBy(how=How.CSS,using="button.btn")
	WebElement searchbutton;
    
	public void SearchZip(String zip)
    {	
    
    	searchbox.sendKeys(zip);
    	searchbutton.click();
    }


}
