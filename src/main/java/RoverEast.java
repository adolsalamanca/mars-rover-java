public class RoverEast implements Rover {

    Coordinates coordinates;
    char direction;

    public RoverEast(Coordinates coordinates) {
        this.coordinates = coordinates;
        direction = Direction.EAST;
    }

    public void moveForward() {
        coordinates.increaseX();
    }

    public void moveBackward() {
        coordinates.decreaseX();
    }
}
