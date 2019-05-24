package stepDefinition;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;


public class Steps {
	
	static WebDriver driver;	

	@Given("The user is in add customer page.")
	public void the_user_is_in_add_customer_page() {

		System.setProperty("webdriver.chrome.driver","D:\\Cucumber\\cucccumber\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/telecom");
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
	}

	@When("The user fills in the valid customer details")
	public void the_user_fills_in_the_valid_customer_details(DataTable customerDetails) {
	    // Write code here that turns the phrase above into concrete actions
	    List<String> CustomerList= customerDetails.asList(String.class);
	    driver.findElement(By.xpath("//label[text()='Done']"));
	    driver.findElement(By.id("fname")).sendKeys(CustomerList.get(0));	
	    driver.findElement(By.id("lname")).sendKeys(CustomerList.get(1));	
	    driver.findElement(By.id("email")).sendKeys(CustomerList.get(2));	
	    driver.findElement(By.name("addr")).sendKeys(CustomerList.get(3));	
	    driver.findElement(By.name("telephoneno")).sendKeys(CustomerList.get(4));	
	}

	@When("The user clicks the submit button.")
	public void the_user_clicks_the_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("submit")).click();
	}

	@Then("The user shouid see the customer ID generated.")	
	
	
	public void the_user_shouid_see_the_customer_ID_generated() {
	  		
		Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	}
}