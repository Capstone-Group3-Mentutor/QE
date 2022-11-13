package mentutor.adminStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.loginAdmin.AdminAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class UpdateUserStepDef {

    @Steps
    AdminAPI adminAPI;


    @Given("Update user with id {int} set request body name {string}, email {string}, password {string}, images {string} and id_class {int}")
    public void updateUserWithIdIdSetRequestBodyNameEmailPasswordImagesAndId_classId_class(int id, String name, String email, String password, String images, int id_class) {
        adminAPI.UpdateUserValidData(id, name, email, password, images, id_class);
    }

    @When("Send request put update user")
    public void sendRequestPutUpdateUser() {
        SerenityRest.when().put(AdminAPI.UPDATE_USERS);
    }

    @Given("Update user with id {int} set request body name {string}, email {string}, password {string}, images {string} and id_class {int} without authorization")
    public void updateUserWithIdIdSetRequestBodyNameEmailPasswordImagesAndId_classId_classWithoutAuthorization(int id, String name, String email, String password, String images, int id_class) {
        adminAPI.UpdateUserWithoutAuth(id, name, email, password, images, id_class);
    }

    @Given("Put update user with id {int} and set name {int}")
    public void putUpdateUserWithIdIdAndSetName(int id, int name) {
        adminAPI.UpdateUserNumericName(id, name);
    }

    @Given("Put update user with id {int} and set name {string}")
    public void putUpdateUserWithIdIdAndSetName(int id, String name) {
        adminAPI.UpdateUserCharName(id, name);
    }

    @Given("Put update user with id {int} and set invalid email {string}")
    public void putUpdateUserWithIdIdAndEtInvalidEmail(int id, String email) {
        adminAPI.UpdateUserInvalidEmail(id, email);
    }

    @Given("Put update user with id {int} and set password {int}")
    public void putUpdateUserWithIdIdAndSetPassword(int id, int password) {
        adminAPI.UpdateUserNumericPass(id, password);
    }

    @Given("Put update user with id {int} and set password {string}")
    public void putUpdateUserWithIdIdAndSetPassword(int id, String password) {
        adminAPI.UpdateUserInvalidPass(id, password);
    }

    @Given("Put update user with id {int} and set images {string}")
    public void putUpdateUserWithIdIdAndSetImage(int id, String images) {
        adminAPI.UpdateUserInvalidImage(id, images);
    }

    @Given("Put update user with id {int} and set id_Class {int}")
    public void putUpdateUserWithIdIdAndSetId_Class(int id, int id_class) {
        adminAPI.UpdateUserUnregisteredIDClass(id, id_class);
    }


    @Given("Update user with id {int} set request empty body name {string}, email {string}, password {string}, images {string} and id_class {int}")
    public void updateUserWithIdSetRequestEmptyBodyNameEmailPasswordImagesAndId_class(int id, String name, String email, String password, String images, int id_class) {
        adminAPI.UpdateUserEmptyAllData(id, name, email, password, images, id_class);
    }


}
