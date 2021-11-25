package com.tsoft.bot.frontend.steps.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;


public class GetSteps {

    @Given("^realizo una operación GET para \"([^\"]*)\"$")
    public void realizoUnaOperaciónGETPara(String url) throws Throwable {
        given().contentType(ContentType.JSON);
    }

    @When("^ingreso el id \"([^\"]*)\"$")
    public void ingresoElId(String postNumber) throws Throwable {

        when().get(String.format("http://localhost:8082/autores/1",postNumber)).
                then().body("nombre", is("Abraham Rivera Rivadeneyra")).statusCode(200);

    }

    @Then("^se verifica que el nombre es \"([^\"]*)\"$")
    public void seVerificaQueElNombreEs(String arg0) throws Throwable {

    }
}
