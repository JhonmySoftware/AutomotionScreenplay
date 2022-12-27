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
    public static final Target LBL_MENU = Target.the("Home Menu").located(By.xpath("//*[@id=\"menu\"]/li[1]"));
    public static final Target BTN_Forms = Target.the("Forms").located(By.xpath("//*[@id=\"menu\"]/li[6]/a/span[1]"));
    public static final Target BTN_FormsValidation = Target.the("Forms Validation").located(By.xpath("//*[@id=\"menu\"]/li[6]/ul/li[2]/a"));
    public static final Target BTN_Closepopup = Target.the("Cerrar Formulario del popup").located(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/header/div[2]/nav/a[3]"));
    public static final Target BTN_CloseInline = Target.the("Cerrar Formulario del inline").located(By.xpath("//*[@id=\"content\"]/div/div/div[3]/div/div/header/div[2]/nav/a[3]"));
    public static final Target Campo_Required = Target.the("Cerrar Formulario del inline").located(By.id("required2"));
    public static final Target Campo_Email = Target.the("Cerrar Formulario del inline").located(By.id("email2"));
    public static final Target Campo_Password = Target.the("Cerrar Formulario del inline").located(By.id("password2"));
    public static final Target Campo_ConfPassword = Target.the("Cerrar Formulario del inline").located(By.id("confirm_password2"));
    public static final Target Campo_Date = Target.the("Cerrar Formulario del inline").located(By.id("date2"));
    public static final Target Campo_Url = Target.the("Cerrar Formulario del inline").located(By.id("url2"));
    public static final Target Campo_DigitsOnly = Target.the("Cerrar Formulario del inline").located(By.id("digits"));
    public static final Target Campo_Range = Target.the("Cerrar Formulario del inline").located(By.id("range"));
    public static final Target Campo_policy = Target.the("Cerrar Formulario del inline").located(By.id("agree2"));
}
