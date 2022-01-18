import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres1;
    Tyres tyres2;
    Tyres tyres3;

    @Before
    public void before(){
        tyres1 = new Tyres(24, "Goodyear");
        tyres2 = new Tyres(20, "Michelin");
        tyres3 = new Tyres(28, "Dunlop");
    }

    @Test
    public void hasSize(){
        assertEquals(24, tyres1.getSize());
        assertEquals(20, tyres2.getSize());
        assertEquals(28, tyres3.getSize());
    }

    @Test
    public void hasBrand(){
        assertEquals("Goodyear", tyres1.getBrand());
        assertEquals("Michelin", tyres2.getBrand());
        assertEquals("Dunlop", tyres3.getBrand());
    }
}
