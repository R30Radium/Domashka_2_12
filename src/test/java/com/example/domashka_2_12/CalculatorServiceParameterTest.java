package com.example.domashka_2_12;

import com.example.domashka_2_12.Service.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.domashka_2_12.CalculatorServiceImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParameterTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSummation(float num1, float num2) {
        assertEquals(num1 + num2, out.plus(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSubstraction(float num1, float num2) {
        assertEquals(num1 + num2, out.minus(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMultiplication(float num1, float num2) {
        assertEquals(num1 + num2, out.multiply(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfDivision(float num1, float num2) {
        assertEquals(num1 / num2, out.divide(num1, num2));
    }

    private static Stream<Arguments> provideArgumentsForCalculatorTests() {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(ZERO, ONE),
                Arguments.of(ONE, ONE),
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, TWO)
                );
    }
}