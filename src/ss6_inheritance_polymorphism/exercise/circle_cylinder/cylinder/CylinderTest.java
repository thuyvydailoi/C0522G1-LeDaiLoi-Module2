package ss6_inheritance_polymorphism.exercise.circle_cylinder.cylinder;



public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5, "violet", 7);
        System.out.println(cylinder);
    }
}
