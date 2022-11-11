package mentutor.loginAdmin;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class AdminAPI {

    public static String URL = "https://ecommerce-alta.online";
    public static final String LOGIN_ADMIN = "https://ecommerce-alta.online/login";
    public static final String GET_ALL_CLASS = URL+"/admin/classes";
    public static final String GET_ALL_USERS = "https://ecommerce-alta.online/admin/users";
    public static final String DELETE_CLASS = "https://ecommerce-alta.online/admin/classes/{id}";
    public static final String DELETE_USER = "https://ecommerce-alta.online/admin/users/{id}";
    public static final String GET_SINGLE_USER = "https://ecommerce-alta.online/admin/users/{id}";
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

    @Step("Delete class with valid id")
    public void deleteClassValidID(int id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id);
    }

    @Step("Delete class without auth")
    public void deleteClassWithoutAuth(int id){
        SerenityRest.given().pathParam("id",id);
    }

    @Step("Delete class unregister id")
    public void deleteClassUnregisterID(int id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id);
    }

    @Step("Delete class invalid id")
    public void deleteClassInvalidID(String id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id);
    }

    @Step("Delete class with Id has been deleted")
    public void deleteClassHasBeenDeletedID(int id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id);
    }

    @Step("Delete user with valid id")
    public void deleteUserWithValidID(int id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id);
    }

    @Step("Delete user without Auth")
    public void deleteUserWithoutAuth(int id){
        SerenityRest.given().pathParam("id",id);
    }

    @Step("Delete user with unregister id")
    public void deleteUserWithUnregisterID(int id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id);
    }

    @Step("Delete user with invalid id")
    public void deleteUserWithInvalidID(String id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id);
    }

    @Step("Delete user with Id has been deleted")
    public void deleteUserHasBeenDeletedID(int id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id);
    }

    @Step("Get single user with valid id")
    public void getSingleUserValidID(int id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id);
    }












}
