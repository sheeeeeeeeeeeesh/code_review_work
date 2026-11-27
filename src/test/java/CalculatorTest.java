import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        this.calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(7, calculator.add(3, 4), "3 + 4 must equals 7");
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(2, 1), "2 - 1 must equals 1");
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(4, 2), "4 / 2 must equals 2");
    }

    @Test
    void times() {
        assertEquals(8, calculator.times(4, 2), "4 * 2 must equals 8");
    }

    @Test
    void solver() {
        assertEquals(9, calculator.solver(3, 2, 3), "Equation: y = kx + b. k = 3, x = 2, b = 3. Right answer: 9");
    }
}