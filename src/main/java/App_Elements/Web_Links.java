package App_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Web_Links {
	
	
	@FindBy(xpath="//*[@id=\"nav-orders\"]/span[2]")WebElement buyAgain;
	
	public Web_Links verify_Buy_Again() {
		
		
		
		if(buyAgain.isDisplayed() && buyAgain.isEnabled()) {
			buyAgain.click();
		}
		return this;
		
		
	}
	

}
