package cucumberExamples;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_Search {
	
	
	
	@Given("user start amazon home page")
	public void user_start_amazon_home_page() {
	 
		System.out.println("Start amazon home page");
	}
	
	
	@When("User insert search details")
	public void user_insert_search_details() {
	    System.out.println("Insert amazon search data");
	}
	
	
	@Then("User click search button")
	public void user_click_search_button() {
	   
		System.out.println("Click amazon button");
		
	}
	
	
	@Then("User close browser")
	public void user_close_browser() {
	   
		System.out.println("close test");
	}

	

}
