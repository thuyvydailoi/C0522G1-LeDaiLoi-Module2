package ss2_ArrayLoop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = input.nextInt();
        }
        System.out.println("Mảng vừa tạo: ");
        System.out.println(Arrays.toString(array));

        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
    }
}
