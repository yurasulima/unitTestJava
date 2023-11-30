package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }


    @Test
    @DisplayName("Test sum 9")
    void testSum() {
        assertEquals(45, calculator.sum(9));
    }


    @Test
    @DisplayName("Test sum 1")
    void testSumWithOne() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    @DisplayName("Test sum 3")
    void testSumWithThree() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    @DisplayName("Test sum 0 IllegalArgumentException")
    void testSumWithZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}
