package straight;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Straight {
    private List<Coordinate> coordinates;

    public Straight(String twoCoordinates) {
        this.coordinates = new ArrayList<>();
        String[] twoDots = twoCoordinates.split("-");
        Arrays.stream(twoDots)
                .forEach(dots -> coordinates.add(new Coordinate(dots)));
    }

    public List<Coordinate> getCoordinate() {
        return coordinates;
    }

    public double getDistance() {
        Coordinate start = getCoordinate().get(0);
        Coordinate end = getCoordinate().get(1);

        double xPoint = Math.pow(end.calculateXpoint(start), 2);
        double yPoint = Math.pow(end.calculateYpoint(start), 2);
        return Math.sqrt(xPoint + yPoint);
    }
}
