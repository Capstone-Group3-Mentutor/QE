package mentutor.forumStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.loginMentee.ForumAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class GetAllStatusStepDef {

    @Steps
    ForumAPI forumAPI;

    //GetAllStatus_001
    @Given("Get all status using valid path with authorization")
    public void getAllStatusUsingValidPath(){
        forumAPI.getAllStatus();
    }

    @When("send request get all status")
    public void sendRequestGetAllStatus() {
        SerenityRest.when().get(forumAPI.GET_ALL_STATUS);
    }

    @Given("Get all status using valid path without authorization")
    public void getAllStatusUsingValidPathWithoutAuthorization() {
        forumAPI.getAllStatusWithoutAuth();
    }
}
