package vehicles;

public class Tyres {

    private int noOfTyres;
    private double tread;

    public Tyres(int noOfTyres, double tread) {
        this.noOfTyres = noOfTyres;
        this.tread = tread;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public double getTyreTread() {
        return this.tread;
    }
}
