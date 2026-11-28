import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(calculator.add(80, -70), calculator.add(4,6));
        assertTrue(calculator.add(7, -3) > 0);
        assertNotNull(calculator.add(1, -1));
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
        assertEquals(calculator.dif(80, -70), calculator.dif(200,50));
        assertTrue(calculator.dif(8, 20) < 0);
        assertNotNull(calculator.dif(1, -1));
        assertEquals(1, calculator.dif(2, 1), "2 - 1 must equals 1");
    }

    @Test
    void div() {
        assertEquals(calculator.div(80, -10), calculator.div(-16,2));
        assertTrue(calculator.div(7, -3) < 0);
        assertNotNull(calculator.div(1, -1));
        assertEquals(2, calculator.div(4, 2), "4 / 2 must equals 2");
    }

    @Test
    void times() {
        assertEquals(calculator.times(80, -70), calculator.times(-56,100));
        assertTrue(calculator.times(7, -3) < 0);
        assertNotNull(calculator.times(1, -1));    }

    @Test
    void solver() {
        assertTrue(calculator.solver() != 1);
        assertNotNull(calculator.solver());    }
        assertEquals(8, calculator.times(4, 2), "4 * 2 must equals 8");
    }

    @Test
    void solver() {
        assertEquals(9, calculator.solver(3, 2, 3), "Equation: y = kx + b. k = 3, x = 2, b = 3. Right answer: 9");
    }
}