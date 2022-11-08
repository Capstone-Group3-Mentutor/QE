package mentutor.mentor;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class MentorAPI {
    public static String URL = "https://ecommerce-alta.online";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_FILE = DIR+"/src/test/resources/JSON/BodyRequest";
    public String BARIER_TOKEN;

    public static String UPDATE_MENTOR_PROFILE = URL+"/users";


    @Step ("Update Mentor Profile with valid data")
    public void setUpdateMentorProfile(File json){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN)
                .formParams("name", "Akunnya dihapus")
                .formParams("email", "testerqulity@gmail.com")
                .formParams("images","src/test/resources/features/login.Feature1bff2772.PNG");
    }}
