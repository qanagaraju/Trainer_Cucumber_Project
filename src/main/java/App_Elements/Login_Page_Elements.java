package App_Elements;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Page Object elements

public class Login_Page_Elements {
	
	static WebDriver driver;
	
	@FindBy(name="user")WebElement username;
	@FindBy(name="pass")WebElement password;
	@FindBy(name="btnSubmit")WebElement submitButton;
	@FindBy(xpath = "//*[@id=\"user_bar\"]/ul/li[1]/a") WebElement signout;
	@FindBy(id="right_col_top_err")WebElement user_message;
	
	
	
	public Login_Page_Elements insert_user_name(String un) {
		
		if(username.isEnabled()) {
			username.sendKeys(un);
		}
		
		return this;
		
	}
	
	public Login_Page_Elements insert_password(String pw) {
		if(password.isEnabled()) {
			password.sendKeys(pw);
		}
		
		return this;
	}
	
	
	public Login_Page_Elements click_submit() throws InterruptedException {
		if(submitButton.isEnabled()) {
			submitButton.click();
			
			Thread.sleep(5000);
		}
		
		
		
		return this;
	}
	
	
	public Login_Page_Elements click_signout() {
		
		try {
			
			if(signout.isEnabled()) {
				signout.click();
				System.out.println("Login Success");
			}
			
		}catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		return this;
		
	}
	
	
	
	
	
	

}
