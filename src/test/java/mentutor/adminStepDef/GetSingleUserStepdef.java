package mentutor.adminStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetSingleUserStepdef {

    //GetSingleUser_001
    @Given("Get single user using valid id {int} with authorization")
    public void getSingleUserUsingValidIdIdWithAuthorization(int id) {
    }

    @When("Send request get single user")
    public void sendRequestGetSingleUser() {
    }

    @And("Get single user json schema validator")
    public void getSingleUserJsonSchemaValidator() {
    }

    //GetSingleUser_002
    @Given("Get single user using valid id {int} without authorization")
    public void getSingleUserUsingValidIdIdWithoutAuthorization(int id) {
    }

    //GetSingleUser_003
    @Given("Get single user with unregistered id {int}")
    public void getSingleUserWithUnregisteredIdId(int id) {
    }

    @Then("Should return status code {int} Method Not Allowed")
    public void shouldReturnStatusCodeMethodNotAllowed(int id) {
    }

    //GetSingleUser_004
    @Given("Get single user with invalid id {string}")
    public void getSingleUserWithInvalidIdId(String id) {
    }

    //GetSingleUser_005
    @Given("Get single user with id {int} has been deleted")
    public void getSingleUserWithIdIdHasBeenDeleted(int id) {
    }

}
