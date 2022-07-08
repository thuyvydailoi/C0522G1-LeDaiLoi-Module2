package ss6_inheritance_polymorphism.exercise.point2d_3d.point2d;

public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2d() {
    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{getX(), getY()};
    }

    public String toString() {
        return String.format("X: %1.2f, Y: %1.2f", getX(), getY());
    }
}