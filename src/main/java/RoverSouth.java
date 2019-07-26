public class RoverSouth implements Rover {

    Coordinates coordinates;

    RoverSouth(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void moveForward() {
        coordinates.decreaseY();
    }

    public void moveBackward() {
        coordinates.increaseY();
    }

    public Rover turnLeft() {
        return new RoverEast(coordinates);
    }

    public Rover turnRight() {
        return new RoverWest(coordinates);
    }
}
