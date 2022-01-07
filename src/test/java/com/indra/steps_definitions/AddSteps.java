package com.indra.steps_definitions;

import com.indra.actions.AddActions;
import com.indra.models.AddBuy;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AddSteps {
    @Managed
    WebDriver driver;
    AddActions addActions = new AddActions(driver);

    @Given("^el usuario ingresa su usuario y contrasenia$")
    public void elUsuarioIngresaSuUsuarioYContrasenia(List<AddBuy> addBuys) {
        addActions.open();
        addActions.clickOnSignIn(addBuys.get(0));
    }

    @Given("^el usuario selecciona categoria de cualquier producto de tecnologia$")
    public void elUsuarioSeleccionaCategoriaDeCualquierProductoDeTecnologia() {
        addActions.seleccioanr();
    }

    @When("^el usuario debe seleccionar el color y la  cantidad que desea comprar$")
    public void elUsuarioDebeSeleccionarElColorYLaCantidadQueDeseaComprar() {
        addActions.clicKOnAdd();
    }

    @When("^el usuario debe visualizar las especificaciones del producto$")
    public void elUsuarioDebeVisualizarLasEspecificacionesDelProducto() {
        addActions.specifi();
    }

    @Then("^el usuario pasa a pagar producto$")
    public void elUsuarioPasaAPagarProducto() {
        addActions.pay();
    }
}