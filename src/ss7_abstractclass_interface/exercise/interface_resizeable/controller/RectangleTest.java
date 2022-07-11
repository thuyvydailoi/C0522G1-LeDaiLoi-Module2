package ss7_abstractclass_interface.exercise.interface_resizeable.controller;

import ss7_abstractclass_interface.exercise.interface_resizeable.model.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());

        rectangle.resize(40);
    }
}
