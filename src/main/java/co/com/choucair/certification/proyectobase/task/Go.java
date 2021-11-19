package co.com.choucair.certification.proyectobase.task;


import co.com.choucair.certification.proyectobase.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Go implements Task {
    private UTestPage uTestPage;
    public static Go toUtestHomePage() {
        return Tasks.instrumented(Go.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(uTestPage));

    }
}
