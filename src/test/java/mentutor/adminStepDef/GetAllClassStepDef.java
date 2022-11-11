package mentutor.adminStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.loginAdmin.AdminAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class GetAllClassStepDef {
    @Steps
    AdminAPI adminAPI;

    //GetAllClass_001
    @Given("Get all class using valid path with authorization")
    public void getAllClassUsingValidPathWithAuthorization() {
        adminAPI.getAllClass();
    }

    @When("Send request get all class")
    public void sendRequestGetAllClass() {
        SerenityRest.when().get(adminAPI.GET_ALL_CLASS);
    }

    @Given("Get all class using valid path without authorization")
    public void getAllClassUsingValidPathWithoutAuthorization() {
        adminAPI.getAllClassWithoutAuth();
    }

  }
