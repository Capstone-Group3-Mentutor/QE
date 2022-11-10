package mentutor.adminStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteClassStefDef {


    //DeleteClass_001
    @Given("Delete class with valid id {int}")
    public void deleteClassWithValidIdId(int id) {
    }

    @When("Send request delete a class")
    public void sendRequestDeleteAClass() {
    }

    @Then("Should return status code {int} OK")
    public void shouldReturnStatusCodeOK(int OK) {
    }

    @And("Response body should contain message {string}")
    public void responseBodyShouldContainMessage(String message) {
    }

    //DeleteClass_002
    @Given("Delete class valid id {int} without authorized")
    public void deleteClassValidIdIdWithoutAuthorized(int id) {
    }

    @Then("Should return status code {int} Bad request")
    public void shouldReturnStatusCodeBadRequest(int bad) {
    }

    //DeleteClass_003
    @Given("Delete class unregistered Id {int}")
    public void deleteClassUnregisteredIdId(int id) {
    }

    @Then("Should return status code {int} Not Found")
    public void shouldReturnStatusCodeNotFound(int notFound) {
    }

    //DeleteClass_004
    @Given("Delete class unregistered Id {string}")
    public void deleteClassUnregisteredId(String id) {
    }

    //DeleteClass_005
    @Given("Delete class with Id {int} has been deleted")
    public void deleteClassWithIdIdHasBeenDeleted(int id) {
    }
}
