import org.junit.Before;
import org.junit.Test;
import vehicle_types.ElectricCar;
import vehicles.Battery;
import vehicles.Engine;
import vehicles.Tyres;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    Battery battery;
    Tyres tyres;
    ElectricCar electricCar;

    @Before
    public void before(){
        battery = new Battery(2, 5);
        tyres = new Tyres(4, 1.6);
        electricCar = new ElectricCar(tyres, 20000, "green", battery);
    }

    @Test
    public void electricCarHasBattery(){
        assertEquals(battery, electricCar.getBattery());
    }

    @Test
    public void electricCarHasTyres(){
        assertEquals(tyres, electricCar.getTyres());
    }



}
