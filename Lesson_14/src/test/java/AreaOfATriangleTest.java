import org.example.AreaOfATriangle;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AreaOfATriangleTest {

    @Test
    public void areaOfTriangleTest() {
        AreaOfATriangle areaOfATriangle = new AreaOfATriangle();
        assertEquals(
                66.332495807108,
                areaOfATriangle.calculation(12,12, 20),
                "Тест программы для вычисления площади треугольника (все стороны натуральные числа)");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void areaOfTriangleTestOneSideZero() {
        AreaOfATriangle areaOfATriangle = new AreaOfATriangle();
        areaOfATriangle.calculation(12,12, 0);
    }

    @Test
    public void areaOfTriangleTestOneSideZeroMassage() {
        try {
            AreaOfATriangle areaOfATriangle = new AreaOfATriangle();
            areaOfATriangle.calculation(12,12,0);
            fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Стороны должны быть натуральными числами!");
        }
    }
}
