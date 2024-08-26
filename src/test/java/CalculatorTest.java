import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Add method should return the right result")
    void addMethodShouldReturnTheRightResult() {
        var result = calculator.add(5, 89);
        Assertions.assertEquals(94, result, "Add method should return the right result");
    }

    @Test
    @DisplayName("Subtract method should return the right result")
    void subtractMethodShouldReturnTheRightResult() {
        var result = calculator.subtract(10, 5);
        Assertions.assertEquals(5, result, "Subtract method should return the right result");
    }

    @Test
    @DisplayName("Multiply method should return an integer")
    void multiplyMethodShouldReturnAFloat() {
        var result = calculator.multiply(5, 4);
        Assertions.assertEquals(20, result);
    }

    @Test
    @DisplayName("Devide method should return an error message when attempting to divide by 0")
    void divideBy0ShouldReturnAnErrorMessage() {
        var result = calculator.divide(5, 0);
        Assertions.assertEquals("Divide by 0 is impossible", result);
    }

    @Test
    @DisplayName("Divide method should return an error message when attempting to divide by 0")
    void divideMethodShouldReturnAStringWithTheValue() {
        var result = calculator.divide(5, 4);
        Assertions.assertEquals("1.25", result);
    }
}
