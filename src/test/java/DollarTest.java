import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DollarTest {
    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar prouct = five.times(2);
        assertEquals(10,prouct.amount);
        prouct=five.times(3);
        assertEquals(15,prouct.amount);
    }
}
