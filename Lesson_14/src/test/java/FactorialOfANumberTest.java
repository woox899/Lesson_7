import org.example.FactorialOfANumber;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialOfANumberTest {

    @Test
    public void testFactorialOfANumber() {
        FactorialOfANumber factorial = new FactorialOfANumber();
        assertEquals(factorial.calculation(3), 6, "Факториал числа 3 равен 3");
    }

    @Test
    public void factorialOfAZeroNumberTest() {
        FactorialOfANumber factorial = new FactorialOfANumber();
        assertEquals(factorial.calculation(0), 1, "Факториал числа 0 рвен 1");
    }
//
//    @DisplayName("Тест программы для вычисления факториала числа 1")
    @Test
    public void factorialOfAOneNumberTest() {
        FactorialOfANumber factorial = new FactorialOfANumber();
        assertEquals(factorial.calculation(1), 1, "Факториал числа 1 равен 1");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialOfANumber factorial = new FactorialOfANumber();
        factorial.calculation(-1);
    }

    @Test
    public void testFactorialOfNegativeNumberWithMessage() {
        try {
            FactorialOfANumber factorial = new FactorialOfANumber();
            factorial.calculation(-1);
            fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Факториал отрицательного числа неопределяется!");
        }
    }
}



