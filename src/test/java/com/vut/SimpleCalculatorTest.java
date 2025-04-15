package com.vut;

import org.junit.*;

/**
 * Unit test for simple Maven Calculator App.
 */
public class SimpleCalculatorTest {

    @Test
        void twoPlusteoShouldEqualFour({
            var calculator = new SimpleCalculator();
            Assert.assertEquals(4,calculator.add(2,2));
            

        })
}
