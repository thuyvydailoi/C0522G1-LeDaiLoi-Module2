package ss07_abstractclass_interface.exercise.interface_resizeable.controller;

import ss07_abstractclass_interface.exercise.interface_resizeable.model.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square.resize(40);
        System.out.println(square);
    }
}
