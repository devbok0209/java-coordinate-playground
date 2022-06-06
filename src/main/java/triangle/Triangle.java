package triangle;

import figure.AbstractFigure;
import straight.Coordinate;


import java.util.List;

public class Triangle extends AbstractFigure {

    public Triangle(List<Coordinate> coordinates) {
        super(coordinates);
    }

    @Override
    public double getArea() {
        Coordinate firstCoordinate = coordinates.get(0);
        Coordinate secondCoordinate = coordinates.get(1);
        Coordinate lastCoordinate = coordinates.get(2);

        double lengthA = getLength(firstCoordinate, secondCoordinate);
        double lengthB = getLength(secondCoordinate, lastCoordinate);
        double lengthC = getLength(lastCoordinate, firstCoordinate);

        return usingHeronPrinciple(lengthA, lengthB, lengthC);
    }

    private long usingHeronPrinciple(double lengthA, double lengthB, double lengthC) {
        double s = (lengthA + lengthB + lengthC) / 2;
        double beforeRoot = s * (s - lengthA) * (s - lengthB) * (s - lengthC);
        return Math.round(Math.sqrt(beforeRoot));
    }

}
