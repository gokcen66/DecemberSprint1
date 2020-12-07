package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import utilities.ParentClass;

import static utilities.ElementsClass.$$;


public class LoginSteps extends ParentClass {
    @Given("^user navigate to basqar$")
    public void userNavigateToBasqar() {
        getHomePage();
    }

    @When("^user loggin to basqar$")
    public void userLogginToBasqar() {
        login();
    }

    @Then("^login should be successfull$")
    public void loginShouldBeSuccessfull() {
        Assert.assertTrue($$(DashBoard).getElements().size()>0);
    }
}
