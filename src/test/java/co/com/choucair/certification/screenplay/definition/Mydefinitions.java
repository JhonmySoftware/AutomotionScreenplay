package co.com.choucair.certification.screenplay.definition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class Mydefinitions {
    @Dado("^que Jhon Quiñones ingresa a la app XTTT$")
    public void que_Jhon_Quiñones_ingresa_a_la_app_XTTT() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Cuando("^digita sus credenciales e ingresa a la app$")
    public void digita_sus_credenciales_e_ingresa_a_la_app(DataTable arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }

    @Entonces("^verifica que pudo ingresar correctamente$")
    public void verifica_que_pudo_ingresar_correctamente() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
