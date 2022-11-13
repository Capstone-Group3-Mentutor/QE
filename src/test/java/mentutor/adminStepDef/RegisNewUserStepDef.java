package mentutor.adminStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.loginAdmin.AdminAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class RegisNewUserStepDef {

    @Steps
    AdminAPI adminAPI;

    //RegisNewUser_001
    @Given("Post create new user with valid data")
    public void postCreateNewUserWithValidData() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserValidData.json");
        adminAPI.regisNewUserValidData(json);
    }

    @When("Send request post create new user")
    public void sendRequestPostCreateNewUser() {
        SerenityRest.when().post(AdminAPI.REGIS_NEW_USERS);
    }

    //RegisNewUser_002
    @Given("Post create new user without authorization")
    public void postCreateNewUserWithoutAuthorization() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserWithoutAuth.json");
        adminAPI.regisNewUserWithoutAuth(json);
    }

    //RegisNewUser_003
    @Given("Post create new user with empty name")
    public void postCreateNewUserWithEmptyName() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserWithEmptyName.json");
        adminAPI.regisNewUserEmptyName(json);
    }

    @Given("Post create new user with empty email")
    public void postCreateNewUserWithEmptyEmail() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserWithEmptyEmail.json");
        adminAPI.regisNewUserEmptyEmail(json);
    }

    @Given("Post create new user with empty password")
    public void postCreateNewUserWithEmptyPassword() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserWithEmptyPass.json");
        adminAPI.regisNewUserEmptyPass(json);
    }

    @Given("Post create new user with empty id_class")
    public void postCreateNewUserWithEmptyId_class() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserWithEmptyIdClass.json");
        adminAPI.regisNewUserEmptyIDClass(json);
    }

    @Given("Post create new user with empty Role")
    public void postCreateNewUserWithEmptyRole() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserWithEmptyRole.json");
        adminAPI.regisNewUserEmptyRole(json);
    }

    //RegisNewUser_008
    @Given("Post create new user with name more than two word name")
    public void postCreateNewUserWithNameMoreThanWordName() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserWithMoreName.json");
        adminAPI.regisNewUserMoreName(json);
    }

    //RegisNewUser_009
    @Given("Post create new user with special char in name")
    public void postCreateNewUserWithSpecialCharInName() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserWithCharName.json");
        adminAPI.regisNewUserCharName(json);
    }

    //RegisNewUser_0010
    @Given("Post create new user with numeric in name")
    public void postCreateNewUserWithNumericInName() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserWithNumName.json");
        adminAPI.regisNewUserNumName(json);
    }

    //RegisNewUser_011
    @Given("Post create new user with invalid email")
    public void postCreateNewUserWithInvalidEmail() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserInvalidEmail.json");
        adminAPI.regisNewUserInvalidEmail(json);
    }

    //RegisNewUser_012
    @Given("Post create new user with deleted email")
    public void postCreateNewUserWithDeletedEmail() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserDeletedEmail.json");
        adminAPI.regisNewUserDeletedEmail(json);
    }

    //RegisNewUser_013
    @Given("Post create new user with alphabet password")
    public void postCreateNewUserWithAlphabetPassword() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserAlphabetPass.json");
        adminAPI.regisNewUserAlphabetPass(json);
    }

    //RegisNewUser_014
    @Given("Post create new user with numeric password")
    public void postCreateNewUserWithNumericPassword() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserNumericPass.json");
        adminAPI.regisNewUserNumericPass(json);
    }

    //RegisNewUser_015
    @Given("Post create new user with special char password")
    public void postCreateNewUserWithSpecialCharPassword() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserCharPass.json");
        adminAPI.regisNewUserCharPass(json);
    }

    //RegisNewUser_016
    @Given("Post create new user with invalid id class")
    public void postCreateNewUserWithInvalidIdClass() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserInvalidIDClass.json");
        adminAPI.regisNewUserInvalidIDClass(json);
    }

    //RegisNewUser_017
    @Given("Post create new user with invalid role")
    public void postCreateNewUserWithInvalidRole() {
        File json = new File(AdminAPI.JSON_FILE+"/RegisNewUserInvalidRole.json");
        adminAPI.regisNewUserInvalidRole(json);
    }
}
