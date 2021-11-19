package co.com.choucair.certification.proyectobase.task;

import co.com.choucair.certification.proyectobase.userinterface.UTestFill;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;


public class Fill implements Task {
    private String form;

    public Fill(String form){
        this.form = form;
    }

    public static Fill the(String form) {
        return Tasks.instrumented(Fill.class,form);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Ivan").into(UTestFill.FIRSTNAME),
                Enter.theValue("Lopez").into(UTestFill.LASTNAME),
                Enter.theValue("idlopez@hotmail.com").into(UTestFill.EMAIL),
                SelectFromOptions.byVisibleText("September").from(UTestFill.MONTH),
                SelectFromOptions.byVisibleText("11").from(UTestFill.DAY),
                SelectFromOptions.byVisibleText("1991").from(UTestFill.YEAR),
                Click.on(UTestFill.LANGUAGES),
                Click.on(UTestFill.NEXT),
                Click.on(UTestFill.CITY),
                Enter.theValue("Pereira").into(UTestFill.CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(UTestFill.CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(UTestFill.ZIP),
                Enter.keyValues("6600").into(UTestFill.ZIP),
                Click.on(UTestFill.COUNTRY),
                Click.on(UTestFill.DEVICES),
                Click.on(UTestFill.MOBILE),
                Click.on(UTestFill.MODEL),
                Click.on(UTestFill.SYSTEM),
                Click.on(UTestFill.LASTSTEP),
                Enter.theValue("123Amarillo*").into(UTestFill.PASSWORD),
                Enter.theValue("123Amarillo*").into(UTestFill.CONFIRM),
                Click.on(UTestFill.CHECK1),
                Click.on(UTestFill.CHECK2),
                Click.on(UTestFill.CHECK3),
                Click.on(UTestFill.COMPLETE));
    }
}
