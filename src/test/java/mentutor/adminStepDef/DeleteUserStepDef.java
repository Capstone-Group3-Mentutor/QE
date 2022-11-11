package mentutor.adminStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DeleteUserStepDef {


    //DeleteUser_001
    @Given("Delete user with valid id {int}")
    public void deleteUserWithValidIdId(int id) {
    }

    @When("Send request delete a user")
    public void sendRequestDeleteAUser() {
    }

    //DeleteUser_002
    @Given("Delete user valid id {int} without authorized")
    public void deleteUserValidIdIdWithoutAuthorized(int id) {
    }

    //DeleteUser_003
    @Given("Delete user unregistered Id {int}")
    public void deleteUserUnregisteredIdId(int id) {
    }

    //DeleteUser_004
    @Given("Delete user unregistered Id {string}")
    public void deleteUserUnregisteredId(String id) {
    }

    //DeleteUser_005
    @Given("Delete user with Id {int} has been deleted")
    public void deleteUserWithIdIdHasBeenDeleted(int id) {
    }
}
