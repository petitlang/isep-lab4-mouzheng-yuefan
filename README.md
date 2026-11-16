# ISEP Lab 4 - Mouzheng and Yuefan Liu

## Current cycle: Checking up to 100 - BLUE

Following PDF page 24, the tests now cover **every integer from 0 through 100**.
The existing tests for 0, 1 and 2 are retained. Two additional parameterized tests
explicitly list the remaining 24 primes and 74 composite numbers.

`PrimeChecker.isPrime()` checks divisors only up to the square root of the number.
The `divisor <= number / divisor` bound avoids integer overflow while preserving
the result for every integer.

Run with JDK 17 or newer. Maven Wrapper downloads Maven on its first run:

```powershell
.\mvnw.cmd test
```

On Linux/macOS, use `./mvnw test`.

The BLUE result remains **101 tests, 0 failures, 0 errors**.

This completes the current RED/GREEN/BLUE cycle. Each phase was committed
and pushed separately, as required by PDF page 16.
