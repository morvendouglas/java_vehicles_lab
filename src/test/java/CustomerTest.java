import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicle_types.Car;
import vehicles.Engine;
import vehicles.Tyres;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Tyres tyres;
    Engine engine;
    Car car;
    Customer customer;

    @Before
    public void before(){

        tyres = new Tyres(4, 1.6);
        engine = new Engine(2, 5);
        car = new Car(tyres, 100000, "black", engine);
        customer = new Customer();
    }

    @Test
    public void canBuyCar(){
        customer.buyVehicle(car);
        assertEquals(1, customer.getNoOfCars());

    }




}
