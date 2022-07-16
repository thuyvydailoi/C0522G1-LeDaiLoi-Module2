package ss11_dsa_stack_queue.exercise.count_char;

import java.util.Scanner;
import java.util.Stack;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập số cần chuyền đổi: ");
        int number = scanner.nextInt();
        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}