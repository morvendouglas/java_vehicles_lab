package vehicle_types;

import vehicles.Engine;
import vehicles.Tyres;
import vehicles.Vehicle;

public class Car extends Vehicle {

    private Engine engine;

    public Car(Tyres tyres, int price, String colour, Engine engine) {
        super(tyres, price, colour);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}
