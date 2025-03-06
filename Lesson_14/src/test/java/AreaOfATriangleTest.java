import org.example.AreaOfATriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AreaOfATriangleTest {
    @DisplayName("Тест программы для вычисления площади треугольника (все стороны натуральные числа)")
    @Test
    void areaOfTriangleTest() {
        AreaOfATriangle areaOfATriangle = new AreaOfATriangle();
        Assertions.assertEquals(
                66.332495807108,
                areaOfATriangle.calculation(12,12, 20));
    }

    @DisplayName("Тест программы для вычисления площади треугольника (стороны <= 0)")
    @Test
    void areaOfTriangleTestOneSideZero() {
        AreaOfATriangle areaOfATriangle = new AreaOfATriangle();
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class ,() -> {
                    areaOfATriangle.calculation(12, 12, 20);
        });
        Assertions.assertEquals("Стороны должны быть натуральными числами!", exception.getMessage());
    }
}
