package ss2_ArrayLoop.exercise;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the reactangle");
                    System.out.println("Input length: ");
                    int length = input.nextInt();
                    System.out.println("Input width: ");
                    int width = input.nextInt();
                    for (int i = 1; i <= width; i++) {
                        for (int j = i; j < length; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right");
                    System.out.println("Input height: ");
                    int height = input.nextInt();
                    System.out.println("Botton-left: ");
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Top-right: ");
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height + 1 - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Botton-left: ");
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height; j++) {
                            if (j < i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("Botton-right: ");
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j < height + 2 - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print the reactangle");
                    System.out.println("Input height: ");
                    int height2 = input.nextInt();
                    for (int i = 0; i < height2; i++) {
                        for (int j = 0; j < height2 + i; j++) {
                            if (j < height2 - i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Bye!!!");
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
            while (choice != 0) ;
    }
}