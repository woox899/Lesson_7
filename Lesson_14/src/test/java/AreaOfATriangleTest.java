import org.example.AreaOfATriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AreaOfATriangleTest {
    @DisplayName("Тест программы для вычисления площади треугольника (все стороны натуральные числа)")
    @Test
    public void areaOfTriangleTest() {
        AreaOfATriangle areaOfATriangle = new AreaOfATriangle();
        Assertions.assertEquals(
                66.332495807108,
                areaOfATriangle.calculation(12,12, 20));
    }

    @DisplayName("Тест программы для вычисления площади треугольника (стороны <= 0)")
    @Test
    public void areaOfTriangleTestOneSideZero() {
        AreaOfATriangle areaOfATriangle = new AreaOfATriangle();
        Exception exception = assertThrows(IllegalArgumentException.class ,() -> {
                    areaOfATriangle.calculation(12, 12, 0);
        });
        Assertions.assertEquals("Стороны должны быть натуральными числами!", exception.getMessage());
    }
}
