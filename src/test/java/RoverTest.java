import org.junit.Assert;
import org.junit.Test;

public class RoverTest {

    private Coordinates coordinates = new Coordinates(0,0);
    Rover rover = new RoverManager(coordinates, Direction.NORTH);

    @Test
    public void should_move_forward_the_rover_after_forward_method_call() {
        rover.moveForward();
        Assert.assertEquals(coordinates.getY(), 1);
    }

    @Test
    public void should_move_backward_the_rover_after_backward_method_call() {
        rover.moveBackward();
        Assert.assertEquals(coordinates.getY(), -1);
    }

}
