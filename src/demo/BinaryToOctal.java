package demo;

import java.util.Scanner;
import java.util.Stack;

public class BinaryToOctal {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thập phân: ");
        int num = scanner.nextInt();
        while (num > 0) {
            integerStack.push(num % 8);
            num /= 8;
        }

        System.out.println("Số bát phân: ");
        while (!integerStack.isEmpty()) {
            System.out.print(integerStack.pop());
        }
    }
}
