package triangle;

import straight.Coordinate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {

    private List<Coordinate> coordinates;

    public Triangle(String input) {
        this.coordinates = new ArrayList<>();
        String[] dots = input.split("-");
        Arrays.stream(dots)
                .forEach(dot -> coordinates.add(new Coordinate(dot)));
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public double getArea() {
        Coordinate firstCoordinate = coordinates.get(0);
        Coordinate secondCoordinate = coordinates.get(1);
        Coordinate lastCoordinate = coordinates.get(2);

        double lengthA = getLength(firstCoordinate, secondCoordinate);
        double lengthB = getLength(secondCoordinate, lastCoordinate);
        double lengthC = getLength(lastCoordinate, firstCoordinate);

        double s = (lengthA + lengthB + lengthC) / 2;

        double beforeRoot = s * (s - lengthA) * (s - lengthB) * (s - lengthC);

        return Math.round(Math.sqrt(beforeRoot));
    }

    private double getLength(Coordinate start, Coordinate end) {

        double xPoint = Math.pow(end.calculateXpoint(start), 2);
        double yPoint = Math.pow(end.calculateYpoint(start), 2);
        return Math.sqrt(xPoint + yPoint);
    }
}
