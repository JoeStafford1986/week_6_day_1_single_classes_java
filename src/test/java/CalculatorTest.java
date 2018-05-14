import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(100,20);
    }

    @Test
    public void addNumbers(){
        assertEquals(120, calculator.addNumbers());
    }

    @Test
    public void subtractNumbers(){
        assertEquals(80, calculator.subtractNumbers());
    }

    @Test
    public void multiplyNumbers(){
        assertEquals(2000, calculator.multiplyNumbers());
    }

    @Test
    public void divideNumbers(){
        assertEquals(5, calculator.divideNumbers());
    }


}
