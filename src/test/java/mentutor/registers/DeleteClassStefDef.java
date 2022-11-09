package mentutor.registers;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteClassStefDef {

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

    @Given("Delete class valid id <id> without authorized")
    public void deleteClassValidIdIdWithoutAuthorized() {
    }

    @Then("Should return status code {int} Bad request")
    public void shouldReturnStatusCodeBadRequest(int bad) {
    }

    @Given("Delete class unregistered Id <id>")
    public void deleteClassUnregisteredIdId() {
    }

    @Then("Should return status code {int} Not Found")
    public void shouldReturnStatusCodeNotFound(int arg0) {
    }

    @Given("Delete class unregistered Id {string}")
    public void deleteClassUnregisteredId(String arg0) {
    }

    @Given("Delete class with Id <id> has been deleted")
    public void deleteClassWithIdIdHasBeenDeleted() {
    }
}
