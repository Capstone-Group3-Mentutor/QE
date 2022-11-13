package mentutor.mentee;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.base.SetBaseLogin;
import mentutor.mentor.mentorAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class classTaskStepDef {
    @Steps
    SetBaseLogin LoginAPI;
    menteeAPI MenteeAPI;
    @Given("Mentee set token to Mentee Token")
    public void menteeSetTokenToMenteeToken() {
        LoginAPI.setGetAllClassTask();
    }

    @When("User send request get all class task")
    public void userSendRequestGetAllClassTask() {
        SerenityRest.when().get(menteeAPI.GET_ALL_CLASS_TASK);
    }
}
