package mentutor.adminBackground;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class AdminAPI {
    public static String URL = "https://ecommerce-alta.online";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REQUEST_LOGIN_FILE = DIR+"/src/test/resources/JSON/Background";
    public static final String LOGIN_ADMIN = "https://ecommerce-alta.online/login";
    public static final String GET_ALL_CLASS = "https://ecommerce-alta.online/admin/classes";
    public static final String GET_ALL_USER = "https://ecommerce-alta.online/admin/users";
    public String TOKEN_ADMIN;

    @Step("Login admin background")
    public void loginAdminBackground(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

    @Step("Get all class")
    public void getAllClass(){
        SerenityRest.given().headers("Authorization", "Bearer "+TOKEN_ADMIN).log().all();
    }

    @Step("Get all class without authorization")
    public void getAllClassWithoutAuth(){
        SerenityRest.given();
    }

    @Step("Get all users")
    public void getAllUsers(){
        SerenityRest.given().headers("Authorization", "Bearer "+TOKEN_ADMIN).log().all();
    }

    @Step("Get all users without authorization")
    public void getAllUsersWithoutAuth(){
        SerenityRest.given();
    }
}
