package mentutor.adminStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisNewClassStepDef {

    //RegisNewClass_001
    @Given("Post create new class with valid data")
    public void postCreateNewClassWithValidData() {
    }

    @When("Send request post create new class")
    public void sendRequestPostCreateNewClass() {
    }

    @Then("Should return status code {int} created")
    public void shouldReturnStatusCodeCreated(int created) {
    }

    @And("Post create new user json schema validator")
    public void postCreateNewUserJsonSchemaValidator() {
    }

    //RegisNewClass_002
    @Given("Post create new class without authorization")
    public void postCreateNewClassWithoutAuthorization() {
    }

    //RegisNewClass_003
    @Given("Post create new class with empty class name")
    public void postCreateNewClassWithEmptyClassName() {
    }

    //RegisNewClass_004
    @Given("Post create new class with numeric class name")
    public void postCreateNewClassWithNumericClassName() {
    }

    //RegisNewClass_005
    @Given("Post create new class with special char class name")
    public void postCreateNewClassWithSpecialCharClassName() {
    }
}
