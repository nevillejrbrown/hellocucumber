package hellocucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.nevillejrbrown.mathbot.MathBot;

import static org.junit.Assert.*;

public class Stepdefs {

    int actualAnswer;


    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        actualAnswer = new MathBot().add(arg1,arg2);
    }

    @Then("^I get the answer (\\d+)$")
    public void then_I_return(int expectedAnswer) {
        assertEquals(expectedAnswer,actualAnswer);
    }


    @When("^I multiply (\\d+) and (\\d+)$")
    public void i_multiply_and(int arg1, int arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        actualAnswer = new MathBot().mulitply(arg1,arg2);
    }
}