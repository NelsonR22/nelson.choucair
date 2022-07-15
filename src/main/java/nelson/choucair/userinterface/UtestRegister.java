package nelson.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UtestRegister extends PageObject {

    public static final Target REGISTER_BUTTON = Target.the("Botón que nos muestra el formulario para registrarse")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target INPUT_FIRSTNAME = Target.the("Ingrese sus nombres")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Ingrese sus apellidos")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Ingrese su correo electronico")
            .located(By.id("email"));
    public static final Target SELECT_FECHA_MONTH = Target.the("seleccione el mes")
            .located(By.id("birthMonth"));
    public static final Target SELECT_FECHA_DAY = Target.the("seleccione el dia")
            .located(By.id("birthDay"));
    public static final Target SELECT_FECHA_YEAR = Target.the("seleccione el año")
            .located(By.id("birthYear"));
    public static final Target SEARCH_LANGUAGES = Target.the("agregue los lenguages que considere pertinentes")
            .located(By.className("ui-select-search input-xs ng-pristine ng-valid ng-empty ng-touched"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("Da click para continuar, sesion 2")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']/a"));
    public static final Target SELECT_CITY = Target.the("Seleccione una ciudad")
            .located(By.id("city"));
    public static final Target AUTOCOMPLETE_CODIGO_POSTAL = Target.the("codigo postal con relacion a la ciudad")
            .located(By.id("zip"));
    public static final Target INPUT_SEARCH = Target.the("Seleccione un pais")
            .located(By.className("form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched"));
    public static final Target BUTTON_NEXT_LOCATIONTWO = Target.the("Da click para continuar, sesion 3")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
    public static final Target BUTTON_COMPUTER = Target.the("Seleccione tu sistema operativo del computador")
            .located(By.xpath("//div[@class='btn btn-default form-control ui-select-toggle']/span"));
    public static final Target BUTTON_VERSION = Target.the("Seleccione una version")
            .located(By.xpath("//*[@placeholder='Select a Version']/span"));
    public static final Target BUTTON_LANGUAGE = Target.the("Seleccione un lenguaje")
            .located(By.xpath("//*[@placeholder='Select OS language']/span"));
    public static final Target BUTTON_MOVIL_DEVICE = Target.the("Seleccione una marca de telefonos")
            .located(By.xpath("//*[@placeholder='Select Brand']/span"));
    public static final Target BUTTON_MODEL = Target.the("Seleccione un modelo de telefono")
            .located(By.xpath("//*[@placeholder='Select a Model']/span"));
    public static final Target OPERATINGSYSTEM = Target.the("Seleccione un sistema operativo")
            .located(By.xpath("//div[@name='handsetOSId']"));
    public static final Target BUTTON_NEXT_LOCATIONTHREE = Target.the("Da click para continuar, sesion 4")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
    public static final Target INPUT_PASSWORD = Target.the("Ingresar una contraseña valida")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMAR_PASSWORD = Target.the("Confirmar contraseña")
            .located(By.id("confirmPassword "));
    public static final Target INPUT_CHECK_BOXONE = Target.the("seleccionar opcion STAY INFORMED!")
            .located(By.className("checkmark signup-consent__checkbox signup-consent__checkbox--highlight"));
    public static final Target INPUT_CHECK_BOXTWO = Target.the("Aceptar terminos y condiciones")
            .located(By.className("checkmark signup-consent__checkbox error"));
    public static final Target INPUT_CHECK_BOXTHREE = Target.the("Aceptar politica de seguridad y privacidad")
            .located(By.className("checkmark signup-consent__checkbox"));
    public  static final Target BUTTONCOMPLETESETUP = Target.the("finalizar y crear usuario, dara la bienvenida")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
}
