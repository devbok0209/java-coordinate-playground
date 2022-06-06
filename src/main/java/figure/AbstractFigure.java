package figure;

import straight.Coordinate;

import java.util.List;

public abstract class AbstractFigure implements Figure{
    protected List<Coordinate> coordinates;

    protected AbstractFigure(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public List<Coordinate> getCoordinate() {
        return coordinates;
    }

    public double getLength(Coordinate start, Coordinate end) {
        double xPoint = Math.pow(end.calculateXpoint(start), 2);
        double yPoint = Math.pow(end.calculateYpoint(start), 2);
        return Math.sqrt(xPoint + yPoint);
    }
}
