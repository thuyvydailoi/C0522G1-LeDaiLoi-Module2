package ss07_abstractclass_interface.exercise.interface_corolable.model;

public class Square extends Shape implements Cloneable {
    private double side = 1;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return getSide() * getSide();
    }

    public double getPerimeter() {
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ",which is a subclass of " +
                super.toString() +
                '}';
    }

    public  void howtoColor(){
        System.out.println("Color all four sides!");
    }
}
