package cucumber_App_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Factory {
	
	
	static WebDriver driver;
	
	
	public WebDriver startBrowser(String browsertype,String appurl) {
		
			if(browsertype.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
				
		}else if(browsertype.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if(browsertype.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
			driver.get(appurl);
			
		return driver;
		
	}
	
}
