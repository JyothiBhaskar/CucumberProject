package stepDefinition;

import org.junit.Assert;

import browserfactory.com.BrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.com.LoginPage;


public class Loginpage {
	
	LoginPage page;
	
	
	@Given("I want to access the application")
	public void i_want_to_access_the_application() {
	    
	page=new LoginPage(BrowserFactory.getDriver());
	}

	@Then("validate Homepage")
	public void validate_homepage() {
	    Assert.assertTrue(page.isLogoDisplayed());

	}

	@Given("Access the application")
	public void access_the_application() {
		
		page=new LoginPage(BrowserFactory.getDriver());

	}


	@When("user enter Username {string}")
	public void user_enter_username(String string) {
		page.LoginP(string);
		//Assert.assertTrue(false);
	}

	


}
