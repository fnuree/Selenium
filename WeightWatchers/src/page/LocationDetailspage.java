package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocationDetailspage {

WebDriver driver;
	
	public LocationDetailspage(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.CSS,using=".location__name > span:nth-child(1)")
	WebElement clickedResultTitle;
	
	@FindBy(how=How.CSS,using=".meeting-hours")
	WebElement hoursofoperation;
	
	@FindBy(how=How.CSS,using=".hours-list--currentday")
	WebElement hoursofoperationCurrentDay;
	
	@FindBy(how=How.CSS,using="li.hours-list-item:nth-child(1)")
	WebElement hoursofoperationSunday;
	
	@FindBy(how=How.CSS,using="li.hours-list-item:nth-child(2)")
	WebElement hoursofoperationMonday;
	
	@FindBy(how=How.CSS,using="li.hours-list-item:nth-child(3)")
	WebElement hoursofoperationTuesday;
	
	@FindBy(how=How.CSS,using="li.hours-list-item:nth-child(4)")
	WebElement hoursofoperationWednesday;
	
	@FindBy(how=How.CSS,using="li.hours-list-item:nth-child(5)")
	WebElement hoursofoperationThursday;
	
	@FindBy(how=How.CSS,using="li.hours-list-item:nth-child(6)")
	WebElement hoursofoperationFriday;
	
	@FindBy(how=How.CSS,using="li.hours-list-item:nth-child(7)")
	WebElement hoursofoperationSaturday;

	
	 public String locationTitle()
	    {
	    	return clickedResultTitle.getText();
	    }

	 
      public void PrintingtHoursOfOperation()
      {
    	System.out.println(hoursofoperation.getText());  
      }
      
      
      public void printTodaysHour(int dayofWeek) {
    	  int day = dayofWeek;
    	  
    	  switch(day){
    	  	case 1:
    	    	System.out.println(hoursofoperationSunday.getText());
    	        break;
        	case 2:
        		System.out.println(hoursofoperationMonday.getText());
        		break;
        	case 3:
        		System.out.println(hoursofoperationTuesday.getText());
        		break;
        	case 4:
        		System.out.println(hoursofoperationWednesday.getText());
        		break;
        	case 5:
        		System.out.println(hoursofoperationThursday.getText());
        		break;
        	case 6:
        		System.out.println(hoursofoperationFriday.getText());
        		break;
        	case 7:
        		System.out.println(hoursofoperationSaturday.getText());
        		break;
    	  }
      }

}
