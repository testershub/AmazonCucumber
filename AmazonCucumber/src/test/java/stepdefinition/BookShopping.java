package stepdefinition;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Tetsershub.AmazonCucumber.WebConnector;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

 
public class BookShopping {
	
	 WebConnector con;

	public BookShopping(WebConnector con) {
	 
		this.con=con;
                 	
	}
	
	@Before
	public void init()
	{
		//initialse browser
		con.Openbrowser();
	}
	
	@After
	public void End()
	{
		//close browser
		con.driver.quit();
		
	}

	@Given("^user is on amazon page$")
	public void user_is_on_amazon_page() throws Throwable {
	   
		//enter amazon url
	    con.driver.get("https://www.amazon.in");
	    
	}

	@When("^user search Experiences of Test Automation: Case Studies of Software Test Automation book name$")
	public void user_search_Experiences_of_Test_Automation_Case_Studies_of_Software_Test_Automation_book_name() throws Throwable {
	    
		//find search field
		WebDriverWait wait = new WebDriverWait(con.driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#twotabsearchtextbox")));
		WebElement searchfield = con.driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		//enter book name "Experiences of Test Automation: Case Studies of Software Test Automation" into search field.
		searchfield.sendKeys("Experiences of Test Automation: Case Studies of Software Test Automation");
		
	}

	@When("^click on search icon$")
	public void click_on_search_icon() throws Throwable {
	    
		//click on search icon
		WebElement searchicon = con.driver.findElement(By.cssSelector("input.nav-input"));
		searchicon.click();
	   
	}

	@When("^click on book name$")
	public void click_on_book_name() throws Throwable {
	    
		//click on book name
		con.driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		
		//switch to tab window
		Iterator<String>addcartitr = con.driver.getWindowHandles().iterator();
		String parent = addcartitr.next();
		String child = addcartitr.next();
		con.driver.switchTo().window(child);
		
	}
	
	@When("^click on All Buying option button for agile book$")
	public void click_on_All_Buying_option_button_for_agile_book() throws Throwable {
	    
	
		
		
	}
	
	@When("^click on add to cart button for agile$")
	public void click_on_add_to_cart_button_for_agile() throws Throwable {
	    
	
		//click on 'Add o cart'
		con.driver.findElement(By.xpath("//*[@id='a-autoid-0']/span/input")).click();
		
	}
	
	@When("^click on add to cart button$")
	public void click_on_add_to_cart_button() throws Throwable {
	    
	
		//click on 'Add o cart'
		WebDriverWait wait = new WebDriverWait(con.driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#add-to-cart-button")));
		
		con.driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
		
	}

	@When("^user searched for Agile Testing: A Practical Guide for Testers and Agile Teams book name$")
	public void user_searched_for_Agile_Testing_A_Practical_Guide_for_Testers_and_Agile_Teams_book_name() throws Throwable {
	    
		//enter book name "Agile Testing: A Practical Guide for Testers and Agile Teams" into search field
		con.driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Agile Testing: A Practical Guide for Testers and Agile Teams");
	    
	}

	
	@When("^click on paperback option and click on add to cart button$")
	public void click_on_paperback_option_and_click_on_add_to_cart_button() throws Throwable {
	   
		//click on papererback edition
		con.driver.findElement(By.cssSelector("a[title='Paperback']")).click();
		

		//click on 'Add o cart'
		WebDriverWait wait = new WebDriverWait(con.driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#add-to-cart-button")));
		
		con.driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
	}
	
	
	
	@When("^click on paperback option and click on All Buying option button for agile book$")
	public void click_on_paperback_option_and_click_on_All_Buying_option_button_for_agile_book () throws Throwable {
	     
		Thread.sleep(5000);
		//click on papererback edition
		con.driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/a")).click();
		
		//switch to tab window
		Iterator<String>agileitr = con.driver.getWindowHandles().iterator();
		String agile = agileitr.next();
		String childagile = agileitr.next();
		String childagile1=agileitr.next();
		con.driver.switchTo().window(childagile1);
		
		//click on all buying option button
		con.driver.findElement(By.xpath("//*[@id='buybox-see-all-buying-choices-announce']")).click();
		
				
	}

	@When("^user searched for Selenium WebDriver (\\d+) Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, (\\d+)nd Edition book name$")
	public void user_searched_for_Selenium_WebDriver_Practical_Guide_End_to_end_automation_testing_for_web_and_mobile_browsers_with_Selenium_WebDriver_nd_Edition_book_name(int arg1, int arg2) throws Throwable {
		//enter book name "Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition" into search field
		con.driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition");
	   
	}
	
	@When("^click on paperback option and click on All Buying option button for selenium webdriver book$")
	public void click_on_paperback_option_and_click_on_All_Buying_option_button_for_selenium_webdriver_book() throws Throwable {
	     
		//click on papererback edition
		con.driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/a")).click();
		
		 //switch to tab window
		  Thread.sleep(6000);
		  Iterator<String>seleniumwindowitr = con.driver.getWindowHandles().iterator();
		  System.out.println("handles:-"+con.driver.getWindowHandles().size());
		  String selenium = seleniumwindowitr.next();
		  String paperback = seleniumwindowitr.next();
		  String paperback1 = seleniumwindowitr.next();
		  String paperback2 = seleniumwindowitr.next();
		  con.driver.switchTo().window(paperback2);
		//click on all buying option button
		  Thread.sleep(6000);
		con.driver.findElement(By.xpath("//*[@id='buybox-see-all-buying-choices-announce']")).click();
		
				
	}
	
	@When("^click on add to cart button for selenium webdriver$")
	public void click_on_add_to_cart_button_for_selenium_webdriver() throws Throwable {
	    
	
		//click on 'Add to cart'
		con.driver.findElement(By.xpath("//*[@id='a-autoid-0']/span/input")).click();
		
	}
	

	@When("^click on Selenium WebDriver (\\d+) Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, (\\d+)nd Edition book name$")
	public void click_on_Selenium_WebDriver_Practical_Guide_End_to_end_automation_testing_for_web_and_mobile_browsers_with_Selenium_WebDriver_nd_Edition_book_name(int arg1, int arg2) throws Throwable {
	  
		//click on book name
		con.driver.findElement(By.cssSelector("h2.a-size-medium")).click();
		
	

		//switch to tab window
		 Iterator<String>seleniumwindowitr = con.driver.getWindowHandles().iterator();
		 String selenium = seleniumwindowitr.next();
		 String handle = seleniumwindowitr.next();
		 String handle1 = seleniumwindowitr.next();
		 String handle2 = seleniumwindowitr.next();
		 con.driver.switchTo().window(handle2);
		  

	}

	
	@When("^click on cart icon$")
	public void click_on_cart_icon() throws Throwable {
	   
		//Click on  Cart icon
		 con.driver.findElement(By.cssSelector("a#nav-cart")).click();
	    
	}

	@When("^click on Save For Later option for Experiences of Test Automation: Case Studies of Software Test Automation book$")
	public void click_on_Save_For_Later_option_for_Experiences_of_Test_Automation_Case_Studies_of_Software_Test_Automation_book() throws Throwable {
	
		//click on 'Save for option' for test automation book
		con.driver.findElement(By.cssSelector("input[aria-label='Save for later Experiences of Test Automation: Case Studies of Software Test Automation, 1e']")).click();
	    
	}

	@When("^click on Delete option for Agile Testing: A Practical Guide for Testers and Agile Teams book$")
	public void click_on_Delete_option_for_Agile_Testing_A_Practical_Guide_for_Testers_and_Agile_Teams_book() throws Throwable {
	    
		 //click on delete for agile
		 Thread.sleep(5000);
		 con.driver.findElement(By.cssSelector("input[aria-label='Delete Agile Testing: A Practical Guide for Testers and Agile Teams, 1e']")).click();
		   
	    
	}

	@When("^increse the quantity to three for Selenium WebDriver (\\d+) Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, (\\d+)nd Edition book$")
	public void increse_the_quantity_to_three_for_Selenium_WebDriver_Practical_Guide_End_to_end_automation_testing_for_web_and_mobile_browsers_with_Selenium_WebDriver_nd_Edition_book(int arg1, int arg2) throws Throwable {
	   
		 //Click on quantity dropdown box for selenium
		 Thread.sleep(8000);
		 con.driver.findElement(By.cssSelector("#a-autoid-0-announce")).click();
		 
		  
		//click on required quantity for selenium book(quantity=3)
		 con.driver.findElement(By.cssSelector("a#dropdown1_2")).click();
	}

	@When("^click on gift checkox for Selenium WebDriver (\\d+) Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, (\\d+)nd Edition book$")
	public void click_on_gift_checkox_for_Selenium_WebDriver_Practical_Guide_End_to_end_automation_testing_for_web_and_mobile_browsers_with_Selenium_WebDriver_nd_Edition_book(int arg1, int arg2) throws Throwable {
	    
		 //select  gift checkbox for selenium book
		 Thread.sleep(5000);
		 con.driver.findElement(By.xpath("//div[@class='a-checkbox sc-gift-option a-align-top a-size-small a-spacing-top-micro']//input")).click(); 

	    
	}

	@Then("^user should be able to see the appropriate books added with selected quantity$")
	public void user_should_be_able_to_see_the_appropriate_books_added_with_selected_quantity() throws Throwable {
	   
		String expres="Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition";
		String actres =con.driver.findElement(By.cssSelector("span[class='a-size-medium sc-product-title a-text-bold']")).getText();
		
		String actquantity=con.driver.findElement(By.cssSelector("span[class='a-dropdown-prompt']")).getText();
		String expquantity ="3";
		
		Assert.assertEquals(expres, actres);
		Assert.assertEquals(expquantity,actquantity );
		
		
		
	   
	}


}
