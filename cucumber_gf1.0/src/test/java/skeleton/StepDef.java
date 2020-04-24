package skeleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	WebDriver driver;
	
	@Given("user should navigates to demowebshop on chrome browser")
	public void user_should_navigates_to_demowebshop_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Selenium\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com");
        
	}

	@When("users should click on register link")
	public void users_should_click_on_register_link() {
	    driver.findElement(By.linkText("Register")).click();
	  
	}

	@When("user selexts gender")
	public void user_selexts_gender() {
	    driver.findElement(By.id("gender-female")).click();
	   
	}

	@When("user enter with first name")
	public void user_enter_with_first_name() {
		   driver.findElement(By.name("FirstName")).sendKeys("Pranali");
		
	}

	@When("user enter with last name")
	public void user_enter_with_last_name() {
	    driver.findElement(By.name("LastName")).sendKeys("Mankar");
	  
	}

	@When("user enter with email")
	public void user_enter_with_email() {
		   driver.findElement(By.name("Email")).sendKeys("pranali1@gmail.com");
		 
	}

	@When("user enter with passwpord")
	public void user_enter_with_passwpord() {
		   driver.findElement(By.name("Password")).sendKeys("password123");
		  
	}

	@When("user enter with confirm password")
	public void user_enter_with_confirm_password() {
		   driver.findElement(By.name("ConfirmPassword")).sendKeys("password123");
		
	}

	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
	    driver.findElement(By.id("register-button")).click();
	
	}

	@Then("user should verify registration success")
	public void user_should_verify_registration_success() {
		 Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register");
		 driver.close();
	    
	}
	
	@When("user enter with first name as {string}")
	public void user_enter_with_first_name_as(String fn) {
		driver.findElement(By.name("FirstName")).sendKeys(fn);
	    	}

	@When("user enter with last name as {string}")
	public void user_enter_with_last_name_as(String ln) {
		driver.findElement(By.name("LastName")).sendKeys(ln);
	}

	@When("user enter with email as {string}")
	public void user_enter_with_email_as(String email) {
		driver.findElement(By.name("Email")).sendKeys(email);
	}

	@When("user enter with passwpord {string}")
	public void user_enter_with_passwpord(String pwd) {
		driver.findElement(By.name("Password")).sendKeys(pwd);
	}

	@When("user enter with confirm password as {string}")
	public void user_enter_with_confirm_password_as(String confirmpwd) {
		 driver.findElement(By.name("ConfirmPassword")).sendKeys(confirmpwd);
	    
	}



}
