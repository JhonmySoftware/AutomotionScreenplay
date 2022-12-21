package co.com.choucair.certification.screenplay.definition;

import co.com.choucair.certification.screenplay.tasks.AbrirPagina;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Mydefinitions {

    private AbrirPagina abrirPagina;

    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Jhon Quiñones ingresa a la app XTTT$")
    public void que_Jhon_Quiñones_ingresa_a_la_app_XTTT() throws Exception {
        OnStage.theActorCalled("Jhon Quiñones").wasAbleTo(AbrirPagina.urlApp());
        throw new PendingException();
    }


    @Cuando("^digita sus credenciales e ingresa a la app$")
    public void digita_sus_credenciales_e_ingresa_a_la_app(DataTable arg1) throws Exception {
        throw new PendingException();
    }

    @Entonces("^verifica que pudo ingresar correctamente$")
    public void verifica_que_pudo_ingresar_correctamente() throws Exception {
        throw new PendingException();
    }


}
