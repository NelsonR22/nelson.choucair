package nelson.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class AccessUtest extends PageObject {

public static final Target BUTTONLOGIN = Target.the("Boton para ingresar credenciales")
        .located(By.xpath("//a[@class='unauthenticated-nav-bar__link']"));
public static final Target INPUT_USER = Target.the("Ingrese usuario")
        .located(By.id("username"));
public static final  Target INPUT_PASSWORD = Target.the("Ingrese contraseña")
        .located(By.id("password"));
public static final Target BUTTONSIGNIN = Target.the("Boton para iniciar sesion")
        .located(By.id("kc-login"));

}