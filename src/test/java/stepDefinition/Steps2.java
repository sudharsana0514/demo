package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps2 {
	
	static WebDriver driver;	
	
	@Given("The user is in Add Tariff Plan to Customer Page.")
	public void the_user_is_in_Add_Tariff_Plan_to_Customer_Page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\Cucumber\\cucccumber\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/telecom");
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.xpath("//a[text()='Add Tariff Plan to Customer']")).click();
	}

	@When("The user fills in the valid Customer ID.")
	public void the_user_fills_in_the_valid_Customer_ID() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("customer_id")).sendKeys("300276");	   
	}
	
	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@value='submit']")).click();
	}

	@Then("The user should see the Sucess Message.")
	public void the_user_should_see_the_Sucess_Message() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
	}
}
