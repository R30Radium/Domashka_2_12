package com.example.domashka_2_12;

import org.junit.jupiter.api.Test;

import com.example.domashka_2_12.Exception.DivideOnZeroException;
import com.example.domashka_2_12.Service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static com.example.domashka_2_12.CalculatorServiceImplTestConstants.*;
    class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturn3WhenSum1And2() {
        assertEquals(THREE, out.plus(ONE, TWO));
    }

    @Test
    public void shouldReturn2WhenSum0And2() { assertEquals(TWO, out.plus(ZERO, TWO));}

    @Test
    public void shouldReturn0WhenMinus2And2() { assertEquals(ZERO, out.minus(TWO, TWO));}

    @Test
    public void shouldReturn1WhenMinus2And1() { assertEquals(ONE, out.minus(TWO, ONE));}

    @Test
    public void shouldReturn1WhenMultiply1And1() { assertEquals(TWO, out.multiply(TWO, ONE));}

    @Test
    public void shouldReturn2WhenMultiply2And1() { assertEquals(TWO, out.multiply(TWO, ONE));}

    @Test
    public void shouldReturn1WhenDivide2And2() { assertEquals(ONE, out.divide(TWO, TWO));}

    @Test
    public void shouldReturn2WhenDivide2And1() { assertEquals(TWO, out.divide(TWO, ONE));}

    @Test
    public void shouldThrowDivideOnZeroExceptionWhenDivideAnyNumAnd0() {
        assertThrows(DivideOnZeroException.class, () -> out.divide(TWO, ZERO));
    }
}
