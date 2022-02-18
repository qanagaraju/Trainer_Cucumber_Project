package cucumberExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import App_Elements.Login_Page_Elements;
import cucumber_App_Utilities.Browser_Factory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FaceBook_Login_Service 
{
 
	static WebDriver driver;
	static Browser_Factory browser = new Browser_Factory();
	static Login_Page_Elements loginpage = new Login_Page_Elements();
	
	@Given("^user start facebook home page$")
	public void user_start_facebook_home_page() {
		
		driver = browser.startBrowser("chrome", "http://www.mycontactform.com");
	    
	}
	
	
	
	@When("^user insert \"(.*)\" and \"(.*)\"$")
	public void user_insert_username_and_password(String username,String password) {
	    
		loginpage = PageFactory.initElements(driver, Login_Page_Elements.class);
		loginpage.insert_user_name(username);
		loginpage.insert_password(password);
		
	}
	
	
	
	
	@Then("^user click submit button$")
	public void user_click_submit_button() {
		
		loginpage = PageFactory.initElements(driver, Login_Page_Elements.class);
		try {
			loginpage.click_submit();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	   
	}
	
	
	
	
	
	@Then("^user close test$")
	public void user_close_test() {
		
	    driver.close();
		
	}
	
	
}
