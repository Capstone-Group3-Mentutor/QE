package mentutor.mentor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.loginAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class MentorCommentStepDef {
    @Steps
    loginAPI LoginAPI;
    @Given("Mentor set forum id to {int} and comment {string}")
    public void mentorSetForumIdToAndCaption(int forum, String comment) {
        LoginAPI.setAddMentorComment(forum,comment);
    }

    @When("User send request post add comment")
    public void userSendRequestPostAddComment() {
        SerenityRest.when().post(mentorAPI.ADD_MENTOR_COMMENT);
    }
}
