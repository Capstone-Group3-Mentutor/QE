package mentutor.mentor;
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
    public static String UPDATE_TASK = URL+"/mentors/tasks{id}";

    public static String GET_ALL_TASK_BY_ID_MENTOR = URL +"/mentors/tasks";



    @Step ("Update Mentor Profile with valid data")
    public void setUpdateMentorProfile(File json){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .contentType("multipart/form-data")
                .multiPart("name", "Akunnya dihapus")
                .multiPart("email", "testerqulity@gmail.com")
                .multiPart("images","src/test/resources/features/login.Feature1bff2772.PNG");
    }
}
