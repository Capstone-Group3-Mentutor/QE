package mentutor.mentor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.base.SetBaseLogin;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class ScoreStepDef {
    @Steps
    SetBaseLogin LoginAPI;
    @Given("Mentor set task id to {int}, submission id to {int}, and score {int}")
    public void mentorSetTaskIdToAndSubmissionIdTo(int task, int sub, int score) {
        LoginAPI.setSubmitScore(task,sub,score);
    }

    @When("User send request post submit score")
    public void userSendRequestPostSubmitScore() {
        SerenityRest.when().post(mentorAPI.SUBMIT_SCORE);
    }


}
