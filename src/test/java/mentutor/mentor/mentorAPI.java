package mentutor.mentor;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class mentorAPI {
    public static String URL = "https://ecommerce-alta.online";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_FILE = DIR+"/src/test/resources/JSON/BodyRequest";
    public static String BARIER_TOKEN;
    public static String UPDATE_MENTOR_PROFILE = URL+"/users";
    public static String CREATE_NEW_TASK = URL+"/mentors/tasks";
    public static String UPDATE_TASK = URL+"/mentors/tasks/{id}";

    public static String GET_ALL_TASK_BY_ID_MENTOR = URL +"/mentors/tasks";
    public static String GET_DETAIL_TASK = URL +"/mentors/tasks/{id}";
    public static String SUBMIT_SCORE = URL + "/mentors/submission/{sub}";
    public static String ADD_MENTOR_COMMENT = URL + "/forum/{forum}";





    @Step ("Update Mentor Profile with valid data")
    public void setUpdateProfile( String name, String email, String password, String images){
        RestAssured.given().log().all()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", name)
                .multiPart("email", email)
                .multiPart("email", password)
                .multiPart("images","src/test/resources/features/" + images);
    }
}
