import behaviours.ICarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomerTest {

    Customer customer;
    Chassis chassis;
    Tyres tyres;
    ICarType car;


    @Before
    public void before() {
        customer = new Customer(10000.00);
        chassis = new Chassis("Ford", "Escort", "White");
        tyres = new Tyres(24, "Michelin");
        car = new CombustionCar(tyres, chassis, 2000, 1 );
    }

    @Test
    public void canGetWallet() {
        assertEquals(10000.00, customer.getWallet(), 0.0);
    }

    @Test
    public void canSetWallet() {
        customer.setWallet(12000.00);
        assertEquals(12000.00, customer.getWallet(), 0.0);
    }

    @Test
    public void canAddCar() {
        customer.addCar(car);
        assertEquals(1, customer.getCarCollectionSize());
    }

    @Test
    public void canBuyCar(){
        customer.buyCarCustomer(car);
        assertEquals(8000.00, customer.getWallet(), 0.0);
        assertEquals(1, customer.getCarCollectionSize());
    }

}
