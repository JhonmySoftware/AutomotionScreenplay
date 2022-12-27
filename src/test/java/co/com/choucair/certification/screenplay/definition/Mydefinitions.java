package co.com.choucair.certification.screenplay.definition;

import co.com.choucair.certification.screenplay.questions.Verificar;
import co.com.choucair.certification.screenplay.tasks.AbrirPagina;
import co.com.choucair.certification.screenplay.tasks.DiligenciarFormulario;
import co.com.choucair.certification.screenplay.tasks.Ingresar;
import co.com.choucair.certification.screenplay.userinterfaces.PaginaXTTT;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class Mydefinitions {

    private AbrirPagina abrirPagina;
    private DiligenciarFormulario formulario;

    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Jhon Quiñones ingresa a la app XTTT$")
    public void que_Jhon_Quiñones_ingresa_a_la_app_XTTT() {
        OnStage.theActorCalled("Jhon Quiñones").wasAbleTo(AbrirPagina.urlApp());

    }


    @Cuando("^digita sus credenciales e ingresa a la app$")
    public void digita_sus_credenciales_e_ingresa_a_la_app() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());
    }

    @Y("^verifica que pudo ingresar correctamente$")
    public void verifica_que_pudo_ingresar_correctamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(), Matchers.equalTo("MENU")));

    }

    @Y("^Ingresa a la Funcionalidad Block Validation y Diligencia el formulario de Block Validation$")
    public void ingresaALaFuncionalidadBlockValidationYDiligenciaElFormularioDeBlockValidation(DataTable Formulario) {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenciarFormulario.Datos());
        List<List<String>> data = Formulario.raw();
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(data.get(1).get(1)).into(PaginaXTTT.Campo_Required),
                Enter.theValue(data.get(2).get(1)).into(PaginaXTTT.Campo_Email),
                Enter.theValue(data.get(3).get(1)).into(PaginaXTTT.Campo_Password),
                Enter.theValue(data.get(4).get(1)).into(PaginaXTTT.Campo_ConfPassword),
                Enter.theValue(data.get(5).get(1)).into(PaginaXTTT.Campo_Date),
                Enter.theValue(data.get(6).get(1)).into(PaginaXTTT.Campo_Url),
                Enter.theValue(data.get(7).get(1)).into(PaginaXTTT.Campo_DigitsOnly),
                Enter.theValue(data.get(8).get(1)).into(PaginaXTTT.Campo_Range),
                Click.on(PaginaXTTT.Campo_policy));
    }

    @Entonces("^verifica respuesta exitosa o fallida$")
    public void verificaRespuestaExitosaOFallida() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



}
