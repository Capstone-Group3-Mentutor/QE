package mentutor.general;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import mentutor.login.loginAPI;
import mentutor.mentor.mentorAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class getTokenStepDef {
    @Steps
    loginAPI LoginAPI;
    mentorAPI MentorAPI;
    @Given("User set update profile data")
    public void userSetUpdateProfileData() {
        File json = new File(LoginAPI.JSON_FILE+"/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateUserProfile(json);
    }
    @And("Set token to Mentor Token")
    public void setTokenToMentorToken() {
         LoginAPI.BARIER_TOKEN = SerenityRest.then().extract().path("data.token");
//        MentorAPI.BARIER_TOKEN = SerenityRest.then().extract().path("data.token");
    }
}
