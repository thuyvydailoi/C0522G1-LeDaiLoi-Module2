package ss06_inheritance_polymorphism.exercise.circle_cylinder.circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle =new Circle();
        System.out.println(circle);

        circle =new Circle(3.5,"blue");
        System.out.println(circle);
    }
}
