import org.junit.Assert;
import org.junit.Test;

public class RoverSouthTest {

    private Coordinates coordinates = new Coordinates(0,0);
    Rover rover = new RoverSouth(coordinates);

    @Test
    public void should_move_forward_the_rover_after_forward_method_call() {
        rover.moveForward();
        Assert.assertEquals(coordinates.getY(), -1);
    }

    @Test
    public void should_move_backward_the_rover_after_backward_method_call() {
        rover.moveBackward();
        Assert.assertEquals(coordinates.getY(), 1);
    }

    @Test
    public void should_return_a_rover_east_after_turn_left() {
        Rover roverAfterTurnLeft = rover.turnLeft();
        Assert.assertEquals(roverAfterTurnLeft.getClass(), RoverEast.class);
    }

    @Test
    public void should_return_a_rover_west_after_turn_right() {
        Rover roverAfterTurnRight = rover.turnRight();
        Assert.assertEquals(roverAfterTurnRight.getClass(), RoverWest.class);
    }
}
