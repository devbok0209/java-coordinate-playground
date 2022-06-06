package rectangle;

import figure.AbstractFigure;
import straight.Coordinate;

import java.util.List;

public class Rectangle extends AbstractFigure {

    public Rectangle(List<Coordinate> coordinates) {
        super(coordinates);
        isRectangle(coordinates);
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
    @Override
    public double getArea() {
        Coordinate firstCoordinate = coordinates.get(0);
        Coordinate secondCoordinate = coordinates.get(1);
        Coordinate lastCoordinate = coordinates.get(3);

        double width = getLength(firstCoordinate, lastCoordinate);
        double height = getLength(firstCoordinate, secondCoordinate);

        return width * height;
    }

}
