package coordinate;

import java.util.List;

public interface FigureCreator {

    static Figure line(List<Point> points) {
        return new Line(points);
    }

    static Figure triangle(List<Point> points) {
        return new Triangle(points);
    }
    static Figure rectangle(List<Point> points) {
        return new Rectangle(points);
    }
}
