package mentutor.mentor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mentutor.login.loginAPI;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class updateMentorProfileStepDef {
    @Steps
    loginAPI LoginAPI;
    testMentorAPI MentorAPI;
//    @Given("Mentor set update profile data with all valid data")
//    public void mentorSetUpdateProfileData() {
//        File json = new File(LoginAPI.JSON_FILE+"/PutUpdateProfileMentorWithValidData.json");
//        LoginAPI.setUpdateUserProfile(json);
//    }
    @When("User send request put update data")
    public void userSendRequestPutUpdateData() {
        SerenityRest.when().put(mentorAPI.UPDATE_MENTOR_PROFILE);
    }
    @Given("Mentor set update profile data with Numeric name {string}")
    public void mentorSetUpdateProfileDataWithNumericData(String name) {
        String email = "";
        String Password = "";
        String images = "";
//        File json = new File(LoginAPI.JSON_FILE+"/UpdateMentorProfile/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateMentorProfile( name, email, Password, images);
    }

    @Given("Mentor set update profile data with Admin token")
    public void mentorSetUpdateProfileDataWithAdminToken() {
        File json = new File(LoginAPI.JSON_FILE+"/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateUserProfile(json);
    }


    @Given("Mentor set update profile data with email {string}")
    public void mentorSetUpdateProfileDataWithEmail(String email) {
        String name = "";
        String password = "";
        String images = "";
//        File json = new File(LoginAPI.JSON_FILE+"/UpdateMentorProfile/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateMentorProfile( name, email, password, images);
    }

    @Given("Mentor set update profile data with password {string}")
    public void mentorSetUpdateProfileDataWithPassword(String password) {
        String name = "";
        String email = "";
        String images = "";
//        File json = new File(LoginAPI.JSON_FILE+"/UpdateMentorProfile/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateMentorProfile( name, email, password, images);
    }

    @Given("Mentor set update profile data with Name {string}, Email {string}, Password {string}, images {string}")
    public void mentorSetUpdateProfileDataWithNameEmailPassword(String name, String email, String password, String images) {
//        File json = new File(LoginAPI.JSON_FILE+"/UpdateMentorProfile/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateMentorProfile( name, email, password, images);
    }

    @Given("Mentor set update profile data with images {string}")
    public void mentorSetUpdateProfileDataWithImages(String images) {
        String name = "";
        String email = "";
        String password = "";
//        File json = new File(LoginAPI.JSON_FILE+"/UpdateMentorProfile/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateMentorProfile( name, email, password, images);
    }
}
