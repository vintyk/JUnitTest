package entity;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.Assert.assertEquals;

public class CalculatorImplTest {
    // только 1 калькулятор на весь тест
    private static CalculatorImpl calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new CalculatorImpl();
    }

    @Test
    public void isZero() throws Exception {
        calculator = new CalculatorImpl();
        double result = calculator.calculate("0");
        assertEquals(0, result, 1e-9);
    }

    @Test
    public void floatingPointTest() {
        calculator = new CalculatorImpl();
        double result = calculator.calculate("-3e3");
        assertEquals(-3000, result, 1e-9);
    }


}