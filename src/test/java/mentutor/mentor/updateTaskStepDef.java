package mentutor.mentor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.base.SetBaseLogin;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;
public class updateTaskStepDef {
    @Steps
    SetBaseLogin LoginAPI;
    testMentorAPI MentorAPI;
    @Given("Mentor set update task data with id {} Title {string}, Description {string}, Time {string}")
    public void mentorSetUpdateTaskDataWithTitleDescriptionTime( int id, String title, String description, String time) {
        LoginAPI.setUpdateTask(id, title, description, time);

    }

    @When("User send request put update task")
    public void userSendRequestPutUpdateTask() {
        SerenityRest.when().put(mentorAPI.UPDATE_TASK);
    }

    @Given("mentor set parameter task id to {int}")
    public void mentorSetParameterTaskIdTo(int task) {
        LoginAPI.setGetDetailTask(task);
    }

    @Given("Mentor set update task data with Id {int}, Title {string}, Description {string},Images {string},File {string}, Time {string}")
    public void mentorSetCreateTaskDataWithTitleDescriptionImagesFileTime(int id,String title, String description, String images, String file, String time) {
        LoginAPI.setUpdateTaskID(id,title, description,images,file, time);
    }

    @Given("Mentor set update task data with Id {string}, Title {string}, Description {string},Images {string},File {string}, Time {string}")
    public void mentorSetUpdateTaskDataWithIdTitleDescriptionImagesFileTime(String id, String title, String description, String images, String file, String time) {
        LoginAPI.setUpdateTaskInvalidId(id,title, description,images,file, time);
    }

    @Given("Mentor set update task data with Title {string}, Description {string},Images {string},File {string}, Time {string}")
    public void mentorSetUpdateTaskDataWithTitleDescriptionImagesFileTime(String title, String description, String images, String file, String time) {
        LoginAPI.setUpdateTaskWithoutId(title, description,images,file, time);
    }

    @Given("Mentor set update task data with Id {int}, Title {string}, Description {string},Images {string},File {string}, Time {string} without token")
    public void mentorSetUpdateTaskDataWithIdTitleDescriptionImagesFileTimeWithoutToken(int id,String title, String description, String images, String file, String time) {
        LoginAPI.setUpdateTaskWithoutToken(id,title, description,images,file, time);
    }


}
