package nelson.choucair.tasks;
import nelson.choucair.userinterface.AccessUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Access implements Task {

    public static Access OnThePage() {
        return Tasks.instrumented(Access.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AccessUtest.BUTTONLOGIN),
        Enter.theValue("Ingrese usuario").into(AccessUtest.INPUT_USER),
        Enter.theValue("Ingrese contraseña").into(AccessUtest.INPUT_PASSWORD),
        Click.on(AccessUtest.BUTTONSIGNIN)
        );

    }
}
