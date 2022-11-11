package mentutor.adminStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.loginAdmin.AdminAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;


public class DeleteClassStefDef {

    @Steps
    AdminAPI adminAPI;

    //DeleteClass_001
    @Given("Delete class with valid id {int}")
    public void deleteClassWithValidIdId(int id) {
        adminAPI.deleteClassValidID(id);
    }

    @When("Send request delete a class")
    public void sendRequestDeleteAClass() {
        SerenityRest.when().delete(AdminAPI.DELETE_CLASS);
    }

    @Then("Should return status code {int} OK")
    public void shouldReturnStatusCodeOK(int OK) {
        SerenityRest.then().statusCode(OK);
    }

     //DeleteClass_002
    @Given("Delete class valid id {int} without authorized")
    public void deleteClassValidIdIdWithoutAuthorized(int id) {
        adminAPI.deleteClassWithoutAuth(id);
    }

    @Then("Should return status code {int} Bad request")
    public void shouldReturnStatusCodeBadRequest(int bad) {
        SerenityRest.then().statusCode(bad);
    }

    //DeleteClass_003
    @Given("Delete class unregistered Id {int}")
    public void deleteClassUnregisteredIdId(int id) {
        adminAPI.deleteClassUnregisterID(id);
    }

    @Then("Should return status code {int} Not Found")
    public void shouldReturnStatusCodeNotFound(int notFound) {
        SerenityRest.then().statusCode(notFound);
    }

    //DeleteClass_004
    @Given("Delete class invalid Id {string}")
    public void deleteClassInvalidId(String id) {
        adminAPI.deleteClassInvalidID("id");
    }

    //DeleteClass_005
    @Given("Delete class with Id {int} has been deleted")
    public void deleteClassWithIdIdHasBeenDeleted(int id) {
        adminAPI.deleteClassHasBeenDeletedID(id);
    }


}
