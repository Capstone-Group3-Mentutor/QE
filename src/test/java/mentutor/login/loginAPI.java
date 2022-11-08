package mentutor.login;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class loginAPI {
    public static String URL = "https://ecommerce-alta.online";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_FILE = DIR+"/src/test/resources/JSON/BodyRequest";
    public String BARIER_TOKEN;
//    public static final String JSON_VALIDATOR = DIR+"/src/test/resources/JSON/SchemaValidator/Post";

    public static String LOGIN_USER = URL+"/login";
    public static String REGISTER_NEW_USER = URL+ "/admin/users";


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
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN)
//                .contentType(ContentType.JSON)
                .formParams("name", "Akunnya dihapus")
                .formParams("email", "testerqulity@gmail.com")
                .formParams("images","src/test/resources/features/login.Feature1bff2772.PNG");
    }
}
