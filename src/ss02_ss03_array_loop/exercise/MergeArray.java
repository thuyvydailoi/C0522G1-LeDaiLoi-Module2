package ss02_ss03_array_loop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng thứ nhất: ");
        int length1 = input.nextInt();
        int[] array1 = new int[length1];
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("Nhập array1[%d]: ", i);
            array1[i] = input.nextInt();
        }
        System.out.println("Mảng vừa tạo: ");
        System.out.println(Arrays.toString(array1));

        System.out.println("Nhập số phần tử của mảng thứ hai: ");
        int length2 = input.nextInt();
        int[] array2 = new int[length2];
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("Nhập array2[%d]: ", i);
            array2[i] = input.nextInt();
        }
        System.out.println("Mảng vừa tạo: ");
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println("Mảng sau khi gộp: ");
        System.out.println(Arrays.toString(array3));
    }
}
