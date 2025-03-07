import org.example.ComparisonOfNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ComparisonOfNumbersTest {
    @DisplayName("Тест программы, которая сравнивает 2 числа")
    @Test
    public void comparisonOfNumbers() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        assertEquals(false, comparison.comparisonOfNumbers(
                100, ">", 240));
    }

    @DisplayName("Тест программы, которая сравнивает 2 отрицательных числа")
    @Test
    public void comparisonOfNegativeNumbers() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        assertEquals(true, comparison.comparisonOfNumbers(
                -100, ">", -240));
    }

    @DisplayName("Тест программы, которая сравнивает 2 дробных числа")
    @Test
    public void comparisonOfFractionalNumbers() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        assertEquals(true, comparison.comparisonOfNumbers(
                27.6, ">", 15.2));
    }

    @DisplayName("Тест программы, которая сравнивает 2 дробных отрицательных числа")
    @Test
    public void comparisonOfNegativeFractionalNumbers() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        assertEquals(false, comparison.comparisonOfNumbers(
                -11.2, ">", -2.2));
    }

    @DisplayName("Тест программы, которая сравнивает 2 числа при введении неверного оператора")
    @Test
    public void comparisonOfNumbersInvalidOperator() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            comparison.comparisonOfNumbers(12, "#", 2);
        });
        assertEquals("Введен неверный оператор!", exception.getMessage());
    }
}
