package mentutor.adminStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.loginAdmin.AdminAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class DeleteUserStepDef {
    @Steps
    AdminAPI adminAPI;

    //DeleteUser_001
    @Given("Delete user with valid id {int}")
    public void deleteUserWithValidIdId(int id) {
        adminAPI.deleteUserWithValidID(id);
    }

    @When("Send request delete a user")
    public void sendRequestDeleteAUser() {
        SerenityRest.when().delete(AdminAPI.DELETE_USER);
    }

    //DeleteUser_002
    @Given("Delete user valid id {int} without authorized")
    public void deleteUserValidIdIdWithoutAuthorized(int id) {
        adminAPI.deleteUserWithoutAuth(id);
    }

    //DeleteUser_003
    @Given("Delete user unregistered Id {int}")
    public void deleteUserUnregisteredIdId(int id) {
        adminAPI.deleteUserWithUnregisterID(id);
    }

    //DeleteUser_004
    @Given("Delete user invalid Id {string}")
    public void deleteUserInvalidId(String id) {
        adminAPI.deleteUserWithInvalidID("id");
    }

    //DeleteUser_005
    @Given("Delete user with Id {int} has been deleted")
    public void deleteUserWithIdIdHasBeenDeleted(int id) {
        adminAPI.deleteUserHasBeenDeletedID(id);

    }
}
