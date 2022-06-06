package straight;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StraightTest {

    private Straight straight;

    @BeforeEach
    void setUp() {
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate("(10,10)"));
        coordinates.add(new Coordinate("(14,15)"));
        this.straight = new Straight(coordinates);
    }

    @Test
    @DisplayName("쉼표로 x, y 값 구분 테스트")
    void shouldDivideByComma() {
        String input = "(1,2)";
        Coordinate coordinate = new Coordinate(input);
        assertEquals(new Position(1), coordinate.getX());
        assertEquals(new Position(2), coordinate.getY());
    }

    @Test
    @DisplayName("x, y 좌표가 모두 최대 24여야하는 테스트")
    void shouldLowerThan24() {
        String yIs24 = "(23,24)";
        assertDoesNotThrow(() -> new Coordinate(yIs24));

        String xIs24 = "(24,23)";
        assertDoesNotThrow(() -> new Coordinate(xIs24));

        String xAndYIs24 = "(24,24)";
        assertDoesNotThrow(() -> new Coordinate(xAndYIs24));
    }

    @Test
    @DisplayName("x, y 좌표가 24를 넘을 경우 Exception 발생 테스트")
    void shouldThrowExceptionWhenOver24() {
        String yIs25 = "(23,25)";
        assertThrows(IllegalArgumentException.class, () -> new Coordinate(yIs25));

        String xIs25 = "(25,23)";
        assertThrows(IllegalArgumentException.class, () -> new Coordinate(xIs25));

        String xAndYIs25 = "(25,25)";
        assertThrows(IllegalArgumentException.class, () -> new Coordinate(xAndYIs25));
    }

    @Test
    @DisplayName(" '-' 가 포함되어있으면 죄표값이 두개여야하는 테스트")
    void shouldTwoCoordinateWhenContainDash() {
        assertEquals(new Coordinate("(10,10)"), straight.getCoordinate().get(0));
        assertEquals(new Coordinate("(14,15)"), straight.getCoordinate().get(1));
    }

    @Test
    @DisplayName("좌표 거리 계산 테스트")
    void shouldGetDistance() {
        Coordinate start = straight.getCoordinate().get(0);
        Coordinate end = straight.getCoordinate().get(1);
        double distance = straight.getLength(start, end);
        assertEquals(6.403, distance, 0.001);
    }

    @AfterEach
    void tearDown() {
        straight = null;
    }
}
