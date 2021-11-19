package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.task.Fill;
import co.com.choucair.certification.proyectobase.task.Go;
import co.com.choucair.certification.proyectobase.task.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class uteststepdefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Ivan wants to log in with his personal username$")
    public void ivanWantsToLogInWithHisPersonalUsername() {
        OnStage.theActorCalled("ivan").wasAbleTo(Go.toUtestHomePage(), (Login.onThePage()));

    }


    @When("^enter the page and click on the (.*) to register$")
    public void enterThePageAndClickOnTheJoinTodayButtonToRegister(String form) {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.the(form));

    }

    @Then("^You must enter the information requested there to (.*)$")
    public void youMustEnterTheInformationRequestedThereToMakeTheSuccessfulRegistration(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}

