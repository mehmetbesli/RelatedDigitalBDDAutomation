package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {

    Page page=new Page();


    @Given("^Go to \"([^\"]*)\" url$")
    public void goToUrl(String url) throws Throwable {
        page.initializeDriver();
        page.gotoUrl(url);
    }

    @When("^Click login button$")
    public void clickLoginButton() throws InterruptedException {
        page.clickLogin();
    }

    @And("^Type \"([^\"]*)\" email and \"([^\"]*)\" password$")
    public void typeUsernameAndPassword(String username, String passwword) throws Throwable {
        page.typeEmailAndPassword(username,passwword);
    }

    @Then("^Click Oturum ac button$")
    public void clickOturumAcButton() throws InterruptedException {
        page.OturumAc();
    }

    @And("^Get error message \"([^\"]*)\"$")
    public void getErrorMessage(String errorMessage) throws Throwable {
        page.errorMessage(errorMessage);
    }

    @And("^Close driver$")
    public void closeDriver() {
        page.closeDriver();
    }
}
