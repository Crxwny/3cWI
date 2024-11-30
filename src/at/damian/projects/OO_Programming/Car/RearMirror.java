package at.damian.projects.OO_Programming.Car;

public class RearMirror {
    private int size;
    private int position; // 0 neutral, -10 links, +10 rechts

    public RearMirror(int size, int position) {
        this.size = size;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
