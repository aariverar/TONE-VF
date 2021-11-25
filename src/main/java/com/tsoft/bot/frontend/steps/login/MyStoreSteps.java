package com.tsoft.bot.frontend.steps.login;

import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.pages.pages.login.MyStorePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class MyStoreSteps {

    private WebDriver driver;
    private final MyStorePage mystore = new MyStorePage(driver);

    public MyStoreSteps() {
        this.driver = Hook.getDriver();
    }



    @Given("^ingreso a la web My Store \"([^\"]*)\"$")
    public void ingresoALaWebMyStore(String arg0) throws Throwable {
        mystore.enterUrl(arg0);
    }

    @When("^doy click en el boton Sign in$")
    public void doyClickEnElBotonSignIn() throws Throwable {
        mystore.clickbotonSI();
    }

    @And("^ingreso mi correo \"([^\"]*)\"$")
    public void ingresoMiCorreo(String arg0) throws Throwable {
        mystore.ingresarCorreo(arg0);
    }

    @And("^doy click en el boton crear cuenta$")
    public void doyClickEnElBotonCrearCuenta() throws Throwable {
        mystore.clickbotonRegistrar();
    }

    @Then("^valido el formulario$")
    public void validoElFormulario() throws Throwable {
        mystore.valFormulario();
    }
}
