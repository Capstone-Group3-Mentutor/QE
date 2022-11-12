package mentutor.mentee;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.mentor.mentorAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class classTaskStepDef {
    @Steps
    menteeAPI MenteeAPI;
    @Given("Mentee set token to Mentee Token")
    public void menteeSetTokenToMenteeToken() {
        MenteeAPI.setGetAllClassTask();
    }

    @When("User send request get all class task")
    public void userSendRequestGetAllClassTask() {
        SerenityRest.when().get(menteeAPI.GET_ALL_TASK_BY_ID_MENTOR);
    }
}
