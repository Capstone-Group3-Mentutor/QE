package mentutor.login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import mentutor.login.base.SetBaseLogin;
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

    @And("Response body should contain id user {int}, name {string}, email {string}, class {} and role {string}")
    public void responseBodyShouldContainIdUserNameEmailAndRole(int id, String name, String email, String role) {
        SerenityRest.then()
                .body(LoginResponses.ID,equalTo(id))
                .body(LoginResponses.NAME,equalTo(name))
                .body(LoginResponses.EMAIL,equalTo(email))
                .body(LoginResponses.ROLE,equalTo(role));
    }

//    @Given("Admin register new mentor")
//    public void adminRegisterNewMentor() {
//
////        SerenityRest.get().body(LoginResponses.TOKEN);
//        File json = new File(LoginAPI.JSON_FILE+"/Login/PostNewPostWithValidUserId.json");
//        LoginAPI.setRegisterNewUser(json);
//    }

//    @When("Admin send request post new user")
//    public void adminSendRequestPostNewUser() {
//        SerenityRest.when().post(LoginAPI.REGISTER_NEW_USER);
//    }

    @And("Response body massage is {string}")
    public void responseBodyMassageIs(String response) {
        SerenityRest.then()
                .body(LoginResponses.MESSAGE,equalTo(response));
    }

    @And("Response body massage error is {string}")
    public void responseBodyMassageErrorIs(String response) {
        SerenityRest.then()
                .body(LoginResponses.ERROR_MESSAGE,equalTo(response));
    }
    @Given("Mentee login with all valid data")
    public void menteeLoginWithAllValidData() {
        String email = "setmentee@gmail.com";
        String password = "Admin123$";
        LoginAPI.setLoginUser(email, password);
    }
//    @And("Reset Mentor data")
//    public void resetMentorData() {
//        int id = 1010;
//        String email = "testerqulity@gmail.com";
//        String password = "Admin123$";
////        SerenityRest.when().post(LoginAPI.LOGIN_USER);
////        LoginAPI.BARIER_TOKEN = SerenityRest.then().extract().path("data.token");
//        LoginAPI.setResetUserData(id, email, password);
//    }
//    @When("Admin set admin token")
//    public void adminSetAdminToken() {
//        SerenityRest.when().post(LoginAPI.LOGIN_USER);
//        LoginAPI.BARIER_TOKEN = SerenityRest.then().extract().path("data.token");
//    }
}
