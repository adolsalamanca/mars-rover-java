import org.junit.Assert;
import org.junit.Test;

public class DirectionTest {

    @Test
    public void should_return_properly_north_direction() {

        Assert.assertEquals(Direction.NORTH, 'N');
    }


    @Test
    public void should_return_properly_south_direction() {

        Assert.assertEquals(Direction.SOUTH, 'S');
    }


    @Test
    public void should_return_properly_east_direction() {

        Assert.assertEquals(Direction.EAST, 'E');
    }


    @Test
    public void should_return_properly_west_direction() {

        Assert.assertEquals(Direction.WEST, 'W');
    }

}
