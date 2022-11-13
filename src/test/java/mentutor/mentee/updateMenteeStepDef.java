package mentutor.mentee;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import mentutor.login.base.SetBaseLogin;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class updateMenteeStepDef {
    @Steps
    SetBaseLogin LoginAPI;

    @Given("Mentee set update profile data with Name {string}, Email {string}, Password {string}, images {string}")
    public void menteeSetUpdateProfileDataWithNameEmailPasswordImages(String name, String email, String password, String images) {
        LoginAPI.setUpdateMentorProfile( name, email, password, images);
    }

    @Given("Mentee set update profile data with Numeric name {string}")
    public void menteeSetUpdateProfileDataWithNumericName(String name) {
        String email = "";
        String Password = "";
        LoginAPI.setUpdateMentorProfileWithoutImages( name, email, Password);
    }

    @Given("Mentee set update profile data with email {string}")
    public void menteeSetUpdateProfileDataWithEmail(String email) {
        String name = "";
        String Password = "";
        LoginAPI.setUpdateMentorProfileWithoutImages( name, email, Password);
    }

    @Given("Mentee set update profile data with password {string}")
    public void menteeSetUpdateProfileDataWithPassword(String Password) {
        String name = "";
        String email = "";
        LoginAPI.setUpdateMentorProfileWithoutImages( name, email, Password);
    }

    @Given("Mentee set update profile data with images {string}")
    public void menteeSetUpdateProfileDataWithImages(String images) {
        String name = "";
        String Password = "";
        String email = "";
        LoginAPI.setUpdateMentorProfile( name, email, Password, images);
    }

    @And("Reset mentee profile")
    public void resetMenteeProfile() {
        String name = "Bismillah bener";
        String email = "setmentee@gmail.com";
        String password = "Admin123$";
        LoginAPI.setResetUserData(name,email, password);
        SerenityRest.when().put(SetBaseLogin.UPDATE_USER_PROFILE);
    }
}
