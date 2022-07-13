package ss07_abstractclass_interface.exercise.interface_corolable.controller;

import ss07_abstractclass_interface.exercise.interface_resizeable.model.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle.resize(40);
        System.out.println(circle);
    }
}
