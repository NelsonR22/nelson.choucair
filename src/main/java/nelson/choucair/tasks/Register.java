package nelson.choucair.tasks;
import nelson.choucair.userinterface.UtestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Register implements Task {
    public static Register OnThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UtestRegister.REGISTER_BUTTON),
                Enter.theValue("Ingrese sus nombres").into(UtestRegister.INPUT_FIRSTNAME),
                Enter.theValue("Ingrese sus apellidos").into(UtestRegister.INPUT_LASTNAME),
                Enter.theValue("Ingrese su correo electronico").into(UtestRegister.INPUT_EMAIL),
                Enter.theValue("seleccione el mes").into(UtestRegister.SELECT_FECHA_MONTH),
                Enter.theValue("Seleccione el dia").into(UtestRegister.SELECT_FECHA_DAY),
                Enter.theValue("Seleccione el año").into(UtestRegister.SELECT_FECHA_YEAR),
                Enter.theValue("agregue los lenguages que considere pertinentes").into(UtestRegister.SEARCH_LANGUAGES),
                Click.on(UtestRegister.BUTTON_NEXT_LOCATION),
                Enter.theValue("Seleccione una ciudad").into(UtestRegister.SELECT_CITY),
                Enter.theValue("codigo postal con relacion a la ciudad").into(UtestRegister.AUTOCOMPLETE_CODIGO_POSTAL),
                Enter.theValue("Seleccione un pais").into(UtestRegister.INPUT_SEARCH),
                Click.on(UtestRegister.BUTTON_NEXT_LOCATIONTWO),
                Enter.theValue("Seleccione tu sistema operativo del computador").into(UtestRegister.BUTTON_COMPUTER),
                Enter.theValue("Seleccione una version").into(UtestRegister.BUTTON_VERSION),
                Enter.theValue("Seleccione un lenguage").into(UtestRegister.BUTTON_LANGUAGE),
                Enter.theValue("Seleccione una marca de telefonos").into(UtestRegister.BUTTON_MOVIL_DEVICE),
                Enter.theValue("Seleccione un modelo de telefono").into(UtestRegister.BUTTON_MODEL),
                Enter.theValue("Seleccione un sistema operativo").into(UtestRegister.OPERATINGSYSTEM),
                Click.on(UtestRegister.BUTTON_NEXT_LOCATIONTHREE),
                Enter.theValue("Ingresar una contraseña valida").into(UtestRegister.INPUT_PASSWORD),
                Enter.theValue("Confirmar contraseña").into(UtestRegister.INPUT_CONFIRMAR_PASSWORD),
                Click.on(UtestRegister.INPUT_CHECK_BOXONE),
                Click.on(UtestRegister.INPUT_CHECK_BOXTWO),
                Click.on(UtestRegister.INPUT_CHECK_BOXTHREE),
                Click.on(UtestRegister.BUTTONCOMPLETESETUP)
                );

    }
}
