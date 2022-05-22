package straight;

import java.awt.*;

public class Coordinate {

    public static final String REGEX = ",";
    private Position x;
    private Position y;

    public Coordinate(String input) {
        String[] result = input.split(REGEX);
        this.x = new Position(Integer.parseInt(result[0].replace("(", "")));
        this.y = new Position(Integer.parseInt(result[1].replace(")", "")));
    }

    public Position getX() {
        return x;
    }

    public Position getY() {
        return y;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinate that = (Coordinate) o;

        if (x != null ? !x.equals(that.x) : that.x != null) return false;
        return y != null ? y.equals(that.y) : that.y == null;
    }

    @Override
    public int hashCode() {
        int result = x != null ? x.hashCode() : 0;
        result = 31 * result + (y != null ? y.hashCode() : 0);
        return result;
    }

    public double calculateXpoint(Coordinate start) {
        return this.x.getDistance(start.getX());
    }

    public double calculateYpoint(Coordinate start) {
        return this.y.getDistance(start.getY());
    }
}
