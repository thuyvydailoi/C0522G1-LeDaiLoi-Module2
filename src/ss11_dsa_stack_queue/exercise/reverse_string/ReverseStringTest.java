package ss11_dsa_stack_queue.exercise.reverse_string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Nhập số phần tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("array[%d]", i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng vừa tạo: " + Arrays.toString(array));

        for (int i = 0; i < size; i++) {
            stack.push(array[i]);
        }

        int[] reverseArray = new int[size];
        for (int i = 0; i < size; i++) {
            reverseArray[i] = stack.pop();
        }

        System.out.println("Mảng sau khi đảo ngược là: " + Arrays.toString(reverseArray));
    }
}
