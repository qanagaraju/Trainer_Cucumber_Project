package cucumberExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber_App_Utilities.Browser_Factory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_Search {
	
	static WebDriver driver;
	static Browser_Factory browser = new Browser_Factory();
	
	@Given("user start amazon home page")
	public void user_start_amazon_home_page() {
	 
		driver = browser.startBrowser("chrome", "http://www.amazon.in");
		
	}
	
	
	@When("User insert search details")
	public void user_insert_search_details() {
	   
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobiles");
		
	}
	
	
	@Then("User click search button")
	public void user_click_search_button() {
	   
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
	
	
	@Then("User close browser")
	public void user_close_browser() {
	   
		driver.close();
	}

	

}
