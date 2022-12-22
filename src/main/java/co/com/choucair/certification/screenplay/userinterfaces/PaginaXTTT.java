package co.com.choucair.certification.screenplay.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class PaginaXTTT extends PageObject {
    public static final Target TXT_USUARIO = Target.the("Ingresar Usuario").located(By.xpath("//*[@id=\"login\"]/form/input[1]"));
    public static final Target TXT_CONTRASENA = Target.the("Ingresar Clave").located(By.xpath("//*[@id=\"login\"]/form/input[2]"));
    public static final Target BTN_SING_IN = Target.the("Botón Ingresar").located(By.xpath("//*[@id=\"login\"]/form/button"));
    public static final Target LBL_MENU = Target.the("Botón Ingresar").located(By.xpath("//*[@id=\"menu\"]/li[1]"));
}
