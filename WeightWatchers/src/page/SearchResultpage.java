package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultpage {

WebDriver driver;
	
	public SearchResultpage(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.CSS,using="#ml-1180510 > result-location:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > location-address:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)")
	WebElement firstResultTitle;
	
	
	@FindBy(how=How.CSS,using="#ml-1180510 > result-location:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > location-address:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")
	WebElement firstResultDistance;


     public String PrintZipResult()
     {
   
    	System.out.println(firstResultTitle.getText());
    	System.out.println(firstResultDistance.getText());
    	return firstResultTitle.getText();
    	 
     }     

	public void ClickFirstZip() 
	{
		firstResultTitle.click();
		
	}

}
