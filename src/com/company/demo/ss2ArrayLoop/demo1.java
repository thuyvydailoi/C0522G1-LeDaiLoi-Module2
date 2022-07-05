package com.company.demo.ss2ArrayLoop;

public class demo1 {
    public static void main(String[] args) {
        int[] arr, b; //Khai báo => Java dùng cách này như một lựa chon mặc định
        int arr2[], b2; //Khai báo
        //b đang là mảng 1 chiều
        //b2 biến kiểu int

        //String arr3[];

        //Cách khai báo thứ 1 => thông qua từ khoá new
        int[] arr3 = new int[]{1, 2, 3, 4, 5}; //Khai báo và khởi tạo mảng
        int[] arr4; //Khai báo
        arr4 = new int[]{1, 2, 3, 4, 5}; //Khởi tạo
        int[] arr5 = {1, 2, 3, 4, 5}; //Cách khai báo thứ 2
        int[] arr6;
        arr6 = new int[]{1, 2, 3, 4, 5};
        //Khi khở tạo sau thì bắt buộc phải dùng từ khoá new

        // arr6.length
//        System.out.println(arr6[5]);
    int[][] arr7 = new int[][]{{1,2,3},{4,5},{6,7}};
        System.out.println(arr7[1].length);
    }
}
