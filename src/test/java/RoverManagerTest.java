import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverManagerTest {

    private RoverManager roverManager;
    private Coordinates coordinates;

    @Before
    public void setUp() {
        coordinates = new Coordinates(0,0);
    }

    @Test
    public void should_return_a_rover_north_after_instantiate_rover_manager_with_that_direction() {
        roverManager = new RoverManager(coordinates, Direction.NORTH);
        Assert.assertEquals(roverManager.rover.getClass(), RoverNorth.class);
    }

    @Test
    public void should_return_a_rover_south_after_instantiate_rover_manager_with_that_direction() {
        roverManager = new RoverManager(coordinates, Direction.SOUTH);
        Assert.assertEquals(roverManager.rover.getClass(), RoverSouth.class);
    }


    @Test
    public void should_return_a_rover_east_after_instantiate_rover_manager_with_that_direction() {
        roverManager = new RoverManager(coordinates, Direction.EAST);
        Assert.assertEquals(roverManager.rover.getClass(), RoverEast.class);
    }


    @Test
    public void should_return_a_rover_west_after_instantiate_rover_manager_with_that_direction() {
        roverManager = new RoverManager(coordinates, Direction.WEST);
        Assert.assertEquals(roverManager.rover.getClass(), RoverWest.class);
    }


}
