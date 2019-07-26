public class RoverNorth implements Rover {

    Coordinates coordinates;

    RoverNorth(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void moveForward() {
        coordinates.increaseY();
    }

    public void moveBackward() {
        coordinates.decreaseY();
    }

    public Rover turnLeft() {
        return new RoverWest(coordinates);
    }

    public Rover turnRight() {
        return new RoverEast(coordinates);
    }
}
