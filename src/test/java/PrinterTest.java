import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(10, 10);
    }

    @Test
    public void getPaperLeft(){
        assertEquals(10, printer.getPaperLeft());
    }

    @Test
    public void print(){
        printer.print(2, 2);
        assertEquals(6, printer.getPaperLeft());
    }

    @Test
    public void noPaperPrint(){
        printer.print(5, 5);
        assertEquals(10, printer.getPaperLeft());
    }

    @Test
    public void refillPaper(){
        printer.refillPaper();
        assertEquals(20, printer.getPaperLeft());
    }

    @Test
    public void reduceToner(){
        printer.print(2,2);
        assertEquals(6, printer.getTonerVolume());
    }
}
