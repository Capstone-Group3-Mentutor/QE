package mentutor.mentee;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class menteeAPI {
    public static String URL = "https://ecommerce-alta.online";
    public static String LOGIN_USER = URL+"/login";
    public static String SUBMIT_TASK = URL+"/mentees/submission/{task}";
    public static String GET_ALL_CLASS_TASK = URL+"/mentees/tasks";
}
