package ss6_inheritance_polymorphism.exercise.circle_cylinder.cylinder;

import ss6_inheritance_polymorphism.exercise.circle_cylinder.circle.Circle;

public class Cylinder extends Circle {
    private double height = 1;

    Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = this.height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + "," +
                "radius=" + getRadius() + "," +
                "color=" + getColor() +
                '}';
    }
}
