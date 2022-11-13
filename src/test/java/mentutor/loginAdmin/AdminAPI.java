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
    public static final String REGIS_NEW_CLASS = "https://ecommerce-alta.online/admin/classes";
    public static final String REGIS_NEW_USERS = "https://ecommerce-alta.online/admin/users";
    public static final String UPDATE_CLASS = "https://ecommerce-alta.online/admin/classes/{id}";
    public static final String UPDATE_USERS = "https://ecommerce-alta.online/admin/users/{id}";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_FILE = DIR+"/src/test/resources/JSON";
    public static final String UPLOAD = "src/test/resources/JSON/BodyRequest/" ;


    public static String TokenAdmin;

    @Step("Login Admin Background")
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

    @Step("Get single user without auth")
    public void getSingleUserWithoutAuth(int id){
        SerenityRest.given().pathParam("id",id);
    }

    @Step("Get single user unregister id")
    public void getSingleUserUnregisterID(int id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id);
    }

    @Step("Get single user invalid id")
    public void getSingleUserInvalidID(String id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id);
    }

    @Step("Get single user with Id has been deleted ")
    public void getSingleUserWithIDHasBeenDeleted(int id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id);
    }

    @Step("Register new class valid name")
    public void regisNewClassValidName(String className){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType("multipart/form-data")
                .multiPart("class_name",className);
    }

    @Step("Register new class without authorization")
    public void regisNewClassWithoutAuth(String className){
        SerenityRest.given().multiPart("class_name",className);
    }

    @Step ("Register new class with empty class name")
    public void regisNewClassEmptyClassName (File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

    @Step("Register new class with numeric name")
    public void regisNewClassNumericName(int className){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .multiPart("class_name",className);
    }

    @Step("Register new user with valid data")
    public void regisNewUserValidData(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Register new user without auth")
    public void regisNewUserWithoutAuth(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

    @Step("Register new user with empty name")
    public void regisNewUserEmptyName(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }
    @Step("Register new user with empty email")
    public void regisNewUserEmptyEmail(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }
    @Step("Register new user with empty password")
    public void regisNewUserEmptyPass(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Register new user with empty id_class")
    public void regisNewUserEmptyIDClass(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }
    @Step("Register new user with empty role")
    public void regisNewUserEmptyRole(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Register new user with more than two name")
    public void regisNewUserMoreName(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Register new user with special char name")
    public void regisNewUserCharName(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Register new user with numeric name")
    public void regisNewUserNumName(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Register new user with invalid email")
    public void regisNewUserInvalidEmail(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Register new user with deleted email")
    public void regisNewUserDeletedEmail(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Register new user with alphabet password")
    public void regisNewUserAlphabetPass(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Register new user with numeric password")
    public void regisNewUserNumericPass(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Register new user with special char password")
    public void regisNewUserCharPass(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Register new user with invalid id_class")
    public void regisNewUserInvalidIDClass(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Register new user with invalid role")
    public void regisNewUserInvalidRole(File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Put update class with valid class name")
    public void UpdateClassValidClassName(int id, String class_name){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("class_name",class_name);

    }

    @Step("Put update class with valid status")
    public void UpdateClassValidStatus(int id, String status){
        String class_name = "Bahasa jerman";
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("status", status);
    }

    @Step("Put update class without authorization")
    public void UpdateClassWithoutAuth(int id, File json){
        SerenityRest.given()
                .pathParam("id",id)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Put update class empty all data")
    public void UpdateClassEmptyData(int id, File json){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Put update class with numeric class name")
    public void UpdateClassWithNumericName(int id, int class_name){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("class_name", class_name);
    }

    @Step("Put update class with special char class name")
    public void UpdateClassWithCharName(int id, String class_name){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("class_name", class_name);
    }

    @Step("Put update class with numeric status")
    public void UpdateClassWithNumericStatus(int id, int status){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("status", status);
    }

    @Step("Put update class with special char status")
    public void UpdateClassWithCharStatus(int id, String status){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("status", status);
    }

    @Step("Put update user with all valid data and authorization")
    public void UpdateUserValidData(int id, String name, String email, String password, String images, int id_class){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("name", name)
                .multiPart("email", email)
                .multiPart("password", password)
                .multiPart("images", new File (UPLOAD +images))
                .multiPart("id_class", id_class);
    }

    @Step("Put update user without authorization")
    public void UpdateUserWithoutAuth(int id, String name, String email, String password, String images, int id_class){
        SerenityRest.given()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("name", name)
                .multiPart("email", email)
                .multiPart("password", password)
                .multiPart("images", new File (UPLOAD +images))
                .multiPart("id_class", id_class);
    }

    @Step("Put update user with numeric name")
    public void UpdateUserNumericName(int id, int name){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("name", name);
    }

    @Step("Put update user with special char")
    public void UpdateUserCharName(int id, String name){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("name", name);
    }

    @Step("Put update user with invalid email")
    public void UpdateUserInvalidEmail(int id, String email){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("email", email);
    }

    @Step("Put update user with numeric password")
    public void UpdateUserNumericPass(int id, int password){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("password", password);
    }

    @Step("Put update user with invalid password")
    public void UpdateUserInvalidPass(int id, String password){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("password", password);
    }

    @Step("Put update user with invalid images extention")
    public void UpdateUserInvalidImage(int id, String images){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("images", new File (UPLOAD +images));
    }

    @Step("Put update user with id_class not registered")
    public void UpdateUserUnregisteredIDClass(int id, int id_class){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("id_class", id_class);
    }

    @Step("Put update user with empty all data")
    public void UpdateUserEmptyAllData(int id, String name, String email, String password, String images, int id_class){
        SerenityRest.given()
                .headers("Authorization","Bearer "+TokenAdmin).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("name", name)
                .multiPart("email", email)
                .multiPart("password", password)
                .multiPart("id_class", id_class);
            }


















}
