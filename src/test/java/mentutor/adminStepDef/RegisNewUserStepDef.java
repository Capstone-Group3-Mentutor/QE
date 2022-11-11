package mentutor.adminStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisNewUserStepDef {

    //RegisNewUser_001
    @Given("Post create new user with valid data")
    public void postCreateNewUserWithValidData() {
    }

    @When("Send request post create new user")
    public void sendRequestPostCreateNewUser() {
    }

    //RegisNewUser_002
    @Given("Post create new user without authorization")
    public void postCreateNewUserWithoutAuthorization() {
    }

    //RegisNewUser_003
    @Given("Post create new user with empty one field")
    public void postCreateNewUserWithEmptyOneField() {
    }

    //RegisNewUser_004
    @Given("Post create new user with name more than {int} word name")
    public void postCreateNewUserWithNameMoreThanWordName(int arg0) {
    }

    //RegisNewUser_005
    @Given("Post create new user with special char in name")
    public void postCreateNewUserWithSpecialCharInName() {
    }

    //RegisNewUser_006
    @Given("Post create new user with numeric in name")
    public void postCreateNewUserWithNumericInName() {
    }

    //RegisNewUser_007
    @Given("Post create new user with invalid email")
    public void postCreateNewUserWithInvalidEmail() {
    }

    //RegisNewUser_008
    @Given("Post create new user with deleted email")
    public void postCreateNewUserWithDeletedEmail() {
    }

    //RegisNewUser_009
    @Given("Post create new user with alphabet password")
    public void postCreateNewUserWithAlphabetPassword() {
    }

    //RegisNewUser_010
    @Given("Post create new user with numeric password")
    public void postCreateNewUserWithNumericPassword() {
    }

    //RegisNewUser_011
    @Given("Post create new user with special char password")
    public void postCreateNewUserWithSpecialCharPassword() {
    }

    //RegisNewUser_012
    @Given("Post create new user with invalid id class")
    public void postCreateNewUserWithInvalidIdClass() {
    }

    //RegisNewUser_013
    @Given("Post create new user with invalid role")
    public void postCreateNewUserWithInvalidRole() {
    }
}
