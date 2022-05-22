package rectangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import straight.Coordinate;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    @DisplayName("좌표 값 네개 입력받는 테스트")
    void should4Coordinate() {
        String input ="(10,10)-(22,10)-(22,18)-(10,18)";
        Rectangle rectangle = new Rectangle(input);
        assertEquals(new Coordinate("(10,10)"), rectangle.getCoordinates().get(0));
        assertEquals(new Coordinate("(22,10)"), rectangle.getCoordinates().get(1));
        assertEquals(new Coordinate("(22,18)"), rectangle.getCoordinates().get(2));
        assertEquals(new Coordinate("(10,18)"), rectangle.getCoordinates().get(3));
    }

    @Test
    @DisplayName("사다리꼴이면 에외 발생 테스트")
    void shouldThrowExceptionWhenTrapezoid() {
        String trapezoid = "(10,10)-(22,10)-(18,18)-(14,18)";
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(trapezoid));
    }

    @Test
    @DisplayName("마름모이면 에외 발생 테스트")
    void shouldThrowExceptionWhenRhombus() {
        String rhombus = "(10,14)-(16,10)-(22,14)-(16,22)";
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(rhombus));
    }

    @Test
    @DisplayName("직사각형이면 예외 발생 하지 않는 테스트")
    void shouldPassWhenRectangle() {
        String rectangle = "(10,10)-(22,10)-(22,18)-(10,18)";
        assertDoesNotThrow(() -> new Rectangle(rectangle));
    }

    @Test
    @DisplayName("사각형 넓이 구하는 테스트")
    void getArea() {
        String rectangleInput = "(10,10)-(22,10)-(22,18)-(10,18)";
        Rectangle rectangle = new Rectangle(rectangleInput);

        assertEquals(96, rectangle.getArea());
    }
}
