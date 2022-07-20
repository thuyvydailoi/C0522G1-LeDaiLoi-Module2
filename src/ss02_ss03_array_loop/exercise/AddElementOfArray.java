package ss2_ss03_ArrayLoop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        boolean isInvalidLength;
        do {
            System.out.println("Nhập vào số lượng phần tử: ");
            n = input.nextInt();
            isInvalidLength = n < 0 || n > 10;
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
        int[] newArray = new int [n+1];
        System.out.println("Nhập vào số cần thêm vào: ");
        int number = input.nextInt();
        System.out.println("Nhập vào vị trí thêm vào: ");
        int index=input.nextInt();
        for (int i = 0; i < index; i++) {
            newArray[i] = arrayA[i];
        }
        newArray[index] = number;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = arrayA[i - 1];
        }
        arrayA=newArray;
        System.out.println("mảng sau khi chèn");
        System.out.println(Arrays.toString(arrayA));
        }
    }