package mentutor.adminStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.loginAdmin.AdminAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class RegisNewClassStepDef {

    @Steps
    AdminAPI adminAPI;

    //RegisNewClass_001
    @Given("Admin create new class with class_name {string}")
    public void AdminCreateNewClassWithClassName(String className) {
        adminAPI.regisNewClassValidName(className);
    }

    @When("Send request post create new class")
    public void sendRequestPostCreateNewClass() {
        SerenityRest.when().post(AdminAPI.REGIS_NEW_CLASS);
    }

    @Then("Should return status code {int} created")
    public void shouldReturnStatusCodeCreated(int created) {
        SerenityRest.then().statusCode(created);
    }

    @And("Post create new user json schema validator")
    public void postCreateNewUserJsonSchemaValidator() {
    }

    //RegisNewClass_002
    @Given("Admin create new class class_name {string} without authorization")
    public void adminCreateNewClassWithoutAuthorization(String className) {
        adminAPI.regisNewClassWithoutAuth(className);
    }

    //RegisNewClass_003
    @Given("Post create new class with empty class name")
    public void postCreateNewClassWithEmptyClassName() {
        File json = new File(AdminAPI.JSON_FILE+"/PostNewClassEmptyClassName.json");
        adminAPI.regisNewClassEmptyClassName(json);
    }

    //RegisNewClass_004
    @Given("Admin create new class with class_name {int}")
    public void postCreateNewClassWithNumericClassName(int className) {
        adminAPI.regisNewClassNumericName(className);

    }

    //RegisNewClass_005
    @Given("Post create new class with special char class name")
    public void postCreateNewClassWithSpecialCharClassName() {
    }
}
