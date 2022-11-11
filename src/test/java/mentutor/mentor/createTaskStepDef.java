package mentutor.mentor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.baseLoginAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class createTaskStepDef {
    @Steps
    baseLoginAPI baseLoginAPI;
    testMentorAPI MentorAPI;
    @Given("Mentor set create task data with Title {string}, Description {string}, Time {string}")
    public void mentorSetCreateTaskDataWithTitleDescriptionTime(String title_valid, String description, String time) {
        baseLoginAPI.setCreateNewTask(title_valid, description, time);
    }

    @When("User send request post create task")
    public void userSendRequestPostCreateTask() {
        SerenityRest.when().post(mentorAPI.CREATE_NEW_TASK);
    }
}
