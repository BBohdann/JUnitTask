package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach(){
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThatSumReturn1(){
        int actual = sumCalculator.sum(1);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testThatSumReturn6(){
        int actual = sumCalculator.sum(3);
        Assertions.assertEquals(6, actual);
    }

    @Test
    public void testThatInputValueCorrect(){
        int [] testCases = {0,-5,-8};
        for (int testCase : testCases) {
            Assertions.assertThrows(IllegalArgumentException.class,
                    ()->sumCalculator.sum(testCase));
        }
    }
}