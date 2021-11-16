package vehicles;

public class Battery {

    private int size;
    private int fullCharge;

    public Battery(int size, int fullCharge) {
        this.size = size;
        this.fullCharge = fullCharge;
    }

    public int getSize() {
        return size;
    }

    public int getFullCharge() {
        return fullCharge;
    }
}
