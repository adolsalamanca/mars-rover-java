public class RoverNorth implements Rover {

    Coordinates coordinates;
    char direction;

    public RoverNorth(Coordinates coordinates) {
        this.coordinates = coordinates;
        direction = Direction.NORTH;
    }

    public void moveForward() {
        coordinates.increaseY();
    }

    public void moveBackward() {
        coordinates.decreaseY();
    }
}
