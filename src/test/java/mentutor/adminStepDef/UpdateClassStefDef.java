package mentutor.adminStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.loginAdmin.AdminAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class UpdateClassStefDef {

    @Steps
    AdminAPI adminAPI;

    @Given("Put update class with id {int} and set class_name {string}")
    public void putUpdateClassWithIdIdAndSetClass_name(int id, String class_name) {
        adminAPI.UpdateClassValidClassName(id, class_name);
    }

    @When("Send request put update class")
    public void sendRequestPutUpdateClass() {
        SerenityRest.when().put(AdminAPI.UPDATE_CLASS);
    }

    @Given("Put update class with id {int} and set status {string}")
    public void putUpdateClassWithIdIdAndSetStatus(int id, String status) {
        adminAPI.UpdateClassValidStatus(id, status);
    }

    @Given("Put update class with id {int} unAuthorization")
    public void putUpdateClassWithIdIdUnauthorization(int id) {
        File json = new File(AdminAPI.JSON_FILE+"/PutUpdateClassWithoutAuth.json");
        adminAPI.UpdateClassWithoutAuth(id,json);
    }

    @Given("Put update class with id {int} all data empty")
    public void putUpdateClassWithIdIdAllDataEmpty(int id) {
        File json = new File(AdminAPI.JSON_FILE+"/PutUpdateClassEmptyBody.json");
        adminAPI.UpdateClassEmptyData(id,json);
    }

    @Given("Put update class with id {int} and class_name {int}")
    public void putUpdateClassWithIdIdAndClass_name(int id, int class_name) {
        adminAPI.UpdateClassWithNumericName(id, class_name);
    }

    @Given("Put update class with id {int} and class_name {string}")
    public void putUpdateClassWithIdIdAndClass_name(int id, String class_name) {
        adminAPI.UpdateClassWithCharName(id, class_name);
    }

    @Given("Put update class with id {int} and status {int}")
    public void putUpdateClassWithIdIdAndStatus(int id, int status) {
        adminAPI.UpdateClassWithNumericStatus(id, status);
    }

    @Given("Put update class with id {int} and status {string}")
    public void putUpdateClassWithIdIdAndStatus(int id, String status) {
        adminAPI.UpdateClassWithCharStatus(id, status);
    }
}
