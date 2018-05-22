package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.MouseAction.Button;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	String productname,productprice;
	
	@Given("^user is  on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		
		/* */
		/* WebElement navBTN=driver.findElement(By.id("nav-link-accountList"));
			navBTN.click();
		 WebElement signOutBTN =driver.findElement(By.xpath("//*[@id='nav-item-signout-sa']"));
		 signOutBTN.click();*/
		 
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.id("nav-link-accountList"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id='nav-item-signout-sa']"))).click().build().perform();
	 
	}


	@Given("^Open https://www\\.amazon\\.com$")
	public void open_https_www_amazon_com() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\SeleniumTest\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.amazon.com");
	}

	@Given("^I am on Signin page$")
	public void i_am_on_Signin_page() throws Throwable {
		WebElement loginBTN = driver.findElement(By.id("nav-link-accountList"));
		loginBTN.click();
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		WebElement loginEmailTextBox = driver.findElement(By.id("ap_email"));
		loginEmailTextBox.sendKeys(arg1);
		WebElement continueBTN = driver.findElement(By.id("continue"));
		continueBTN.click();
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		WebElement loginPasswordTextBox = driver.findElement(By.id("ap_password"));
		loginPasswordTextBox.sendKeys(arg1);
		WebElement signBTN = driver.findElement(By.id("signInSubmit"));
		signBTN.click();
	}

	@Then("^Login should fail as \"([^\"]*)\"$")
	public void login_should_fail_as (String arg1) throws Throwable {
	   String errormessage=driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")).getText().trim();
	 
	   if(errormessage.equals(arg1)) {
		   System.out.println("Test Passed Login failed");
		   
	   }else {	
		   System.out.println("Test Failed");
	   }
	   
	  
	}
	
	@Then("^I should see home page header as \"([^\"]*)\"$")
	public void i_should_see_home_page_header_as (String arg1) throws Throwable {
	   String loginname=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).getText().trim();
	 
	   if(loginname.equals(arg1)) {
		   System.out.println("Test Passed");
	   }else {	
		   System.out.println("Test Failed");
	   }
	}
	
	@Then("^I Signout$")
	public void i_signout () throws Throwable {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
		WebElement oElement7 = driver.findElement(By.xpath("//*[@id=\"nav-item-signout-sa\"]"));
		            oElement7.click();
	}
	
	
	
	@Then("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws Throwable {
		
		WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTextBox.sendKeys(arg1);
		WebElement searchBTN=driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		searchBTN.click();
		
		
	    
	}

	@Then("^I choose to buy first item$")
	public void i_choose_to_buy_first_item() throws Throwable {
		
	    WebElement selectFirstItem=driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div/div/div[1]/div/div/a/img"));
	    selectFirstItem.click();
	    
	}

	@Then("^I add item to basket$")
	public void i_add_item_to_basket() throws Throwable {
		productname=driver.findElement(By.xpath("//*[@id=\"productTitle\"]")).getText().trim();
		productprice=driver.findElement(By.xpath("//*[@id=\"priceblock_ourprice\"]")).getText().trim();
		WebElement addCartBTN=driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		addCartBTN.click();
		 String itemCount=driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).getText();
		 if(itemCount.equals("1"))
		   {
			   System.out.println("Test Passed Item is added successfuly");
		   }else {
			   System.out.println("Test Failed Item is not added successfuly");
			   Actions actions = new Actions(driver);
				actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
				WebElement oElement7 = driver.findElement(By.xpath("//*[@id=\"nav-item-signout-sa\"]"));
				            oElement7.click();
			   
		   }
	   
	}

	@Then("^I close driver and browser$")
	public void i_close_driver_and_browser() throws Throwable {
		
		 driver.close();
	}
	
	
	@Then("^I validate item from basket$")
	public void i_validate_item_from_basket() throws Throwable {
	   WebElement basketBTN=driver.findElement(By.xpath("//*[@id=\"nav-cart\"]"));
	   basketBTN.click();
	   String pdname=driver.findElement(By.xpath("//*[@id=\"activeCartViewForm\"]/div[2]/div/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span")).getText().trim();
	   String pdprice=driver.findElement(By.xpath("//*[@id=\"activeCartViewForm\"]/div[2]/div/div[4]/div/div[2]/p/span")).getText().trim();
	   System.out.println(productname+"::"+pdname);
	   System.out.println(productprice+"::"+pdprice);
	   
	   if(pdname.equals(productname)&& pdprice.equals(productprice))
	   {
		   System.out.println("Test Passed Item is added successfuly");
	   }else {
		   System.out.println("Test Failed Item is not added successfuly");
	   		
	   }
	}

	@Then("^I should see item in basket$")
	public void i_should_see_item_in_basket() throws Throwable {
	   String itemCount=driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).getText();
	   if(itemCount.equals("1"))
	   {
		   System.out.println("Test Passed Item is present");
	   }else {
		   System.out.println("Test Failed Item is not present");
		   driver.close();
		   		
	   }
	}
	
	@Then("^I remove item from basket$")
	public void i_remove_item_from_basket() throws Throwable {
		  WebElement basketBTN=driver.findElement(By.xpath("//*[@id=\"nav-cart\"]"));
		  basketBTN.click();
		  
		  WebElement removeBTN=driver.findElement(By.xpath("//*[@id=\"activeCartViewForm\"]/div[2]/div/div[4]/div/div[1]/div/div/div[2]/div/span[1]/span/input"));
		  removeBTN.click();
		  Thread.sleep(1000);
	}

}
