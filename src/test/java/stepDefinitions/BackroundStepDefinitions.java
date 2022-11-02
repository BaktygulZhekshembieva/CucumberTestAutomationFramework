package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackroundStepDefinitions {

    @Given("^user login to system$")
    public void user_login_to_system() throws Throwable {
        System.err.println("user login to system");
    }

    @When("^user input login with mock date$")
    public void user_input_login_with_mock_date() throws Throwable {
        System.err.println("user input login with mock date");
    }

    @When("^user clicked on login button$")
    public void user_clicked_on_login_button() throws Throwable {
        System.err.println("user clicked on login button");
    }

    @Then("^user in the system$")
    public void user_in_the_system() throws Throwable {
        System.err.println("Congraulations you are in");
    }

}
