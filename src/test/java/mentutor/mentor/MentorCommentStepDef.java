package mentutor.mentor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.baseLoginAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class MentorCommentStepDef {
    @Steps
    baseLoginAPI baseLoginAPI;
    @Given("Mentor set forum id to {int} and comment {string}")
    public void mentorSetForumIdToAndCaption(int forum, String comment) {
        baseLoginAPI.setAddMentorComment(forum,comment);
    }

    @When("User send request post add comment")
    public void userSendRequestPostAddComment() {
        SerenityRest.when().post(mentorAPI.ADD_MENTOR_COMMENT);
    }

    @Given("Mentor set forum id to {string} and comment {string}")
    public void mentorSetForumIdToAndComment(String forum, String comment) {
        baseLoginAPI.setAddMentorCommentInvalid(forum,comment);
    }

    @Given("Mentor set comment {string}")
    public void mentorSetComment(String comment) {
        baseLoginAPI.setAddMentorCommentwithoutID(comment);
    }

    @Given("Mentor set forum id to {int} and comment {int}")
    public void mentorSetForumIdToAndComment(int forum, int comment) {
        baseLoginAPI.setAddMentorCommentfloat(forum,comment);
    }

    @Given("Mentor set forum id to {int} and comment to {float}")
    public void mentorSetForumIdToAndComment(int forum, float comment) {
        baseLoginAPI.setAddMentorCommentfloat(forum,comment);
    }

    @Given("Mentor set forum id to {int}")
    public void mentorSetForumIdTo(int arg0) {
    }
}
