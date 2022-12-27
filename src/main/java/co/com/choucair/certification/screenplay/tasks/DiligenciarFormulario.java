package co.com.choucair.certification.screenplay.tasks;

import co.com.choucair.certification.screenplay.userinterfaces.PaginaXTTT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DiligenciarFormulario implements Task {

    private PaginaXTTT paginaXTTT;

    public static DiligenciarFormulario Datos() {
        return Tasks.instrumented(DiligenciarFormulario.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaXTTT.BTN_Forms),
                Click.on(PaginaXTTT.BTN_FormsValidation),
                Click.on(PaginaXTTT.BTN_Closepopup),
                Click.on(PaginaXTTT.BTN_CloseInline));

    }
}
