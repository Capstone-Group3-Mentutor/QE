package mentutor.login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

import static org.hamcrest.Matchers.*;

public class loginStepDef {


    @Steps
    baseLoginAPI baseLoginAPI;
    @Given("User login with all valid data")
    public void userLoginWithAllValidData() {
        File json = new File(baseLoginAPI.JSON_FILE+"/Login/LoginUserWithValidData.json");
        baseLoginAPI.setLoginUser(json);
    }
    @Given("Mentor login with all valid data")
    public void mentorLoginWithAllValidData() {
//        if(email==null){
//            email="testerquality@gmail.com";
//            password="Admin123$";
//            HashMap<String, Object> json = new HashMap<String, Object>();
//            String s1 = email;
//            String s2 = password;
//            json.put("email", s1);
//            json.put("password", s2);
//            SerenityRest.given()
//                    .contentType("multipart/form-data")
//                    .multiPart("email", email)
//                    .multiPart("email", password);
//        }
        File json = new File(baseLoginAPI.JSON_FILE+"/Background/LoginMentor.json");
        baseLoginAPI.setLoginUser(json);

    }

    @When("Send request post login user")
    public void sendRequestPostLoginUser() {
        SerenityRest.when().post(baseLoginAPI.LOGIN_USER);
    }

    @And("Response body should contain id user {int}, name {string}, email {string}, class {} and role {string}")
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
        File json = new File(baseLoginAPI.JSON_FILE+"/Login/PostNewPostWithValidUserId.json");
        baseLoginAPI.setRegisterNewUser(json);
    }

    @When("Admin send request post new user")
    public void adminSendRequestPostNewUser() {
        SerenityRest.when().post(baseLoginAPI.REGISTER_NEW_USER);
    }









//    @And("Add foto")
//    public void addFoto() {
//    }
    @Given("User set login data wit unregistered email")
    public void userSetLoginDataWitUnregisteredEmail() {
        File json = new File(baseLoginAPI.JSON_FILE+"/Login/LoginUserWithUnregisteredEmail.json");
        baseLoginAPI.setLoginUser(json);
    }

    @Given("User login with invalid email")
    public void userLoginWithInvalidEmail() {
        File json = new File(baseLoginAPI.JSON_FILE+"/Login/LoginUserWithInvalidEmail.json");
        baseLoginAPI.setLoginUser(json);
    }

    @Given("User login with invalid Password")
    public void userLoginWithInvalidPassword() {
        File json = new File(baseLoginAPI.JSON_FILE+"/Login/LoginUserWithInvalidPassword.json");
        baseLoginAPI.setLoginUser(json);
    }

    @Given("User login with all invalid data")
    public void userLoginWithAllInvalidData() {
        File json = new File(baseLoginAPI.JSON_FILE+"/Login/LoginUserWithAllInvalidData.json");
        baseLoginAPI.setLoginUser(json);
    }

    @Given("User login with empty email")
    public void userLoginWithEmptyEmail() {
        File json = new File(baseLoginAPI.JSON_FILE+"/Login/LoginUserWithEmptyEmail.json");
        baseLoginAPI.setLoginUser(json);
    }

    @Given("User login with empty password")
    public void userLoginWithEmptyPassword() {
        File json = new File(baseLoginAPI.JSON_FILE+"/Login/LoginUserWithEmptyDassword.json");
        baseLoginAPI.setLoginUser(json);
    }

    @Given("User login with all empty data")
    public void userLoginWithAllEmptyData() {
        File json = new File(baseLoginAPI.JSON_FILE+"/Login/LoginUserWithAllEmptyData.json");
        baseLoginAPI.setLoginUser(json);
    }

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

    @Given("Admin reset Mentor data")
    public void adminResetMentorData() {
        File json = new File(baseLoginAPI.JSON_FILE+"/Background/LoginMentor.json");
        baseLoginAPI.setLoginUser(json);
    }
}
