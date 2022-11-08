package mentutor.mentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import mentutor.login.loginAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import java.io.File;
import java.util.HashMap;

import static mentutor.registers.registerVariable.*;
import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.*;

import static org.hamcrest.Matchers.*;
public class updateMentorProfileStepDef {
    @Steps
    loginAPI LoginAPI;
    MentorAPI mentorAPI;
    @Given("Mentor set update profile data")
    public void mentorSetUpdateProfileData() {
        File json = new File(LoginAPI.JSON_FILE+"/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateUserProfile(json);
    }
    @When("User send request put update data")
    public void userSendRequestPutUpdateData() {
        SerenityRest.when().put(mentorAPI.UPDATE_MENTOR_PROFILE);
    }
}
