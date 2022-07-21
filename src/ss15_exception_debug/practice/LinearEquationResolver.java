package ss15_exception_debug.practice;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0' ," +
                " please enter constans:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("b: ");
        double b = Double.parseDouble(scanner.nextLine());

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
