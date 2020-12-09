package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pageModels.NavMenu;
import utilities.Buttons;
import utilities.Condition;
import utilities.NotificationResults;
import utilities.ParentClass;

import static utilities.ElementClass.$;

public class UserStory01Steps extends ParentClass {

    @Given("^User navigate to Citizenships page$")
    public void userNavigateToCitizenshipsPage() {
        clickOnMenuTo(NavMenu.Citizenships);

    }

    @When("^User create a Citizenship name as \"([^\"]*)\" short name as \"([^\"]*)\"$")
    public void user_create_a_Citizenship_name_as_short_name_as(String name, String shortName) {
        $(PageButtonAdd).shouldBe(Condition.appear).click();
        $(DialogInputName).shouldBe(Condition.visible).setValue(name);
        $(DialogInputShortName).setValue(shortName);
        clickToDialogButton(Buttons.Save);


    }

    @Then("^Citizenships successfully should be created$")
    public void citizenships_successfully_should_be_created() {
        $(PopupMessageContainer).shouldBe(Condition.appear);
        verifyNotificationAs(NotificationResults.created);

    }
    @Given("^Navigate to dashboard$")
    public void navigate_to_dashboard()  {
   clickOnMenuTo(NavMenu.Dashboard);
    }

    @Given("^Navigate to Citizenships page$")
    public void navigate_to_Citizenships_page() {
      clickOnMenuTo(NavMenu.Citizenships);
    }

    @Then("^User update  Citizenship name as \"([^\"]*)\" to \"([^\"]*)\" short name as \"([^\"]*)\"$")
    public void userUpdateCitizenshipNameAsToShortNameAs(String oldName, String newName, String shortName) {
        editTableData(oldName);
        $(DialogInputName).shouldBe(Condition.appear).clear().setValue(newName);
        $(DialogInputShortName).clear().setValue(shortName);
        clickToDialogButton(Buttons.Save);

    }

    @Then("^Citizenships successfully should be updated$")
    public void citizenships_successfully_should_be_updated() {
        $(PopupMessageContainer).shouldBe(Condition.appear);
        verifyNotificationAs(NotificationResults.updated);

    }
    @Given("^User Navigate to dashboard$")
    public void user_Navigate_to_dashboard() {
    clickOnMenuTo(NavMenu.Dashboard);
    }

    @Given("^User Navigate to Citizenships page$")
    public void user_Navigate_to_Citizenships_page()  {
       clickOnMenuTo(NavMenu.Citizenships);
    }
    @Then("^User delete the \"([^\"]*)\"$")
    public void user_delete_the(String citizenship)  {
        deleteTableData(citizenship);

    }

    @Then("^Citizenships successfully should be deleted$")
    public void citizenships_successfully_should_be_deleted()  {

       $(PopupMessageContainer).shouldBe(Condition.appear);
        verifyNotificationAs(NotificationResults.deleted);

    }


}
