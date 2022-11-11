package mentutor.general;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import mentutor.login.baseLoginAPI;
import net.serenitybdd.rest.SerenityRest;

import java.io.File;

public class BackgroundTesting {
    baseLoginAPI baseLoginAPI;

    @Before(value = "@mentor")
    public void beforeScenario() {
        File json = new File(baseLoginAPI.JSON_FILE+"/Background/LoginMentor.json");
        baseLoginAPI.setLoginUser(json);
        SerenityRest.when().post(baseLoginAPI.LOGIN_USER);
        baseLoginAPI.BARIER_TOKEN = SerenityRest.then().extract().path("data.token");
    }

    @After(value = "@mentor")
    public void afterScenario(Scenario scenario) {
        File json = new File(baseLoginAPI.JSON_FILE+"/PutUpdateProfileMentorWithValidData.json");
        baseLoginAPI.setUpdateUserProfile(json);
        SerenityRest.when().post(baseLoginAPI.UPDATE_MENTOR_PROFILE);
    }
}
