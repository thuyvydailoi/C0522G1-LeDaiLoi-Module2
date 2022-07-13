package ss04_oop.exercise.fan;

public class MainFan {
    public static void main(String[] args) {
        Fan input = new Fan();
        input.setSpeed(input.getFAST());
        input.setColor("Brown");
        input.setRadius(10);
        input.setOn(true);
        System.out.println("Input1: " + input);

        Fan input2 = new Fan();
        input2.setSpeed(input2.getMEDIUM());
        input2.setColor("Blue");
        input2.setRadius(5);
        input2.setOn(false);
        System.out.println("Input2: " + input2);
    }
}
