import org.example.ComparisonOfNumbers;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ComparisonOfNumbersTest {
    @Test
    public void comparisonOfNumbers() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        assertEquals(false, comparison.comparisonOfNumbers(
                100, ">", 240),"Тест программы, которая сравнивает 2 числа");
    }

    @Test
    public void comparisonOfNegativeNumbers() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        assertEquals(true, comparison.comparisonOfNumbers(
                -100, ">", -240),
                "Тест программы, которая сравнивает 2 отрицательных числа");
    }

    @Test
    public void comparisonOfFractionalNumbers() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        assertEquals(true, comparison.comparisonOfNumbers(
                27.6, ">", 15.2),
                "Тест программы, которая сравнивает 2 дробных числа");
    }

    @Test
    public void comparisonOfNegativeFractionalNumbers() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        assertEquals(false, comparison.comparisonOfNumbers(
                -11.2, ">", -2.2),
                "Тест программы, которая сравнивает 2 дробных отрицательных числа");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void comparisonOfNumbersInvalidOperator() {
        ComparisonOfNumbers comparison = new ComparisonOfNumbers();
        comparison.comparisonOfNumbers(12, "%", 13);
    }

    @Test
    public void comparisonOfNumbersInvalidOperatorMessage() {
        try {
            ComparisonOfNumbers comparison = new ComparisonOfNumbers();
            comparison.comparisonOfNumbers(12, "%", 13);
            fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Введен неверный оператор!");
        }
    }
}
