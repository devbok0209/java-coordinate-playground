package figure;

import straight.Coordinate;

import java.util.List;

public interface Figure {
    List<Coordinate> getCoordinate();
    double getArea();
    double getLength(Coordinate start, Coordinate end);
}
