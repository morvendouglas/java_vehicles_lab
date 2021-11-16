package vehicle_types;

import vehicles.Battery;
import vehicles.Tyres;
import vehicles.Vehicle;

public class ElectricCar extends Vehicle {

    private Battery battery;


    public ElectricCar(Tyres tyres, int price, String colour, Battery battery) {
        super(tyres, price, colour);
        this.battery = battery;

    }

    public Battery getBattery() {
        return battery;
    }
}
