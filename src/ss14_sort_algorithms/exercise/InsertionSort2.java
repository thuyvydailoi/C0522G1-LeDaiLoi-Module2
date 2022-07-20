package ss14_sort_algorithms.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        boolean isInvalidLength;
        do {
            System.out.println("Nhập vào số lượng phần tử: ");
            n = input.nextInt();
            isInvalidLength = n < 0 || n > 100;
            if (isInvalidLength) {
                System.out.println("Vui lòng kiểm tra lại!!!");
            }
        } while (isInvalidLength);
        int[] arrayA = new int[n];
        for (int i = 0; i < arrayA.length; i++) {
            System.out.printf("Nhập vào a[%d]: ", i);
            arrayA[i] = input.nextInt();
        }
        System.out.print("Mảng vừa tạo là: ");
        System.out.println(Arrays.toString(arrayA));
        System.out.println("Mảng sau khi sắp xếp là: ");
        System.out.println(Arrays.toString(insertSort(arrayA)));

    }

    public static int[] insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
        return array;
    }
}
