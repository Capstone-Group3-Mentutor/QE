package mentutor.login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import java.io.File;
import java.util.HashMap;

import static mentutor.registers.registerVariable.*;
import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.*;

import static org.hamcrest.Matchers.*;
public class loginStepDef {

//    private String token;
//    public String getToken(){
//
//    }

    @Steps
    loginAPI LoginAPI;
    @Given("User login with all valid data")
    public void userLoginWithAllValidData() {
        File json = new File(LoginAPI.JSON_FILE+"/LoginAdmin.json");
        LoginAPI.setLoginUser(json);
    }

    @When("Send request post login user")
    public void sendRequestPostLoginUser() {
        SerenityRest.when().post(LoginAPI.LOGIN_USER);
    }

    @Then("Should return {int} OK")
    public void shouldReturnOK(int OK) {
        SerenityRest.then().statusCode(OK);
    }

    @And("Response body should contain id user {int}, name {string},email {string} and role {string}")
    public void responseBodyShouldContainIdUserNameEmailAndRole(int id, String name, String email, String role) {
        SerenityRest.then()
                .body(LoginResponses.ID,equalTo(id))
                .body(LoginResponses.NAME,equalTo(name))
                .body(LoginResponses.EMAIL,equalTo(email))
                .body(LoginResponses.ROLE,equalTo(role));
    }

    @Given("Admin register new mentor")
    public void adminRegisterNewMentor() {
//        SerenityRest.get().body(LoginResponses.TOKEN);
        File json = new File(LoginAPI.JSON_FILE+"/PostNewPostWithValidUserId.json");
        LoginAPI.setRegisterNewUser(json);
    }

    @When("Admin send request post new user")
    public void adminSendRequestPostNewUser() {
        SerenityRest.when().post(LoginAPI.REGISTER_NEW_USER);
    }

    @Given("User set update profile data")
    public void userSetUpdateProfileData() {
        File json = new File(LoginAPI.JSON_FILE+"/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateUserProfile(json);
    }

    @When("User send request put update data")
    public void userSendRequestPutUpdateData() {
        SerenityRest.when().put(LoginAPI.UPDATE_USER_PROFILE);
    }

    @And("Set token to Mentor Token")
    public void setTokenToMentorToken() {
        LoginAPI.BARIER_TOKEN= SerenityRest.then().extract().path("data.token");
    }

    @Then("Should return {int} Created")
    public void shouldReturnCreated(int Created) {
        SerenityRest.then().statusCode(Created);
    }

    @And("Add foto")
    public void addFoto() {
    }
}
