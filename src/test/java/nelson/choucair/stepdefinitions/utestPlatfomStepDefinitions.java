package nelson.choucair.stepdefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nelson.choucair.tasks.OpenUp;
import nelson.choucair.questions.Answer;
import nelson.choucair.tasks.Register;


import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class utestPlatfomStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }


    @Given("^: that Nelson wants to earn money and learn new skills$")
    public void thatNelsonwantstoearnmoneyandlearnnewskills () {
        // Write code here that turns the phrase above into concrete actions

       OnStage.theActorCalled("Nelson").wasAbleTo(OpenUp.thePage());

    }




    @When("^look for the option to register on the Utest platform$")
    public void lookfortheoptiontoregisterontheUtestplatform () {

        OnStage.theActorCalled("Nelson").wasAbleTo(Register.OnThePage());

    }


    @Then("^:manages to register in (.*)$")
    public void managestoregisterinUtest(String question) {


        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}
