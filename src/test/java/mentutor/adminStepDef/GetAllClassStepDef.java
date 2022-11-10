package mentutor.adminStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GetAllClassStepDef {

    //GetAllClass_001
    @Given("Get all class using valid path {string} with authorization")
    public void getAllClassUsingValidPathWithAuthorization(String path) {
    }

    @When("Send request get all class")
    public void sendRequestGetAllClass() {
    }

    //GetAllClass_002
    @Given("Get all class using valid path {string} without authorization")
    public void getAllClassUsingValidPathWithoutAuthorization(String path) {
    }
}
