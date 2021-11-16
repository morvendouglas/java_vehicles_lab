import org.junit.Before;
import org.junit.Test;
import vehicles.Tyres;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres(4, 1.6);
    }

    @Test
    public void hasNoOfTyres(){
        assertEquals(4, tyres.getNoOfTyres());
    }

    @Test
    public void hasTyreTread(){
        assertEquals(1.6, tyres.getTyreTread(), 0.0);
    }


}
