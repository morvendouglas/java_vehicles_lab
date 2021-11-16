package people;

import vehicle_types.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Vehicle> cars;

    public Customer() {
        this.money = 200000;
        this.cars = new ArrayList<>();
    }


    public void buyVehicle(Car car) {
        this.cars.add(car);
    }


    public int getNoOfCars() {
        return cars.size();
    }
}
