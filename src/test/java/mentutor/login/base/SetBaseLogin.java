package mentutor.login.base;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class SetBaseLogin {
    public static String URL = "https://ecommerce-alta.online";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_FILE = DIR+"/src/test/resources/JSON/BodyRequest";
    public static String BARIER_TOKEN;
    public static final String JSON_VALIDATOR = DIR+"/src/test/resources/JSON/SchemaValidator/Post";

    public static String LOGIN_USER = URL+"/login";
    public static String REGISTER_NEW_USER = URL+ "/admin/users";
    public static String UPDATE_MENTOR_PROFILE = URL+ "/users";
    public static String GET_DETAIL_TASK = URL +"/mentors/tasks/{id}";
    public static String email;
    public static String password;




    @Step("Login user with valid data")
    public void setLoginUser(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }
    @Step ("Register new user with valid data")
    public void setRegisterNewUser(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

    @Step ("Update User Profile with valid data")
    public void setUpdateUserProfile(File json){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .contentType("multipart/form-data")
                .multiPart("name", "Akunnya dihapus")
                .multiPart("email", "testerqulity@gmail.com")
                .multiPart("images","src/test/resources/features/login.Feature1bff2772.PNG");
    }
    @Step ("Update User Mentor with valid data")
    public void setUpdateMentorProfile( String name, String email, String password, String images){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", name)
                .multiPart("email", email)
                .multiPart("email", password)
                .multiPart("images","src/test/resources/features/" + images).log().all();
    }
    @Step ("Create new Task")
    public void setCreateNewTask(String title, String description, String time){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .contentType("multipart/form-data")
                .multiPart("title", title)
                .multiPart("description", description)
                .multiPart("due_date", time)
                .multiPart("file", "src/test/resources/features/testFileValid.PNG")
                .multiPart("images","src/test/resources/features/testImagesValid.PNG");

    }
    @Step ("Get All Task By Id Mentor")
    public void setGetAllTaskbyIDMentor(){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN);
    }
    @Step ("Get Detail Task with Task id")
    public void setGetDetailTask(int id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("id",id).log().all();
    }
    @Step ("Get Detail Task with Task id")
    public void setGetDetailTaskInvalid(String id){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("id",id).log().all();
    }
    @Step ("Get Detail Task with Task id")
    public void setUpdateTaskID(int id){
//        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all();
        SerenityRest.given().pathParam("id",id).log().all();
    }
    @Step ("Update Task")
    public void setUpdateTask(int id, String title, String description, String time){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("title", title)
                .multiPart("description", description)
                .multiPart("due_date", time)
                .multiPart("file", "src/test/resources/features/testFileValid.PNG")
                .multiPart("images","src/test/resources/features/testImagesValid.PNG");
    }
    @Step ("Update Task Invalid")
    public void setUpdateTaskInvalid(String id, String title, String description, String time){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("title", title)
                .multiPart("description", description)
                .multiPart("due_date", time)
                .multiPart("file", "src/test/resources/features/testFileValid.PNG")
                .multiPart("images","src/test/resources/features/testImagesValid.PNG");
    }

    @Step ("Submit Score valid")
    public void setSubmitScore(int task, int submission, int score){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("sub",submission)
                .multiPart("id_task", task)
                .multiPart("score", score)
                .log().all();
    }
    @Step ("Add Mentor Comment")
    public void setAddMentorComment(int forum, String comment){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("forum",forum)
                .multiPart("caption", comment)
                .log().all();
    }
    @Step ("Add Mentor Comment")
    public void setAddMentorCommentInvalid(String forum, String comment){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("forum",forum)
                .multiPart("caption", comment)
                .log().all();
    }
    @Step ("Add Mentor Comment")
    public void setAddMentorCommentwithoutID( String comment){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
//                .pathParam("forum",forum)
                .multiPart("caption", comment)
                .log().all();
    }
    @Step ("Add Mentor Comment")
    public void setAddMentorCommentfloat(int forum, float comment){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("forum",forum)
                .multiPart("caption", comment)
                .log().all();
    }

}
