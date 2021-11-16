package vehicles;

public class Engine {

    private int size;
    private int fullTank;

    public Engine(int size, int fullTank) {
        this.size = size;
        this.fullTank = fullTank;
    }

    public int getEngineSize() {
        return this.size;
    }

    public int getFullTank() {
        return this.fullTank;
    }
}
