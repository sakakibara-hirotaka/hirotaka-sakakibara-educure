package main2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DividerTest {

    @Test
    void testNormalDivison() {
        Divider divider = new Divider();
        assertEquals(3.0,divider.divide(6.0,2.0),0.0001,"6÷2は3になるはず");
        assertEquals(-4,divider.divide(-8.0,2.0),0.0001,"-8÷2は-4になるはず");
        assertEquals(2.5,divider.divide(5.0,2.0),0.0001,"5÷2は2.5になるはず");
    }

    @Test
    void testExceptionDivision() {
        Divider divider = new Divider();

        IllegalArgumentException e =
        assertThrows(IllegalArgumentException.class,() -> divider.divide(5.0,0.0));
        assertEquals("ゼロで除算はできません",e.getMessage());
    
    }

}
        
        /*try {
            divider.divide(5.0,0.0);
            fail("ゼロ除算で例外が発生するはず");
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            assertEquals("ゼロで除算はできません",e.getMessage());
        }*/

