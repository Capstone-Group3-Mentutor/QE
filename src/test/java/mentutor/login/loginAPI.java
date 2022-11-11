package mentutor.login;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class LoginAPi {

    public static String URL = "https://ecommerce-alta.online";
    public static final String LOGIN_ADMIN = "https://ecommerce-alta.online/login";
    public static final String GET_ALL_CLASS = URL+"/admin/classes";
    public static final String GET_ALL_USERS = "https://ecommerce-alta.online/admin/users";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_FILE = DIR+"/src/test/resources/JSON";

    public static String TokenAdmin;

    @Step ("Login Admin Background")
    public void setLoginAdmin(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

    @Step("Get All Class")
    public void getAllClass(){
        SerenityRest.given().headers("Authorization", "Bearer "+TokenAdmin).log().all();
    }

    @Step("Get All Class without Auth")
    public void getAllClassWithoutAuth(){
        SerenityRest.given();
    }

    @Step("Get All Users")
    public void getAllUsers(){
        SerenityRest.given().headers("Authorization","Bearer "+TokenAdmin).log().all();
    }

    @Step("Get All Users without Auth")
    public void getAllUsersWithoutAuth(){
        SerenityRest.given();
    }










}
