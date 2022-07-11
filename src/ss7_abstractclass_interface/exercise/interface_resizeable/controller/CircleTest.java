package ss7_abstractclass_interface.exercise.interface_resizeable.controller;

import ss7_abstractclass_interface.exercise.interface_resizeable.model.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle.resize(40);
        System.out.println(circle);
    }
}
