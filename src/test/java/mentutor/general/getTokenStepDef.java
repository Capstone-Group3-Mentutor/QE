package mentutor.general;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import mentutor.login.baseLoginAPI;
import mentutor.mentor.mentorAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class getTokenStepDef {
    @Steps
    baseLoginAPI baseLoginAPI;
    mentorAPI MentorAPI;
    @Given("User set update profile data")
    public void userSetUpdateProfileData() {
        File json = new File(baseLoginAPI.JSON_FILE+"/PutUpdateProfileMentorWithValidData.json");
        baseLoginAPI.setUpdateUserProfile(json);
    }
    @And("Set token to Mentor Token")
    public void setTokenToMentorToken() {
        SerenityRest.when().post(baseLoginAPI.LOGIN_USER);
        baseLoginAPI.BARIER_TOKEN = SerenityRest.then().extract().path("data.token");
//        LoginAPI.setGetAllTaskbyIDMentor();
//        MentorAPI.BARIER_TOKEN = SerenityRest.then().extract().path("data.token");
    }
}
