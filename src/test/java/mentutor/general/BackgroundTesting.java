package mentutor.general;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import mentutor.login.base.SetBaseLogin;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class BackgroundTesting {
    SetBaseLogin LoginAPI;

    @Before(value = "@mentor")
    public void beforeScenario() {
        File json = new File(LoginAPI.JSON_FILE+"/Background/LoginMentor.json");
        LoginAPI.setLoginUser(json);
        SerenityRest.when().post(LoginAPI.LOGIN_USER);
        LoginAPI.BARIER_TOKEN = SerenityRest.then().extract().path("data.token");
    }

    @After(value = "@mentor")
    public void afterScenario(Scenario scenario) {
        File json = new File(LoginAPI.JSON_FILE+"/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateUserProfile(json);
        SerenityRest.when().post(LoginAPI.UPDATE_MENTOR_PROFILE);
    }
}
