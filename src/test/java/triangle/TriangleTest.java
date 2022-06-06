package triangle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import straight.Coordinate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private Triangle triangle;

    @BeforeEach
    void setup() {
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate("(10,10)"));
        coordinates.add(new Coordinate("(14,15)"));
        coordinates.add(new Coordinate("(20,8)"));
        this.triangle = new Triangle(coordinates);
    }

    @Test
    @DisplayName("좌표 값 3개로 삼각형을 만드는 테스트")
    void should3Coordinate() {
        assertEquals(new Coordinate("(10,10)"), triangle.getCoordinate().get(0));
        assertEquals(new Coordinate("(14,15)"), triangle.getCoordinate().get(1));
        assertEquals(new Coordinate("(20,8)"), triangle.getCoordinate().get(2));
    }

    @Test
    @DisplayName("삼각형 넓이 구하는 테스트")
    void getArea() {
        assertEquals(29.0, triangle.getArea(), 0.01);
    }

    @AfterEach
    void tearDown() {
        triangle = null;
    }

}