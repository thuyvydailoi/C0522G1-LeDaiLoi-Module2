package ss7_abstractclass_interface.exercise.interface_resizeable.controller;

import ss7_abstractclass_interface.exercise.interface_resizeable.model.Circle;
import ss7_abstractclass_interface.exercise.interface_resizeable.model.Rectangle;
import ss7_abstractclass_interface.exercise.interface_resizeable.model.Shape;
import ss7_abstractclass_interface.exercise.interface_resizeable.model.Square;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(7);
        shapes[1] = new Rectangle(2,9);
        shapes[2] = new Square(4);
        double percent = Math.floor(Math.random() * 100) + 1;
        System.out.println("Trước khi thay đổi: ");
        for (Shape shape : shapes) {
            System.out.println(shape + "\n AREA: " + shape.getArea());
        }

        System.out.println("percent: " + percent +"%");

        System.out.println("Sau khi thay đổi: ");
        for (Shape shape: shapes){
            shape.resize(percent);
            System.out.println(shape+"AREA: "+ shape.getArea());
        }
    }
}
