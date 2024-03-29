public class RoverManager{

    Rover rover;

    public RoverManager(Coordinates coordinates, char direction) {
        initializeRover(coordinates, direction);
    }

    private void initializeRover(Coordinates coordinates, char direction) {
        switch (direction) {
            case 'N':
                rover = new RoverNorth(coordinates);
                break;
            case 'S':
                rover = new RoverSouth(coordinates);
                break;
            case 'E':
                rover = new RoverEast(coordinates);
                break;
            case 'W':
                rover = new RoverWest(coordinates);
                break;
        }
    }

    public void moveForward() {
        rover.moveForward();
    }

    public void moveBackward() {
        rover.moveBackward();
    }

    public void turnLeft() {
        rover = rover.turnLeft();
    }

    public void turnRight() {
        rover = rover.turnRight();
    }

}
