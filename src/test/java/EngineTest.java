import org.junit.Before;
import org.junit.Test;
import vehicles.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(1, 5);
    }
    @Test
    public void hasSizeOfEngine(){
        assertEquals(1, engine.getEngineSize());
    }

    @Test
    public void hasFullTank(){
        assertEquals(5, engine.getFullTank());
    }

}
