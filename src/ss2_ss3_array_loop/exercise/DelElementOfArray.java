package ss2_ArrayLoop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DelElementOfArray {
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
        for (int x : arrayA) {
            System.out.print(x + "\t");
        }
        System.out.println("Số cần xoá là: ");
        int number = input.nextInt();
        boolean notIn = true;
        for (int i = 0; i < arrayA.length; i++) {
            if (number == arrayA[i]) {
                notIn = false;
                for (int j = i; j < arrayA.length - 1; j++) {
                    int temp = arrayA[j];
                    arrayA[j] = arrayA[j + 1];
                    arrayA[j + 1] = temp;
                }
            }
            arrayA[arrayA.length - 1] = 0;

        }
        if (!notIn) {
            System.out.println("Không tìm thấy number trong mảng!");
        } else {
            System.out.println("Mảng sau khi xóa phần tử number: ");
            System.out.println(Arrays.toString(arrayA));
        }
    }
}
