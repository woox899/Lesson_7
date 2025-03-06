import org.example.FactorialOfANumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactorialOfANumberTest {

    @DisplayName("Тест программы для вычисления факториала натурального числа")
    @Test
    void factorialOfANaturalNumberTest() {
        FactorialOfANumber factorial = new FactorialOfANumber();
        Assertions.assertEquals(6, factorial.calculation(3));
    }

    @DisplayName("Тест программы для вычисления факториала числа 0")
    @Test
    void factorialOfAZeroNumberTest() {
        FactorialOfANumber factorial = new FactorialOfANumber();
        Assertions.assertEquals(1, factorial.calculation(0));
    }

    @DisplayName("Тест программы для вычисления факториала числа 1")
    @Test
    void factorialOfAOneNumberTest() {
        FactorialOfANumber factorial = new FactorialOfANumber();
        Assertions.assertEquals(1, factorial.calculation(1));
    }

    @Test
    void testFactorialOfNegativeNumber() {
        FactorialOfANumber factorial = new FactorialOfANumber();
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            factorial.calculation(-1);
        });
        Assertions.assertEquals("Факториал отрицательного числа неопределяется!", exception.getMessage());
    }
}



