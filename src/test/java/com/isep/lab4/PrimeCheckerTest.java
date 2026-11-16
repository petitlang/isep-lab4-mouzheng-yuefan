package com.isep.lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class PrimeCheckerTest {

    @Test
    void zeroIsNotPrime() {
        PrimeChecker checker = new PrimeChecker();

        assertFalse(checker.isPrime(0),
                "0 should not be considered a prime number");
    }
}
