public class RoverEast implements Rover {

    Coordinates coordinates;

    RoverEast(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void moveForward() {
        coordinates.increaseX();
    }

    public void moveBackward() {
        coordinates.decreaseX();
    }

    public Rover turnLeft() {
        return new RoverNorth(coordinates);
    }

    public Rover turnRight() {
        return new RoverSouth(coordinates);
    }
}
