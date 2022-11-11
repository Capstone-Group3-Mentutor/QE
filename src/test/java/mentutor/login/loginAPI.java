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
    public static final String JSON_FILE = DIR+"/src/test/resources/JSON/BodyRequest";
    public static String BARIER_TOKEN;
    //public static final String JSON_VALIDATOR = DIR+"/src/test/resources/JSON/SchemaValidator/Post";

    public static String LOGIN_USER = URL+"/login";
    public static String REGISTER_NEW_USER = URL+ "/admin/users";
    public static String UPDATE_MENTOR_PROFILE = URL+ "/users";
    public static String GET_DETAIL_TASK = URL +"/mentors/tasks/{id}";
    public static String email;
    public static String password;


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

    @Step ("Update User Mentor with valid data")
    public void setUpdateMentorProfile( String name, String email, String password, String images){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .contentType("multipart/form-data")
                .multiPart("name", name)
                .multiPart("email", email)
                .multiPart("email", password)
                .multiPart("images","src/test/resources/features/" + images);

    }

    @Step("Get All Users without Auth")
    public void getAllUsersWithoutAuth(){
        SerenityRest.given();
    }
    @Step ("Get All Task By Id Mentor")
    public void setGetAllTaskbyIDMentor(){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all();
    }
    @Step ("Get Detail Task with Task id")
    public void setGetDetailTask(int task){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all();
        SerenityRest.given().pathParam("id",task);
    }
    @Step ("Update Task")
    public void setUpdateTask(int id, String title, String description, String time){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .contentType("multipart/form-data")
                .pathParam("id",id)
                .multiPart("title", title)
                .multiPart("description", description)
                .multiPart("due_date", time)
                .multiPart("file", "src/test/resources/features/testFileValid.PNG")
                .multiPart("images","src/test/resources/features/testImagesValid.PNG");
    }
    @Step ("Admin Token")
    public void setAdminToken(){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all();
    }










}
