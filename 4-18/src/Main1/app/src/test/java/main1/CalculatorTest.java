package main1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calcculator = new Calculator();
        assertEquals(5,calcculator.add(2,3),"2+3は5になるはず");
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.subtract(5,3),"5-3は2になるはず");
    }
}
