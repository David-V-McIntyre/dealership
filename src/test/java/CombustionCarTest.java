import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombustionCarTest {
    Tyres tyres1;
    Chassis chassis1;
    CombustionCar combustionCar;

    @Before
    public void before(){
        tyres1 = new Tyres(24, "Goodyear");
        chassis1 = new Chassis("Ferrari", "Best Ferrari", "Red");
        combustionCar = new CombustionCar(tyres1, chassis1, 4000, 2);
    }

    @Test
    public void hasRefuel(){
        assertEquals("Need fuel", combustionCar.refuel());
    }

    @Test
    public void canRun(){
        assertEquals("Brum brum car go brrrr", combustionCar.run());
    }

    @Test
    public void hasEngine(){
        assertEquals("Combustion Engine", combustionCar.engine);
    }


}