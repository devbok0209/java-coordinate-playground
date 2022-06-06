package triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import straight.Coordinate;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    @DisplayName("좌표 값 3개로 삼각형을 만드는 테스트")
    void should3Coordinate() {
        String input = "(10,10)-(14,15)-(20,8)";
        Triangle triangle = new Triangle(input);
        assertEquals(new Coordinate("(10,10)"), triangle.getCoordinates().get(0));
        assertEquals(new Coordinate("(14,15)"), triangle.getCoordinates().get(1));
        assertEquals(new Coordinate("(20,8)"), triangle.getCoordinates().get(2));
    }

    @Test
    @DisplayName("삼각형 넓이 구하는 테스트")
    void getArea() {
        String input = "(10,10)-(14,15)-(20,8)";
        Triangle triangle = new Triangle(input);

        assertEquals(29.0, triangle.getArea(), 0.01);
    }
}