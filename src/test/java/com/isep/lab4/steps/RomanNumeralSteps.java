package com.isep.lab4.steps;

import com.isep.lab4.RomanNumeralConverter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralSteps {

    private int number;
    private String result;

    @Given("I have the integer {int}")
    public void iHaveTheInteger(int number) {
        this.number = number;
    }

    @When("I convert it to a Roman numeral")
    public void iConvertItToARomanNumeral() {
        result = new RomanNumeralConverter().convert(number);
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String expected) {
        assertEquals(expected, result);
    }
}
