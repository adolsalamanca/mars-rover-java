public class RoverWest implements Rover {
    Coordinates coordinates;

    RoverWest(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void moveForward() {
        coordinates.decreaseX();
    }

    public void moveBackward() {
        coordinates.increaseX();
    }

    public Rover turnLeft() {
        return new RoverSouth(coordinates);
    }

    public Rover turnRight() {
        return new RoverNorth(coordinates);
    }
}
