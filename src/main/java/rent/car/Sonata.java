package rent.car;

public class Sonata extends Car {

    private final String carName = "Sonata";
    private final double gasMileage = 10;

    private String report;
    private double distance;

    public Sonata(double distance) {
        this.distance = distance;
        this.report = toString();
    }

    @Override
    double getDistancePerLiter() {
        return gasMileage;
    }

    @Override
    double getTripDistance() {
        return this.distance;
    }

    @Override
    public String getName() {
        return this.carName;
    }

    @Override
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }

    @Override
    public String toString() {
        return getName() + " : " + (int)getChargeQuantity() + "리터";
    }
}
