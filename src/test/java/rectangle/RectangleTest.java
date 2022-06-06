package rectangle;

import figure.Figure;
import figure.FigureFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import straight.Coordinate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Figure rectangle;

    @BeforeEach
    void setUp() {
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate("(10,10)"));
        coordinates.add(new Coordinate("(22,10)"));
        coordinates.add(new Coordinate("(22,18)"));
        coordinates.add(new Coordinate("(10,18)"));
        this.rectangle = FigureFactory.create(coordinates);
    }

    @Test
    @DisplayName("좌표 값 네개 입력받는 테스트")
    void should4Coordinate() {
        assertEquals(new Coordinate("(10,10)"), rectangle.getCoordinate().get(0));
        assertEquals(new Coordinate("(22,10)"), rectangle.getCoordinate().get(1));
        assertEquals(new Coordinate("(22,18)"), rectangle.getCoordinate().get(2));
        assertEquals(new Coordinate("(10,18)"), rectangle.getCoordinate().get(3));
    }

    @Test
    @DisplayName("사다리꼴이면 에외 발생 테스트")
    void shouldThrowExceptionWhenTrapezoid() {
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate("(10,10)"));
        coordinates.add(new Coordinate("(22,10)"));
        coordinates.add(new Coordinate("(18,18)"));
        coordinates.add(new Coordinate("(14,18)"));
        assertThrows(IllegalArgumentException.class, () -> FigureFactory.create(coordinates));
    }

    @Test
    @DisplayName("마름모이면 에외 발생 테스트")
    void shouldThrowExceptionWhenRhombus() {
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate("(10,14)"));
        coordinates.add(new Coordinate("(16,10)"));
        coordinates.add(new Coordinate("(22,14)"));
        coordinates.add(new Coordinate("(16,22)"));
        assertThrows(IllegalArgumentException.class, () -> FigureFactory.create(coordinates));
    }

    @Test
    @DisplayName("직사각형이면 예외 발생 하지 않는 테스트")
    void shouldPassWhenRectangle() {
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate("(10,10)"));
        coordinates.add(new Coordinate("(22,10)"));
        coordinates.add(new Coordinate("(22,18)"));
        coordinates.add(new Coordinate("(10,18)"));
        assertDoesNotThrow(() -> FigureFactory.create(coordinates));
    }

    @Test
    @DisplayName("사각형 넓이 구하는 테스트")
    void getArea() {
        assertEquals(96, rectangle.getArea());
    }

    @AfterEach
    void tearDown() {
        rectangle = null;
    }
}
