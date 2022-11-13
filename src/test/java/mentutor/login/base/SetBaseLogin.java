package mentutor.login.base;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class SetBaseLogin {
    public static String URL = "https://ecommerce-alta.online";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_FILE = DIR+"/src/test/resources/JSON/BodyRequest";
    public static final String UPLOAD = "src/test/resources/JSON/BodyRequest/" ;
    public static String BARIER_TOKEN;
    public static final String JSON_VALIDATOR = DIR+"/src/test/resources/JSON/SchemaValidator/Post";

    public static String LOGIN_USER = URL+"/login";
    public static String REGISTER_NEW_USER = URL+ "/admin/users";
    public static String UPDATE_MENTOR_PROFILE = URL+ "/users";
    public static String GET_DETAIL_TASK = URL +"/mentors/tasks/{id}";




    @Step("Login user with valid data")
    public void setLoginUser(String email, String password){
        SerenityRest.given()
                .multiPart("email", email)
                .multiPart("password", password);
    }
    @Step ("Register new user with valid data")
    public void setRegisterNewUser(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

//    @Step ("Update User Profile with valid data")
//    public void setUpdateUserProfile(File json){
//        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
//                .contentType("multipart/form-data")
//                .multiPart("name", "Akunnya dihapus")
//                .multiPart("email", "testerqulity@gmail.com")
//                .multiPart("images","src/test/resources/features/login.Feature1bff2772.PNG");
//    }
    @Step ("Update User Mentor with valid data")
    public void setUpdateMentorProfile( String name, String email, String password, String images){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", name)
                .multiPart("email", email)
                .multiPart("email", password)
                .multiPart("images", new File (UPLOAD +images))
                .log().all();
    }
    @Step ("Create new Task")
    public void setCreateNewTask(String title, String description,String images, String file, String time){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .contentType("multipart/form-data")
                .multiPart("title", title)
                .multiPart("description", description)
                .multiPart("images", new File (UPLOAD +images))
                .multiPart("file", new File (UPLOAD +file))
                .multiPart("due_date", time);
    }
    @Step ("Create new Task")
    public void setCreateNewTaskWithoutToken(String title, String description,String images, String file, String time){
        SerenityRest.given().log().all()
                .contentType("multipart/form-data")
                .multiPart("title", title)
                .multiPart("description", description)
                .multiPart("images", new File (UPLOAD +images))
                .multiPart("file", new File (UPLOAD +file))
                .multiPart("due_date", time);
    }
    @Step ("Get All Task By Id Mentor")
    public void setGetAllTaskbyIDMentor(){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN);
    }
    @Step("Get All Class Task")
    public void setGetAllClassTask(){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .log().all();
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
    public void setGetDetailTaskWithoutToken(int id){
        SerenityRest.given().log().all()
                .pathParam("id",id);
    }
    @Step ("Get Detail Task with Task id")
    public void setUpdateTaskID(int id,String title, String description, String images, String file, String time){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("title", title)
                .multiPart("description", description)
                .multiPart("images", new File (UPLOAD +images))
                .multiPart("file", new File (UPLOAD +file))
                .multiPart("due_date", time);
    }
    @Step ("Get Detail Task with Task id")
    public void setUpdateTaskWithoutToken(int id,String title, String description, String images, String file, String time){
        SerenityRest.given().log().all()
//                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("title", title)
                .multiPart("description", description)
                .multiPart("images", new File (UPLOAD +images))
                .multiPart("file", new File (UPLOAD +file))
                .multiPart("due_date", time);
    }
    @Step ("Get Detail Task with Task id")
    public void setUpdateTaskInvalidId(String id,String title, String description, String images, String file, String time){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("title", title)
                .multiPart("description", description)
                .multiPart("images", new File (UPLOAD +images))
                .multiPart("file", new File (UPLOAD +file))
                .multiPart("due_date", time);
    }
    @Step ("Get Detail Task with Task id")
    public void setUpdateTaskWithoutId(String title, String description, String images, String file, String time){
        int id = 0;
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
                .pathParam("id",id)
                .contentType("multipart/form-data")
                .multiPart("title", title)
                .multiPart("description", description)
                .multiPart("images", new File (UPLOAD +images))
                .multiPart("file", new File (UPLOAD +file))
                .multiPart("due_date", time);
    }
//    @Step ("Update Task")
//    public void setUpdateTask(int id, String title, String description, String time){
//        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
//                .pathParam("id",id)
//                .contentType("multipart/form-data")
//                .multiPart("title", title)
//                .multiPart("description", description)
//                .multiPart("due_date", time)
//                .multiPart("file", "src/test/resources/features/testFileValid.PNG")
//                .multiPart("images","src/test/resources/features/testImagesValid.PNG");
//    }
//    @Step ("Update Task Invalid")
//    public void setUpdateTaskInvalid(String id, String title, String description, String time){
//        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all()
//                .pathParam("id",id)
//                .contentType("multipart/form-data")
//                .multiPart("title", title)
//                .multiPart("description", description)
//                .multiPart("due_date", time)
//                .multiPart("file", "src/test/resources/features/testFileValid.PNG")
//                .multiPart("images","src/test/resources/features/testImagesValid.PNG");
//    }

    @Step ("Submit Score valid")
    public void setSubmitScore(int task, int submission, int score){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("sub",submission)
                .multiPart("id_task", task)
                .multiPart("score", score)
                .log().all();
    }
    public void setSubmitScoreWithoutToken(int task, int submission, int score){
        SerenityRest.given().log().all()
                .pathParam("sub",submission)
                .multiPart("id_task", task)
                .multiPart("score", score);
    }
    public void setSubmitEmptyScore(int task, int submission){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("sub",submission)
                .multiPart("id_task", task)
                .log().all();
    }
    public void setSubmitFloatScore(int task, int submission, float score){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("sub",submission)
                .multiPart("id_task", task)
                .multiPart("score", score)
                .log().all();
    }
    public void setSubmitScoreInvalid(String task, int submission, int score){
        SerenityRest.given().log().all()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("sub",submission)
                .multiPart("id_task", task)
                .multiPart("score", score);
    }
    public void setSubmitScoreWithoutTaskId( int submission, int score){
        SerenityRest.given().log().all()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("sub",submission)
                .multiPart("score", score);
    }
    public void setSubmitStringScore(int task, int submission, String score){
        SerenityRest.given().log().all()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("sub",submission)
                .multiPart("id_task", task)
                .multiPart("score", score);
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
    @Step ("Add Mentor Comment")
    public void setAddMentorCommentWithoutData(int forum){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("forum",forum)
                .log().all();
    }
//    @Step ("reset user data")
//    public void setResetUserData(int id,String email, String password){
//        SerenityRest.given()
//                .headers("Authorization","Bearer "+ BARIER_TOKEN)
//                .pathParam("id",id)
//                .multiPart("email", email)
//                .multiPart("password", password);
//    }
    @Step ("Submit Task")
    public void setSubmitTask(int task, String file){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("task",task)
                .multiPart("file", new File (UPLOAD +file))
                .log().all();
    }
    public void setSubmitTaskWithoutToken(int task, String file){
        SerenityRest.given()
                .pathParam("task",task)
                .multiPart("file", new File (UPLOAD +file))
                .log().all();
    }
    public void setSubmitTaskinvalid(String task, String file){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("task",task)
                .multiPart("file", new File (UPLOAD +file))
                .log().all();
    }


}
