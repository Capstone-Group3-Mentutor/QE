package mentutor.registers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import java.util.HashMap;

import static mentutor.registers.registerVariable.*;
import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.*;

public class registerNewUsersStepDefs {

    //TODO create API helper function to generate input JSON from excel
    private final String excelName = "Herry"; //name excel
    private final String excelEmail = "hery@gmail.com"; //email excel
    private final String excelPassword = "asdfqwer"; //password excel
    private final String excelClass = "back-end"; //class excel
    private final String excelRole = "Mentee"; //class excel

    @Given("Admin set URL to register endpoint")
    public void setURLToRegisterEndpoint() {
        HashMap<String, Object> json = new HashMap<String, Object>();

        json.put("name", excelName);
        json.put("email", excelEmail);
        json.put("password", excelPassword);
        json.put("class", excelClass);
        json.put("role", excelRole);

        given().baseUri(REGISTER_URL).contentType(ContentType.JSON).body(json);

    }

    @When("he send request POST register new user")
    public void sendRequestPOSTRegisterNewUser() {
        when().post();
    }

    @Then("Response is as expected")
    public void responseIsAsExpected() {
        then()
                //assert status cpde
                .statusCode(201)

                //assert headers
                .headers("access-control-allow-credentials", is("true"))
                .headers("access-control-allow-headers", is("X-Requested-With,Content-Type,Accept,Origin"))
                .headers("access-control-allow-methods", is("*"))
                .headers("access-control-allow-origin", is("*"))
                .headers("content-encoding", is("gzip"))
                .headers("content-length", is(notNullValue()))
                .headers("content-type", is("application/json;charset=utf-8"))
                .headers("date", is(notNullValue()))


                //assert response body
                .body("data.id", is(notNullValue()))
                .body("data.name", is(excelName))
                .body("data.role", is(excelRole))
                .body("data.class", is(excelClass))

                //assert response time
                .time(Matchers.lessThan(3000L));
    }
}
