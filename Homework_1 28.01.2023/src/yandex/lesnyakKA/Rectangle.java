package yandex.lesnyakKA;

public class Rectangle {
    private int longRectangle;
    private int width;

    public Rectangle(int longRectangle, int width) {
        this.longRectangle = longRectangle;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longRectangle=" + longRectangle +
                ", width=" + width +
                '}';
    }

    public int getLongRectangle() {
        return longRectangle;
    }

    public void setLongRectangle(int longRectangle) {
        this.longRectangle = longRectangle;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerimeterRectangle() {
        int longRectangle = this.longRectangle;
        int width = this.width;
        return 2 * (longRectangle + width);
    }
    public int getSquareRectangle() {
        int longRectangle = this.longRectangle;
        int width = this.width;
        return longRectangle * width;
    }

}
