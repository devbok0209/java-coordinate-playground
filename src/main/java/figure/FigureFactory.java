package figure;

import rectangle.Rectangle;
import straight.Coordinate;
import straight.Straight;
import triangle.Triangle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {

    private static Map<Integer, Function<List<Coordinate>, Figure>> classifier = new HashMap<>();
    public static final int NUM_STRAIGHT = 2;
    public static final int NUM_TRIANGLE = 3;
    public static final int NUM_RECTANGLE = 4;

    static {
        classifier.put(NUM_STRAIGHT, Straight::new);
        classifier.put(NUM_TRIANGLE, Triangle::new);
        classifier.put(NUM_RECTANGLE, Rectangle::new);
    }

    public static Figure create(List<Coordinate> coordinates) {
        return classifier.get(coordinates.size()).apply(coordinates);
    }
}
