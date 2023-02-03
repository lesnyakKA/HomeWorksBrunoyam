package yandex.lesnyakKA;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longRectangle=" + length +
                ", width=" + width +
                '}';
    }

    public int getPerimeterRectangle() {
        return 2 * (length + width);
    }
    public int getSquareRectangle() {
        return length * width;
    }

}
