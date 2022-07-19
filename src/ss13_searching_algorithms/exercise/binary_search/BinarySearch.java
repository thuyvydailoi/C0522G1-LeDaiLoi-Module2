package ss13_searching_algorithms.exercise.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {5, 100, 20, 300, 440, 2021};
        System.out.println("Nhập số cần tìm kiếm: ");
        int k = Integer.parseInt(scanner.nextLine());
        System.out.print("Kết quả tìm kiếm là: ");
        System.out.println(binarySearch(array, 0, array.length - 1, k));


        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.print("Mảng sau khi được sắp xếp là: ");
        System.out.print(Arrays.toString(array));
    }

    public static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (x == arr[mid]) {
                return mid;
            }

            if (x > arr[mid]) {
                return binarySearch(arr, mid + 1, right, x);
            }

            return binarySearch(arr, left, mid - 1, x);
        }
        return -1;
    }
}
