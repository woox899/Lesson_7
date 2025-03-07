import org.example.Calculator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CalculatorTest {

    @Test
    void calculatorTest() {
        Calculator calculator = new Calculator();
        assertEquals(144, calculator.calculator(12, "*", 12),
                "Тест программы для проверки работы программы калькулятора");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void calculatorTestDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.calculator(12, "/", 0);
    }

    @Test
    public void calculatorTestDivideByZeroMessage() {
        try {
            Calculator calculator = new Calculator();
            calculator.calculator(12,"/", 0);
            fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Делить на 0 нельзя!");
        }
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void calculatorTestInvalidOperator() {
        Calculator calculator = new Calculator();
        calculator.calculator(120, "#", 2);
    }

    @Test
    public void calculatorTestInvalidOperatorMessage() {
        try {
            Calculator calculator = new Calculator();
            calculator.calculator(120, "@", 12);
            fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Введен неверный оператор!");
        }
    }
}