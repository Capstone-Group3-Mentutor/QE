package mentutor.mentee;

import io.cucumber.java.en.Given;
import mentutor.login.base.SetBaseLogin;
import net.thucydides.core.annotations.Steps;

public class menteeCommentStepDef {
    @Steps
    SetBaseLogin LoginAPI;
    menteeAPI MenteeAPI;

}
