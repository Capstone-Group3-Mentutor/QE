package mentutor.general;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import mentutor.login.base.SetBaseLogin;
import mentutor.mentee.menteeAPI;
import mentutor.mentor.mentorAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class getTokenStepDef {
    @Steps
    SetBaseLogin LoginAPI;
    mentorAPI MentorAPI;
    menteeAPI MenteeAPI;
    @Given("User set update profile data")
    public void userSetUpdateProfileData() {
        File json = new File(LoginAPI.JSON_FILE+"/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateUserProfile(json);
    }
    @And("Set token to base Mentor Token")
    public void setTokenToMentorToken() {
        SerenityRest.when().post(LoginAPI.LOGIN_USER);
        LoginAPI.BARIER_TOKEN = SerenityRest.then().extract().path("data.token");
    }
    @And("Set token to base Mentee Token")
    public void setTokenToBaseMenteeToken() {
        SerenityRest.when().post(MenteeAPI.LOGIN_USER);
        LoginAPI.BARIER_TOKEN = SerenityRest.then().extract().path("data.token");
    }
}
