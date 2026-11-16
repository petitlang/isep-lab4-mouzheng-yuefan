# ISEP Lab 4 - Mouzheng and Yuefan Liu

## Current cycle: Checking up to 100 - RED

Following PDF page 24, the tests now cover **every integer from 0 through 100**.
The existing tests for 0, 1 and 2 are retained. Two additional parameterized tests
explicitly list the remaining 24 primes and 74 composite numbers.

`PrimeChecker.isPrime()` is unchanged from the previous GREEN/BLUE cycle:
it returns `true` only when `number == 2`, and otherwise returns `false`.

Run with JDK 17 or newer. Maven Wrapper downloads Maven on its first run:

```powershell
.\mvnw.cmd test
```

On Linux/macOS, use `./mvnw test`.

The expected RED result is **101 tests, 24 failures, 0 errors**: the original
three cases and all 74 composite cases pass, while the 24 new prime cases fail.
The failures are assertions about missing behavior, not compilation errors.

Yuefan Liu will continue with GREEN and BLUE. Each phase should be committed
and pushed separately, as required by PDF page 16.
