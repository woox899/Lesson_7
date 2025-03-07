import org.example.FactorialOfANumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialOfANumberTest {
    @DisplayName("Тест программы для вычисления факториала натурального числа")
    @Test
    public void factorialOfANaturalNumberTest() {
        FactorialOfANumber factorial = new FactorialOfANumber();
        assertEquals(6, factorial.calculation(3));
    }

    @DisplayName("Тест программы для вычисления факториала числа 0")
    @Test
    public void factorialOfAZeroNumberTest() {
        FactorialOfANumber factorial = new FactorialOfANumber();
        assertEquals(1, factorial.calculation(0));
    }

    @DisplayName("Тест программы для вычисления факториала числа 1")
    @Test
    public void factorialOfAOneNumberTest() {
        FactorialOfANumber factorial = new FactorialOfANumber();
        assertEquals(1, factorial.calculation(1));
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        FactorialOfANumber factorial = new FactorialOfANumber();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factorial.calculation(-1);
        });
        assertEquals("Факториал отрицательного числа неопределяется!", exception.getMessage());
    }
}



