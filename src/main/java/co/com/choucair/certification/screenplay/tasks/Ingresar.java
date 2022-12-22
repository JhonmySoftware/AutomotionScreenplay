package co.com.choucair.certification.screenplay.tasks;

import co.com.choucair.certification.screenplay.userinterfaces.PaginaXTTT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {
    public static Ingresar credenciales() {
        return Tasks.instrumented(Ingresar.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("@jhonfquinonesa").into(PaginaXTTT.TXT_USUARIO),
                Enter.theValue("123456").into(PaginaXTTT.TXT_CONTRASENA),
                Click.on(PaginaXTTT.BTN_SING_IN));
    }
}
