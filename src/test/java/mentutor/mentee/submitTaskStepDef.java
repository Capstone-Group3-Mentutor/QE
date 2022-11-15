package mentutor.mentee;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.base.SetBaseLogin;
import mentutor.mentor.mentorAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class submitTaskStepDef {
    @Steps
    SetBaseLogin LoginAPI;
    @Given("User set task id to {int} and file {string}")
    public void userSetTaskIdToAndFile(int task, String file) {
        LoginAPI.setSubmitTask(task,file);
    }

    @When("User send request post submit task")
    public void userSendRequestPostSubmitTask() {
        SerenityRest.when().post(menteeAPI.SUBMIT_TASK);
    }

    @Given("User set task id to {string} and file {string}")
    public void userSetTaskIdToAndFile(String task, String file) {
        LoginAPI.setSubmitTaskinvalid(task,file);
    }

    @Given("User set task id to {int} and file {string} without token")
    public void userSetTaskIdToAndFileWithoutToken(int task, String file) {
        LoginAPI.setSubmitTaskWithoutToken(task,file);
    }
}
