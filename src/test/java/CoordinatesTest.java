import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CoordinatesTest {

    @Test
    @Parameters({"0,0","1,1","-1,-1","-1,1","1,-1"})
    public void should_return_properly_coordinates_instantiated(int xCoord, int yCoord) {
        Coordinates coordinates = new Coordinates(xCoord,yCoord);

        Assert.assertEquals(coordinates.getX(), xCoord);
        Assert.assertEquals(coordinates.getY(), yCoord);

    }

}
