package stepDefinitions;


import cucumber.api.java.en.When;

public class ScenarioOutLineDefinitions {
    @When("^user input field \"([^\"]*)\" with following credentials First name$")
    public void user_input_field_with_following_creadebtials_First_name(String firstName)  {
        System.out.println("User input " + firstName);
    }

    @When("^user input field \"([^\"]*)\" with following credentials Last name$")
    public void user_input_field_with_following_creadebtials_Last_name(String lastName)  {
        System.out.println("User input " + lastName);
    }

    @When("^user input field \"([^\"]*)\" with following credentials Email$")
    public void user_input_field_with_following_creadebtials_Email(String emailAddress)  {
        System.out.println("User input " + emailAddress);
    }

    @When("^user input field \"([^\"]*)\" with following credentials Username$")
    public void user_input_field_with_following_creadebtials_Username(String userName)  {
        System.out.println("User input " + userName);
    }

    @When("^user input field \"([^\"]*)\" with following credentials Password$")
    public void user_input_field_with_following_creadebtials_Password(String password)  {
        System.out.println("User input " + password);
    }

    @When("^user input field \"([^\"]*)\" with following credentials BIO$")
    public void user_input_field_with_following_creadebtials_BIO(String bio)  {
        System.out.println("User input " + bio);
    }


}
