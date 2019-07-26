public class RoverWest implements Rover {
    Coordinates coordinates;
    char direction;

    public RoverWest(Coordinates coordinates) {
        this.coordinates = coordinates;
        direction = Direction.WEST;
    }

    public void moveForward() {
        coordinates.decreaseX();
    }

    public void moveBackward() {
        coordinates.increaseX();
    }
}
