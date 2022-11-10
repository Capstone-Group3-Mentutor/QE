package mentutor.general;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import org.jruby.util.ResourceException;

public class ResponseCode {
    @Then("Should return {int} OK")
    public void shouldReturnOK(int OK) {
        SerenityRest.then().statusCode(OK);
    }
    @Then("Should return {int} Created")
    public void shouldReturnCreated(int Created) {
        SerenityRest.then().statusCode(Created);
    }

    @Then("Should return {int} Not Found")
    public void shouldReturnNotFound(int NotFound) {
        SerenityRest.then().statusCode(NotFound);
    }



    @Then("Should return {int} Bad Request")
    public void shouldReturnBadRequest(int Bad) {
        SerenityRest.then().statusCode(Bad);
    }



}
