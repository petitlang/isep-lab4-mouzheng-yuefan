# ISEP Lab 4 - Mouzheng and Yuefan Liu

## PrimeChecker: checking up to 100 - complete

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

## Current cycle: FizzBuzz up to 100 - BLUE

`FizzBuzzTest` contains 100 fixed examples for positive integers 1 through 100.
The expected results cover ordinary numbers, multiples of 3, multiples of 5,
and multiples of both 3 and 5. No input validation is required.

Following PDF page 27, `FizzBuzz.fizzBuzz(int)` first checks whether the number
is divisible by both 3 and 5, then by 3, then by 5, and otherwise returns the
number as a string. The common-multiple case takes precedence over either
individual rule. Inputs are assumed to be positive integers.

BLUE simplifies the common-multiple condition from
`number % 3 == 0 && number % 5 == 0` to `number % 15 == 0`, since the least
common multiple of 3 and 5 is 15. The order and returned strings stay the same.

Both GREEN and BLUE pass **201 tests, 0 failures, 0 errors**: 100 FizzBuzz examples
and the existing 101 PrimeChecker cases. The original RED tests are unchanged.
GREEN and BLUE are committed and pushed separately.

## Roman numerals BDD - readable scenarios and full-range coverage

`roman_numerals.feature` explains the behavior through 21 short examples:
familiar symbols, short forms such as `IV` and `IX`, and mixed numerals.
`roman_numerals_full_range.feature` holds the other 979 examples. Together,
they cover every number from 1 through 1000 exactly once. The Given, When,
and Then steps describe what a reader asks for and sees.

`RomanNumeralConverter.convert(int)` builds the numeral from descending Roman
values, including the subtractive pairs `CM`, `CD`, `XC`, `XL`, `IX` and `IV`.
BLUE reuses the value and symbol tables via `private static final` fields.

The full suite passes **1201 tests/scenarios, 0 failures, 0 errors**: 1000 Roman
numeral scenarios plus the existing 201 PrimeChecker and FizzBuzz cases.
The expected number-to-numeral mappings and conversion code are unchanged.
