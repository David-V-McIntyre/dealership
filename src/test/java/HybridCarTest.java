import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {
    Tyres tyres1;
    Chassis chassis1;
    HybridCar hybridCar;

    @Before
    public void before(){
        tyres1 = new Tyres(24, "Goodyear");
        chassis1 = new Chassis("Ferrari", "Best Ferrari", "Red");
        hybridCar = new HybridCar(tyres1, chassis1, 3000, 2);
    }

    @Test
    public void hasPrice(){
        assertEquals(3000, hybridCar.getPrice(), 0.0);
    }

    @Test
    public void hasDamage(){
        assertEquals(2, hybridCar.getDamage());
    }

    @Test
    public void hasRefuel(){
        assertEquals("need electricity and petrol", hybridCar.refuel());
    }

    @Test
    public void canRun(){
        assertEquals("hybrid car go hmmmmmmmmm then brrrr then hmmmmmm", hybridCar.run());
    }

    @Test
    public void hasEngine(){
        assertEquals("hybrid", hybridCar.engine);
    }


}