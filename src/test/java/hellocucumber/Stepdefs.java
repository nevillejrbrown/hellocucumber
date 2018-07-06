package hellocucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.nevillejrbrown.mathbot.MathBot;

import static org.junit.Assert.*;

public class Stepdefs {

    int actualAnswer;

    @When("^I add 2 and 2$")
    public void when_I_add_2_and_2() {
        actualAnswer = new MathBot().add(2,2);
        // throw new PendingException();
    }

    @Then("^I get the answer (\\d+)$")
    public void then_I_return(int expectedAnswer) {
        assertEquals(expectedAnswer,actualAnswer);
    }
}