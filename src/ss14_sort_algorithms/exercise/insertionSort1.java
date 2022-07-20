package ss14_sort_algorithms.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean isInvalidLength;
        do {
            System.out.println("Nhập vào số lượng phần tử: ");
            n = scanner.nextInt();
            isInvalidLength = n < 0 || n > 100;
        } while (isInvalidLength);

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhập vào a[%d]: ", i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa tạo là: ");
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; j--){
                array[j+1]=array[j];
            }
            array[j+1]=key;
        }
        System.out.println("Mảng sau khi sắp xếp là: ");
        System.out.println(Arrays.toString(array));
    }
}
