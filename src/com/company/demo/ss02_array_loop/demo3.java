package com.company.demo.ss02_array_loop;

import java.util.Arrays;
import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        //Nhập vào mảng 1 chiều
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean isInvalidLength;
        do {
            //Menu
            System.out.print("Nhập vào số lượng phần tử: ");
            n = scanner.nextInt();

            isInvalidLength = n < 0 || n > 10;

            if (isInvalidLength) {
                System.out.println("n>=10, xin kiểm tra lại!!!");
            }
        } while(isInvalidLength);

        System.out.println("Điểm của bạn làL " + n);

        int[] arr = new int[n];

        //Nhập mảng
        for (int i=0;i<arr.length;i++){
            System.out.printf("Nhập vào a[%d]: ",i);
            arr[i] = scanner.nextInt();
        }

        //Xuất mảng
        for (int i = 0; i<arr.length;i++){
            System.out.printf(arr[i] + "\t");
        }
        System.out.println(Arrays.toString(arr)); //Phương thức có sẵn của Java

        for (int item :arr){
            System.out.printf(item + "\t");
        }
    }
}
