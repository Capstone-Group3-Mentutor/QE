package mentutor.mentor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.base.SetBaseLogin;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class getAllTaskbyIdMentor {
    @Steps
    SetBaseLogin LoginAPI;
    @Given("Mentor set token to Mentor Token")
    public void mentorSetTokenToMentorToken() {
        LoginAPI.setGetAllTaskbyIDMentor();
    }

    @When("User send request get all task")
    public void userSendRequestGetAllTask() {
        SerenityRest.when().get(mentorAPI.GET_ALL_TASK_BY_ID_MENTOR);
    }

    @Given("Mentor set token to Admin Token")
    public void mentorSetTokenToAdminToken() {
        LoginAPI.setGetAllTaskbyIDMentor();
    }
    @Given("Mentor set task id to {int}")
    public void mentorSetTaskIdTo(int id) {
        LoginAPI.setGetDetailTask(id);
    }
    @When("User send request get detail task")
    public void userSendRequestGetDetailTaskWithTaskId() {
        SerenityRest.when().get(mentorAPI.GET_DETAIL_TASK);
    }


    @Given("Mentor set task id to {string}")
    public void mentorSetInvalidTaskIdTo(String id) {
        LoginAPI.setGetDetailTaskInvalid(id);
    }

    @When("User send request delete task")
    public void userSendRequestDeleteTask() {
        SerenityRest.when().delete(mentorAPI.GET_DETAIL_TASK);
    }


    @Given("Mentor set task id to {int} without token")
    public void mentorSetTaskIdToWithoutToken(int id) {
        LoginAPI.setGetDetailTaskWithoutToken(id);
    }

    @Given("Mentor set mentor token without set task id")
    public void mentorSetMentorTokenWithoutSetTaskId() {
        int id = 0;
        LoginAPI.setGetDetailTask(id);
    }
}
