package ss4_Oop.exercise.QuadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquatior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isInvalidLength;
        double a;
        do {
            System.out.println("Nhập số a: ");
             a = input.nextDouble();
            isInvalidLength = a < 0;
            if (isInvalidLength) {
                System.out.println("Vui lòng kiểm tra lại!!!");
            }
        }while (isInvalidLength) ;
            System.out.println("Nhập số b: ");
            double b = input.nextDouble();
            System.out.println("Nhập số c: ");
            double c = input.nextDouble();

            QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
            double delta = quadraticEquation.getDiscrimiant();
            if (delta > 0) {
                System.out.printf("Phương trình có 2 nghiệm %f và %f", quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
            } else if (delta == 0) {
                System.out.printf("Phương trình có 1 nghiệm kép %f", quadraticEquation.getRoot1());
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
