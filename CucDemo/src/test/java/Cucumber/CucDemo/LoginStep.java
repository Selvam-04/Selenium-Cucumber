package Cucumber.CucDemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep 
{
	@Given("Users enters username")
	public void users_enters_username()  
	{
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("Enter username");
	}

	@When("User enters password")
	public void user_enters_password() 
	{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("passsword is given");     
	}

	@When("Click on password")
	public void click_on_password() 
	{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on login");
	}

	@Then("Homepage is displayed")
	public void homepage_is_displayed() 
	{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on homepage");
	}

}
