//package mentutor.login;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.serenitybdd.rest.SerenityRest;
//import net.thucydides.core.annotations.Steps;
//
//import java.io.File;
//
//public class LoginAdminStefDef {
//    @Steps
//    LoginAPi loginAPi;
//
//    @Given("User login with valid data")
//    public void userLoginWithValidData() {
//        File json = new File(LoginAPi.JSON_FILE + "/LoginAdminBackground.json");
//        loginAPi.setLoginAdmin(json);
//    }
//
//    @When("Send request post login user")
//    public void sendRequestPostLoginUser() {
//        SerenityRest.when().post(loginAPi.LOGIN_ADMIN);
//    }
//
//    @And("Set token to Admin Token")
//    public void setTokenToAdminToken() {
//        loginAPi.TokenAdmin = SerenityRest.then().extract().path("data.token");
//    }
//
//
//
//}
