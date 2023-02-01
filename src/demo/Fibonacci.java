package demo;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        String fibonacci = "" + num1 + ", " + num2;
        while (num3 < 100) {
            fibonacci += ", " + num3;
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }
        System.out.println(fibonacci);
    }
}
