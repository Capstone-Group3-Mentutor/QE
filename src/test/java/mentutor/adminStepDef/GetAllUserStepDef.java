package mentutor.adminStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GetAllUserStepDef {
    @Given("Get all user using valid path {string} with authorization")
    public void getAllUserUsingValidPathWithAuthorization(String path) {
    }

    @When("Send request get all user")
    public void sendRequestGetAllUser() {
    }

    @Given("Get all user using valid path {string} without authorization")
    public void getAllUserUsingValidPathWithoutAuthorization(String path) {
    }
}
