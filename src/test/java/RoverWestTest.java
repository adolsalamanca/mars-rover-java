import org.junit.Assert;
import org.junit.Test;

public class RoverWestTest {

    private Coordinates coordinates = new Coordinates(0,0);
    Rover rover = new RoverWest(coordinates);

    @Test
    public void should_move_forward_the_rover_after_forward_method_call() {
        rover.moveForward();
        Assert.assertEquals(coordinates.getX(), -1);
    }

    @Test
    public void should_move_backward_the_rover_after_backward_method_call() {
        rover.moveBackward();
        Assert.assertEquals(coordinates.getX(), 1);
    }

    @Test
    public void should_return_a_rover_south_after_turn_left() {
        Rover roverAfterTurnLeft = rover.turnLeft();
        Assert.assertEquals(roverAfterTurnLeft.getClass(), RoverSouth.class);
    }

    @Test
    public void should_return_a_rover_north_after_turn_right() {
        Rover roverAfterTurnRight = rover.turnRight();
        Assert.assertEquals(roverAfterTurnRight.getClass(), RoverNorth.class);
    }
}
