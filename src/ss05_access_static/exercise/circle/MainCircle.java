package ss05_access_static.exercise.circle;

public class MainCircle {
    public static void main(String[] args) {
        Circle input = new Circle();
//        double radius = input.getRadius();
        double area = input.getArea();
        System.out.println("Circle: " + input + " Area is: " + area);
    }
}
