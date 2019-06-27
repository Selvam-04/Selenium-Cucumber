package pack;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login
{
	@Given("Users enters {string}")
	public void users_enters(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}

	@When("User enters password {string}")
	public void user_enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);     
	}

	@And("Click on password{int}")
	public void click_on_password(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("clicked"); 
	}

	@Then("Homepage is displayed{int}")
	public void homepage_is_displayed(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("homepage");
	     	}
	@When("user clicks on logout button")
	public void user_clicks_on_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("click logout"); 
	}

	@Then("user is successfully loggedout")
	public void user_is_successfully_loggedout() {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("logged out");
	}

	 }

	 
	

	 



