package com.isep.lab4.steps;

import com.isep.lab4.RomanNumeralConverter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralSteps {

    private final RomanNumeralConverter converter = new RomanNumeralConverter();
    private int number;
    private String romanNumeral;

    @Given("I have the number {int}")
    public void iHaveTheNumber(int number) {
        this.number = number;
    }

    @When("I ask for its Roman numeral")
    public void iAskForItsRomanNumeral() {
        romanNumeral = converter.convert(number);
    }

    @Then("I should see {string}")
    public void iShouldSee(String expectedRomanNumeral) {
        assertEquals(expectedRomanNumeral, romanNumeral);
    }
}
