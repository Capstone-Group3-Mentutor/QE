package mentutor.general;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import mentutor.login.loginAPI;
import mentutor.mentor.MentorAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import java.io.File;
import java.util.HashMap;

import static mentutor.registers.registerVariable.*;
import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.*;

import static org.hamcrest.Matchers.*;

public class getTokenStepDef {
    @Steps
    loginAPI LoginAPI;
    MentorAPI mentorAPI;
    @Given("User set update profile data")
    public void userSetUpdateProfileData() {
        File json = new File(LoginAPI.JSON_FILE+"/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateUserProfile(json);
    }
    @And("Set token to Mentor Token")
    public void setTokenToMentorToken() {
        LoginAPI.BARIER_TOKEN = SerenityRest.then().extract().path("data.token");
//        mentorAPI.BARIER_TOKEN = SerenityRest.then().extract().path("data.token");
    }
}
