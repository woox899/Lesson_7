import org.example.Calculator;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @DisplayName("Тест программы для проверки работы программы калькулятора")
    @Test
    public void calculatorTest() {
        Calculator calculator = new Calculator();
        assertEquals(144, calculator.calculator(12, "*", 12));
    }

    @DisplayName("Тест программы для проверки работы программы калькулятора при делении на 0")
    @Test
    public void calculatorTestDivideByZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculator(12, "/", 0);
        });
        assertEquals("Делить на 0 нельзя!", exception.getMessage());
    }

    @DisplayName("Тест программы для проверки работы программы калькулятора при введении неверного оператора")
    @Test
    public void calculatorTestInvalidOperator() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculator(12, "$", 2);
        });
        assertEquals("Введен неверный оператор!", exception.getMessage());
    }
}