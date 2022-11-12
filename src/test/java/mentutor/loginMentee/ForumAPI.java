package mentutor.loginMentee;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class ForumAPI {

    public static String URL = "https://ecommerce-alta.online";
    public static String LOGIN_MENTEE = "https://ecommerce-alta.online/login";

    public static String GET_ALL_STATUS = "https://ecommerce-alta.online/forum";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_FILE = DIR+"/src/test/resources/JSON";
    public static String TokenMentee;

    @Step("Login Mentee Background")
    public void setLoginMenteeBackground(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

    @Step("Get All Status")
    public void getAllStatus(){
        SerenityRest.given().headers("Authorization","Bearer "+TokenMentee).log().all();
    }

    @Step("Get All Status without Auth")
    public void getAllStatusWithoutAuth(){
        SerenityRest.given();
    }
}
