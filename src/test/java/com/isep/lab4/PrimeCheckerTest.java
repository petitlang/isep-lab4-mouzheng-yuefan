package com.isep.lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeCheckerTest {

    @Test
    void zeroIsNotPrime() {
        PrimeChecker checker = new PrimeChecker();

        assertFalse(checker.isPrime(0),
                "0 should not be considered a prime number");
    }

    @Test
    void oneIsNotPrime() {
        PrimeChecker checker = new PrimeChecker();

        assertFalse(checker.isPrime(1),
                "1 should not be considered a prime number");
    }

    @Test
    void twoIsPrime() {
        PrimeChecker checker = new PrimeChecker();

        assertTrue(checker.isPrime(2),
                "2 should be considered a prime number");
    }
}
