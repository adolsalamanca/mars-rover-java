public class RoverSouth implements Rover {

    Coordinates coordinates;
    char direction;

    public RoverSouth(Coordinates coordinates) {
        this.coordinates = coordinates;
        direction = Direction.SOUTH;
    }

    public void moveForward() {
        coordinates.decreaseY();
    }

    public void moveBackward() {
        coordinates.increaseY();
    }
}
