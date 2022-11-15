package mentutor.mentor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.base.SetBaseLogin;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class ScoreStepDef {
    @Steps
    SetBaseLogin LoginAPI;
    @When("User send request post submit score")
    public void userSendRequestPostSubmitScore() {
        SerenityRest.when().post(mentorAPI.SUBMIT_SCORE);
    }
    @Given("Mentor set task id to {int}, submission id to {int}, and score {int}")
    public void mentorSetTaskIdToAndSubmissionIdTo(int task, int sub, int score) {
        LoginAPI.setSubmitScore(task,sub,score);
    }
    @Given("Mentor set task id to {string}, submission id to {int}, and score {int}")
    public void mentorSetTaskIdToSubmissionIdToAndScore(String task, int sub, int score) {
        LoginAPI.setSubmitScoreInvalid(task,sub,score);
    }

    @Given("Mentor set submission id to {int}, and score {int}")
    public void mentorSetSubmissionIdToAndScore(int sub, int score) {
        LoginAPI.setSubmitScoreWithoutTaskId(sub,score);
    }

    @Given("Mentor set task id to {int}, submission id to {int}, and score {string}")
    public void mentorSetTaskIdToSubmissionIdToAndScore(int task, int sub, String score) {
        LoginAPI.setSubmitStringScore(task,sub,score);
    }
    @Given("Mentor set task id to {int}, submission id to {int}, and decimal score {float}")
    public void mentorSetTaskIdToSubmissionIdToAndScore(int task, int sub, float score) {
        LoginAPI.setSubmitFloatScore(task,sub,score);
    }
    @Given("Mentor set task id to {int}, submission id to {int}")
    public void mentorSetTaskIdToSubmissionIdTo(int task, int sub) {
        LoginAPI.setSubmitEmptyScore(task,sub);
    }

    @Given("Mentor set task id to {int}, submission id to {int}, and score {int} without token")
    public void mentorSetTaskIdToSubmissionIdToAndScoreWithoutToken(int task, int sub, int score) {
        LoginAPI.setSubmitScoreWithoutToken(task,sub,score);
    }
}
