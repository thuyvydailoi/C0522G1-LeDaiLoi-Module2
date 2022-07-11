package ss7_abstractclass_interface.exercise.interface_corolable.model;

public class Circle extends Shape{
    private double radius =1.0;

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
        return getRadius()*getRadius()*Math.PI;
    }

    public double getPerimeter(){
        return 2*getRadius()*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                 ", which is a subclass of "
                + super.toString()
                + '}';
    }

    @Override
    public void howtoColor() {
        super.howtoColor();
    }
}
