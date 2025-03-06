import org.example.Calculator;
import org.example.ComparisonOfNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComparisonOfNumbersTest {
    @DisplayName("Тест программы, которая сравнивает 2 числа")
    @Test
    void comparisonOfNumbers() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        Assertions.assertEquals(false, comparison.comparisonOfNumbers(
                100, ">", 240));
    }

    @DisplayName("Тест программы, которая сравнивает 2 отрицательных числа")
    @Test
    void comparisonOfNegativeNumbers() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        Assertions.assertEquals(true, comparison.comparisonOfNumbers(
                -100, ">", -240));
    }

    @DisplayName("Тест программы, которая сравнивает 2 дробных числа")
    @Test
    void comparisonOfFractionalNumbers() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        Assertions.assertEquals(true, comparison.comparisonOfNumbers(
                27.6, ">", 15.2));
    }

    @DisplayName("Тест программы, которая сравнивает 2 дробных отрицательных числа")
    @Test
    void comparisonOfNegativeFractionalNumbers() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        Assertions.assertEquals(false, comparison.comparisonOfNumbers(
                -11.2, ">", -2.2));
    }

    @DisplayName("Тест программы, которая сравнивает 2 числа при введении неверного оператора")
    @Test
    void comparisonOfNumbersInvalidOperator() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            comparison.comparisonOfNumbers(12, "#", 2);
        });
        Assertions.assertEquals("Введен неверный оператор!", exception.getMessage());
    }


}
