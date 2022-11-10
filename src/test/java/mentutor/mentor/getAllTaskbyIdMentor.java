package mentutor.mentor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.loginAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class getAllTaskbyIdMentor {
    @Steps
    loginAPI LoginAPI;
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
    public void mentorSetTaskIdTo(int task) {
        LoginAPI.setGetDetailTask(task);
    }
    @When("User send request get detail task")
    public void userSendRequestGetDetailTaskWithTaskId() {
        SerenityRest.when().get(loginAPI.GET_DETAIL_TASK);
    }


}
