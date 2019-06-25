package Tetsershub.AmazonCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebConnector {
	
public static WebDriver driver;
	public void Openbrowser() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
	}

}
