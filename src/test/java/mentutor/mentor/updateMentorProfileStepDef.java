package mentutor.mentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.base.SetBaseLogin;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class updateMentorProfileStepDef {
    @Steps
    SetBaseLogin LoginAPI;
//    @Given("Mentor set update profile data with all valid data")
//    public void mentorSetUpdateProfileData() {
//        File json = new File(LoginAPI.JSON_FILE+"/PutUpdateProfileMentorWithValidData.json");
//        LoginAPI.setUpdateUserProfile(json);
//    }
    @When("User send request put update data")
    public void userSendRequestPutUpdateData() {
        SerenityRest.when().put(SetBaseLogin.UPDATE_USER_PROFILE);
    }
    @Given("Mentor set update profile data with Numeric name {string}")
    public void mentorSetUpdateProfileDataWithNumericData(String name) {
        String email = "";
        String Password = "";
        LoginAPI.setUpdateMentorProfileWithoutImages( name, email, Password);
    }

//    @Given("Mentor set update profile data with Admin token")
//    public void mentorSetUpdateProfileDataWithAdminToken() {
//        File json = new File(LoginAPI.JSON_FILE+"/PutUpdateProfileMentorWithValidData.json");
//        LoginAPI.setUpdateUserProfile(json);
//    }


    @Given("Mentor set update profile data with email {string}")
    public void mentorSetUpdateProfileDataWithEmail(String email) {
        String name = "";
        String password = "";
//        File json = new File(LoginAPI.JSON_FILE+"/UpdateMentorProfile/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateMentorProfileWithoutImages( name, email, password);
    }

    @Given("Mentor set update profile data with password {string}")
    public void mentorSetUpdateProfileDataWithPassword(String password) {
        String name = "";
        String email = "";
        LoginAPI.setUpdateMentorProfileWithoutImages( name, email, password);
    }

    @Given("Mentor set update profile data with Name {string}, Email {string}, Password {string}, images {string}")
    public void mentorSetUpdateProfileDataWithNameEmailPassword(String name, String email, String password, String images) {
        LoginAPI.setUpdateMentorProfile(name, email, password, images);
    }

    @Given("Mentor set update profile data with images {string}")
    public void mentorSetUpdateProfileDataWithImages(String images) {
        String name = "";
        String email = "";
        String password = "";
        LoginAPI.setUpdateMentorProfile( name, email, password, images);
    }

    @And("Reset mentor profile")
    public void resetMentorProfile() {
        String name = "Bismillah bener";
        String email = "setmentor@gmail.com";
        String password = "Admin123$";
        LoginAPI.setResetUserData(name,email, password);
        SerenityRest.when().put(SetBaseLogin.UPDATE_USER_PROFILE);
    }


}
