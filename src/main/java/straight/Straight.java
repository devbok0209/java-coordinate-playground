package straight;


import figure.AbstractFigure;
import java.util.List;

public class Straight extends AbstractFigure {
    public Straight(List<Coordinate> coordinates) {
        super(coordinates);
    }

    @Override
    public double getArea() {
        return getLength(coordinates.get(0), coordinates.get(1));
    }
}
