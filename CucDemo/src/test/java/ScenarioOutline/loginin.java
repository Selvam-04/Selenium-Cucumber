package ScenarioOutline;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginin
{

	@Given("I wants to enter {string}")
	public void i_wants_to_enter(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(string);
	}

	@When("I entered {string}")
	public void i_entered(String string) {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println(string);
	}


@Then("Logged in")
public void logged_in() {
    // Write code here that turns the phrase above into concrete actions
     System.out.println("ok");
}
@Given("I want to create an account")
public void i_want_to_create_an_account() {
    // Write code here that turns the phrase above into concrete actions
     System.out.println("registered");
}

@When("I enter my credentials")
public void i_enter_my_credentials(io.cucumber.datatable.DataTable dataTable) 
{
	List <Map<String,String>> list=dataTable.asMaps(String.class,String.class);
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).get("username"));
        System.out.println(list.get(i).get("password"));
	}
    }

@Then("I verify the account")
public void i_verify_the_account() {
    // Write code here that turns the phrase above into concrete actions
     
}



}
