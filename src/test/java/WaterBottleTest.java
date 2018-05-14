import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void getVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void takeDrink(){
        waterBottle.takeDrink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillBottle(){
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getVolume());
    }

}
