package week7.Task3;

public class Robot {
    private int x;
    private int y;
    private int direction;

    public Robot() {
        this.x = 0;
        this.y = 0;
        this.direction = 0;
    }

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = 0;
    }

    public Robot(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void go() {
        switch (direction) {
            case 0:
                y++;
                break;
            // right
            case 1:
                x++;
                break;

            //bottom
            case 2:
                y--;
                break;
            case 3:
                x--;
                break;
            default:
                break;
        }
    }

    public void turnLeft() {
        direction = (direction - 1) % 4;

    }

    public void turnRight() {
        direction = (direction + 1) % 4;

    }

    public void printCoordinates() {
        System.out.println("(x,y) = [" + x + ", " + y);

    }
}
