package ss07_abstractclass_interface.exercise.interface_resizeable.model;

import ss07_abstractclass_interface.exercise.interface_resizeable.services.Resizeable;

public class Square extends Rectangle implements Resizeable {
    private double side = 1;

    public Square() {
    }

    public Square(double side) {
        this.side=side;
    }

    public Square(double side, double filled, double color) {
        super(filled,color);
        this.side=side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        setSide(width);
    }

    public void setLength(double length) {
        setSide(length);
    }

    public double getArea() {
        return getSide() * getSide();
    }

    public double getPerimeter() {
        return 4 * getArea();
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ",which is a subclass of "
                + super.toString();
    }

    public void resize(double percent) {
        setSide(getSide() + getSide() * percent / 100);
    }
}
