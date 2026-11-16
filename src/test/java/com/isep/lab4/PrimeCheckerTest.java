package com.isep.lab4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeCheckerTest {

    private final PrimeChecker primeChecker = new PrimeChecker();

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    void testNumberLessThan2AreNotPrime(int number) {
        assertFalse(primeChecker.isPrime(number),
                number + " should not be considered a prime number");
    }

    @Test
    void twoIsPrime() {
        assertTrue(primeChecker.isPrime(2),
                "2 should be considered a prime number");
    }
}
