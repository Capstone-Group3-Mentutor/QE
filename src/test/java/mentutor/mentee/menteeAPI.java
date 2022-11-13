package mentutor.mentee;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class menteeAPI {
    public static String URL = "https://ecommerce-alta.online";
    public static String LOGIN_USER = URL+"/login";
    public static String SUBMIT_TASK = URL+"/mentees/submission/{task}";
    public static String GET_ALL_CLASS_TASK = URL+"/mentees/tasks";

    public static String GET_ALL_TASK_BY_ID_MENTOR = URL +"/mentors/tasks";
    public static String GET_DETAIL_TASK = URL +"/mentors/tasks/{id}";
    public static String SUBMIT_SCORE = URL + "/mentors/submission/{sub}";
    public static String ADD_MENTOR_COMMENT = URL + "/forum/{forum}";
}
