package mentutor.loginAdmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class LoginAdminStefDef {
    @Steps
    AdminAPI adminAPI;

    @Given("User login with valid data")
    public void userLoginWithValidData() {
        File json = new File(AdminAPI.JSON_FILE + "/LoginAdminBackground.json");
        adminAPI.setLoginAdmin(json);
    }
    
    @When("Send request post login user")
    public void sendRequestPostLoginUser() {
        SerenityRest.when().post(adminAPI.LOGIN_ADMIN);
    }

    @And("Set token to Admin Token")
    public void setTokenToAdminToken() {
        adminAPI.TokenAdmin = SerenityRest.then().extract().path("data.token");
    }



}
