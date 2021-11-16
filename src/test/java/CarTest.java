import org.junit.Before;
import org.junit.Test;
import vehicle_types.Car;
import vehicles.Engine;
import vehicles.Tyres;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Engine engine;
    Tyres tyres;
    Car car;

    @Before
    public void before(){
        tyres = new Tyres(4, 1.6);
        engine = new Engine(2, 5);
        car = new Car(tyres, 100000, "black", engine);
    }

}
