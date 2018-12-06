package dataStructure.texteditor.domain;

public class Cursor {
    private int x;
    private int y;

    private Cursor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Cursor of() {
        return new Cursor(0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void newLine() {
        this.y++;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Cursor{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
