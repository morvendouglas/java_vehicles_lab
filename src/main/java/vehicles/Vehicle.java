package vehicles;

public abstract class Vehicle {

    private Tyres tyres;
    private int price;
    private String colour;


    public Vehicle(Tyres tyres, int price, String colour) {
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }
}
