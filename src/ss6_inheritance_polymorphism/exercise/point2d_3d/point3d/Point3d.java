package ss6_inheritance_polymorphism.exercise.point2d_3d.point3d;

import ss6_inheritance_polymorphism.exercise.point2d_3d.point2d.Point2d;

public class Point3d extends Point2d {
    private float z = 0.0f;

    public Point3d() {

    }

    public Point3d(float z) {
        this.z = z;
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    public String toString() {
        return String.format("( %s, Z: %1.2f )", super.toString(), getZ());
    }
}
