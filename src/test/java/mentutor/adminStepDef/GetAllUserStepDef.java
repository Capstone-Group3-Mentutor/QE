package mentutor.adminStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.loginAdmin.AdminAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class GetAllUserStepDef {

    @Steps
    AdminAPI adminAPI;

    @Given("Get all user using valid path with authorization")
    public void getAllUserUsingValidPathWithAuthorization() {
        adminAPI.getAllUsers();
    }

    @When("Send request get all user")
    public void sendRequestGetAllUser() {
        SerenityRest.when().get(adminAPI.GET_ALL_USERS);
    }

    @Given("Get all user using valid path without authorization")
    public void getAllUserUsingValidPathWithoutAuthorization() {
        adminAPI.getAllUsersWithoutAuth();
    }
}
