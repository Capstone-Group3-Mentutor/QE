package mentutor.forumStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.loginAdmin.AdminAPI;
import mentutor.loginMentee.ForumAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class AddStatusForumStepDef {

    @Steps
    ForumAPI forumAPI;

    @Given("Post add status with set request body caption {string} and images {string}")
    public void postAddStatusWithSetRequestBodyCaptionAndImages(String caption, String images) {
        forumAPI.addStatusValidData(caption, images);
    }

    @When("Send request post add status")
    public void sendRequestPostAddStatus() {
        SerenityRest.when().post(ForumAPI.ADD_STATUS);
    }

    @Given("Post add status set request body caption {string} and images {string} without auth")
    public void postAddStatusSetRequestBodyCaptionAndImagesWithoutAuth(String caption, String images) {
        forumAPI.addStatusWithoutAuth(caption, images);
    }

    @Given("Post add status with set request body caption {int} and images {string}")
    public void postAddStatusWithSetRequestBodyCaptionAndImages(int caption, String images) {
        forumAPI.addStatusNumericCaption(caption, images);
    }
}
