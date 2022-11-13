package mentutor.loginMentee;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class MenteeLoginStefDef {

    @Steps
    ForumAPI forumAPI;

    @Given("User login as a mentee with valid data")
    public void userLoginMenteeWithValidData(){
        File json = new File(ForumAPI.JSON_FILE+"/LoginMenteeBackground.json");
        forumAPI.setLoginMenteeBackground(json);
    }

    @When("Send request post login as a mentee")
    public void sendRequestPostLoginAsAMentee() {
        SerenityRest.when().post(forumAPI.LOGIN_MENTEE);
    }

    @And("Set token as a mentee token")
    public void setTokenAsAMenteeToken() {
        forumAPI.TokenMentee = SerenityRest.then().extract().path("data.token");
    }
}
