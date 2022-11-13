package mentutor.mentee;

import io.cucumber.java.en.Given;
import mentutor.login.base.SetBaseLogin;
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
        String images = "";
//        File json = new File(LoginAPI.JSON_FILE+"/UpdateMentorProfile/PutUpdateProfileMentorWithValidData.json");
        LoginAPI.setUpdateMentorProfile( name, email, Password, images);
    }

    @Given("Mentee set update profile data with email {string}")
    public void menteeSetUpdateProfileDataWithEmail(String arg0) {
    }

    @Given("Mentee set update profile data with password {string}")
    public void menteeSetUpdateProfileDataWithPassword(String arg0) {
    }

    @Given("Mentee set update profile data with images {string}")
    public void menteeSetUpdateProfileDataWithImages(String arg0) {
    }
}
