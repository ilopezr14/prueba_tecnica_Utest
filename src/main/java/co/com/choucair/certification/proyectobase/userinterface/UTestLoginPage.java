package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UTestLoginPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to register").located(By.xpath("//a[text()='Join Today']"));
    public static final Target SUCCESSFULL = Target.the("validate correct registration").located(By.id("laddaBtn"));
}
