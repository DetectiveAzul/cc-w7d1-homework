import org.junit.Before;
import org.junit.Test;
import persons.Visitor;
import stalls.IceCreamStall;
import stalls.TobaccoStall;

import static org.junit.Assert.*;

public class IceCreamStallTest {
    private IceCreamStall icecream;
    private Visitor visitor00;
    private Visitor visitor01;

    @Before
    public void before() {
        icecream = new IceCreamStall("La Jijonenca","Jonathan", "AB14", 1, 5);
        visitor00 = new Visitor("Jaime", 29, 1.70, 35, true);
        visitor01 = new Visitor("John", 14, 1.45, 10, false);
    }
    @Test
    public void allowedTo() {
        assertTrue(icecream.isAllowedTo(visitor00));
    }
    @Test
    public void NotallowedTo() {
        assertFalse(icecream.isAllowedTo(visitor01));
    }
}
