# ISEP Lab 4 - Mouzheng and Yuefan Liu

## First cycle: RED

The first requirement is that **0 is not a prime number**.
`PrimeCheckerTest.zeroIsNotPrime()` expects `isPrime(0)` to return `false`.
`PrimeChecker.isPrime()` is deliberately unimplemented and throws
`UnsupportedOperationException("Not implemented yet")`.

Run with JDK 17 or newer. Maven Wrapper downloads Maven on its first run:

```powershell
.\mvnw.cmd test
```

On Linux/macOS, use `./mvnw test`.

The expected RED result is **1 test, 0 assertion failures, 1 error** caused by
the unimplemented method. The project and test must compile successfully.

Yuefan Liu will continue with GREEN, then review whether BLUE refactoring is
needed. Each phase should be committed and pushed separately.
