package ss7_abstractclass_interface.exercise.interface_resizeable.model;

import ss7_abstractclass_interface.exercise.interface_resizeable.services.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius()+(getRadius()*percent/100));
    }

    @Override
    public void howtoColor() {

    }
}
