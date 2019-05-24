package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps1 {
	static WebDriver driver;	
	
	@Given("The user is in Add Tariff Plan page.")
	public void the_user_is_in_Add_Tariff_Plan_page() {
		System.setProperty("webdriver.chrome.driver","D:\\Cucumber\\cucccumber\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/telecom");
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}
	
	@When("The user fills in the valid Plan details.{string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fills_in_the_valid_Plan_details(String MonthRental,String FreeLocMins,String FreeIntMins,
			String FreeSMS,String LocCharges,String IntCharges,String SMSCharges )
	{	       
		    driver.findElement(By.id("rental1")).sendKeys(MonthRental);	
		    driver.findElement(By.id("local_minutes")).sendKeys(FreeLocMins);	
		    driver.findElement(By.id("inter_minutes")).sendKeys(FreeIntMins);	
		    driver.findElement(By.id("sms_pack")).sendKeys(FreeSMS);	
		    driver.findElement(By.id("minutes_charges")).sendKeys(LocCharges);	
		    driver.findElement(By.id("inter_charges")).sendKeys(IntCharges);	
		    driver.findElement(By.id("sms_charges")).sendKeys(SMSCharges);	
	}

	@When("The user clicks the submit buttons.")
	public void the_user_clicks_the_submit_buttons() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("submit")).click();
	}

	@Then("The user shouid see the Sucess Message.")
	public void the_user_shouid_see_the_Sucess_Message() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
	}
	
	@When("The user clicks the Reset button.")
	public void the_user_clicks_the_Reset_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@value='Reset']")).click();
	}

	@Then("The user shouid see the Form Cleared.")
	public void the_user_shouid_see_the_Form_Cleared() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed()); 
	}
}
