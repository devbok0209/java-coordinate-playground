package rent.car;

public class K5 extends Car{

    private final String carName = "K5";
    private final double gasMileage = 13;
    private String report;
    private double distance;

    public K5(double distance) {
        this.distance = distance;
        this.report = toString();
    }

    @Override
    double getDistancePerLiter() {
        return gasMileage;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return carName;
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
