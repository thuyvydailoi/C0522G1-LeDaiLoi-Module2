package com.company.demo.ss01_introduction_java;

public class demo1 {
    public static void main(String[] args) {
        System.out.println("Hello C0522G1");
        char c = 'a' - 'A';

        byte b = 1; //Khai báo và khởi tạo
        short s; //Khai báo trước
        s = Short.MAX_VALUE; //Khởi tạo sau

        //byte b2=b+1;
        //Trong Java kiểu số nguyên mặc định là int
        //              số thực mặc định là double
        int i = 2;
        long l = 1000000000000534234L; //Phải có hậu tố l và L

        s = 5; //Khởi tạo sau
        float f = 10222222222222222222222.0F;
        double d1 = 1022222222222222222222222222222222222222222222.4D;
        double d2 = 1022222222222222222222222222222222222222222222.50;
        System.out.println(d1 == d2);

        System.out.println(b);
    }
}
