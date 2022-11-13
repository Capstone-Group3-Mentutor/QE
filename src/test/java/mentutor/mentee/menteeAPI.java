package mentutor.mentee;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class menteeAPI {
    public static String URL = "https://ecommerce-alta.online";
    public static String LOGIN_USER = URL+"/login";

    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_FILE = DIR+"/src/test/resources/JSON/BodyRequest";
    public static String BARIER_TOKEN;
    public static String UPDATE_MENTEE_PROFILE = URL+"/users";
    public static String SUBMIT_TASK = URL+"/mentees/submission/{task}";
    public static String GET_ALL_CLASS_TASK = URL+"/mentees/tasks";

    public static String GET_ALL_TASK_BY_ID_MENTOR = URL +"/mentors/tasks";
    public static String GET_DETAIL_TASK = URL +"/mentors/tasks/{id}";
    public static String SUBMIT_SCORE = URL + "/mentors/submission/{sub}";
    public static String ADD_MENTOR_COMMENT = URL + "/forum/{forum}";

    @Step("Get All Class Task")
    public void setGetAllClassTask(){
        SerenityRest.given().headers("Authorization","Bearer "+ BARIER_TOKEN).log().all();
    }
    @Step ("Add Mentor Comment")
    public void setAddComment(int forum, String comment){
        SerenityRest.given()
                .headers("Authorization","Bearer "+ BARIER_TOKEN)
                .pathParam("task",forum)
                .multiPart("file", comment)
                .log().all();
    }
}
