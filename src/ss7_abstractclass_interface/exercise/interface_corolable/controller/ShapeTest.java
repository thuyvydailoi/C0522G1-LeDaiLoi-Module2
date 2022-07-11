package ss7_abstractclass_interface.exercise.interface_corolable.controller;

import ss7_abstractclass_interface.exercise.interface_corolable.model.Circle;
import ss7_abstractclass_interface.exercise.interface_corolable.model.Rectangle;
import ss7_abstractclass_interface.exercise.interface_corolable.model.Shape;
import ss7_abstractclass_interface.exercise.interface_corolable.model.Square;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(3,7);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                ((Shape) shape).howtoColor();
            }
        }
    }
}
