import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChassisTest {
    Chassis chassis1;

    @Before
    public void before(){
        chassis1 = new Chassis("Ferrari", "Best Ferrari", "Red");
    }

    @Test
    public void hasBrand(){
        assertEquals("Ferrari", chassis1.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("Best Ferrari", chassis1.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", chassis1.getColour());
    }
}
