import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @DisplayName("Тест программы для проверки работы программы калькулятора")
    @Test
    void calculatorTest() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(144, calculator.calculator(12, "*", 12));
    }

    @DisplayName("Тест программы для проверки работы программы калькулятора при делении на 0")
    @Test
    void calculatorTestDivideByZero() {
        Calculator calculator = new Calculator();
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculator(12, "/", 0);
        });
        Assertions.assertEquals("Делить на 0 нельзя!", exception.getMessage());
    }

    @DisplayName("Тест программы для проверки работы программы калькулятора при введении неверного оператора")
    @Test
    void calculatorTestInvalidOperator() {
        Calculator calculator = new Calculator();
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculator(12, "$", 2);
        });
        Assertions.assertEquals("Введен неверный оператор!", exception.getMessage());
    }
}