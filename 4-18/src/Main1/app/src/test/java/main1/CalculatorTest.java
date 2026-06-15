package main1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calcculator = new Calculator();
        assertEquals(5,calcculator.add(2,3),"2+3は5になるはず");
        assertEquals(4,calcculator.add(-1,5),"-1+5は4になるはず");
        assertEquals(4,calcculator.add(0,4),"0+4は4になるはず");
    }
    
    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.subtract(5,3),"5-3は2になるはず");
         assertEquals(-3,calculator.subtract(-1,2),"-1-2は-3になるはず");
         assertEquals(4,calculator.subtract(4,0),"4-0は4になるはず");
    }
}
