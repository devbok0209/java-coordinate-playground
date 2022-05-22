package straight;

public class Position {

    private double point;

    public Position(double point) {
        if (point > 24) {
            throw new IllegalArgumentException("좌표 값은 24를 초과해서는 안됩니다!");
        }
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        return Double.compare(position.point, point) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(point);
        return (int) (temp ^ (temp >>> 32));
    }

    public double getDistance(Position end) {
        return this.point - end.point;
    }
}
