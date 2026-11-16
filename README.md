# ISEP Lab 4 - Mouzheng and Yuefan Liu

## Current cycle: Checking 1/2 - BLUE

The three current tests require **0 and 1 to be non-prime, and 2 to be prime**.
Following PDF page 22, `PrimeChecker.isPrime()` returns `true` when `number == 2`
and otherwise returns `false`. This is the minimal implementation for this cycle.

Run with JDK 17 or newer. Maven Wrapper downloads Maven on its first run:

```powershell
.\mvnw.cmd test
```

On Linux/macOS, use `./mvnw test`.

The expected result is **3 tests, 0 failures, 0 errors**.

Following PDF page 23, the tests for 0 and 1 now share a `@ParameterizedTest`
with `@ValueSource(ints = {0, 1})`. The separate test for 2 is retained, and both
tests use a shared `private final PrimeChecker` field. The production code is
unchanged from GREEN. GREEN and BLUE are committed and pushed separately.
