package mentutor.mentor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.baseLoginAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class getAllTaskbyIdMentor {
    @Steps
    baseLoginAPI baseLoginAPI;
    @Given("Mentor set token to Mentor Token")
    public void mentorSetTokenToMentorToken() {
        baseLoginAPI.setGetAllTaskbyIDMentor();
    }

    @When("User send request get all task")
    public void userSendRequestGetAllTask() {
        SerenityRest.when().get(mentorAPI.GET_ALL_TASK_BY_ID_MENTOR);
    }

    @Given("Mentor set token to Admin Token")
    public void mentorSetTokenToAdminToken() {
        baseLoginAPI.setGetAllTaskbyIDMentor();
    }
    @Given("Mentor set task id to {int}")
    public void mentorSetTaskIdTo(int id) {
        baseLoginAPI.setGetDetailTask(id);
    }
    @When("User send request get detail task")
    public void userSendRequestGetDetailTaskWithTaskId() {
        SerenityRest.when().get(mentorAPI.GET_DETAIL_TASK);
    }


    @Given("Mentor set invalid task id to {string}")
    public void mentorSetInvalidTaskIdTo(String id) {
        baseLoginAPI.setGetDetailTaskInvalid(id);
    }

    @When("User send request delete task")
    public void userSendRequestDeleteTask() {
        SerenityRest.when().delete(mentorAPI.GET_DETAIL_TASK);
    }


}
