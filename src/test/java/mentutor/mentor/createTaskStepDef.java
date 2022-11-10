package mentutor.mentor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.loginAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class createTaskStepDef {
    @Steps
    loginAPI LoginAPI;
    testMentorAPI MentorAPI;
    @Given("Mentor set create task data with Title {string}, Description {string}, Time {string}")
    public void mentorSetCreateTaskDataWithTitleDescriptionTime(String title, String description, String time) {
        File json = new File(LoginAPI.JSON_FILE+"/UpdateMentorProfile/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setCreateNewTask(json, title, description, time);
    }

    @When("User send request post create task")
    public void userSendRequestPostCreateTask() {
        SerenityRest.when().post(mentorAPI.CREATE_NEW_TASK);
    }
}
