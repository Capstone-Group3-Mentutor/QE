package mentutor.mentor;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class mentorAPI {
    public static String URL = "https://ecommerce-alta.online";
    public static String UPDATE_MENTOR_PROFILE = URL + "/users";
    public static String CREATE_NEW_TASK = URL + "/mentors/tasks";
    public static String UPDATE_TASK = URL + "/mentors/tasks/{id}";
    public static String GET_ALL_TASK_BY_ID_MENTOR = URL + "/mentors/tasks";
    public static String GET_DETAIL_TASK = URL + "/mentors/tasks/{id}";
    public static String SUBMIT_SCORE = URL + "/mentors/submission/{sub}";
    public static String ADD_MENTOR_COMMENT = URL + "/forum/{forum}";
}
