package mentutor.login;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class loginAPI {
    public static String URL = "https://ecommerce-alta.online";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_FILE = DIR+"/src/test/resources/JSON/BodyRequest";
    public static String BARIER_TOKEN;
//    public static final String JSON_VALIDATOR = DIR+"/src/test/resources/JSON/SchemaValidator/Post";

    public static String LOGIN_USER = URL+"/login";
    public static String REGISTER_NEW_USER = URL+ "/admin/users";
    public static String UPDATE_MENTOR_PROFILE = URL+ "/users";



    @Step ("Login user with valid data")
    public void setLoginUser(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }
    @Step ("Register new user with valid data")
    public void setRegisterNewUser(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

    @Step ("Update User Profile with valid data")
    public void setUpdateUserProfile(File json){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .contentType("multipart/form-data")
                .multiPart("name", "Akunnya dihapus")
                .multiPart("email", "testerqulity@gmail.com")
                .multiPart("images","src/test/resources/features/login.Feature1bff2772.PNG");
    }
    @Step ("Update User Mentor with valid data")
    public void setUpdateMentorProfile(File json, String name, String email, String password, String images){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .contentType("multipart/form-data")
                .multiPart("name", name)
                .multiPart("email", email)
                .multiPart("email", password)
                .multiPart("images","src/test/resources/features/" + images);
    }
    @Step ("Create new Task")
    public void setCreateNewTask(File json,String title, String description, String time){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .contentType("multipart/form-data")
                .multiPart("title", title)
                .multiPart("description", description)
                .multiPart("due_date", time)
                .multiPart("file", "src/test/resources/features/testFileValid.PNG")
                .multiPart("images","src/test/resources/features/testImagesValid.PNG");
    }

}
