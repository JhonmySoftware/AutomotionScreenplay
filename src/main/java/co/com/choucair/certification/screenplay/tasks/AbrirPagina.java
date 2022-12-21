package co.com.choucair.certification.screenplay.tasks;

import co.com.choucair.certification.screenplay.userinterfaces.PaginaXTTT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.jetbrains.annotations.NotNull;

public class AbrirPagina implements Task {
    private PaginaXTTT paginaXTTT;

    public static AbrirPagina urlApp() {
        return (AbrirPagina) Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaXTTT));
    }
}
