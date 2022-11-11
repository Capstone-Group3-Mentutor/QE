package mentutor.adminStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.adminBackground.AdminAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class GetAllUserStepDef {

    @Steps
    AdminAPI adminApi;

    @Given("Get all user using valid path with authorization")
    public void getAllUserUsingValidPathWithAuthorization() {
        adminApi.getAllUsers();
    }

    @When("Send request get all user")
    public void sendRequestGetAllUser() {
        SerenityRest.when().get(adminApi.GET_ALL_USER);
    }

    @Given("Get all user using valid path without authorization")
    public void getAllUserUsingValidPathWithoutAuthorization() {
        adminApi.getAllUsersWithoutAuth();
    }
}
