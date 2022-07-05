package ss2_ArrayLoop.exercise;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int number = input.nextInt();
        if (number < 2) {
            System.out.println();
        } else {

            int count = 2;
            boolean checkNumber = true;
            while (count < number) {
                if (number % count == 0) {
                    checkNumber = false;
                    break;
                }
                count++;
            }
            if (checkNumber)
                System.out.println(number + " Là số nguyên tố");
            else
                System.out.println(number + " Không phải số nguyên tố");
        }
    }
}

