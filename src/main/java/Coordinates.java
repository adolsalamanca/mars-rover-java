public class Coordinates {

    private int x,y;

    Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void increaseX() {
        x++;
    }

    public void increaseY() {
        y++;
    }

    public void decreaseX() {
        x--;
    }

    public void decreaseY() {
        y--;
    }
}
