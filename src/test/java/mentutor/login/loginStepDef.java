package mentutor.login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import mentutor.login.base.SetBaseLogin;
import mentutor.mentee.menteeAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import java.io.File;
import java.util.HashMap;
import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.*;

import static org.hamcrest.Matchers.*;
public class loginStepDef {


    @Steps
    SetBaseLogin LoginAPI;
    @Given("User login with email {string} and password {string}")
    public void userLoginWithAllValidData(String email, String password) {
        LoginAPI.setLoginUser(email, password);
    }
    @Given("Mentor login with all valid data")
    public void mentorLoginWithAllValidData() {
        String email = "setmentor@gmail.com";
        String password = "Admin123$";
        LoginAPI.setLoginUser(email, password);

    }
    @When("User send request post login user")
    public void sendRequestPostLoginUser() {
        SerenityRest.when().post(LoginAPI.LOGIN_USER);
    }
    @And("Response body massage is {string}")
    public void responseBodyMassageIs(String response) {
        SerenityRest.then()
                .body(LoginResponses.MESSAGE,equalTo(response));
    }
    @Given("Mentee login with all valid data")
    public void menteeLoginWithAllValidData() {
        String email = "setmentee@gmail.com";
        String password = "Admin123$";
        LoginAPI.setLoginUser(email, password);
    }
    @Given("Mentee set token to Mentee Token")
    public void menteeSetTokenToMenteeToken() {
        LoginAPI.setGetAllClassTask();
    }

    @When("User send request get all class task")
    public void userSendRequestGetAllClassTask() {
        SerenityRest.when().get(menteeAPI.GET_ALL_CLASS_TASK);
    }
}
