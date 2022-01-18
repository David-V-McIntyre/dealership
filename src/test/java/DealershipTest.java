import behaviours.ICarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Customer customer;
    Chassis chassis;
    Tyres tyres;
    ICarType car;
    Dealership dealership;

    @Before
    public void before() {
        customer = new Customer(10000.00);
        chassis = new Chassis("Ford", "Escort", "White");
        tyres = new Tyres(24, "Michelin");
        car = new CombustionCar(tyres, chassis, 2000, 1 );
        dealership = new Dealership(40000);
    }

    @Test
    public void hasTill(){
        assertEquals(40000, dealership.getTill(), 0.0);
    }

    @Test
    public void canAddCar(){
        dealership.addCar(car);
        assertEquals(1, dealership.getCarStockSize());
    }

    @Test
    public void canBuyCar(){
        dealership.buyCarDealer(car);
    assertEquals(38100.00, dealership.getTill(), 0.0);
    assertEquals(1, dealership.getCarStockSize());
    }

    @Test
    public void canSellCar(){
        dealership.addCar(car);
        dealership.sellCarDealer(car);
        assertEquals(42000.00, dealership.getTill(), 0.0);
        assertEquals(0, dealership.getCarStockSize());
    }

}

