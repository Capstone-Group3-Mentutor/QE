package mentutor.adminStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.LoginAPi;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class GetAllUserStepDef {

    @Steps
    LoginAPi loginAPi;

    @Given("Get all user using valid path with authorization")
    public void getAllUserUsingValidPathWithAuthorization() {
        loginAPi.getAllUsers();
    }

    @When("Send request get all user")
    public void sendRequestGetAllUser() {
        SerenityRest.when().get(loginAPi.GET_ALL_USERS);
    }

    @Given("Get all user using valid path without authorization")
    public void getAllUserUsingValidPathWithoutAuthorization() {
        loginAPi.getAllUsersWithoutAuth();
    }
}
