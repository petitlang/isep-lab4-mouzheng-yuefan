# ISEP Lab 4 - Mouzheng and Yuefan Liu

## Current cycle: Checking up to 100 - GREEN

Following PDF page 24, the tests now cover **every integer from 0 through 100**.
The existing tests for 0, 1 and 2 are retained. Two additional parameterized tests
explicitly list the remaining 24 primes and 74 composite numbers.

`PrimeChecker.isPrime()` now checks divisibility from 2 through `number - 1`.
It returns `false` for numbers below 2 and for composite numbers.

Run with JDK 17 or newer. Maven Wrapper downloads Maven on its first run:

```powershell
.\mvnw.cmd test
```

On Linux/macOS, use `./mvnw test`.

The GREEN result is **101 tests, 0 failures, 0 errors**.

Yuefan Liu will review BLUE refactoring next. Each phase should be committed
and pushed separately, as required by PDF page 16.
