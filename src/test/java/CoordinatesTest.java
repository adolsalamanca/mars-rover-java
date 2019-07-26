import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CoordinatesTest {

    int originalXCoord = 0;
    int originalYCoord = 0;
    Coordinates coord;

    @Before
    public void setUp() {
        coord = new Coordinates(originalXCoord, originalYCoord);
    }

    @After
    public void tearDown() {
        coord = null;
    }

    @Test
    @Parameters({"0,0","1,1","-1,-1","-1,1","1,-1"})
    public void should_return_properly_coordinates_instantiated(int xCoord, int yCoord) {
        Coordinates coordinates = new Coordinates(xCoord,yCoord);

        Assert.assertEquals(coordinates.getX(), xCoord);
        Assert.assertEquals(coordinates.getY(), yCoord);

    }

    @Test
    public void should_return_decreased_x_if_requested() {
        coord.decreaseX();
        Assert.assertEquals(originalXCoord-1, coord.getX());
    }

    @Test
    public void should_return_decreased_y_if_requested() {
        coord.decreaseY();
        Assert.assertEquals(originalYCoord-1, coord.getY());
    }

    @Test
    public void should_return_increased_x_if_requested() {
        coord.increaseX();
        Assert.assertEquals(originalXCoord+1, coord.getX());
    }

    @Test
    public void should_return_increased_y_if_requested() {
        coord.increaseY();
        Assert.assertEquals(originalYCoord+1, coord.getY());
    }

}
