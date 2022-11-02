package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyFirstStepDefinitions {
    @Given("^user on web \"([^\"]*)\"$")
    public void user_on_web(String arg1) throws Throwable {
        System.out.println("user_on_web");
    }

    @Then("^user should see header logo apple$")
    public void user_should_see_header_logo_apple() throws Throwable {
        System.out.println("user should see header logo apple");
    }

    @When("^user clicked \"([^\"]*)\" button$")
    public void user_clicked_button(String arg1) throws Throwable {
        System.out.println("user clicked login");
    }

    @Then("^user should see \"([^\"]*)\" text$")
    public void user_should_see_text(String arg1) throws Throwable {
        System.out.println("user see text" + arg1);
    }

    @Then("^appear colors$")
    public void appear_colors() throws Throwable {
        System.out.println("5");
    }

    @When("^user clicked on Deep Purple Colors$")
    public void user_clicked_on_Deep_Purple_Colors() throws Throwable {
        System.out.println("user choose deep colours");
    }

    @Then("^user should see memory of Iphone$")
    public void user_should_see_memory_of_Iphone() throws Throwable {
        System.out.println("user see memory of Iphone");
    }

    @Then("^user chosen (\\d+)TB memory of Iphone$")
    public void user_chosen_TB_memory_of_Iphone(int arg1) throws Throwable {
        System.out.println(8);
    }

    @Then("^appear payment options$")
    public void appear_payment_options() throws Throwable {
        System.out.println(9);
    }

    @Then("^user should pay$")
    public void user_should_pay() throws Throwable {
        System.out.println(10);
    }

    @And("^user clicked \"([^\"]*)\" buttons$")
    public void userClickedButtons(String arg0) throws Throwable {
        System.out.println("user see " + arg0);
    }


}
