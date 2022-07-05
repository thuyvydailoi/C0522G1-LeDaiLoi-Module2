package com.company.demo.ss2ArrayLoop;

public class demo4 {
    public static void main(String[] args) {
        int[][] arr7 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7}};
        for (int i = 0; i < arr7.length; i++) {
            for (int j = 0; i < arr7[i].length; j++) {
                System.out.print(arr7[i][j] + "\t");
            }
            System.out.println();
        }
        int a[] = new int[]{1, 3};

        //Mảng có 10 phần tử
        //=> Xoá phần tử tại vị trí số 2

        //Bước 1
        //Dùng vòng for để gán giá trị lại

        //Bước 2
        //new ra mảng mới có số lượng phần là n-1=0

        //Bước 3
        // copy giá trị từ mảng của qua mảng mới

        //Bước 4
        //gán lại địa chỉ cho mảng cũ

        //so sánh
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.equals(str2));
        int x = 2;
        //Ví sao không sử dụng equals cho kiểu dữ liệu nguyên thuỷ ????
    }
}