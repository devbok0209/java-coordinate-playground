package rectangle;

import straight.Coordinate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rectangle {

    private List<Coordinate> coordinates;

    public Rectangle(String input) {
        this.coordinates = new ArrayList<>();
        String[] dots = input.split("-");
        Arrays.stream(dots)
                .forEach(dot -> coordinates.add(new Coordinate(dot)));
        isRectangle(coordinates);
        //isTrapezoid(coordinates);
        //isTrapezoid(coordinates);
    }

    private void isRectangle(List<Coordinate> coordinates) {
        Coordinate firstCoordinate = coordinates.get(0);
        Coordinate secondCoordinate = coordinates.get(1);
        Coordinate thirdCoordinate = coordinates.get(2);
        Coordinate lastCoordinate = coordinates.get(3);

        if (!firstCoordinate.getX().equals(lastCoordinate.getX())
                && !secondCoordinate.getX().equals(thirdCoordinate.getX())) {
            throw new IllegalArgumentException("사다리꼴은 안됩니다!");
        }

        if (firstCoordinate.getY().equals(thirdCoordinate.getY())
            && secondCoordinate.getX().equals(lastCoordinate.getX())) {
            throw new IllegalArgumentException("마름모는 안됩니다!");
        }
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public double getArea() {
        Coordinate firstCoordinate = coordinates.get(0);
        Coordinate secondCoordinate = coordinates.get(1);
        Coordinate lastCoordinate = coordinates.get(3);

        double width = getLength(firstCoordinate, lastCoordinate);
        double height = getLength(firstCoordinate, secondCoordinate);

        return width * height;
    }

    public double getLength(Coordinate start, Coordinate end) {

        double xPoint = Math.pow(end.calculateXpoint(start), 2);
        double yPoint = Math.pow(end.calculateYpoint(start), 2);
        return Math.sqrt(xPoint + yPoint);
    }
}
